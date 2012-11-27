/**
 */
package fr.enseeiht.pDL2.impl;

import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.WorkSequenceKindStart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Sequence Kind Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl#getStarted2Start <em>Started2 Start</em>}</li>
 *   <li>{@link fr.enseeiht.pDL2.impl.WorkSequenceKindStartImpl#getStarted2Finish <em>Started2 Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkSequenceKindStartImpl extends MinimalEObjectImpl.Container implements WorkSequenceKindStart
{
  /**
   * The default value of the '{@link #getStarted2Start() <em>Started2 Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarted2Start()
   * @generated
   * @ordered
   */
  protected static final String STARTED2_START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStarted2Start() <em>Started2 Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarted2Start()
   * @generated
   * @ordered
   */
  protected String started2Start = STARTED2_START_EDEFAULT;

  /**
   * The default value of the '{@link #getStarted2Finish() <em>Started2 Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarted2Finish()
   * @generated
   * @ordered
   */
  protected static final String STARTED2_FINISH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStarted2Finish() <em>Started2 Finish</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStarted2Finish()
   * @generated
   * @ordered
   */
  protected String started2Finish = STARTED2_FINISH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkSequenceKindStartImpl()
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
    return PDL2Package.Literals.WORK_SEQUENCE_KIND_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStarted2Start()
  {
    return started2Start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStarted2Start(String newStarted2Start)
  {
    String oldStarted2Start = started2Start;
    started2Start = newStarted2Start;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_START, oldStarted2Start, started2Start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStarted2Finish()
  {
    return started2Finish;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStarted2Finish(String newStarted2Finish)
  {
    String oldStarted2Finish = started2Finish;
    started2Finish = newStarted2Finish;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_FINISH, oldStarted2Finish, started2Finish));
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
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_START:
        return getStarted2Start();
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_FINISH:
        return getStarted2Finish();
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
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_START:
        setStarted2Start((String)newValue);
        return;
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_FINISH:
        setStarted2Finish((String)newValue);
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
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_START:
        setStarted2Start(STARTED2_START_EDEFAULT);
        return;
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_FINISH:
        setStarted2Finish(STARTED2_FINISH_EDEFAULT);
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
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_START:
        return STARTED2_START_EDEFAULT == null ? started2Start != null : !STARTED2_START_EDEFAULT.equals(started2Start);
      case PDL2Package.WORK_SEQUENCE_KIND_START__STARTED2_FINISH:
        return STARTED2_FINISH_EDEFAULT == null ? started2Finish != null : !STARTED2_FINISH_EDEFAULT.equals(started2Finish);
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
    result.append(" (Started2Start: ");
    result.append(started2Start);
    result.append(", Started2Finish: ");
    result.append(started2Finish);
    result.append(')');
    return result.toString();
  }

} //WorkSequenceKindStartImpl