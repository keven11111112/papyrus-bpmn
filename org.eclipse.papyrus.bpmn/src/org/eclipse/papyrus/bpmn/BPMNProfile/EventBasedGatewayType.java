/**
 */
package org.eclipse.papyrus.bpmn.BPMNProfile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Event Based Gateway Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.bpmn.BPMNProfile.BPMNProfilePackage#getEventBasedGatewayType()
 * @model
 * @generated
 */
public enum EventBasedGatewayType implements Enumerator {
	/**
	 * The '<em><b>Exclusive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSIVE(0, "exclusive", "exclusive"),

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(1, "parallel", "parallel");

	/**
	 * The '<em><b>Exclusive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exclusive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE
	 * @model name="exclusive"
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSIVE_VALUE = 0;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Event Based Gateway Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EventBasedGatewayType[] VALUES_ARRAY =
		new EventBasedGatewayType[] {
			EXCLUSIVE,
			PARALLEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Event Based Gateway Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EventBasedGatewayType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Event Based Gateway Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventBasedGatewayType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventBasedGatewayType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Based Gateway Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventBasedGatewayType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EventBasedGatewayType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Event Based Gateway Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EventBasedGatewayType get(int value) {
		switch (value) {
			case EXCLUSIVE_VALUE: return EXCLUSIVE;
			case PARALLEL_VALUE: return PARALLEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EventBasedGatewayType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EventBasedGatewayType
