/**
 */
package fr.enseeiht.pDL1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL1.Process#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.pDL1.Process#getProcessElements <em>Process Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.enseeiht.pDL1.PDL1Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject
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
   * @see fr.enseeiht.pDL1.PDL1Package#getProcess_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.pDL1.Process#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.pDL1.ProcessElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Elements</em>' containment reference list.
   * @see fr.enseeiht.pDL1.PDL1Package#getProcess_ProcessElements()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElement> getProcessElements();

} // Process
