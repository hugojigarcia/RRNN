//  @ Project : RRNN
//  @ File Name : PersistenciaRed.java
//  @ Author :  Hugo


package IA.RRNN.PPersistencia;

import IA.RRNN.Red;

public class PersistenciaRed implements IPersistenciaRed {
	
	//SINGLETON
	private final static IPersistenciaRed INSTANCE = new PersistenciaRed();
	public static IPersistenciaRed getInstance() { return INSTANCE; }
	private PersistenciaRed() {}
	
	public void create(Red red) {
		// TODO
	}

	public Red read(String nombre) {
		// TODO
		return null;
	}
	
	public void update(Red red) {
		// TODO
	}
	
	public void delete(String nombre) {
		// TODO
	}
}
