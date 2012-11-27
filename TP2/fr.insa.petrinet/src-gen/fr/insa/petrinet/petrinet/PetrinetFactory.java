/**
 */
package fr.insa.petrinet.petrinet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.insa.petrinet.petrinet.PetrinetPackage
 * @generated
 */
public interface PetrinetFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PetrinetFactory eINSTANCE = fr.insa.petrinet.petrinet.impl.PetrinetFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Petri Net</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Petri Net</em>'.
   * @generated
   */
  PetriNet createPetriNet();

  /**
   * Returns a new object of class '<em>Arc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arc</em>'.
   * @generated
   */
  Arc createArc();

  /**
   * Returns a new object of class '<em>Noeud</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Noeud</em>'.
   * @generated
   */
  Noeud createNoeud();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Place</em>'.
   * @generated
   */
  Place createPlace();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PetrinetPackage getPetrinetPackage();

} //PetrinetFactory