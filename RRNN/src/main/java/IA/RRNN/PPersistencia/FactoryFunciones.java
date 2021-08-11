package IA.RRNN.PPersistencia;

import IA.RRNN.PFuncion.*;

public class FactoryFunciones {
	private final static FactoryFunciones INSTANCE = new FactoryFunciones();
	public static FactoryFunciones getInstance() { return INSTANCE; }
	private FactoryFunciones() {}
	
	public IFuncion factoryMethod(String nombreFuncion) throws Exception {
		switch (nombreFuncion.toLowerCase()) {
			case "escalon": return new FuncionEscalon(); 
			case "escalón": return new FuncionEscalon(); 
			case "lineal": return new FuncionLineal();
			case "relu": return new FuncionReLU();
			case "sigmoidal": return new FuncionSigmoidal();
			case "tangentehiperbolica": return new FuncionTangenteHiperbolica();
			case "tangente hiperbolica": return new FuncionTangenteHiperbolica();
			case "tangentehiperbólica": return new FuncionTangenteHiperbolica();
			case "tangente hiperbólica": return new FuncionTangenteHiperbolica();
			default: throw new Exception("Error: no existe este tipo de función");
		}
	}

}
