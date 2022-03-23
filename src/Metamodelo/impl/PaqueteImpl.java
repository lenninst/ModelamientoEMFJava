/**
 */
package Metamodelo.impl;

import Metamodelo.Clase;
import Metamodelo.ClaseAbstracta;
import Metamodelo.Interface;
import Metamodelo.MetamodeloPackage;
import Metamodelo.Paquete;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.PaqueteImpl#getNombrePaquete <em>Nombre Paquete</em>}</li>
 *   <li>{@link Metamodelo.impl.PaqueteImpl#getClaseabstracta <em>Claseabstracta</em>}</li>
 *   <li>{@link Metamodelo.impl.PaqueteImpl#getClase <em>Clase</em>}</li>
 *   <li>{@link Metamodelo.impl.PaqueteImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaqueteImpl extends MinimalEObjectImpl.Container implements Paquete {
	/**
	 * The default value of the '{@link #getNombrePaquete() <em>Nombre Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePaquete()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PAQUETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombrePaquete() <em>Nombre Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePaquete()
	 * @generated
	 * @ordered
	 */
	protected String nombrePaquete = NOMBRE_PAQUETE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClaseabstracta() <em>Claseabstracta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaseabstracta()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaseAbstracta> claseabstracta;

	/**
	 * The cached value of the '{@link #getClase() <em>Clase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClase()
	 * @generated
	 * @ordered
	 */
	protected Clase clase;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.PAQUETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombrePaquete() {
		return nombrePaquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePaquete(String newNombrePaquete) {
		String oldNombrePaquete = nombrePaquete;
		nombrePaquete = newNombrePaquete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.PAQUETE__NOMBRE_PAQUETE, oldNombrePaquete, nombrePaquete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaseAbstracta> getClaseabstracta() {
		if (claseabstracta == null) {
			claseabstracta = new EObjectContainmentEList<ClaseAbstracta>(ClaseAbstracta.class, this, MetamodeloPackage.PAQUETE__CLASEABSTRACTA);
		}
		return claseabstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getClase() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.PAQUETE__CLASE, oldClase, newClase);
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
				msgs = ((InternalEObject)clase).eInverseRemove(this, MetamodeloPackage.CLASE__PAQUETE, Clase.class, msgs);
			if (newClase != null)
				msgs = ((InternalEObject)newClase).eInverseAdd(this, MetamodeloPackage.CLASE__PAQUETE, Clase.class, msgs);
			msgs = basicSetClase(newClase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.PAQUETE__CLASE, newClase, newClase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, MetamodeloPackage.PAQUETE__INTERFACE, MetamodeloPackage.INTERFACE__PAQUETE);
		}
		return interface_;
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
			case MetamodeloPackage.PAQUETE__CLASE:
				if (clase != null)
					msgs = ((InternalEObject)clase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodeloPackage.PAQUETE__CLASE, null, msgs);
				return basicSetClase((Clase)otherEnd, msgs);
			case MetamodeloPackage.PAQUETE__INTERFACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterface()).basicAdd(otherEnd, msgs);
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
			case MetamodeloPackage.PAQUETE__CLASEABSTRACTA:
				return ((InternalEList<?>)getClaseabstracta()).basicRemove(otherEnd, msgs);
			case MetamodeloPackage.PAQUETE__CLASE:
				return basicSetClase(null, msgs);
			case MetamodeloPackage.PAQUETE__INTERFACE:
				return ((InternalEList<?>)getInterface()).basicRemove(otherEnd, msgs);
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
			case MetamodeloPackage.PAQUETE__NOMBRE_PAQUETE:
				return getNombrePaquete();
			case MetamodeloPackage.PAQUETE__CLASEABSTRACTA:
				return getClaseabstracta();
			case MetamodeloPackage.PAQUETE__CLASE:
				return getClase();
			case MetamodeloPackage.PAQUETE__INTERFACE:
				return getInterface();
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
			case MetamodeloPackage.PAQUETE__NOMBRE_PAQUETE:
				setNombrePaquete((String)newValue);
				return;
			case MetamodeloPackage.PAQUETE__CLASEABSTRACTA:
				getClaseabstracta().clear();
				getClaseabstracta().addAll((Collection<? extends ClaseAbstracta>)newValue);
				return;
			case MetamodeloPackage.PAQUETE__CLASE:
				setClase((Clase)newValue);
				return;
			case MetamodeloPackage.PAQUETE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends Interface>)newValue);
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
			case MetamodeloPackage.PAQUETE__NOMBRE_PAQUETE:
				setNombrePaquete(NOMBRE_PAQUETE_EDEFAULT);
				return;
			case MetamodeloPackage.PAQUETE__CLASEABSTRACTA:
				getClaseabstracta().clear();
				return;
			case MetamodeloPackage.PAQUETE__CLASE:
				setClase((Clase)null);
				return;
			case MetamodeloPackage.PAQUETE__INTERFACE:
				getInterface().clear();
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
			case MetamodeloPackage.PAQUETE__NOMBRE_PAQUETE:
				return NOMBRE_PAQUETE_EDEFAULT == null ? nombrePaquete != null : !NOMBRE_PAQUETE_EDEFAULT.equals(nombrePaquete);
			case MetamodeloPackage.PAQUETE__CLASEABSTRACTA:
				return claseabstracta != null && !claseabstracta.isEmpty();
			case MetamodeloPackage.PAQUETE__CLASE:
				return clase != null;
			case MetamodeloPackage.PAQUETE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombrePaquete: ");
		result.append(nombrePaquete);
		result.append(')');
		return result.toString();
	}

} //PaqueteImpl
