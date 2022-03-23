/**
 */
package Metamodelo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Metamodelo.MetamodeloFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodeloPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Metamodelo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/Metamodelo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Metamodelo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodeloPackage eINSTANCE = Metamodelo.impl.MetamodeloPackageImpl.init();

	/**
	 * The meta object id for the '{@link Metamodelo.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.PaqueteImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 0;

	/**
	 * The feature id for the '<em><b>Nombre Paquete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__NOMBRE_PAQUETE = 0;

	/**
	 * The feature id for the '<em><b>Claseabstracta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__CLASEABSTRACTA = 1;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__CLASE = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.ClaseImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 1;

	/**
	 * The feature id for the '<em><b>Nombre Clase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NOMBRE_CLASE = 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__OPERACIONES = 1;

	/**
	 * The feature id for the '<em><b>Asociacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ASOCIACION = 2;

	/**
	 * The feature id for the '<em><b>Agregacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__AGREGACION = 3;

	/**
	 * The feature id for the '<em><b>Herencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__HERENCIA = 4;

	/**
	 * The feature id for the '<em><b>Implementacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__IMPLEMENTACION = 5;

	/**
	 * The feature id for the '<em><b>Paquete</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__PAQUETE = 6;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ATRIBUTOS = 7;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.OperacionesImpl <em>Operaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.OperacionesImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getOperaciones()
	 * @generated
	 */
	int OPERACIONES = 2;

	/**
	 * The feature id for the '<em><b>Nombre Operacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__NOMBRE_OPERACION = 0;

	/**
	 * The feature id for the '<em><b>Encapsulamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__ENCAPSULAMIENTO = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES__DATATYPE = 2;

	/**
	 * The number of structural features of the '<em>Operaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERACIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.AtributosImpl <em>Atributos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.AtributosImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getAtributos()
	 * @generated
	 */
	int ATRIBUTOS = 3;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__NOMBRE_ATRIBUTO = 0;

	/**
	 * The feature id for the '<em><b>Encapculamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__ENCAPCULAMIENTO = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__CLASE = 3;

	/**
	 * The number of structural features of the '<em>Atributos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Atributos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.ParametrosImpl <em>Parametros</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.ParametrosImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getParametros()
	 * @generated
	 */
	int PARAMETROS = 4;

	/**
	 * The feature id for the '<em><b>Nombre Parametro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETROS__NOMBRE_PARAMETRO = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETROS__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Parametros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETROS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parametros</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETROS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.DataTypeImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Nombre Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NOMBRE_DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.ReferenciaImpl <em>Referencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.ReferenciaImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getReferencia()
	 * @generated
	 */
	int REFERENCIA = 9;

	/**
	 * The feature id for the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__NOMBRE_REFERENCIA = 0;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA__MULTIPLICIDAD = 1;

	/**
	 * The number of structural features of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Referencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.AsociacionImpl <em>Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.AsociacionImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getAsociacion()
	 * @generated
	 */
	int ASOCIACION = 6;

	/**
	 * The feature id for the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__NOMBRE_REFERENCIA = REFERENCIA__NOMBRE_REFERENCIA;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__MULTIPLICIDAD = REFERENCIA__MULTIPLICIDAD;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__CLASE = REFERENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_FEATURE_COUNT = REFERENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_OPERATION_COUNT = REFERENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.ClaseAbstractaImpl <em>Clase Abstracta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.ClaseAbstractaImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getClaseAbstracta()
	 * @generated
	 */
	int CLASE_ABSTRACTA = 7;

	/**
	 * The feature id for the '<em><b>Nombre Clase Abstracta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__ATRIBUTOS = 1;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA__OPERACIONES = 2;

	/**
	 * The number of structural features of the '<em>Clase Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Clase Abstracta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_ABSTRACTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.Interface <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.Interface
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Nombre Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NOMBRE_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Operaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERACIONES = 1;

	/**
	 * The feature id for the '<em><b>Paquete</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PAQUETE = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.ImplementacionImpl <em>Implementacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.ImplementacionImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getImplementacion()
	 * @generated
	 */
	int IMPLEMENTACION = 10;

	/**
	 * The feature id for the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__NOMBRE_REFERENCIA = REFERENCIA__NOMBRE_REFERENCIA;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__MULTIPLICIDAD = REFERENCIA__MULTIPLICIDAD;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__CLASE = REFERENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION_FEATURE_COUNT = REFERENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implementacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION_OPERATION_COUNT = REFERENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.HerenciaImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 11;

	/**
	 * The feature id for the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__NOMBRE_REFERENCIA = REFERENCIA__NOMBRE_REFERENCIA;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__MULTIPLICIDAD = REFERENCIA__MULTIPLICIDAD;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__CLASE = REFERENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = REFERENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = REFERENCIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Metamodelo.impl.AgregacionImpl <em>Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Metamodelo.impl.AgregacionImpl
	 * @see Metamodelo.impl.MetamodeloPackageImpl#getAgregacion()
	 * @generated
	 */
	int AGREGACION = 12;

	/**
	 * The feature id for the '<em><b>Nombre Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__NOMBRE_REFERENCIA = REFERENCIA__NOMBRE_REFERENCIA;

	/**
	 * The feature id for the '<em><b>Multiplicidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__MULTIPLICIDAD = REFERENCIA__MULTIPLICIDAD;

	/**
	 * The feature id for the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__CLASE = REFERENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_FEATURE_COUNT = REFERENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_OPERATION_COUNT = REFERENCIA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Metamodelo.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see Metamodelo.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Paquete#getNombrePaquete <em>Nombre Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Paquete</em>'.
	 * @see Metamodelo.Paquete#getNombrePaquete()
	 * @see #getPaquete()
	 * @generated
	 */
	EAttribute getPaquete_NombrePaquete();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.Paquete#getClaseabstracta <em>Claseabstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claseabstracta</em>'.
	 * @see Metamodelo.Paquete#getClaseabstracta()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_Claseabstracta();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodelo.Paquete#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clase</em>'.
	 * @see Metamodelo.Paquete#getClase()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_Clase();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.Paquete#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see Metamodelo.Paquete#getInterface()
	 * @see #getPaquete()
	 * @generated
	 */
	EReference getPaquete_Interface();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see Metamodelo.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Clase#getNombreClase <em>Nombre Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Clase</em>'.
	 * @see Metamodelo.Clase#getNombreClase()
	 * @see #getClase()
	 * @generated
	 */
	EAttribute getClase_NombreClase();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.Clase#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see Metamodelo.Clase#getOperaciones()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Operaciones();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Clase#getAsociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asociacion</em>'.
	 * @see Metamodelo.Clase#getAsociacion()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Asociacion();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Clase#getAgregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agregacion</em>'.
	 * @see Metamodelo.Clase#getAgregacion()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Agregacion();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Clase#getHerencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herencia</em>'.
	 * @see Metamodelo.Clase#getHerencia()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Herencia();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Clase#getImplementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementacion</em>'.
	 * @see Metamodelo.Clase#getImplementacion()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Implementacion();

	/**
	 * Returns the meta object for the container reference '{@link Metamodelo.Clase#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Paquete</em>'.
	 * @see Metamodelo.Clase#getPaquete()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Paquete();

	/**
	 * Returns the meta object for the containment reference '{@link Metamodelo.Clase#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atributos</em>'.
	 * @see Metamodelo.Clase#getAtributos()
	 * @see #getClase()
	 * @generated
	 */
	EReference getClase_Atributos();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Operaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operaciones</em>'.
	 * @see Metamodelo.Operaciones
	 * @generated
	 */
	EClass getOperaciones();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Operaciones#getNombreOperacion <em>Nombre Operacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Operacion</em>'.
	 * @see Metamodelo.Operaciones#getNombreOperacion()
	 * @see #getOperaciones()
	 * @generated
	 */
	EAttribute getOperaciones_NombreOperacion();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Operaciones#getEncapsulamiento <em>Encapsulamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encapsulamiento</em>'.
	 * @see Metamodelo.Operaciones#getEncapsulamiento()
	 * @see #getOperaciones()
	 * @generated
	 */
	EAttribute getOperaciones_Encapsulamiento();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Operaciones#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see Metamodelo.Operaciones#getDatatype()
	 * @see #getOperaciones()
	 * @generated
	 */
	EReference getOperaciones_Datatype();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Atributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributos</em>'.
	 * @see Metamodelo.Atributos
	 * @generated
	 */
	EClass getAtributos();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Atributos#getNombreAtributo <em>Nombre Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Atributo</em>'.
	 * @see Metamodelo.Atributos#getNombreAtributo()
	 * @see #getAtributos()
	 * @generated
	 */
	EAttribute getAtributos_NombreAtributo();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Atributos#getEncapculamiento <em>Encapculamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encapculamiento</em>'.
	 * @see Metamodelo.Atributos#getEncapculamiento()
	 * @see #getAtributos()
	 * @generated
	 */
	EAttribute getAtributos_Encapculamiento();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Atributos#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see Metamodelo.Atributos#getDatatype()
	 * @see #getAtributos()
	 * @generated
	 */
	EReference getAtributos_Datatype();

	/**
	 * Returns the meta object for the container reference '{@link Metamodelo.Atributos#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Clase</em>'.
	 * @see Metamodelo.Atributos#getClase()
	 * @see #getAtributos()
	 * @generated
	 */
	EReference getAtributos_Clase();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Parametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametros</em>'.
	 * @see Metamodelo.Parametros
	 * @generated
	 */
	EClass getParametros();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Parametros#getNombreParametro <em>Nombre Parametro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Parametro</em>'.
	 * @see Metamodelo.Parametros#getNombreParametro()
	 * @see #getParametros()
	 * @generated
	 */
	EAttribute getParametros_NombreParametro();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Parametros#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see Metamodelo.Parametros#getDatatype()
	 * @see #getParametros()
	 * @generated
	 */
	EReference getParametros_Datatype();

	/**
	 * Returns the meta object for class '{@link Metamodelo.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see Metamodelo.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.DataType#getNombreDataType <em>Nombre Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Data Type</em>'.
	 * @see Metamodelo.DataType#getNombreDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_NombreDataType();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asociacion</em>'.
	 * @see Metamodelo.Asociacion
	 * @generated
	 */
	EClass getAsociacion();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Asociacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase</em>'.
	 * @see Metamodelo.Asociacion#getClase()
	 * @see #getAsociacion()
	 * @generated
	 */
	EReference getAsociacion_Clase();

	/**
	 * Returns the meta object for class '{@link Metamodelo.ClaseAbstracta <em>Clase Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase Abstracta</em>'.
	 * @see Metamodelo.ClaseAbstracta
	 * @generated
	 */
	EClass getClaseAbstracta();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.ClaseAbstracta#getNombreClaseAbstracta <em>Nombre Clase Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Clase Abstracta</em>'.
	 * @see Metamodelo.ClaseAbstracta#getNombreClaseAbstracta()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EAttribute getClaseAbstracta_NombreClaseAbstracta();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.ClaseAbstracta#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see Metamodelo.ClaseAbstracta#getAtributos()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_Atributos();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.ClaseAbstracta#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see Metamodelo.ClaseAbstracta#getOperaciones()
	 * @see #getClaseAbstracta()
	 * @generated
	 */
	EReference getClaseAbstracta_Operaciones();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see Metamodelo.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Interface#getNombreInterface <em>Nombre Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Interface</em>'.
	 * @see Metamodelo.Interface#getNombreInterface()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_NombreInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link Metamodelo.Interface#getOperaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operaciones</em>'.
	 * @see Metamodelo.Interface#getOperaciones()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operaciones();

	/**
	 * Returns the meta object for the container reference '{@link Metamodelo.Interface#getPaquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Paquete</em>'.
	 * @see Metamodelo.Interface#getPaquete()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Paquete();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencia</em>'.
	 * @see Metamodelo.Referencia
	 * @generated
	 */
	EClass getReferencia();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Referencia#getNombreReferencia <em>Nombre Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Referencia</em>'.
	 * @see Metamodelo.Referencia#getNombreReferencia()
	 * @see #getReferencia()
	 * @generated
	 */
	EAttribute getReferencia_NombreReferencia();

	/**
	 * Returns the meta object for the attribute '{@link Metamodelo.Referencia#getMultiplicidad <em>Multiplicidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicidad</em>'.
	 * @see Metamodelo.Referencia#getMultiplicidad()
	 * @see #getReferencia()
	 * @generated
	 */
	EAttribute getReferencia_Multiplicidad();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementacion</em>'.
	 * @see Metamodelo.Implementacion
	 * @generated
	 */
	EClass getImplementacion();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Implementacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase</em>'.
	 * @see Metamodelo.Implementacion#getClase()
	 * @see #getImplementacion()
	 * @generated
	 */
	EReference getImplementacion_Clase();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see Metamodelo.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Herencia#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase</em>'.
	 * @see Metamodelo.Herencia#getClase()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_Clase();

	/**
	 * Returns the meta object for class '{@link Metamodelo.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregacion</em>'.
	 * @see Metamodelo.Agregacion
	 * @generated
	 */
	EClass getAgregacion();

	/**
	 * Returns the meta object for the reference '{@link Metamodelo.Agregacion#getClase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clase</em>'.
	 * @see Metamodelo.Agregacion#getClase()
	 * @see #getAgregacion()
	 * @generated
	 */
	EReference getAgregacion_Clase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodeloFactory getMetamodeloFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Metamodelo.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.PaqueteImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '<em><b>Nombre Paquete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAQUETE__NOMBRE_PAQUETE = eINSTANCE.getPaquete_NombrePaquete();

		/**
		 * The meta object literal for the '<em><b>Claseabstracta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__CLASEABSTRACTA = eINSTANCE.getPaquete_Claseabstracta();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__CLASE = eINSTANCE.getPaquete_Clase();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAQUETE__INTERFACE = eINSTANCE.getPaquete_Interface();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.ClaseImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em><b>Nombre Clase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE__NOMBRE_CLASE = eINSTANCE.getClase_NombreClase();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__OPERACIONES = eINSTANCE.getClase_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Asociacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ASOCIACION = eINSTANCE.getClase_Asociacion();

		/**
		 * The meta object literal for the '<em><b>Agregacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__AGREGACION = eINSTANCE.getClase_Agregacion();

		/**
		 * The meta object literal for the '<em><b>Herencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__HERENCIA = eINSTANCE.getClase_Herencia();

		/**
		 * The meta object literal for the '<em><b>Implementacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__IMPLEMENTACION = eINSTANCE.getClase_Implementacion();

		/**
		 * The meta object literal for the '<em><b>Paquete</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__PAQUETE = eINSTANCE.getClase_Paquete();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE__ATRIBUTOS = eINSTANCE.getClase_Atributos();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.OperacionesImpl <em>Operaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.OperacionesImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getOperaciones()
		 * @generated
		 */
		EClass OPERACIONES = eINSTANCE.getOperaciones();

		/**
		 * The meta object literal for the '<em><b>Nombre Operacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACIONES__NOMBRE_OPERACION = eINSTANCE.getOperaciones_NombreOperacion();

		/**
		 * The meta object literal for the '<em><b>Encapsulamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERACIONES__ENCAPSULAMIENTO = eINSTANCE.getOperaciones_Encapsulamiento();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERACIONES__DATATYPE = eINSTANCE.getOperaciones_Datatype();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.AtributosImpl <em>Atributos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.AtributosImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getAtributos()
		 * @generated
		 */
		EClass ATRIBUTOS = eINSTANCE.getAtributos();

		/**
		 * The meta object literal for the '<em><b>Nombre Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS__NOMBRE_ATRIBUTO = eINSTANCE.getAtributos_NombreAtributo();

		/**
		 * The meta object literal for the '<em><b>Encapculamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS__ENCAPCULAMIENTO = eINSTANCE.getAtributos_Encapculamiento();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTOS__DATATYPE = eINSTANCE.getAtributos_Datatype();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTOS__CLASE = eINSTANCE.getAtributos_Clase();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.ParametrosImpl <em>Parametros</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.ParametrosImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getParametros()
		 * @generated
		 */
		EClass PARAMETROS = eINSTANCE.getParametros();

		/**
		 * The meta object literal for the '<em><b>Nombre Parametro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETROS__NOMBRE_PARAMETRO = eINSTANCE.getParametros_NombreParametro();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETROS__DATATYPE = eINSTANCE.getParametros_Datatype();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.DataTypeImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Nombre Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NOMBRE_DATA_TYPE = eINSTANCE.getDataType_NombreDataType();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.AsociacionImpl <em>Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.AsociacionImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getAsociacion()
		 * @generated
		 */
		EClass ASOCIACION = eINSTANCE.getAsociacion();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASOCIACION__CLASE = eINSTANCE.getAsociacion_Clase();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.ClaseAbstractaImpl <em>Clase Abstracta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.ClaseAbstractaImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getClaseAbstracta()
		 * @generated
		 */
		EClass CLASE_ABSTRACTA = eINSTANCE.getClaseAbstracta();

		/**
		 * The meta object literal for the '<em><b>Nombre Clase Abstracta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASE_ABSTRACTA__NOMBRE_CLASE_ABSTRACTA = eINSTANCE.getClaseAbstracta_NombreClaseAbstracta();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__ATRIBUTOS = eINSTANCE.getClaseAbstracta_Atributos();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASE_ABSTRACTA__OPERACIONES = eINSTANCE.getClaseAbstracta_Operaciones();

		/**
		 * The meta object literal for the '{@link Metamodelo.Interface <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.Interface
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Nombre Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NOMBRE_INTERFACE = eINSTANCE.getInterface_NombreInterface();

		/**
		 * The meta object literal for the '<em><b>Operaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERACIONES = eINSTANCE.getInterface_Operaciones();

		/**
		 * The meta object literal for the '<em><b>Paquete</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PAQUETE = eINSTANCE.getInterface_Paquete();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.ReferenciaImpl <em>Referencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.ReferenciaImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getReferencia()
		 * @generated
		 */
		EClass REFERENCIA = eINSTANCE.getReferencia();

		/**
		 * The meta object literal for the '<em><b>Nombre Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCIA__NOMBRE_REFERENCIA = eINSTANCE.getReferencia_NombreReferencia();

		/**
		 * The meta object literal for the '<em><b>Multiplicidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCIA__MULTIPLICIDAD = eINSTANCE.getReferencia_Multiplicidad();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.ImplementacionImpl <em>Implementacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.ImplementacionImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getImplementacion()
		 * @generated
		 */
		EClass IMPLEMENTACION = eINSTANCE.getImplementacion();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTACION__CLASE = eINSTANCE.getImplementacion_Clase();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.HerenciaImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__CLASE = eINSTANCE.getHerencia_Clase();

		/**
		 * The meta object literal for the '{@link Metamodelo.impl.AgregacionImpl <em>Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Metamodelo.impl.AgregacionImpl
		 * @see Metamodelo.impl.MetamodeloPackageImpl#getAgregacion()
		 * @generated
		 */
		EClass AGREGACION = eINSTANCE.getAgregacion();

		/**
		 * The meta object literal for the '<em><b>Clase</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGREGACION__CLASE = eINSTANCE.getAgregacion_Clase();

	}

} //MetamodeloPackage
