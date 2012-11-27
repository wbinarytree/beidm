/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package petriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petriNet.Transition#getMin_time <em>Min time</em>}</li>
 *   <li>{@link petriNet.Transition#getMax_time <em>Max time</em>}</li>
 * </ul>
 * </p>
 *
 * @see petriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Min time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min time</em>' attribute.
	 * @see #setMin_time(int)
	 * @see petriNet.PetriNetPackage#getTransition_Min_time()
	 * @model
	 * @generated
	 */
	int getMin_time();

	/**
	 * Sets the value of the '{@link petriNet.Transition#getMin_time <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min time</em>' attribute.
	 * @see #getMin_time()
	 * @generated
	 */
	void setMin_time(int value);

	/**
	 * Returns the value of the '<em><b>Max time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max time</em>' attribute.
	 * @see #setMax_time(int)
	 * @see petriNet.PetriNetPackage#getTransition_Max_time()
	 * @model
	 * @generated
	 */
	int getMax_time();

	/**
	 * Sets the value of the '{@link petriNet.Transition#getMax_time <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max time</em>' attribute.
	 * @see #getMax_time()
	 * @generated
	 */
	void setMax_time(int value);

} // Transition
