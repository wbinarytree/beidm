/**
 */
package fr.insa.petrinet.petrinet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.insa.petrinet.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "petrinet";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.insa.fr/petrinet/Petrinet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "petrinet";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PetrinetPackage eINSTANCE = fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.impl.PetriNetImpl
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getPetriNet()
   * @generated
   */
  int PETRI_NET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__NAME = 0;

  /**
   * The feature id for the '<em><b>Noeuds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__NOEUDS = 1;

  /**
   * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET__ARCS = 2;

  /**
   * The number of structural features of the '<em>Petri Net</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRI_NET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.impl.ArcImpl <em>Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.impl.ArcImpl
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getArc()
   * @generated
   */
  int ARC = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__TARGET = 2;

  /**
   * The feature id for the '<em><b>Arc Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__ARC_TYPE = 3;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__WEIGHT = 4;

  /**
   * The number of structural features of the '<em>Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.impl.NoeudImpl <em>Noeud</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.impl.NoeudImpl
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getNoeud()
   * @generated
   */
  int NOEUD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOEUD__NAME = 0;

  /**
   * The number of structural features of the '<em>Noeud</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOEUD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.impl.TransitionImpl
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = NOEUD__NAME;

  /**
   * The feature id for the '<em><b>Min Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__MIN_TIME = NOEUD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Max Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__MAX_TIME = NOEUD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.impl.PlaceImpl
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
   * @generated
   */
  int PLACE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__NAME = NOEUD__NAME;

  /**
   * The feature id for the '<em><b>Marking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__MARKING = NOEUD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.insa.petrinet.petrinet.ArcKindType <em>Arc Kind Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.insa.petrinet.petrinet.ArcKindType
   * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getArcKindType()
   * @generated
   */
  int ARC_KIND_TYPE = 5;


  /**
   * Returns the meta object for class '{@link fr.insa.petrinet.petrinet.PetriNet <em>Petri Net</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Petri Net</em>'.
   * @see fr.insa.petrinet.petrinet.PetriNet
   * @generated
   */
  EClass getPetriNet();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.PetriNet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.insa.petrinet.petrinet.PetriNet#getName()
   * @see #getPetriNet()
   * @generated
   */
  EAttribute getPetriNet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.insa.petrinet.petrinet.PetriNet#getNoeuds <em>Noeuds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Noeuds</em>'.
   * @see fr.insa.petrinet.petrinet.PetriNet#getNoeuds()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_Noeuds();

  /**
   * Returns the meta object for the containment reference list '{@link fr.insa.petrinet.petrinet.PetriNet#getArcs <em>Arcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arcs</em>'.
   * @see fr.insa.petrinet.petrinet.PetriNet#getArcs()
   * @see #getPetriNet()
   * @generated
   */
  EReference getPetriNet_Arcs();

  /**
   * Returns the meta object for class '{@link fr.insa.petrinet.petrinet.Arc <em>Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arc</em>'.
   * @see fr.insa.petrinet.petrinet.Arc
   * @generated
   */
  EClass getArc();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Arc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.insa.petrinet.petrinet.Arc#getName()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_Name();

  /**
   * Returns the meta object for the reference '{@link fr.insa.petrinet.petrinet.Arc#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see fr.insa.petrinet.petrinet.Arc#getSource()
   * @see #getArc()
   * @generated
   */
  EReference getArc_Source();

  /**
   * Returns the meta object for the reference '{@link fr.insa.petrinet.petrinet.Arc#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see fr.insa.petrinet.petrinet.Arc#getTarget()
   * @see #getArc()
   * @generated
   */
  EReference getArc_Target();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Arc#getArcType <em>Arc Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arc Type</em>'.
   * @see fr.insa.petrinet.petrinet.Arc#getArcType()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_ArcType();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Arc#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see fr.insa.petrinet.petrinet.Arc#getWeight()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_Weight();

  /**
   * Returns the meta object for class '{@link fr.insa.petrinet.petrinet.Noeud <em>Noeud</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Noeud</em>'.
   * @see fr.insa.petrinet.petrinet.Noeud
   * @generated
   */
  EClass getNoeud();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Noeud#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.insa.petrinet.petrinet.Noeud#getName()
   * @see #getNoeud()
   * @generated
   */
  EAttribute getNoeud_Name();

  /**
   * Returns the meta object for class '{@link fr.insa.petrinet.petrinet.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see fr.insa.petrinet.petrinet.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Transition#getMinTime <em>Min Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Time</em>'.
   * @see fr.insa.petrinet.petrinet.Transition#getMinTime()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_MinTime();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Transition#getMaxTime <em>Max Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Time</em>'.
   * @see fr.insa.petrinet.petrinet.Transition#getMaxTime()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_MaxTime();

  /**
   * Returns the meta object for class '{@link fr.insa.petrinet.petrinet.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see fr.insa.petrinet.petrinet.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link fr.insa.petrinet.petrinet.Place#getMarking <em>Marking</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Marking</em>'.
   * @see fr.insa.petrinet.petrinet.Place#getMarking()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Marking();

  /**
   * Returns the meta object for enum '{@link fr.insa.petrinet.petrinet.ArcKindType <em>Arc Kind Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Arc Kind Type</em>'.
   * @see fr.insa.petrinet.petrinet.ArcKindType
   * @generated
   */
  EEnum getArcKindType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PetrinetFactory getPetrinetFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.impl.PetriNetImpl <em>Petri Net</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.impl.PetriNetImpl
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getPetriNet()
     * @generated
     */
    EClass PETRI_NET = eINSTANCE.getPetriNet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

    /**
     * The meta object literal for the '<em><b>Noeuds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__NOEUDS = eINSTANCE.getPetriNet_Noeuds();

    /**
     * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRI_NET__ARCS = eINSTANCE.getPetriNet_Arcs();

    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.impl.ArcImpl <em>Arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.impl.ArcImpl
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getArc()
     * @generated
     */
    EClass ARC = eINSTANCE.getArc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__NAME = eINSTANCE.getArc_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARC__SOURCE = eINSTANCE.getArc_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARC__TARGET = eINSTANCE.getArc_Target();

    /**
     * The meta object literal for the '<em><b>Arc Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__ARC_TYPE = eINSTANCE.getArc_ArcType();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.impl.NoeudImpl <em>Noeud</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.impl.NoeudImpl
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getNoeud()
     * @generated
     */
    EClass NOEUD = eINSTANCE.getNoeud();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOEUD__NAME = eINSTANCE.getNoeud_Name();

    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.impl.TransitionImpl
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Min Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__MIN_TIME = eINSTANCE.getTransition_MinTime();

    /**
     * The meta object literal for the '<em><b>Max Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__MAX_TIME = eINSTANCE.getTransition_MaxTime();

    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.impl.PlaceImpl
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
     * @generated
     */
    EClass PLACE = eINSTANCE.getPlace();

    /**
     * The meta object literal for the '<em><b>Marking</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__MARKING = eINSTANCE.getPlace_Marking();

    /**
     * The meta object literal for the '{@link fr.insa.petrinet.petrinet.ArcKindType <em>Arc Kind Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.insa.petrinet.petrinet.ArcKindType
     * @see fr.insa.petrinet.petrinet.impl.PetrinetPackageImpl#getArcKindType()
     * @generated
     */
    EEnum ARC_KIND_TYPE = eINSTANCE.getArcKindType();

  }

} //PetrinetPackage
