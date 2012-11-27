/**
 */
package fr.enseeiht.pDL1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL1.WorkDefinition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL1.PDL1Package#getWorkDefinition()
 * @model
 * @generated
 */
public interface WorkDefinition extends ProcessElement
{
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
   * @see fr.enseeiht.pDL1.PDL1Package#getWorkDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL1.WorkDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // WorkDefinition
