/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Referencia#getNombreReferencia <em>Nombre Referencia</em>}</li>
 *   <li>{@link Metamodelo.Referencia#getMultiplicidad <em>Multiplicidad</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getReferencia()
 * @model
 * @generated
 */
public interface Referencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Referencia</em>' attribute.
	 * @see #setNombreReferencia(String)
	 * @see Metamodelo.MetamodeloPackage#getReferencia_NombreReferencia()
	 * @model
	 * @generated
	 */
	String getNombreReferencia();

	/**
	 * Sets the value of the '{@link Metamodelo.Referencia#getNombreReferencia <em>Nombre Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Referencia</em>' attribute.
	 * @see #getNombreReferencia()
	 * @generated
	 */
	void setNombreReferencia(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicidad</em>' attribute.
	 * @see #setMultiplicidad(String)
	 * @see Metamodelo.MetamodeloPackage#getReferencia_Multiplicidad()
	 * @model
	 * @generated
	 */
	String getMultiplicidad();

	/**
	 * Sets the value of the '{@link Metamodelo.Referencia#getMultiplicidad <em>Multiplicidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicidad</em>' attribute.
	 * @see #getMultiplicidad()
	 * @generated
	 */
	void setMultiplicidad(String value);

} // Referencia
