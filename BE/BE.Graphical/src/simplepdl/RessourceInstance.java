/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simplepdl.RessourceInstance#getType <em>Type</em>}</li>
 *   <li>{@link simplepdl.RessourceInstance#getActivity <em>Activity</em>}</li>
 *   <li>{@link simplepdl.RessourceInstance#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see simplepdl.SimplepdlPackage#getRessourceInstance()
 * @model
 * @generated
 */
public interface RessourceInstance extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RessourceDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessourceInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	RessourceDefinition getType();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RessourceDefinition value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getLinksToRessources <em>Links To Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRessourceInstance_Activity()
	 * @see simplepdl.WorkDefinition#getLinksToRessources
	 * @model opposite="linksToRessources" required="true"
	 * @generated
	 */
	WorkDefinition getActivity();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceInstance#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(WorkDefinition value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(int)
	 * @see simplepdl.SimplepdlPackage#getRessourceInstance_Instances()
	 * @model required="true"
	 * @generated
	 */
	int getInstances();

	/**
	 * Sets the value of the '{@link simplepdl.RessourceInstance#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(int value);

} // RessourceInstance
