package IA.RRNN.PPersistencia;

import IA.RRNN.PFuncion.IFuncion;

public interface ICreator {
	public IFuncion factoryMethod(String nombreFuncion) throws Exception;
}
