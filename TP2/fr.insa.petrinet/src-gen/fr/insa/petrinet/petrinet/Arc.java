/**
 */
package fr.insa.petrinet.petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.Arc#getName <em>Name</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.Arc#getSource <em>Source</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.Arc#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.Arc#getArcType <em>Arc Type</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.Arc#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject
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
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Arc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Noeud)
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc_Source()
   * @model
   * @generated
   */
  Noeud getSource();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Arc#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Noeud value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Noeud)
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc_Target()
   * @model
   * @generated
   */
  Noeud getTarget();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Arc#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Noeud value);

  /**
   * Returns the value of the '<em><b>Arc Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.insa.petrinet.petrinet.ArcKindType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arc Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arc Type</em>' attribute.
   * @see fr.insa.petrinet.petrinet.ArcKindType
   * @see #setArcType(ArcKindType)
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc_ArcType()
   * @model
   * @generated
   */
  ArcKindType getArcType();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Arc#getArcType <em>Arc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arc Type</em>' attribute.
   * @see fr.insa.petrinet.petrinet.ArcKindType
   * @see #getArcType()
   * @generated
   */
  void setArcType(ArcKindType value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see fr.insa.petrinet.petrinet.PetrinetPackage#getArc_Weight()
   * @model
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link fr.insa.petrinet.petrinet.Arc#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

} // Arc
