/**
 */
package Metamodelo.impl;

import Metamodelo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodeloFactoryImpl extends EFactoryImpl implements MetamodeloFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodeloFactory init() {
		try {
			MetamodeloFactory theMetamodeloFactory = (MetamodeloFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodeloPackage.eNS_URI);
			if (theMetamodeloFactory != null) {
				return theMetamodeloFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodeloFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodeloFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetamodeloPackage.PAQUETE: return createPaquete();
			case MetamodeloPackage.CLASE: return createClase();
			case MetamodeloPackage.OPERACIONES: return createOperaciones();
			case MetamodeloPackage.ATRIBUTOS: return createAtributos();
			case MetamodeloPackage.PARAMETROS: return createParametros();
			case MetamodeloPackage.DATA_TYPE: return createDataType();
			case MetamodeloPackage.ASOCIACION: return createAsociacion();
			case MetamodeloPackage.REFERENCIA: return createReferencia();
			case MetamodeloPackage.IMPLEMENTACION: return createImplementacion();
			case MetamodeloPackage.HERENCIA: return createHerencia();
			case MetamodeloPackage.AGREGACION: return createAgregacion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete createPaquete() {
		PaqueteImpl paquete = new PaqueteImpl();
		return paquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operaciones createOperaciones() {
		OperacionesImpl operaciones = new OperacionesImpl();
		return operaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributos createAtributos() {
		AtributosImpl atributos = new AtributosImpl();
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametros createParametros() {
		ParametrosImpl parametros = new ParametrosImpl();
		return parametros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociacion createAsociacion() {
		AsociacionImpl asociacion = new AsociacionImpl();
		return asociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referencia createReferencia() {
		ReferenciaImpl referencia = new ReferenciaImpl();
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion createImplementacion() {
		ImplementacionImpl implementacion = new ImplementacionImpl();
		return implementacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregacion createAgregacion() {
		AgregacionImpl agregacion = new AgregacionImpl();
		return agregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodeloPackage getMetamodeloPackage() {
		return (MetamodeloPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodeloPackage getPackage() {
		return MetamodeloPackage.eINSTANCE;
	}

} //MetamodeloFactoryImpl
