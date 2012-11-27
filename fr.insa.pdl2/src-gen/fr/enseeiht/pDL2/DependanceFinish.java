/**
 */
package fr.enseeiht.pDL2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependance Finish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL2.DependanceFinish#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.DependanceFinish#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL2.PDL2Package#getDependanceFinish()
 * @model
 * @generated
 */
public interface DependanceFinish extends EObject
{
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
   * @see fr.enseeiht.pDL2.PDL2Package#getDependanceFinish_Predecessor()
   * @model
   * @generated
   */
  WorkDefinition getPredecessor();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL2.DependanceFinish#getPredecessor <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predecessor</em>' reference.
   * @see #getPredecessor()
   * @generated
   */
  void setPredecessor(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Link</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Link</em>' containment reference.
   * @see #setLink(WorkSequenceKindFinish)
   * @see fr.enseeiht.pDL2.PDL2Package#getDependanceFinish_Link()
   * @model containment="true"
   * @generated
   */
  WorkSequenceKindFinish getLink();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL2.DependanceFinish#getLink <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link</em>' containment reference.
   * @see #getLink()
   * @generated
   */
  void setLink(WorkSequenceKindFinish value);

} // DependanceFinish
