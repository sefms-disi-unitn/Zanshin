/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.unitn.disi.zanshin.model.gore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Refinement Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * 
 * @see it.unitn.disi.zanshin.model.gore.GorePackage#getRefinementType()
 * @model
 * @generated
 */
public enum RefinementType implements Enumerator {
	/**
	 * The '<em><b>AND</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "AND", "and"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OR</b></em>' literal object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(1, "OR", "or"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>AND</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #AND
	 * @model literal="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #OR
	 * @model literal="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Refinement Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final RefinementType[] VALUES_ARRAY = new RefinementType[] { AND, OR, };

	/**
	 * A public read-only list of all the '<em><b>Refinement Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<RefinementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Refinement Type</b></em>' literal with the specified literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RefinementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefinementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refinement Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static RefinementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefinementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) { return result; }
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refinement Type</b></em>' literal with the specified integer value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static RefinementType get(int value) {
		switch (value) {
		case AND_VALUE:
			return AND;
		case OR_VALUE:
			return OR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private RefinementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // RefinementType
