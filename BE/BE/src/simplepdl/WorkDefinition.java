/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getMin_time <em>Min time</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getMax_time <em>Max time</em>}</li>
 *   <li>{@link simplepdl.WorkDefinition#getLinksToRessources <em>Links To Ressources</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplepdl.SimplepdlPackage#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Links To Predecessors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Predecessors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToPredecessors()
	 * @see simplepdl.WorkSequence#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToPredecessors();

	/**
	 * Returns the value of the '<em><b>Links To Successors</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.WorkSequence}.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkSequence#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Successors</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToSuccessors()
	 * @see simplepdl.WorkSequence#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	EList<WorkSequence> getLinksToSuccessors();

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
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.WorkDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Min_time()
	 * @model required="true"
	 * @generated
	 */
	int getMin_time();

	/**
	 * Sets the value of the '{@link simplepdl.WorkDefinition#getMin_time <em>Min time</em>}' attribute.
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
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_Max_time()
	 * @model required="true"
	 * @generated
	 */
	int getMax_time();

	/**
	 * Sets the value of the '{@link simplepdl.WorkDefinition#getMax_time <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max time</em>' attribute.
	 * @see #getMax_time()
	 * @generated
	 */
	void setMax_time(int value);

	/**
	 * Returns the value of the '<em><b>Links To Ressources</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.RessourceInstance}.
	 * It is bidirectional and its opposite is '{@link simplepdl.RessourceInstance#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links To Ressources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Ressources</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getWorkDefinition_LinksToRessources()
	 * @see simplepdl.RessourceInstance#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	EList<RessourceInstance> getLinksToRessources();

} // WorkDefinition
