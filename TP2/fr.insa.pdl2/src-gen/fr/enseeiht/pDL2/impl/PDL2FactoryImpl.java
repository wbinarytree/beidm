/**
 */
package fr.enseeiht.pDL2.impl;

import fr.enseeiht.pDL2.DependanceFinish;
import fr.enseeiht.pDL2.DependanceStart;
import fr.enseeiht.pDL2.Guidance;
import fr.enseeiht.pDL2.PDL2Factory;
import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.ProcessElement;
import fr.enseeiht.pDL2.WorkDefinition;
import fr.enseeiht.pDL2.WorkSequenceKindFinish;
import fr.enseeiht.pDL2.WorkSequenceKindStart;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDL2FactoryImpl extends EFactoryImpl implements PDL2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PDL2Factory init()
  {
    try
    {
      PDL2Factory thePDL2Factory = (PDL2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.enseeiht.fr/PDL2"); 
      if (thePDL2Factory != null)
      {
        return thePDL2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDL2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PDL2Package.PROCESS: return createProcess();
      case PDL2Package.PROCESS_ELEMENT: return createProcessElement();
      case PDL2Package.WORK_DEFINITION: return createWorkDefinition();
      case PDL2Package.DEPENDANCE_START: return createDependanceStart();
      case PDL2Package.WORK_SEQUENCE_KIND_START: return createWorkSequenceKindStart();
      case PDL2Package.DEPENDANCE_FINISH: return createDependanceFinish();
      case PDL2Package.WORK_SEQUENCE_KIND_FINISH: return createWorkSequenceKindFinish();
      case PDL2Package.GUIDANCE: return createGuidance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.enseeiht.pDL2.Process createProcess()
  {
    ProcessImpl process = new ProcessImpl();
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessElement createProcessElement()
  {
    ProcessElementImpl processElement = new ProcessElementImpl();
    return processElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition createWorkDefinition()
  {
    WorkDefinitionImpl workDefinition = new WorkDefinitionImpl();
    return workDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependanceStart createDependanceStart()
  {
    DependanceStartImpl dependanceStart = new DependanceStartImpl();
    return dependanceStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequenceKindStart createWorkSequenceKindStart()
  {
    WorkSequenceKindStartImpl workSequenceKindStart = new WorkSequenceKindStartImpl();
    return workSequenceKindStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependanceFinish createDependanceFinish()
  {
    DependanceFinishImpl dependanceFinish = new DependanceFinishImpl();
    return dependanceFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkSequenceKindFinish createWorkSequenceKindFinish()
  {
    WorkSequenceKindFinishImpl workSequenceKindFinish = new WorkSequenceKindFinishImpl();
    return workSequenceKindFinish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guidance createGuidance()
  {
    GuidanceImpl guidance = new GuidanceImpl();
    return guidance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL2Package getPDL2Package()
  {
    return (PDL2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDL2Package getPackage()
  {
    return PDL2Package.eINSTANCE;
  }

} //PDL2FactoryImpl
