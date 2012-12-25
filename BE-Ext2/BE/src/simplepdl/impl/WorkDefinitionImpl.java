/**
 */
package simplepdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplepdl.RessourceInstance;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To Predecessors</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getMin_time <em>Min time</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getMax_time <em>Max time</em>}</li>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToRessources <em>Links To Ressources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkDefinitionImpl extends EObjectImpl implements WorkDefinition {
	/**
	 * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToPredecessors;

	/**
	 * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkSequence> linksToSuccessors;

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
	 * The default value of the '{@link #getMin_time() <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin_time() <em>Min time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_time()
	 * @generated
	 * @ordered
	 */
	protected int min_time = MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_time() <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_time() <em>Max time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_time()
	 * @generated
	 * @ordered
	 */
	protected int max_time = MAX_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinksToRessources() <em>Links To Ressources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<RessourceInstance> linksToRessources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.WORK_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getLinksToPredecessors() {
		if (linksToPredecessors == null) {
			linksToPredecessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS, SimplepdlPackage.WORK_SEQUENCE__SUCCESSOR);
		}
		return linksToPredecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkSequence> getLinksToSuccessors() {
		if (linksToSuccessors == null) {
			linksToSuccessors = new EObjectWithInverseResolvingEList<WorkSequence>(WorkSequence.class, this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS, SimplepdlPackage.WORK_SEQUENCE__PREDECESSOR);
		}
		return linksToSuccessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMin_time() {
		return min_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_time(int newMin_time) {
		int oldMin_time = min_time;
		min_time = newMin_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__MIN_TIME, oldMin_time, min_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_time() {
		return max_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_time(int newMax_time) {
		int oldMax_time = max_time;
		max_time = newMax_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__MAX_TIME, oldMax_time, max_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RessourceInstance> getLinksToRessources() {
		if (linksToRessources == null) {
			linksToRessources = new EObjectWithInverseResolvingEList<RessourceInstance>(RessourceInstance.class, this, SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES, SimplepdlPackage.RESSOURCE_INSTANCE__ACTIVITY);
		}
		return linksToRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToPredecessors()).basicAdd(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToSuccessors()).basicAdd(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinksToRessources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return ((InternalEList<?>)getLinksToPredecessors()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return ((InternalEList<?>)getLinksToSuccessors()).basicRemove(otherEnd, msgs);
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				return ((InternalEList<?>)getLinksToRessources()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return getLinksToPredecessors();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return getLinksToSuccessors();
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				return getName();
			case SimplepdlPackage.WORK_DEFINITION__MIN_TIME:
				return getMin_time();
			case SimplepdlPackage.WORK_DEFINITION__MAX_TIME:
				return getMax_time();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				return getLinksToRessources();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				getLinksToPredecessors().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				getLinksToSuccessors().addAll((Collection<? extends WorkSequence>)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__MIN_TIME:
				setMin_time((Integer)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__MAX_TIME:
				setMax_time((Integer)newValue);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				getLinksToRessources().clear();
				getLinksToRessources().addAll((Collection<? extends RessourceInstance>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				getLinksToPredecessors().clear();
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				getLinksToSuccessors().clear();
				return;
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplepdlPackage.WORK_DEFINITION__MIN_TIME:
				setMin_time(MIN_TIME_EDEFAULT);
				return;
			case SimplepdlPackage.WORK_DEFINITION__MAX_TIME:
				setMax_time(MAX_TIME_EDEFAULT);
				return;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				getLinksToRessources().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
				return linksToPredecessors != null && !linksToPredecessors.isEmpty();
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
				return linksToSuccessors != null && !linksToSuccessors.isEmpty();
			case SimplepdlPackage.WORK_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplepdlPackage.WORK_DEFINITION__MIN_TIME:
				return min_time != MIN_TIME_EDEFAULT;
			case SimplepdlPackage.WORK_DEFINITION__MAX_TIME:
				return max_time != MAX_TIME_EDEFAULT;
			case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_RESSOURCES:
				return linksToRessources != null && !linksToRessources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", min_time: ");
		result.append(min_time);
		result.append(", max_time: ");
		result.append(max_time);
		result.append(')');
		return result.toString();
	}

} //WorkDefinitionImpl
