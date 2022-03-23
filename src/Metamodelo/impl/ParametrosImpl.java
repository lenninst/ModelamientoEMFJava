/**
 */
package Metamodelo.impl;

import Metamodelo.DataType;
import Metamodelo.MetamodeloPackage;
import Metamodelo.Parametros;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametros</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.ParametrosImpl#getNombreParametro <em>Nombre Parametro</em>}</li>
 *   <li>{@link Metamodelo.impl.ParametrosImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametrosImpl extends MinimalEObjectImpl.Container implements Parametros {
	/**
	 * The default value of the '{@link #getNombreParametro() <em>Nombre Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreParametro()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PARAMETRO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreParametro() <em>Nombre Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreParametro()
	 * @generated
	 * @ordered
	 */
	protected String nombreParametro = NOMBRE_PARAMETRO_EDEFAULT;

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
	protected ParametrosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.PARAMETROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreParametro() {
		return nombreParametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreParametro(String newNombreParametro) {
		String oldNombreParametro = nombreParametro;
		nombreParametro = newNombreParametro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.PARAMETROS__NOMBRE_PARAMETRO, oldNombreParametro, nombreParametro));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.PARAMETROS__DATATYPE, oldDatatype, datatype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.PARAMETROS__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloPackage.PARAMETROS__NOMBRE_PARAMETRO:
				return getNombreParametro();
			case MetamodeloPackage.PARAMETROS__DATATYPE:
				if (resolve) return getDatatype();
				return basicGetDatatype();
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
			case MetamodeloPackage.PARAMETROS__NOMBRE_PARAMETRO:
				setNombreParametro((String)newValue);
				return;
			case MetamodeloPackage.PARAMETROS__DATATYPE:
				setDatatype((DataType)newValue);
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
			case MetamodeloPackage.PARAMETROS__NOMBRE_PARAMETRO:
				setNombreParametro(NOMBRE_PARAMETRO_EDEFAULT);
				return;
			case MetamodeloPackage.PARAMETROS__DATATYPE:
				setDatatype((DataType)null);
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
			case MetamodeloPackage.PARAMETROS__NOMBRE_PARAMETRO:
				return NOMBRE_PARAMETRO_EDEFAULT == null ? nombreParametro != null : !NOMBRE_PARAMETRO_EDEFAULT.equals(nombreParametro);
			case MetamodeloPackage.PARAMETROS__DATATYPE:
				return datatype != null;
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
		result.append(" (nombreParametro: ");
		result.append(nombreParametro);
		result.append(')');
		return result.toString();
	}

} //ParametrosImpl
