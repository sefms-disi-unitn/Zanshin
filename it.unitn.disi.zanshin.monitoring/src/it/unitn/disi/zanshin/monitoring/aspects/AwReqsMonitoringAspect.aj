package it.unitn.disi.zanshin.monitoring.aspects;

import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.MonitorableMethod;
import it.unitn.disi.zanshin.model.gore.PerformativeRequirement;
import it.unitn.disi.zanshin.monitoring.Activator;
import it.unitn.disi.zanshin.monitoring.MonitoringUtils;
import it.unitn.disi.zanshin.services.IMonitoringService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Aspect that intercepts calls to life-cicle methods of definable and performative requirements and sends them to the
 * monitoring service in this bundle.
 * 
 * In order to apply this aspect to the other bundles in the platform, you need to run the JVM with argument
 * -Dosgi.framework.extensions=org.eclipse.equinox.weaving.hook in order to activate Equinox's AspectJ weaving. I
 * currently don't know if this works only in Equinox or if it will be applied also to other OSGi containers.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public aspect AwReqsMonitoringAspect {
	/** The monitoring service. */
	private IMonitoringService monitoringService;

	/** Constructor. */
	public AwReqsMonitoringAspect() {
		// Initializes the monitoring service using the registered service in the platform.
		BundleContext context = Activator.getContext();
		ServiceReference<IMonitoringService> reference = context.getServiceReference(IMonitoringService.class);
		monitoringService = context.getService(reference);
	}

	/** Defines a point-cut for calls to definable requirements' methods. */
	pointcut definable(DefinableRequirement req): target(req) && (
			call(void start()) ||
			call(void end()) ||
			call(void success()) ||
			call(void fail())
		);

	/** Defines a point-cut for calls to performative requirements' methods. */
	pointcut performative(PerformativeRequirement req): target(req) && call(void cancel());

	/** Defines an aspect to be applied at the definable point-cut. */
	after(DefinableRequirement req): definable(req) {
		// Obtains the name of the method that was called.
		String methodName = thisJoinPoint.getSignature().getName();

		// Converts it to one of the literals in MonitorableMethod and gets the enumerated value.
		methodName = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
		MonitorableMethod method = MonitorableMethod.get(methodName);

		// Processes the method.
		processMethodCall(req, method);
	}

	/** Defines an aspect to be applied at the performative point-cut. */
	after(PerformativeRequirement req): performative(req) {
		// Process the cancel method (only possibility here).
		processMethodCall(req, MonitorableMethod.CANCEL);
	}

	/**
	 * Processes the specified method call, sent to the specified requirement object.
	 * 
	 * @param req
	 *          The requirement that received the method call.
	 * @param method
	 *          The type of method that was called.
	 */
	private void processMethodCall(DefinableRequirement req, MonitorableMethod method) {
		MonitoringUtils.log.debug("AwReqs aspect intercepted: {0} / {1}", new Object[] { method, req.getClass().getSimpleName() }); //$NON-NLS-1$

		// Defers processing to the monitoring service.
		monitoringService.monitorMethodCall(req, method);
	}
}