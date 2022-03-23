/**
 */
package Metamodelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Interface#getNombreInterface <em>Nombre Interface</em>}</li>
 *   <li>{@link Metamodelo.Interface#getOperaciones <em>Operaciones</em>}</li>
 *   <li>{@link Metamodelo.Interface#getPaquete <em>Paquete</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Interface</em>' attribute.
	 * @see #setNombreInterface(String)
	 * @see Metamodelo.MetamodeloPackage#getInterface_NombreInterface()
	 * @model
	 * @generated
	 */
	String getNombreInterface();

	/**
	 * Sets the value of the '{@link Metamodelo.Interface#getNombreInterface <em>Nombre Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Interface</em>' attribute.
	 * @see #getNombreInterface()
	 * @generated
	 */
	void setNombreInterface(String value);

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.Operaciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getInterface_Operaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operaciones> getOperaciones();

	/**
	 * Returns the value of the '<em><b>Paquete</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Paquete#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paquete</em>' container reference.
	 * @see #setPaquete(Paquete)
	 * @see Metamodelo.MetamodeloPackage#getInterface_Paquete()
	 * @see Metamodelo.Paquete#getInterface
	 * @model opposite="interface" required="true" transient="false"
	 * @generated
	 */
	Paquete getPaquete();

	/**
	 * Sets the value of the '{@link Metamodelo.Interface#getPaquete <em>Paquete</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paquete</em>' container reference.
	 * @see #getPaquete()
	 * @generated
	 */
	void setPaquete(Paquete value);

} // Interface
