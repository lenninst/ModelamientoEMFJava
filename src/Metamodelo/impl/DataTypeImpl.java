/**
 */
package Metamodelo.impl;

import Metamodelo.DataType;
import Metamodelo.MetamodeloPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.DataTypeImpl#getNombreDataType <em>Nombre Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The default value of the '{@link #getNombreDataType() <em>Nombre Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreDataType() <em>Nombre Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreDataType()
	 * @generated
	 * @ordered
	 */
	protected String nombreDataType = NOMBRE_DATA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreDataType() {
		return nombreDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreDataType(String newNombreDataType) {
		String oldNombreDataType = nombreDataType;
		nombreDataType = newNombreDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.DATA_TYPE__NOMBRE_DATA_TYPE, oldNombreDataType, nombreDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloPackage.DATA_TYPE__NOMBRE_DATA_TYPE:
				return getNombreDataType();
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
			case MetamodeloPackage.DATA_TYPE__NOMBRE_DATA_TYPE:
				setNombreDataType((String)newValue);
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
			case MetamodeloPackage.DATA_TYPE__NOMBRE_DATA_TYPE:
				setNombreDataType(NOMBRE_DATA_TYPE_EDEFAULT);
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
			case MetamodeloPackage.DATA_TYPE__NOMBRE_DATA_TYPE:
				return NOMBRE_DATA_TYPE_EDEFAULT == null ? nombreDataType != null : !NOMBRE_DATA_TYPE_EDEFAULT.equals(nombreDataType);
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
		result.append(" (nombreDataType: ");
		result.append(nombreDataType);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
