package IA.RRNN.PPersistencia;

import IA.RRNN.PFuncion.*;

public class FactoryFunciones {
	private final static FactoryFunciones INSTANCE = new FactoryFunciones();
	public static FactoryFunciones getInstance() { return INSTANCE; }
	private FactoryFunciones() {}
	
	public IFuncion crearFuncion(String nombre) {
		//TODO
		return new FuncionSigmoidal();
	}

}
