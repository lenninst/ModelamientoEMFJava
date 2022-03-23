/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametros</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Parametros#getNombreParametro <em>Nombre Parametro</em>}</li>
 *   <li>{@link Metamodelo.Parametros#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getParametros()
 * @model
 * @generated
 */
public interface Parametros extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Parametro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Parametro</em>' attribute.
	 * @see #setNombreParametro(String)
	 * @see Metamodelo.MetamodeloPackage#getParametros_NombreParametro()
	 * @model
	 * @generated
	 */
	String getNombreParametro();

	/**
	 * Sets the value of the '{@link Metamodelo.Parametros#getNombreParametro <em>Nombre Parametro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Parametro</em>' attribute.
	 * @see #getNombreParametro()
	 * @generated
	 */
	void setNombreParametro(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see Metamodelo.MetamodeloPackage#getParametros_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link Metamodelo.Parametros#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

} // Parametros
