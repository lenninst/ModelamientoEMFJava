/**
 */
package Metamodelo.impl;

import Metamodelo.MetamodeloPackage;
import Metamodelo.Referencia;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.ReferenciaImpl#getNombreReferencia <em>Nombre Referencia</em>}</li>
 *   <li>{@link Metamodelo.impl.ReferenciaImpl#getMultiplicidad <em>Multiplicidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenciaImpl extends MinimalEObjectImpl.Container implements Referencia {
	/**
	 * The default value of the '{@link #getNombreReferencia() <em>Nombre Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreReferencia()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_REFERENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreReferencia() <em>Nombre Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreReferencia()
	 * @generated
	 * @ordered
	 */
	protected String nombreReferencia = NOMBRE_REFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicidad() <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicidad()
	 * @generated
	 * @ordered
	 */
	protected String multiplicidad = MULTIPLICIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.REFERENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreReferencia() {
		return nombreReferencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreReferencia(String newNombreReferencia) {
		String oldNombreReferencia = nombreReferencia;
		nombreReferencia = newNombreReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.REFERENCIA__NOMBRE_REFERENCIA, oldNombreReferencia, nombreReferencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicidad() {
		return multiplicidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicidad(String newMultiplicidad) {
		String oldMultiplicidad = multiplicidad;
		multiplicidad = newMultiplicidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.REFERENCIA__MULTIPLICIDAD, oldMultiplicidad, multiplicidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloPackage.REFERENCIA__NOMBRE_REFERENCIA:
				return getNombreReferencia();
			case MetamodeloPackage.REFERENCIA__MULTIPLICIDAD:
				return getMultiplicidad();
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
			case MetamodeloPackage.REFERENCIA__NOMBRE_REFERENCIA:
				setNombreReferencia((String)newValue);
				return;
			case MetamodeloPackage.REFERENCIA__MULTIPLICIDAD:
				setMultiplicidad((String)newValue);
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
			case MetamodeloPackage.REFERENCIA__NOMBRE_REFERENCIA:
				setNombreReferencia(NOMBRE_REFERENCIA_EDEFAULT);
				return;
			case MetamodeloPackage.REFERENCIA__MULTIPLICIDAD:
				setMultiplicidad(MULTIPLICIDAD_EDEFAULT);
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
			case MetamodeloPackage.REFERENCIA__NOMBRE_REFERENCIA:
				return NOMBRE_REFERENCIA_EDEFAULT == null ? nombreReferencia != null : !NOMBRE_REFERENCIA_EDEFAULT.equals(nombreReferencia);
			case MetamodeloPackage.REFERENCIA__MULTIPLICIDAD:
				return MULTIPLICIDAD_EDEFAULT == null ? multiplicidad != null : !MULTIPLICIDAD_EDEFAULT.equals(multiplicidad);
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
		result.append(" (nombreReferencia: ");
		result.append(nombreReferencia);
		result.append(", multiplicidad: ");
		result.append(multiplicidad);
		result.append(')');
		return result.toString();
	}

} //ReferenciaImpl
