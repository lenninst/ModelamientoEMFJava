/**
 */
package Metamodelo.impl;

import Metamodelo.DataType;
import Metamodelo.MetamodeloPackage;
import Metamodelo.Operaciones;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operaciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.OperacionesImpl#getNombreOperacion <em>Nombre Operacion</em>}</li>
 *   <li>{@link Metamodelo.impl.OperacionesImpl#getEncapsulamiento <em>Encapsulamiento</em>}</li>
 *   <li>{@link Metamodelo.impl.OperacionesImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperacionesImpl extends MinimalEObjectImpl.Container implements Operaciones {
	/**
	 * The default value of the '{@link #getNombreOperacion() <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOperacion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_OPERACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreOperacion() <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreOperacion()
	 * @generated
	 * @ordered
	 */
	protected String nombreOperacion = NOMBRE_OPERACION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncapsulamiento() <em>Encapsulamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulamiento()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCAPSULAMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulamiento() <em>Encapsulamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulamiento()
	 * @generated
	 * @ordered
	 */
	protected String encapsulamiento = ENCAPSULAMIENTO_EDEFAULT;

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
	protected OperacionesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.OPERACIONES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreOperacion() {
		return nombreOperacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreOperacion(String newNombreOperacion) {
		String oldNombreOperacion = nombreOperacion;
		nombreOperacion = newNombreOperacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.OPERACIONES__NOMBRE_OPERACION, oldNombreOperacion, nombreOperacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncapsulamiento() {
		return encapsulamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncapsulamiento(String newEncapsulamiento) {
		String oldEncapsulamiento = encapsulamiento;
		encapsulamiento = newEncapsulamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.OPERACIONES__ENCAPSULAMIENTO, oldEncapsulamiento, encapsulamiento));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.OPERACIONES__DATATYPE, oldDatatype, datatype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.OPERACIONES__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloPackage.OPERACIONES__NOMBRE_OPERACION:
				return getNombreOperacion();
			case MetamodeloPackage.OPERACIONES__ENCAPSULAMIENTO:
				return getEncapsulamiento();
			case MetamodeloPackage.OPERACIONES__DATATYPE:
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
			case MetamodeloPackage.OPERACIONES__NOMBRE_OPERACION:
				setNombreOperacion((String)newValue);
				return;
			case MetamodeloPackage.OPERACIONES__ENCAPSULAMIENTO:
				setEncapsulamiento((String)newValue);
				return;
			case MetamodeloPackage.OPERACIONES__DATATYPE:
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
			case MetamodeloPackage.OPERACIONES__NOMBRE_OPERACION:
				setNombreOperacion(NOMBRE_OPERACION_EDEFAULT);
				return;
			case MetamodeloPackage.OPERACIONES__ENCAPSULAMIENTO:
				setEncapsulamiento(ENCAPSULAMIENTO_EDEFAULT);
				return;
			case MetamodeloPackage.OPERACIONES__DATATYPE:
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
			case MetamodeloPackage.OPERACIONES__NOMBRE_OPERACION:
				return NOMBRE_OPERACION_EDEFAULT == null ? nombreOperacion != null : !NOMBRE_OPERACION_EDEFAULT.equals(nombreOperacion);
			case MetamodeloPackage.OPERACIONES__ENCAPSULAMIENTO:
				return ENCAPSULAMIENTO_EDEFAULT == null ? encapsulamiento != null : !ENCAPSULAMIENTO_EDEFAULT.equals(encapsulamiento);
			case MetamodeloPackage.OPERACIONES__DATATYPE:
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
		result.append(" (nombreOperacion: ");
		result.append(nombreOperacion);
		result.append(", encapsulamiento: ");
		result.append(encapsulamiento);
		result.append(')');
		return result.toString();
	}

} //OperacionesImpl
