/**
 */
package fr.insa.petrinet.petrinet.impl;

import fr.insa.petrinet.petrinet.Arc;
import fr.insa.petrinet.petrinet.Noeud;
import fr.insa.petrinet.petrinet.PetriNet;
import fr.insa.petrinet.petrinet.PetrinetPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.PetriNetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.PetriNetImpl#getNoeuds <em>Noeuds</em>}</li>
 *   <li>{@link fr.insa.petrinet.petrinet.impl.PetriNetImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends MinimalEObjectImpl.Container implements PetriNet
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
   * The cached value of the '{@link #getNoeuds() <em>Noeuds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNoeuds()
   * @generated
   * @ordered
   */
  protected EList<Noeud> noeuds;

  /**
   * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcs()
   * @generated
   * @ordered
   */
  protected EList<Arc> arcs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PetriNetImpl()
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
    return PetrinetPackage.Literals.PETRI_NET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PETRI_NET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Noeud> getNoeuds()
  {
    if (noeuds == null)
    {
      noeuds = new EObjectContainmentEList<Noeud>(Noeud.class, this, PetrinetPackage.PETRI_NET__NOEUDS);
    }
    return noeuds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arc> getArcs()
  {
    if (arcs == null)
    {
      arcs = new EObjectContainmentEList<Arc>(Arc.class, this, PetrinetPackage.PETRI_NET__ARCS);
    }
    return arcs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PetrinetPackage.PETRI_NET__NOEUDS:
        return ((InternalEList<?>)getNoeuds()).basicRemove(otherEnd, msgs);
      case PetrinetPackage.PETRI_NET__ARCS:
        return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case PetrinetPackage.PETRI_NET__NAME:
        return getName();
      case PetrinetPackage.PETRI_NET__NOEUDS:
        return getNoeuds();
      case PetrinetPackage.PETRI_NET__ARCS:
        return getArcs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PetrinetPackage.PETRI_NET__NAME:
        setName((String)newValue);
        return;
      case PetrinetPackage.PETRI_NET__NOEUDS:
        getNoeuds().clear();
        getNoeuds().addAll((Collection<? extends Noeud>)newValue);
        return;
      case PetrinetPackage.PETRI_NET__ARCS:
        getArcs().clear();
        getArcs().addAll((Collection<? extends Arc>)newValue);
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
      case PetrinetPackage.PETRI_NET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PetrinetPackage.PETRI_NET__NOEUDS:
        getNoeuds().clear();
        return;
      case PetrinetPackage.PETRI_NET__ARCS:
        getArcs().clear();
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
      case PetrinetPackage.PETRI_NET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PetrinetPackage.PETRI_NET__NOEUDS:
        return noeuds != null && !noeuds.isEmpty();
      case PetrinetPackage.PETRI_NET__ARCS:
        return arcs != null && !arcs.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //PetriNetImpl
