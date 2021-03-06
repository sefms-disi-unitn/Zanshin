/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore.impl;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.GorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Aw Req</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getOtherTargets <em>Other Targets</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getTarget <em>Target</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.gore.impl.AwReqImpl#getIncrementCoefficient <em>Increment Coefficient</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AwReqImpl extends DefinableRequirementImpl implements AwReq {
	/**
	 * The cached value of the '{@link #getOtherTargets() <em>Other Targets</em>}' reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOtherTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinableRequirement> otherTargets;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected DefinableRequirement target;

	/**
	 * The default value of the '{@link #getIncrementCoefficient() <em>Increment Coefficient</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncrementCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double INCREMENT_COEFFICIENT_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getIncrementCoefficient() <em>Increment Coefficient</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIncrementCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double incrementCoefficient = INCREMENT_COEFFICIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AwReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GorePackage.Literals.AW_REQ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<DefinableRequirement> getOtherTargets() {
		if (otherTargets == null) {
			otherTargets = new EObjectResolvingEList<DefinableRequirement>(DefinableRequirement.class, this, GorePackage.AW_REQ__OTHER_TARGETS);
		}
		return otherTargets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinableRequirement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (DefinableRequirement) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GorePackage.AW_REQ__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DefinableRequirement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTarget(DefinableRequirement newTarget) {
		DefinableRequirement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getIncrementCoefficient() {
		return incrementCoefficient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIncrementCoefficient(double newIncrementCoefficient) {
		double oldIncrementCoefficient = incrementCoefficient;
		incrementCoefficient = newIncrementCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GorePackage.AW_REQ__INCREMENT_COEFFICIENT, oldIncrementCoefficient, incrementCoefficient));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GorePackage.AW_REQ__OTHER_TARGETS:
			return getOtherTargets();
		case GorePackage.AW_REQ__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
			return getIncrementCoefficient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GorePackage.AW_REQ__OTHER_TARGETS:
			getOtherTargets().clear();
			getOtherTargets().addAll((Collection<? extends DefinableRequirement>) newValue);
			return;
		case GorePackage.AW_REQ__TARGET:
			setTarget((DefinableRequirement) newValue);
			return;
		case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
			setIncrementCoefficient((Double) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GorePackage.AW_REQ__OTHER_TARGETS:
			getOtherTargets().clear();
			return;
		case GorePackage.AW_REQ__TARGET:
			setTarget((DefinableRequirement) null);
			return;
		case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
			setIncrementCoefficient(INCREMENT_COEFFICIENT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GorePackage.AW_REQ__OTHER_TARGETS:
			return otherTargets != null && !otherTargets.isEmpty();
		case GorePackage.AW_REQ__TARGET:
			return target != null;
		case GorePackage.AW_REQ__INCREMENT_COEFFICIENT:
			return incrementCoefficient != INCREMENT_COEFFICIENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (incrementCoefficient: "); //$NON-NLS-1$
		result.append(incrementCoefficient);
		result.append(')');
		return result.toString();
	}

} // AwReqImpl
