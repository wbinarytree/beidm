/**
 */
package fr.insa.petrinet.petrinet.impl;

import fr.insa.petrinet.petrinet.PetrinetPackage;
import fr.insa.petrinet.petrinet.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.TransitionImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.TransitionImpl#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends NoeudImpl implements Transition
{
  /**
   * The default value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinTime()
   * @generated
   * @ordered
   */
  protected static final int MIN_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinTime()
   * @generated
   * @ordered
   */
  protected int minTime = MIN_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxTime()
   * @generated
   * @ordered
   */
  protected static final int MAX_TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxTime()
   * @generated
   * @ordered
   */
  protected int maxTime = MAX_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return PetrinetPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinTime()
  {
    return minTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinTime(int newMinTime)
  {
    int oldMinTime = minTime;
    minTime = newMinTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.TRANSITION__MIN_TIME, oldMinTime, minTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxTime()
  {
    return maxTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxTime(int newMaxTime)
  {
    int oldMaxTime = maxTime;
    maxTime = newMaxTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.TRANSITION__MAX_TIME, oldMaxTime, maxTime));
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
      case PetrinetPackage.TRANSITION__MIN_TIME:
        return getMinTime();
      case PetrinetPackage.TRANSITION__MAX_TIME:
        return getMaxTime();
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
      case PetrinetPackage.TRANSITION__MIN_TIME:
        setMinTime((Integer)newValue);
        return;
      case PetrinetPackage.TRANSITION__MAX_TIME:
        setMaxTime((Integer)newValue);
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
      case PetrinetPackage.TRANSITION__MIN_TIME:
        setMinTime(MIN_TIME_EDEFAULT);
        return;
      case PetrinetPackage.TRANSITION__MAX_TIME:
        setMaxTime(MAX_TIME_EDEFAULT);
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
      case PetrinetPackage.TRANSITION__MIN_TIME:
        return minTime != MIN_TIME_EDEFAULT;
      case PetrinetPackage.TRANSITION__MAX_TIME:
        return maxTime != MAX_TIME_EDEFAULT;
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
    result.append(" (minTime: ");
    result.append(minTime);
    result.append(", maxTime: ");
    result.append(maxTime);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
