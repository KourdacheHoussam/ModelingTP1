/**
 */
package machinetats;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link machinetats.Machine#getOperations <em>Operations</em>}</li>
 *   <li>{@link machinetats.Machine#getEtats <em>Etats</em>}</li>
 *   <li>{@link machinetats.Machine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link machinetats.Machine#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see machinetats.MachinetatsPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(Operation)
	 * @see machinetats.MachinetatsPackage#getMachine_Operations()
	 * @model containment="true"
	 * @generated
	 */
	Operation getOperations();

	/**
	 * Sets the value of the '{@link machinetats.Machine#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(Operation value);

	/**
	 * Returns the value of the '<em><b>Etats</b></em>' containment reference list.
	 * The list contents are of type {@link machinetats.Etat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etats</em>' containment reference list.
	 * @see machinetats.MachinetatsPackage#getMachine_Etats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etat> getEtats();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link machinetats.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see machinetats.MachinetatsPackage#getMachine_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see machinetats.MachinetatsPackage#getMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link machinetats.Machine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Machine
