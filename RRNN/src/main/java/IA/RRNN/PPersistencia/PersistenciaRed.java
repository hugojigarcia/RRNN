//  @ Project : RRNN
//  @ File Name : PersistenciaRed.java
//  @ Author :  Hugo


package IA.RRNN.PPersistencia;

import IA.RRNN.Red;
import IA.RRNN.PFuncion.IFuncion;

public class PersistenciaRed implements IPersistenciaRed {
	private IPersistenciaRed INSTANCE = new PersistenciaRed();
	private PersistenciaRed() {}
	public IPersistenciaRed getInstance() { return INSTANCE; }
	
	public void create(Red red) {
		//TODO
	}
	
	public void read(Red nombre) {
		//TODO
	}
	
	public void update(Red red) {
		//TODO
	}
	
	public void delete(Red nombre) {
		//TODO
	}
}
