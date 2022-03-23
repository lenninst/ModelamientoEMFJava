/**
 */
package Metamodelo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.Herencia#getClase <em>Clase</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getHerencia()
 * @model
 * @generated
 */
public interface Herencia extends Referencia {
	/**
	 * Returns the value of the '<em><b>Clase</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Metamodelo.Clase#getHerencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clase</em>' reference.
	 * @see #setClase(Clase)
	 * @see Metamodelo.MetamodeloPackage#getHerencia_Clase()
	 * @see Metamodelo.Clase#getHerencia
	 * @model opposite="herencia"
	 * @generated
	 */
	Clase getClase();

	/**
	 * Sets the value of the '{@link Metamodelo.Herencia#getClase <em>Clase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clase</em>' reference.
	 * @see #getClase()
	 * @generated
	 */
	void setClase(Clase value);

} // Herencia
