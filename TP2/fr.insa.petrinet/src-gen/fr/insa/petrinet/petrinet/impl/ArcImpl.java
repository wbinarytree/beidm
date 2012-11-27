/**
 */
package fr.insa.petrinet.petrinet.impl;

import fr.insa.petrinet.petrinet.Arc;
import fr.insa.petrinet.petrinet.ArcKindType;
import fr.insa.petrinet.petrinet.Noeud;
import fr.insa.petrinet.petrinet.PetrinetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.ArcImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.ArcImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.ArcImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.ArcImpl#getArcType <em>Arc Type</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.ArcImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Noeud source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Noeud target;

  /**
   * The default value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcType()
   * @generated
   * @ordered
   */
  protected static final ArcKindType ARC_TYPE_EDEFAULT = ArcKindType.NORMAL;

  /**
   * The cached value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcType()
   * @generated
   * @ordered
   */
  protected ArcKindType arcType = ARC_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected static final int WEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeight()
   * @generated
   * @ordered
   */
  protected int weight = WEIGHT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArcImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PetrinetPackage.Literals.ARC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Noeud getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Noeud)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Noeud basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Noeud newSource)
  {
    Noeud oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Noeud getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Noeud)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetPackage.ARC__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Noeud basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Noeud newTarget)
  {
    Noeud oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArcKindType getArcType()
  {
    return arcType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArcType(ArcKindType newArcType)
  {
    ArcKindType oldArcType = arcType;
    arcType = newArcType == null ? ARC_TYPE_EDEFAULT : newArcType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__ARC_TYPE, oldArcType, arcType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWeight()
  {
    return weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeight(int newWeight)
  {
    int oldWeight = weight;
    weight = newWeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__WEIGHT, oldWeight, weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PetrinetPackage.ARC__NAME:
        return getName();
      case PetrinetPackage.ARC__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case PetrinetPackage.ARC__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case PetrinetPackage.ARC__ARC_TYPE:
        return getArcType();
      case PetrinetPackage.ARC__WEIGHT:
        return getWeight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PetrinetPackage.ARC__NAME:
        setName((String)newValue);
        return;
      case PetrinetPackage.ARC__SOURCE:
        setSource((Noeud)newValue);
        return;
      case PetrinetPackage.ARC__TARGET:
        setTarget((Noeud)newValue);
        return;
      case PetrinetPackage.ARC__ARC_TYPE:
        setArcType((ArcKindType)newValue);
        return;
      case PetrinetPackage.ARC__WEIGHT:
        setWeight((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PetrinetPackage.ARC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PetrinetPackage.ARC__SOURCE:
        setSource((Noeud)null);
        return;
      case PetrinetPackage.ARC__TARGET:
        setTarget((Noeud)null);
        return;
      case PetrinetPackage.ARC__ARC_TYPE:
        setArcType(ARC_TYPE_EDEFAULT);
        return;
      case PetrinetPackage.ARC__WEIGHT:
        setWeight(WEIGHT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PetrinetPackage.ARC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PetrinetPackage.ARC__SOURCE:
        return source != null;
      case PetrinetPackage.ARC__TARGET:
        return target != null;
      case PetrinetPackage.ARC__ARC_TYPE:
        return arcType != ARC_TYPE_EDEFAULT;
      case PetrinetPackage.ARC__WEIGHT:
        return weight != WEIGHT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", arcType: ");
    result.append(arcType);
    result.append(", weight: ");
    result.append(weight);
    result.append(')');
    return result.toString();
  }

} //ArcImpl
