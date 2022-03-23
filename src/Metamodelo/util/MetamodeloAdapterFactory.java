/**
 */
package Metamodelo.util;

import Metamodelo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Metamodelo.MetamodeloPackage
 * @generated
 */
public class MetamodeloAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodeloPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodeloAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodeloPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodeloSwitch<Adapter> modelSwitch =
		new MetamodeloSwitch<Adapter>() {
			@Override
			public Adapter casePaquete(Paquete object) {
				return createPaqueteAdapter();
			}
			@Override
			public Adapter caseClase(Clase object) {
				return createClaseAdapter();
			}
			@Override
			public Adapter caseOperaciones(Operaciones object) {
				return createOperacionesAdapter();
			}
			@Override
			public Adapter caseAtributos(Atributos object) {
				return createAtributosAdapter();
			}
			@Override
			public Adapter caseParametros(Parametros object) {
				return createParametrosAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseAsociacion(Asociacion object) {
				return createAsociacionAdapter();
			}
			@Override
			public Adapter caseClaseAbstracta(ClaseAbstracta object) {
				return createClaseAbstractaAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseReferencia(Referencia object) {
				return createReferenciaAdapter();
			}
			@Override
			public Adapter caseImplementacion(Implementacion object) {
				return createImplementacionAdapter();
			}
			@Override
			public Adapter caseHerencia(Herencia object) {
				return createHerenciaAdapter();
			}
			@Override
			public Adapter caseAgregacion(Agregacion object) {
				return createAgregacionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Paquete
	 * @generated
	 */
	public Adapter createPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Clase
	 * @generated
	 */
	public Adapter createClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Operaciones <em>Operaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Operaciones
	 * @generated
	 */
	public Adapter createOperacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Atributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Atributos
	 * @generated
	 */
	public Adapter createAtributosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Parametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Parametros
	 * @generated
	 */
	public Adapter createParametrosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Asociacion
	 * @generated
	 */
	public Adapter createAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.ClaseAbstracta <em>Clase Abstracta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.ClaseAbstracta
	 * @generated
	 */
	public Adapter createClaseAbstractaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Referencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Referencia
	 * @generated
	 */
	public Adapter createReferenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Implementacion
	 * @generated
	 */
	public Adapter createImplementacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Metamodelo.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Metamodelo.Agregacion
	 * @generated
	 */
	public Adapter createAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodeloAdapterFactory
