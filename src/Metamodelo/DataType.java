/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.DataType#getNombreDataType <em>Nombre Data Type</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Data Type</em>' attribute.
	 * @see #setNombreDataType(String)
	 * @see Metamodelo.MetamodeloPackage#getDataType_NombreDataType()
	 * @model
	 * @generated
	 */
	String getNombreDataType();

	/**
	 * Sets the value of the '{@link Metamodelo.DataType#getNombreDataType <em>Nombre Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Data Type</em>' attribute.
	 * @see #getNombreDataType()
	 * @generated
	 */
	void setNombreDataType(String value);

} // DataType
