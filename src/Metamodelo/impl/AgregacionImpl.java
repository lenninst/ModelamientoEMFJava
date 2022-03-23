/**
 */
package Metamodelo.impl;

import Metamodelo.Agregacion;
import Metamodelo.Clase;
import Metamodelo.MetamodeloPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agregacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.AgregacionImpl#getClase <em>Clase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgregacionImpl extends ReferenciaImpl implements Agregacion {
	/**
	 * The cached value of the '{@link #getClase() <em>Clase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClase()
	 * @generated
	 * @ordered
	 */
	protected Clase clase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgregacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.AGREGACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getClase() {
		if (clase != null && clase.eIsProxy()) {
			InternalEObject oldClase = (InternalEObject)clase;
			clase = (Clase)eResolveProxy(oldClase);
			if (clase != oldClase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.AGREGACION__CLASE, oldClase, clase));
			}
		}
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase basicGetClase() {
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClase(Clase newClase, NotificationChain msgs) {
		Clase oldClase = clase;
		clase = newClase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.AGREGACION__CLASE, oldClase, newClase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClase(Clase newClase) {
		if (newClase != clase) {
			NotificationChain msgs = null;
			if (clase != null)
				msgs = ((InternalEObject)clase).eInverseRemove(this, MetamodeloPackage.CLASE__AGREGACION, Clase.class, msgs);
			if (newClase != null)
				msgs = ((InternalEObject)newClase).eInverseAdd(this, MetamodeloPackage.CLASE__AGREGACION, Clase.class, msgs);
			msgs = basicSetClase(newClase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.AGREGACION__CLASE, newClase, newClase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodeloPackage.AGREGACION__CLASE:
				if (clase != null)
					msgs = ((InternalEObject)clase).eInverseRemove(this, MetamodeloPackage.CLASE__AGREGACION, Clase.class, msgs);
				return basicSetClase((Clase)otherEnd, msgs);
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
			case MetamodeloPackage.AGREGACION__CLASE:
				return basicSetClase(null, msgs);
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
			case MetamodeloPackage.AGREGACION__CLASE:
				if (resolve) return getClase();
				return basicGetClase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodeloPackage.AGREGACION__CLASE:
				setClase((Clase)newValue);
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
			case MetamodeloPackage.AGREGACION__CLASE:
				setClase((Clase)null);
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
			case MetamodeloPackage.AGREGACION__CLASE:
				return clase != null;
		}
		return super.eIsSet(featureID);
	}

} //AgregacionImpl
