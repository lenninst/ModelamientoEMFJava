/**
 */
package Metamodelo.impl;

import Metamodelo.Atributos;
import Metamodelo.Clase;
import Metamodelo.DataType;
import Metamodelo.MetamodeloPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.AtributosImpl#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link Metamodelo.impl.AtributosImpl#getEncapculamiento <em>Encapculamiento</em>}</li>
 *   <li>{@link Metamodelo.impl.AtributosImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link Metamodelo.impl.AtributosImpl#getClase <em>Clase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributosImpl extends MinimalEObjectImpl.Container implements Atributos {
	/**
	 * The default value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ATRIBUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected String nombreAtributo = NOMBRE_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncapculamiento() <em>Encapculamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapculamiento()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCAPCULAMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapculamiento() <em>Encapculamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapculamiento()
	 * @generated
	 * @ordered
	 */
	protected String encapculamiento = ENCAPCULAMIENTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.ATRIBUTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreAtributo() {
		return nombreAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAtributo(String newNombreAtributo) {
		String oldNombreAtributo = nombreAtributo;
		nombreAtributo = newNombreAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.ATRIBUTOS__NOMBRE_ATRIBUTO, oldNombreAtributo, nombreAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncapculamiento() {
		return encapculamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapculamiento(String newEncapculamiento) {
		String oldEncapculamiento = encapculamiento;
		encapculamiento = newEncapculamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.ATRIBUTOS__ENCAPCULAMIENTO, oldEncapculamiento, encapculamiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject)datatype;
			datatype = (DataType)eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.ATRIBUTOS__DATATYPE, oldDatatype, datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.ATRIBUTOS__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getClase() {
		if (eContainerFeatureID() != MetamodeloPackage.ATRIBUTOS__CLASE) return null;
		return (Clase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClase(Clase newClase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClase, MetamodeloPackage.ATRIBUTOS__CLASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClase(Clase newClase) {
		if (newClase != eInternalContainer() || (eContainerFeatureID() != MetamodeloPackage.ATRIBUTOS__CLASE && newClase != null)) {
			if (EcoreUtil.isAncestor(this, newClase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClase != null)
				msgs = ((InternalEObject)newClase).eInverseAdd(this, MetamodeloPackage.CLASE__ATRIBUTOS, Clase.class, msgs);
			msgs = basicSetClase(newClase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.ATRIBUTOS__CLASE, newClase, newClase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodeloPackage.ATRIBUTOS__CLASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case MetamodeloPackage.ATRIBUTOS__CLASE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetamodeloPackage.ATRIBUTOS__CLASE:
				return eInternalContainer().eInverseRemove(this, MetamodeloPackage.CLASE__ATRIBUTOS, Clase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloPackage.ATRIBUTOS__NOMBRE_ATRIBUTO:
				return getNombreAtributo();
			case MetamodeloPackage.ATRIBUTOS__ENCAPCULAMIENTO:
				return getEncapculamiento();
			case MetamodeloPackage.ATRIBUTOS__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
			case MetamodeloPackage.ATRIBUTOS__CLASE:
				return getClase();
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
			case MetamodeloPackage.ATRIBUTOS__NOMBRE_ATRIBUTO:
				setNombreAtributo((String)newValue);
				return;
			case MetamodeloPackage.ATRIBUTOS__ENCAPCULAMIENTO:
				setEncapculamiento((String)newValue);
				return;
			case MetamodeloPackage.ATRIBUTOS__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case MetamodeloPackage.ATRIBUTOS__CLASE:
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
			case MetamodeloPackage.ATRIBUTOS__NOMBRE_ATRIBUTO:
				setNombreAtributo(NOMBRE_ATRIBUTO_EDEFAULT);
				return;
			case MetamodeloPackage.ATRIBUTOS__ENCAPCULAMIENTO:
				setEncapculamiento(ENCAPCULAMIENTO_EDEFAULT);
				return;
			case MetamodeloPackage.ATRIBUTOS__DATATYPE:
				setDatatype((DataType)null);
				return;
			case MetamodeloPackage.ATRIBUTOS__CLASE:
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
			case MetamodeloPackage.ATRIBUTOS__NOMBRE_ATRIBUTO:
				return NOMBRE_ATRIBUTO_EDEFAULT == null ? nombreAtributo != null : !NOMBRE_ATRIBUTO_EDEFAULT.equals(nombreAtributo);
			case MetamodeloPackage.ATRIBUTOS__ENCAPCULAMIENTO:
				return ENCAPCULAMIENTO_EDEFAULT == null ? encapculamiento != null : !ENCAPCULAMIENTO_EDEFAULT.equals(encapculamiento);
			case MetamodeloPackage.ATRIBUTOS__DATATYPE:
				return datatype != null;
			case MetamodeloPackage.ATRIBUTOS__CLASE:
				return getClase() != null;
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
		result.append(" (nombreAtributo: ");
		result.append(nombreAtributo);
		result.append(", encapculamiento: ");
		result.append(encapculamiento);
		result.append(')');
		return result.toString();
	}

} //AtributosImpl
