/**
 */
package Metamodelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Paquete#getNombrePaquete <em>Nombre Paquete</em>}</li>
 *   <li>{@link Metamodelo.Paquete#getClaseabstracta <em>Claseabstracta</em>}</li>
 *   <li>{@link Metamodelo.Paquete#getClase <em>Clase</em>}</li>
 *   <li>{@link Metamodelo.Paquete#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getPaquete()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='claseUnica'"
 * @generated
 */
public interface Paquete extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Paquete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Paquete</em>' attribute.
	 * @see #setNombrePaquete(String)
	 * @see Metamodelo.MetamodeloPackage#getPaquete_NombrePaquete()
	 * @model
	 * @generated
	 */
	String getNombrePaquete();

	/**
	 * Sets the value of the '{@link Metamodelo.Paquete#getNombrePaquete <em>Nombre Paquete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Paquete</em>' attribute.
	 * @see #getNombrePaquete()
	 * @generated
	 */
	void setNombrePaquete(String value);

	/**
	 * Returns the value of the '<em><b>Claseabstracta</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.ClaseAbstracta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claseabstracta</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getPaquete_Claseabstracta()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaseAbstracta> getClaseabstracta();

	/**
	 * Returns the value of the '<em><b>Clase</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Clase#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clase</em>' containment reference.
	 * @see #setClase(Clase)
	 * @see Metamodelo.MetamodeloPackage#getPaquete_Clase()
	 * @see Metamodelo.Clase#getPaquete
	 * @model opposite="paquete" containment="true"
	 * @generated
	 */
	Clase getClase();

	/**
	 * Sets the value of the '{@link Metamodelo.Paquete#getClase <em>Clase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clase</em>' containment reference.
	 * @see #getClase()
	 * @generated
	 */
	void setClase(Clase value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.Interface}.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Interface#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getPaquete_Interface()
	 * @see Metamodelo.Interface#getPaquete
	 * @model opposite="paquete" containment="true" upper="9"
	 * @generated
	 */
	EList<Interface> getInterface();

} // Paquete
