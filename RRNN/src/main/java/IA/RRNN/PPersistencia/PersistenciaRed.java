package IA.RRNN.PPersistencia;

import IA.RRNN.Red;

//  @ Project : RRNN
//  @ File Name : PersistenciaRed.java
//  @ Author : alonsete7,Hugo0133


public class PersistenciaRed implements IPersistenciaRed {
	private final static IPersistenciaRed INSTANCE = new PersistenciaRed();
	private PersistenciaRed() {}
	public static IPersistenciaRed getInstance() { return INSTANCE; }
	
	public void create(Red red) {
		//TODO
	}
	
	public Red read(String nombre) {
		//TODO
		return null;
	}
	
	public void update(Red red) {
		//TODO
	}
	
	public void delete(String nombre) {
		//TODO
	}
}
