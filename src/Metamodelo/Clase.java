/**
 */
package Metamodelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Clase#getNombreClase <em>Nombre Clase</em>}</li>
 *   <li>{@link Metamodelo.Clase#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link Metamodelo.Clase#getAsociacion <em>Asociacion</em>}</li>
 *   <li>{@link Metamodelo.Clase#getAgregacion <em>Agregacion</em>}</li>
 *   <li>{@link Metamodelo.Clase#getHerencia <em>Herencia</em>}</li>
 *   <li>{@link Metamodelo.Clase#getImplementacion <em>Implementacion</em>}</li>
 *   <li>{@link Metamodelo.Clase#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Metamodelo.Clase#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getClase()
 * @model
 * @generated
 */
public interface Clase extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Clase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Clase</em>' attribute.
	 * @see #setNombreClase(String)
	 * @see Metamodelo.MetamodeloPackage#getClase_NombreClase()
	 * @model
	 * @generated
	 */
	String getNombreClase();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getNombreClase <em>Nombre Clase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Clase</em>' attribute.
	 * @see #getNombreClase()
	 * @generated
	 */
	void setNombreClase(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.Operaciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getClase_Operaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operaciones> getOperaciones();

	/**
	 * Returns the value of the '<em><b>Asociacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Asociacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociacion</em>' reference.
	 * @see #setAsociacion(Asociacion)
	 * @see Metamodelo.MetamodeloPackage#getClase_Asociacion()
	 * @see Metamodelo.Asociacion#getClase
	 * @model opposite="clase"
	 * @generated
	 */
	Asociacion getAsociacion();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getAsociacion <em>Asociacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asociacion</em>' reference.
	 * @see #getAsociacion()
	 * @generated
	 */
	void setAsociacion(Asociacion value);

	/**
	 * Returns the value of the '<em><b>Agregacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Agregacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregacion</em>' reference.
	 * @see #setAgregacion(Agregacion)
	 * @see Metamodelo.MetamodeloPackage#getClase_Agregacion()
	 * @see Metamodelo.Agregacion#getClase
	 * @model opposite="clase"
	 * @generated
	 */
	Agregacion getAgregacion();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getAgregacion <em>Agregacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agregacion</em>' reference.
	 * @see #getAgregacion()
	 * @generated
	 */
	void setAgregacion(Agregacion value);

	/**
	 * Returns the value of the '<em><b>Herencia</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Herencia#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencia</em>' reference.
	 * @see #setHerencia(Herencia)
	 * @see Metamodelo.MetamodeloPackage#getClase_Herencia()
	 * @see Metamodelo.Herencia#getClase
	 * @model opposite="clase"
	 * @generated
	 */
	Herencia getHerencia();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getHerencia <em>Herencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herencia</em>' reference.
	 * @see #getHerencia()
	 * @generated
	 */
	void setHerencia(Herencia value);

	/**
	 * Returns the value of the '<em><b>Implementacion</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Implementacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementacion</em>' reference.
	 * @see #setImplementacion(Implementacion)
	 * @see Metamodelo.MetamodeloPackage#getClase_Implementacion()
	 * @see Metamodelo.Implementacion#getClase
	 * @model opposite="clase"
	 * @generated
	 */
	Implementacion getImplementacion();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getImplementacion <em>Implementacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementacion</em>' reference.
	 * @see #getImplementacion()
	 * @generated
	 */
	void setImplementacion(Implementacion value);

	/**
	 * Returns the value of the '<em><b>Paquete</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Paquete#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquete</em>' container reference.
	 * @see #setPaquete(Paquete)
	 * @see Metamodelo.MetamodeloPackage#getClase_Paquete()
	 * @see Metamodelo.Paquete#getClase
	 * @model opposite="clase" required="true" transient="false"
	 * @generated
	 */
	Paquete getPaquete();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getPaquete <em>Paquete</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paquete</em>' container reference.
	 * @see #getPaquete()
	 * @generated
	 */
	void setPaquete(Paquete value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Atributos#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference.
	 * @see #setAtributos(Atributos)
	 * @see Metamodelo.MetamodeloPackage#getClase_Atributos()
	 * @see Metamodelo.Atributos#getClase
	 * @model opposite="clase" containment="true"
	 * @generated
	 */
	Atributos getAtributos();

	/**
	 * Sets the value of the '{@link Metamodelo.Clase#getAtributos <em>Atributos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributos</em>' containment reference.
	 * @see #getAtributos()
	 * @generated
	 */
	void setAtributos(Atributos value);

} // Clase
