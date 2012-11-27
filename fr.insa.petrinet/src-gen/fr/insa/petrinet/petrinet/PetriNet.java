/**
 */
package fr.insa.petrinet.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.PetriNet#getNoeuds <em>Noeuds</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.PetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject
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
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPetriNet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.PetriNet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Noeuds</b></em>' containment reference list.
   * The list contents are of type {@link fr.insa.petrinet.petrinet.Noeud}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Noeuds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Noeuds</em>' containment reference list.
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPetriNet_Noeuds()
   * @model containment="true"
   * @generated
   */
  EList<Noeud> getNoeuds();

  /**
   * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
   * The list contents are of type {@link fr.insa.petrinet.petrinet.Arc}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arcs</em>' containment reference list.
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPetriNet_Arcs()
   * @model containment="true"
   * @generated
   */
  EList<Arc> getArcs();

} // PetriNet
