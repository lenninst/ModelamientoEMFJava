/**
 */
package Metamodelo.impl;

import Metamodelo.Agregacion;
import Metamodelo.Asociacion;
import Metamodelo.Atributos;
import Metamodelo.Clase;
import Metamodelo.Herencia;
import Metamodelo.Implementacion;
import Metamodelo.MetamodeloPackage;
import Metamodelo.Operaciones;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getNombreClase <em>Nombre Clase</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getAsociacion <em>Asociacion</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getAgregacion <em>Agregacion</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getHerencia <em>Herencia</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getImplementacion <em>Implementacion</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Metamodelo.impl.ClaseImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaseImpl extends MinimalEObjectImpl.Container implements Clase {
	/**
	 * The default value of the '{@link #getNombreClase() <em>Nombre Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreClase()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CLASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreClase() <em>Nombre Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreClase()
	 * @generated
	 * @ordered
	 */
	protected String nombreClase = NOMBRE_CLASE_EDEFAULT;

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
	 * The cached value of the '{@link #getAsociacion() <em>Asociacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociacion()
	 * @generated
	 * @ordered
	 */
	protected Asociacion asociacion;

	/**
	 * The cached value of the '{@link #getAgregacion() <em>Agregacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregacion()
	 * @generated
	 * @ordered
	 */
	protected Agregacion agregacion;

	/**
	 * The cached value of the '{@link #getHerencia() <em>Herencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerencia()
	 * @generated
	 * @ordered
	 */
	protected Herencia herencia;

	/**
	 * The cached value of the '{@link #getImplementacion() <em>Implementacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementacion()
	 * @generated
	 * @ordered
	 */
	protected Implementacion implementacion;

	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected Atributos atributos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloPackage.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreClase() {
		return nombreClase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreClase(String newNombreClase) {
		String oldNombreClase = nombreClase;
		nombreClase = newNombreClase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__NOMBRE_CLASE, oldNombreClase, nombreClase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operaciones> getOperaciones() {
		if (operaciones == null) {
			operaciones = new EObjectContainmentEList<Operaciones>(Operaciones.class, this, MetamodeloPackage.CLASE__OPERACIONES);
		}
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociacion getAsociacion() {
		if (asociacion != null && asociacion.eIsProxy()) {
			InternalEObject oldAsociacion = (InternalEObject)asociacion;
			asociacion = (Asociacion)eResolveProxy(oldAsociacion);
			if (asociacion != oldAsociacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.CLASE__ASOCIACION, oldAsociacion, asociacion));
			}
		}
		return asociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociacion basicGetAsociacion() {
		return asociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsociacion(Asociacion newAsociacion, NotificationChain msgs) {
		Asociacion oldAsociacion = asociacion;
		asociacion = newAsociacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__ASOCIACION, oldAsociacion, newAsociacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsociacion(Asociacion newAsociacion) {
		if (newAsociacion != asociacion) {
			NotificationChain msgs = null;
			if (asociacion != null)
				msgs = ((InternalEObject)asociacion).eInverseRemove(this, MetamodeloPackage.ASOCIACION__CLASE, Asociacion.class, msgs);
			if (newAsociacion != null)
				msgs = ((InternalEObject)newAsociacion).eInverseAdd(this, MetamodeloPackage.ASOCIACION__CLASE, Asociacion.class, msgs);
			msgs = basicSetAsociacion(newAsociacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__ASOCIACION, newAsociacion, newAsociacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregacion getAgregacion() {
		if (agregacion != null && agregacion.eIsProxy()) {
			InternalEObject oldAgregacion = (InternalEObject)agregacion;
			agregacion = (Agregacion)eResolveProxy(oldAgregacion);
			if (agregacion != oldAgregacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.CLASE__AGREGACION, oldAgregacion, agregacion));
			}
		}
		return agregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregacion basicGetAgregacion() {
		return agregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgregacion(Agregacion newAgregacion, NotificationChain msgs) {
		Agregacion oldAgregacion = agregacion;
		agregacion = newAgregacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__AGREGACION, oldAgregacion, newAgregacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgregacion(Agregacion newAgregacion) {
		if (newAgregacion != agregacion) {
			NotificationChain msgs = null;
			if (agregacion != null)
				msgs = ((InternalEObject)agregacion).eInverseRemove(this, MetamodeloPackage.AGREGACION__CLASE, Agregacion.class, msgs);
			if (newAgregacion != null)
				msgs = ((InternalEObject)newAgregacion).eInverseAdd(this, MetamodeloPackage.AGREGACION__CLASE, Agregacion.class, msgs);
			msgs = basicSetAgregacion(newAgregacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__AGREGACION, newAgregacion, newAgregacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia getHerencia() {
		if (herencia != null && herencia.eIsProxy()) {
			InternalEObject oldHerencia = (InternalEObject)herencia;
			herencia = (Herencia)eResolveProxy(oldHerencia);
			if (herencia != oldHerencia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.CLASE__HERENCIA, oldHerencia, herencia));
			}
		}
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia basicGetHerencia() {
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHerencia(Herencia newHerencia, NotificationChain msgs) {
		Herencia oldHerencia = herencia;
		herencia = newHerencia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__HERENCIA, oldHerencia, newHerencia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerencia(Herencia newHerencia) {
		if (newHerencia != herencia) {
			NotificationChain msgs = null;
			if (herencia != null)
				msgs = ((InternalEObject)herencia).eInverseRemove(this, MetamodeloPackage.HERENCIA__CLASE, Herencia.class, msgs);
			if (newHerencia != null)
				msgs = ((InternalEObject)newHerencia).eInverseAdd(this, MetamodeloPackage.HERENCIA__CLASE, Herencia.class, msgs);
			msgs = basicSetHerencia(newHerencia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__HERENCIA, newHerencia, newHerencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion getImplementacion() {
		if (implementacion != null && implementacion.eIsProxy()) {
			InternalEObject oldImplementacion = (InternalEObject)implementacion;
			implementacion = (Implementacion)eResolveProxy(oldImplementacion);
			if (implementacion != oldImplementacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodeloPackage.CLASE__IMPLEMENTACION, oldImplementacion, implementacion));
			}
		}
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion basicGetImplementacion() {
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementacion(Implementacion newImplementacion, NotificationChain msgs) {
		Implementacion oldImplementacion = implementacion;
		implementacion = newImplementacion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__IMPLEMENTACION, oldImplementacion, newImplementacion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementacion(Implementacion newImplementacion) {
		if (newImplementacion != implementacion) {
			NotificationChain msgs = null;
			if (implementacion != null)
				msgs = ((InternalEObject)implementacion).eInverseRemove(this, MetamodeloPackage.IMPLEMENTACION__CLASE, Implementacion.class, msgs);
			if (newImplementacion != null)
				msgs = ((InternalEObject)newImplementacion).eInverseAdd(this, MetamodeloPackage.IMPLEMENTACION__CLASE, Implementacion.class, msgs);
			msgs = basicSetImplementacion(newImplementacion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__IMPLEMENTACION, newImplementacion, newImplementacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete getPaquete() {
		if (eContainerFeatureID() != MetamodeloPackage.CLASE__PAQUETE) return null;
		return (Paquete)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaquete(Paquete newPaquete, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPaquete, MetamodeloPackage.CLASE__PAQUETE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaquete(Paquete newPaquete) {
		if (newPaquete != eInternalContainer() || (eContainerFeatureID() != MetamodeloPackage.CLASE__PAQUETE && newPaquete != null)) {
			if (EcoreUtil.isAncestor(this, newPaquete))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPaquete != null)
				msgs = ((InternalEObject)newPaquete).eInverseAdd(this, MetamodeloPackage.PAQUETE__CLASE, Paquete.class, msgs);
			msgs = basicSetPaquete(newPaquete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__PAQUETE, newPaquete, newPaquete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributos getAtributos() {
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtributos(Atributos newAtributos, NotificationChain msgs) {
		Atributos oldAtributos = atributos;
		atributos = newAtributos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__ATRIBUTOS, oldAtributos, newAtributos);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributos(Atributos newAtributos) {
		if (newAtributos != atributos) {
			NotificationChain msgs = null;
			if (atributos != null)
				msgs = ((InternalEObject)atributos).eInverseRemove(this, MetamodeloPackage.ATRIBUTOS__CLASE, Atributos.class, msgs);
			if (newAtributos != null)
				msgs = ((InternalEObject)newAtributos).eInverseAdd(this, MetamodeloPackage.ATRIBUTOS__CLASE, Atributos.class, msgs);
			msgs = basicSetAtributos(newAtributos, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloPackage.CLASE__ATRIBUTOS, newAtributos, newAtributos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodeloPackage.CLASE__ASOCIACION:
				if (asociacion != null)
					msgs = ((InternalEObject)asociacion).eInverseRemove(this, MetamodeloPackage.ASOCIACION__CLASE, Asociacion.class, msgs);
				return basicSetAsociacion((Asociacion)otherEnd, msgs);
			case MetamodeloPackage.CLASE__AGREGACION:
				if (agregacion != null)
					msgs = ((InternalEObject)agregacion).eInverseRemove(this, MetamodeloPackage.AGREGACION__CLASE, Agregacion.class, msgs);
				return basicSetAgregacion((Agregacion)otherEnd, msgs);
			case MetamodeloPackage.CLASE__HERENCIA:
				if (herencia != null)
					msgs = ((InternalEObject)herencia).eInverseRemove(this, MetamodeloPackage.HERENCIA__CLASE, Herencia.class, msgs);
				return basicSetHerencia((Herencia)otherEnd, msgs);
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				if (implementacion != null)
					msgs = ((InternalEObject)implementacion).eInverseRemove(this, MetamodeloPackage.IMPLEMENTACION__CLASE, Implementacion.class, msgs);
				return basicSetImplementacion((Implementacion)otherEnd, msgs);
			case MetamodeloPackage.CLASE__PAQUETE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPaquete((Paquete)otherEnd, msgs);
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				if (atributos != null)
					msgs = ((InternalEObject)atributos).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodeloPackage.CLASE__ATRIBUTOS, null, msgs);
				return basicSetAtributos((Atributos)otherEnd, msgs);
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
			case MetamodeloPackage.CLASE__OPERACIONES:
				return ((InternalEList<?>)getOperaciones()).basicRemove(otherEnd, msgs);
			case MetamodeloPackage.CLASE__ASOCIACION:
				return basicSetAsociacion(null, msgs);
			case MetamodeloPackage.CLASE__AGREGACION:
				return basicSetAgregacion(null, msgs);
			case MetamodeloPackage.CLASE__HERENCIA:
				return basicSetHerencia(null, msgs);
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				return basicSetImplementacion(null, msgs);
			case MetamodeloPackage.CLASE__PAQUETE:
				return basicSetPaquete(null, msgs);
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				return basicSetAtributos(null, msgs);
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
			case MetamodeloPackage.CLASE__PAQUETE:
				return eInternalContainer().eInverseRemove(this, MetamodeloPackage.PAQUETE__CLASE, Paquete.class, msgs);
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
			case MetamodeloPackage.CLASE__NOMBRE_CLASE:
				return getNombreClase();
			case MetamodeloPackage.CLASE__OPERACIONES:
				return getOperaciones();
			case MetamodeloPackage.CLASE__ASOCIACION:
				if (resolve) return getAsociacion();
				return basicGetAsociacion();
			case MetamodeloPackage.CLASE__AGREGACION:
				if (resolve) return getAgregacion();
				return basicGetAgregacion();
			case MetamodeloPackage.CLASE__HERENCIA:
				if (resolve) return getHerencia();
				return basicGetHerencia();
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				if (resolve) return getImplementacion();
				return basicGetImplementacion();
			case MetamodeloPackage.CLASE__PAQUETE:
				return getPaquete();
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				return getAtributos();
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
			case MetamodeloPackage.CLASE__NOMBRE_CLASE:
				setNombreClase((String)newValue);
				return;
			case MetamodeloPackage.CLASE__OPERACIONES:
				getOperaciones().clear();
				getOperaciones().addAll((Collection<? extends Operaciones>)newValue);
				return;
			case MetamodeloPackage.CLASE__ASOCIACION:
				setAsociacion((Asociacion)newValue);
				return;
			case MetamodeloPackage.CLASE__AGREGACION:
				setAgregacion((Agregacion)newValue);
				return;
			case MetamodeloPackage.CLASE__HERENCIA:
				setHerencia((Herencia)newValue);
				return;
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				setImplementacion((Implementacion)newValue);
				return;
			case MetamodeloPackage.CLASE__PAQUETE:
				setPaquete((Paquete)newValue);
				return;
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				setAtributos((Atributos)newValue);
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
			case MetamodeloPackage.CLASE__NOMBRE_CLASE:
				setNombreClase(NOMBRE_CLASE_EDEFAULT);
				return;
			case MetamodeloPackage.CLASE__OPERACIONES:
				getOperaciones().clear();
				return;
			case MetamodeloPackage.CLASE__ASOCIACION:
				setAsociacion((Asociacion)null);
				return;
			case MetamodeloPackage.CLASE__AGREGACION:
				setAgregacion((Agregacion)null);
				return;
			case MetamodeloPackage.CLASE__HERENCIA:
				setHerencia((Herencia)null);
				return;
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				setImplementacion((Implementacion)null);
				return;
			case MetamodeloPackage.CLASE__PAQUETE:
				setPaquete((Paquete)null);
				return;
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				setAtributos((Atributos)null);
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
			case MetamodeloPackage.CLASE__NOMBRE_CLASE:
				return NOMBRE_CLASE_EDEFAULT == null ? nombreClase != null : !NOMBRE_CLASE_EDEFAULT.equals(nombreClase);
			case MetamodeloPackage.CLASE__OPERACIONES:
				return operaciones != null && !operaciones.isEmpty();
			case MetamodeloPackage.CLASE__ASOCIACION:
				return asociacion != null;
			case MetamodeloPackage.CLASE__AGREGACION:
				return agregacion != null;
			case MetamodeloPackage.CLASE__HERENCIA:
				return herencia != null;
			case MetamodeloPackage.CLASE__IMPLEMENTACION:
				return implementacion != null;
			case MetamodeloPackage.CLASE__PAQUETE:
				return getPaquete() != null;
			case MetamodeloPackage.CLASE__ATRIBUTOS:
				return atributos != null;
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
		result.append(" (nombreClase: ");
		result.append(nombreClase);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
