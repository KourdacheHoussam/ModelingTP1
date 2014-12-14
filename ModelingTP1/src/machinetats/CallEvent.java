/**
 */
package machinetats;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link machinetats.CallEvent#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see machinetats.MachinetatsPackage#getCallEvent()
 * @model
 * @generated
 */
public interface CallEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference.
	 * @see #setOperations(Operation)
	 * @see machinetats.MachinetatsPackage#getCallEvent_Operations()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperations();

	/**
	 * Sets the value of the '{@link machinetats.CallEvent#getOperations <em>Operations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(Operation value);

} // CallEvent
