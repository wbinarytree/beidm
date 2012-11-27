/**
 */
package fr.enseeiht.pDL1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL1.WorkSequence#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link fr.enseeiht.pDL1.WorkSequence#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.enseeiht.pDL1.WorkSequence#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL1.PDL1Package#getWorkSequence()
 * @model
 * @generated
 */
public interface WorkSequence extends ProcessElement
{
  /**
   * Returns the value of the '<em><b>Link Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.enseeiht.pDL1.WorkSequenceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link Type</em>' attribute.
   * @see fr.enseeiht.pDL1.WorkSequenceType
   * @see #setLinkType(WorkSequenceType)
   * @see fr.enseeiht.pDL1.PDL1Package#getWorkSequence_LinkType()
   * @model
   * @generated
   */
  WorkSequenceType getLinkType();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL1.WorkSequence#getLinkType <em>Link Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Type</em>' attribute.
   * @see fr.enseeiht.pDL1.WorkSequenceType
   * @see #getLinkType()
   * @generated
   */
  void setLinkType(WorkSequenceType value);

  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference.
   * @see #setPredecessor(WorkDefinition)
   * @see fr.enseeiht.pDL1.PDL1Package#getWorkSequence_Predecessor()
   * @model
   * @generated
   */
  WorkDefinition getPredecessor();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL1.WorkSequence#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Successor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Successor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Successor</em>' reference.
   * @see #setSuccessor(WorkDefinition)
   * @see fr.enseeiht.pDL1.PDL1Package#getWorkSequence_Successor()
   * @model
   * @generated
   */
  WorkDefinition getSuccessor();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL1.WorkSequence#getSuccessor <em>Successor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Successor</em>' reference.
   * @see #getSuccessor()
   * @generated
   */
  void setSuccessor(WorkDefinition value);

} // WorkSequence