/**
 */
package fr.enseeiht.pDL1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.pDL1.PDL1Package
 * @generated
 */
public interface PDL1Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDL1Factory eINSTANCE = fr.enseeiht.pDL1.impl.PDL1FactoryImpl.init();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Process Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process Element</em>'.
   * @generated
   */
  ProcessElement createProcessElement();

  /**
   * Returns a new object of class '<em>Work Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Definition</em>'.
   * @generated
   */
  WorkDefinition createWorkDefinition();

  /**
   * Returns a new object of class '<em>Work Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Work Sequence</em>'.
   * @generated
   */
  WorkSequence createWorkSequence();

  /**
   * Returns a new object of class '<em>Guidance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Guidance</em>'.
   * @generated
   */
  Guidance createGuidance();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PDL1Package getPDL1Package();

} //PDL1Factory
