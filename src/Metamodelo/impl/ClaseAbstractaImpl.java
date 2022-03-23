/**
 */
package Metamodelo.impl;

import Metamodelo.Atributos;
import Metamodelo.ClaseAbstracta;
import Metamodelo.MetamodeloPackage;
import Metamodelo.Operaciones;

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
 * An implementation of the model object '<em><b>Clase Abstracta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.ClaseAbstractaImpl#getNombreClaseAbstracta <em>Nombre Clase Abstracta</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseAbstractaImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseAbstractaImpl#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClaseAbstractaImpl extends MinimalEObjectImpl.Container implements ClaseAbstracta {
	/**
	 * The default value of the '{@link #getNombreClaseAbstracta() <em>Nombre Clase Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreClaseAbstracta()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CLASE_ABSTRACTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreClaseAbstracta() <em>Nombre Clase Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreClaseAbstracta()
	 * @generated
	 * @ordered
	 */
	protected String nombreClaseAbstracta = NOMBRE_CLASE_ABSTRACTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributos> atributos;

	/**
	 * The cached value of the '{@link #getOperaciones() <em>Operaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Operaciones> operaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseAbstractaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.CLASE_ABSTRACTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreClaseAbstracta() {
		return nombreClaseAbstracta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreClaseAbstracta(String newNombreClaseAbstracta) {
		String oldNombreClaseAbstracta = nombreClaseAbstracta;
		nombreClaseAbstracta = newNombreClaseAbstracta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA, oldNombreClaseAbstracta, nombreClaseAbstracta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributos> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributos>(Atributos.class, this, MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operaciones> getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentEList<Operaciones>(Operaciones.class, this, MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
			case MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES:
				return ((InternalEList<?>)getOperaciones()).basicRemove(otherEnd, msgs);
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
			case MetamodeloPackage.CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA:
				return getNombreClaseAbstracta();
			case MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS:
				return getAtributos();
			case MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES:
				return getOperaciones();
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
			case MetamodeloPackage.CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA:
				setNombreClaseAbstracta((String)newValue);
				return;
			case MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributos>)newValue);
				return;
			case MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection<? extends Operaciones>)newValue);
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
			case MetamodeloPackage.CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA:
				setNombreClaseAbstracta(NOMBRE_CLASE_ABSTRACTA_EDEFAULT);
				return;
			case MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS:
				getAtributos().clear();
				return;
			case MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES:
				getOperaciones().clear();
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
			case MetamodeloPackage.CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA:
				return NOMBRE_CLASE_ABSTRACTA_EDEFAULT == null ? nombreClaseAbstracta != null : !NOMBRE_CLASE_ABSTRACTA_EDEFAULT.equals(nombreClaseAbstracta);
			case MetamodeloPackage.CLASE_ABSTRACTA__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case MetamodeloPackage.CLASE_ABSTRACTA__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
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
		result.append(" (nombreClaseAbstracta: ");
		result.append(nombreClaseAbstracta);
		result.append(')');
		return result.toString();
	}

} //ClaseAbstractaImpl
