/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operaciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Operaciones#getNombreOperacion <em>Nombre Operacion</em>}</li>
 *   <li>{@link Metamodelo.Operaciones#getEncapsulamiento <em>Encapsulamiento</em>}</li>
 *   <li>{@link Metamodelo.Operaciones#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getOperaciones()
 * @model
 * @generated
 */
public interface Operaciones extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Operacion</em>' attribute.
	 * @see #setNombreOperacion(String)
	 * @see Metamodelo.MetamodeloPackage#getOperaciones_NombreOperacion()
	 * @model
	 * @generated
	 */
	String getNombreOperacion();

	/**
	 * Sets the value of the '{@link Metamodelo.Operaciones#getNombreOperacion <em>Nombre Operacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Operacion</em>' attribute.
	 * @see #getNombreOperacion()
	 * @generated
	 */
	void setNombreOperacion(String value);

	/**
	 * Returns the value of the '<em><b>Encapsulamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulamiento</em>' attribute.
	 * @see #setEncapsulamiento(String)
	 * @see Metamodelo.MetamodeloPackage#getOperaciones_Encapsulamiento()
	 * @model
	 * @generated
	 */
	String getEncapsulamiento();

	/**
	 * Sets the value of the '{@link Metamodelo.Operaciones#getEncapsulamiento <em>Encapsulamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulamiento</em>' attribute.
	 * @see #getEncapsulamiento()
	 * @generated
	 */
	void setEncapsulamiento(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see Metamodelo.MetamodeloPackage#getOperaciones_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link Metamodelo.Operaciones#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // Operaciones
