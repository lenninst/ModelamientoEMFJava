/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Metamodelo.MetamodeloPackage
 * @generated
 */
public interface MetamodeloFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodeloFactory eINSTANCE = Metamodelo.impl.MetamodeloFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paquete</em>'.
	 * @generated
	 */
	Paquete createPaquete();

	/**
	 * Returns a new object of class '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clase</em>'.
	 * @generated
	 */
	Clase createClase();

	/**
	 * Returns a new object of class '<em>Operaciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operaciones</em>'.
	 * @generated
	 */
	Operaciones createOperaciones();

	/**
	 * Returns a new object of class '<em>Atributos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributos</em>'.
	 * @generated
	 */
	Atributos createAtributos();

	/**
	 * Returns a new object of class '<em>Parametros</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametros</em>'.
	 * @generated
	 */
	Parametros createParametros();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asociacion</em>'.
	 * @generated
	 */
	Asociacion createAsociacion();

	/**
	 * Returns a new object of class '<em>Referencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referencia</em>'.
	 * @generated
	 */
	Referencia createReferencia();

	/**
	 * Returns a new object of class '<em>Implementacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementacion</em>'.
	 * @generated
	 */
	Implementacion createImplementacion();

	/**
	 * Returns a new object of class '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herencia</em>'.
	 * @generated
	 */
	Herencia createHerencia();

	/**
	 * Returns a new object of class '<em>Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agregacion</em>'.
	 * @generated
	 */
	Agregacion createAgregacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodeloPackage getMetamodeloPackage();

} //MetamodeloFactory
