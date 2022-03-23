/**
 */
package Metamodelo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase Abstracta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Metamodelo.ClaseAbstracta#getNombreClaseAbstracta <em>Nombre Clase Abstracta</em>}</li>
 *   <li>{@link Metamodelo.ClaseAbstracta#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link Metamodelo.ClaseAbstracta#getOperaciones <em>Operaciones</em>}</li>
 * </ul>
 *
 * @see Metamodelo.MetamodeloPackage#getClaseAbstracta()
 * @model abstract="true"
 * @generated
 */
public interface ClaseAbstracta extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Clase Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Clase Abstracta</em>' attribute.
	 * @see #setNombreClaseAbstracta(String)
	 * @see Metamodelo.MetamodeloPackage#getClaseAbstracta_NombreClaseAbstracta()
	 * @model
	 * @generated
	 */
	String getNombreClaseAbstracta();

	/**
	 * Sets the value of the '{@link Metamodelo.ClaseAbstracta#getNombreClaseAbstracta <em>Nombre Clase Abstracta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Clase Abstracta</em>' attribute.
	 * @see #getNombreClaseAbstracta()
	 * @generated
	 */
	void setNombreClaseAbstracta(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.Atributos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getClaseAbstracta_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributos> getAtributos();

	/**
	 * Returns the value of the '<em><b>Operaciones</b></em>' containment reference list.
	 * The list contents are of type {@link Metamodelo.Operaciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operaciones</em>' containment reference list.
	 * @see Metamodelo.MetamodeloPackage#getClaseAbstracta_Operaciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operaciones> getOperaciones();

} // ClaseAbstracta
