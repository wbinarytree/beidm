/**
 */
package fr.enseeiht.pDL1.impl;

import fr.enseeiht.pDL1.Guidance;
import fr.enseeiht.pDL1.PDL1Factory;
import fr.enseeiht.pDL1.PDL1Package;
import fr.enseeiht.pDL1.ProcessElement;
import fr.enseeiht.pDL1.WorkDefinition;
import fr.enseeiht.pDL1.WorkSequence;
import fr.enseeiht.pDL1.WorkSequenceType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class PDL1FactoryImpl extends EFactoryImpl implements PDL1Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PDL1Factory init()
  {
    try
    {
      PDL1Factory thePDL1Factory = (PDL1Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.enseeiht.fr/PDL1"); 
      if (thePDL1Factory != null)
      {
        return thePDL1Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PDL1FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL1FactoryImpl()
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
      case PDL1Package.PROCESS: return createProcess();
      case PDL1Package.PROCESS_ELEMENT: return createProcessElement();
      case PDL1Package.WORK_DEFINITION: return createWorkDefinition();
      case PDL1Package.WORK_SEQUENCE: return createWorkSequence();
      case PDL1Package.GUIDANCE: return createGuidance();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDL1Package.WORK_SEQUENCE_TYPE:
        return createWorkSequenceTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PDL1Package.WORK_SEQUENCE_TYPE:
        return convertWorkSequenceTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fr.enseeiht.pDL1.Process createProcess()
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
  public WorkSequence createWorkSequence()
  {
    WorkSequenceImpl workSequence = new WorkSequenceImpl();
    return workSequence;
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
  public WorkSequenceType createWorkSequenceTypeFromString(EDataType eDataType, String initialValue)
  {
    WorkSequenceType result = WorkSequenceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWorkSequenceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PDL1Package getPDL1Package()
  {
    return (PDL1Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PDL1Package getPackage()
  {
    return PDL1Package.eINSTANCE;
  }

} //PDL1FactoryImpl
