/**
 */
package fr.insa.petrinet.petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.Place#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Noeud
{
  /**
   * Returns the value of the '<em><b>Marking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Marking</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Marking</em>' attribute.
   * @see #setMarking(int)
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getPlace_Marking()
   * @model
   * @generated
   */
  int getMarking();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Place#getMarking <em>Marking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Marking</em>' attribute.
   * @see #getMarking()
   * @generated
   */
  void setMarking(int value);

} // Place
