/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Atributos#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link Metamodelo.Atributos#getEncapculamiento <em>Encapculamiento</em>}</li>
 *   <li>{@link Metamodelo.Atributos#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link Metamodelo.Atributos#getClase <em>Clase</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getAtributos()
 * @model
 * @generated
 */
public interface Atributos extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #setNombreAtributo(String)
	 * @see Metamodelo.MetamodeloPackage#getAtributos_NombreAtributo()
	 * @model
	 * @generated
	 */
	String getNombreAtributo();

	/**
	 * Sets the value of the '{@link Metamodelo.Atributos#getNombreAtributo <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #getNombreAtributo()
	 * @generated
	 */
	void setNombreAtributo(String value);

	/**
	 * Returns the value of the '<em><b>Encapculamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapculamiento</em>' attribute.
	 * @see #setEncapculamiento(String)
	 * @see Metamodelo.MetamodeloPackage#getAtributos_Encapculamiento()
	 * @model
	 * @generated
	 */
	String getEncapculamiento();

	/**
	 * Sets the value of the '{@link Metamodelo.Atributos#getEncapculamiento <em>Encapculamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapculamiento</em>' attribute.
	 * @see #getEncapculamiento()
	 * @generated
	 */
	void setEncapculamiento(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see Metamodelo.MetamodeloPackage#getAtributos_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link Metamodelo.Atributos#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Clase</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Clase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clase</em>' container reference.
	 * @see #setClase(Clase)
	 * @see Metamodelo.MetamodeloPackage#getAtributos_Clase()
	 * @see Metamodelo.Clase#getAtributos
	 * @model opposite="atributos" transient="false"
	 * @generated
	 */
	Clase getClase();

	/**
	 * Sets the value of the '{@link Metamodelo.Atributos#getClase <em>Clase</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clase</em>' container reference.
	 * @see #getClase()
	 * @generated
	 */
	void setClase(Clase value);

} // Atributos
