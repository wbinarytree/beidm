/**
 */
package fr.enseeiht.pDL2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.enseeiht.pDL2.PDL2Factory
 * @model kind="package"
 * @generated
 */
public interface PDL2Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pDL2";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.enseeiht.fr/PDL2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pDL2";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PDL2Package eINSTANCE = fr.enseeiht.pDL2.impl.PDL2PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.ProcessImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.ProcessElementImpl <em>Process Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.ProcessElementImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getProcessElement()
   * @generated
   */
  int PROCESS_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Process Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.WorkDefinitionImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Links To Predecessors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__LINKS_TO_PREDECESSORS = PROCESS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Links To Successors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__LINKS_TO_SUCCESSORS = PROCESS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.DependanceStartImpl <em>Dependance Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.DependanceStartImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getDependanceStart()
   * @generated
   */
  int DEPENDANCE_START = 3;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_START__PREDECESSOR = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_START__LINK = 1;

  /**
   * The number of structural features of the '<em>Dependance Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_START_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl <em>Work Sequence Kind Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkSequenceKindStart()
   * @generated
   */
  int WORK_SEQUENCE_KIND_START = 4;

  /**
   * The feature id for the '<em><b>Started2 Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_START__STARTED2_START = 0;

  /**
   * The feature id for the '<em><b>Started2 Finish</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_START__STARTED2_FINISH = 1;

  /**
   * The number of structural features of the '<em>Work Sequence Kind Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_START_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.DependanceFinishImpl <em>Dependance Finish</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.DependanceFinishImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getDependanceFinish()
   * @generated
   */
  int DEPENDANCE_FINISH = 5;

  /**
   * The feature id for the '<em><b>Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_FINISH__PREDECESSOR = 0;

  /**
   * The feature id for the '<em><b>Link</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_FINISH__LINK = 1;

  /**
   * The number of structural features of the '<em>Dependance Finish</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDANCE_FINISH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.WorkSequenceKindFinishImpl <em>Work Sequence Kind Finish</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.WorkSequenceKindFinishImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkSequenceKindFinish()
   * @generated
   */
  int WORK_SEQUENCE_KIND_FINISH = 6;

  /**
   * The feature id for the '<em><b>Finished2 Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_FINISH__FINISHED2_START = 0;

  /**
   * The feature id for the '<em><b>Finished2 Finish</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH = 1;

  /**
   * The number of structural features of the '<em>Work Sequence Kind Finish</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_KIND_FINISH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.enseeiht.pDL2.impl.GuidanceImpl <em>Guidance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.enseeiht.pDL2.impl.GuidanceImpl
   * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getGuidance()
   * @generated
   */
  int GUIDANCE = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE__TEXT = PROCESS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Guidance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUIDANCE_FEATURE_COUNT = PROCESS_ELEMENT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see fr.enseeiht.pDL2.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDL2.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.enseeiht.pDL2.Process#getProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Process Elements</em>'.
   * @see fr.enseeiht.pDL2.Process#getProcessElements()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElements();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.ProcessElement <em>Process Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process Element</em>'.
   * @see fr.enseeiht.pDL2.ProcessElement
   * @generated
   */
  EClass getProcessElement();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see fr.enseeiht.pDL2.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.WorkDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.enseeiht.pDL2.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.enseeiht.pDL2.WorkDefinition#getLinksToPredecessors <em>Links To Predecessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links To Predecessors</em>'.
   * @see fr.enseeiht.pDL2.WorkDefinition#getLinksToPredecessors()
   * @see #getWorkDefinition()
   * @generated
   */
  EReference getWorkDefinition_LinksToPredecessors();

  /**
   * Returns the meta object for the containment reference list '{@link fr.enseeiht.pDL2.WorkDefinition#getLinksToSuccessors <em>Links To Successors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links To Successors</em>'.
   * @see fr.enseeiht.pDL2.WorkDefinition#getLinksToSuccessors()
   * @see #getWorkDefinition()
   * @generated
   */
  EReference getWorkDefinition_LinksToSuccessors();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.DependanceStart <em>Dependance Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependance Start</em>'.
   * @see fr.enseeiht.pDL2.DependanceStart
   * @generated
   */
  EClass getDependanceStart();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDL2.DependanceStart#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.enseeiht.pDL2.DependanceStart#getPredecessor()
   * @see #getDependanceStart()
   * @generated
   */
  EReference getDependanceStart_Predecessor();

  /**
   * Returns the meta object for the containment reference '{@link fr.enseeiht.pDL2.DependanceStart#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see fr.enseeiht.pDL2.DependanceStart#getLink()
   * @see #getDependanceStart()
   * @generated
   */
  EReference getDependanceStart_Link();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.WorkSequenceKindStart <em>Work Sequence Kind Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence Kind Start</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindStart
   * @generated
   */
  EClass getWorkSequenceKindStart();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.WorkSequenceKindStart#getStarted2Start <em>Started2 Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Started2 Start</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindStart#getStarted2Start()
   * @see #getWorkSequenceKindStart()
   * @generated
   */
  EAttribute getWorkSequenceKindStart_Started2Start();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.WorkSequenceKindStart#getStarted2Finish <em>Started2 Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Started2 Finish</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindStart#getStarted2Finish()
   * @see #getWorkSequenceKindStart()
   * @generated
   */
  EAttribute getWorkSequenceKindStart_Started2Finish();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.DependanceFinish <em>Dependance Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependance Finish</em>'.
   * @see fr.enseeiht.pDL2.DependanceFinish
   * @generated
   */
  EClass getDependanceFinish();

  /**
   * Returns the meta object for the reference '{@link fr.enseeiht.pDL2.DependanceFinish#getPredecessor <em>Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Predecessor</em>'.
   * @see fr.enseeiht.pDL2.DependanceFinish#getPredecessor()
   * @see #getDependanceFinish()
   * @generated
   */
  EReference getDependanceFinish_Predecessor();

  /**
   * Returns the meta object for the containment reference '{@link fr.enseeiht.pDL2.DependanceFinish#getLink <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Link</em>'.
   * @see fr.enseeiht.pDL2.DependanceFinish#getLink()
   * @see #getDependanceFinish()
   * @generated
   */
  EReference getDependanceFinish_Link();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.WorkSequenceKindFinish <em>Work Sequence Kind Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Work Sequence Kind Finish</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindFinish
   * @generated
   */
  EClass getWorkSequenceKindFinish();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Start <em>Finished2 Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Finished2 Start</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Start()
   * @see #getWorkSequenceKindFinish()
   * @generated
   */
  EAttribute getWorkSequenceKindFinish_Finished2Start();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Finish <em>Finished2 Finish</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Finished2 Finish</em>'.
   * @see fr.enseeiht.pDL2.WorkSequenceKindFinish#getFinished2Finish()
   * @see #getWorkSequenceKindFinish()
   * @generated
   */
  EAttribute getWorkSequenceKindFinish_Finished2Finish();

  /**
   * Returns the meta object for class '{@link fr.enseeiht.pDL2.Guidance <em>Guidance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guidance</em>'.
   * @see fr.enseeiht.pDL2.Guidance
   * @generated
   */
  EClass getGuidance();

  /**
   * Returns the meta object for the attribute '{@link fr.enseeiht.pDL2.Guidance#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.enseeiht.pDL2.Guidance#getText()
   * @see #getGuidance()
   * @generated
   */
  EAttribute getGuidance_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDL2Factory getPDL2Factory();

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
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.ProcessImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.ProcessElementImpl <em>Process Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.ProcessElementImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getProcessElement()
     * @generated
     */
    EClass PROCESS_ELEMENT = eINSTANCE.getProcessElement();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.WorkDefinitionImpl <em>Work Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.WorkDefinitionImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Links To Predecessors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DEFINITION__LINKS_TO_PREDECESSORS = eINSTANCE.getWorkDefinition_LinksToPredecessors();

    /**
     * The meta object literal for the '<em><b>Links To Successors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORK_DEFINITION__LINKS_TO_SUCCESSORS = eINSTANCE.getWorkDefinition_LinksToSuccessors();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.DependanceStartImpl <em>Dependance Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.DependanceStartImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getDependanceStart()
     * @generated
     */
    EClass DEPENDANCE_START = eINSTANCE.getDependanceStart();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDANCE_START__PREDECESSOR = eINSTANCE.getDependanceStart_Predecessor();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDANCE_START__LINK = eINSTANCE.getDependanceStart_Link();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl <em>Work Sequence Kind Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkSequenceKindStart()
     * @generated
     */
    EClass WORK_SEQUENCE_KIND_START = eINSTANCE.getWorkSequenceKindStart();

    /**
     * The meta object literal for the '<em><b>Started2 Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE_KIND_START__STARTED2_START = eINSTANCE.getWorkSequenceKindStart_Started2Start();

    /**
     * The meta object literal for the '<em><b>Started2 Finish</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE_KIND_START__STARTED2_FINISH = eINSTANCE.getWorkSequenceKindStart_Started2Finish();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.DependanceFinishImpl <em>Dependance Finish</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.DependanceFinishImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getDependanceFinish()
     * @generated
     */
    EClass DEPENDANCE_FINISH = eINSTANCE.getDependanceFinish();

    /**
     * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDANCE_FINISH__PREDECESSOR = eINSTANCE.getDependanceFinish_Predecessor();

    /**
     * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDANCE_FINISH__LINK = eINSTANCE.getDependanceFinish_Link();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.WorkSequenceKindFinishImpl <em>Work Sequence Kind Finish</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.WorkSequenceKindFinishImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getWorkSequenceKindFinish()
     * @generated
     */
    EClass WORK_SEQUENCE_KIND_FINISH = eINSTANCE.getWorkSequenceKindFinish();

    /**
     * The meta object literal for the '<em><b>Finished2 Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE_KIND_FINISH__FINISHED2_START = eINSTANCE.getWorkSequenceKindFinish_Finished2Start();

    /**
     * The meta object literal for the '<em><b>Finished2 Finish</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORK_SEQUENCE_KIND_FINISH__FINISHED2_FINISH = eINSTANCE.getWorkSequenceKindFinish_Finished2Finish();

    /**
     * The meta object literal for the '{@link fr.enseeiht.pDL2.impl.GuidanceImpl <em>Guidance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.enseeiht.pDL2.impl.GuidanceImpl
     * @see fr.enseeiht.pDL2.impl.PDL2PackageImpl#getGuidance()
     * @generated
     */
    EClass GUIDANCE = eINSTANCE.getGuidance();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUIDANCE__TEXT = eINSTANCE.getGuidance_Text();

  }

} //PDL2Package
