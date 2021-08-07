package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

//  @ Project : RRNN
//  @ File Name : CRed.java
//  @ Author : alonsete7,Hugo0133


public class CRed {
	//ATRIBUTOS
	private List<Red> redes;
	//SINGLETON
	private final static CRed INSTANCE = new CRed();
	public static CRed getInstance() { return INSTANCE; }
	private CRed() {
		//TODO
		redes = new ArrayList<>();
	}
	
	public Red crearRed(String nombre) {
		//TODO
		return null;
	}
	
	public Red crearRed(String nombre, int numEntradas) {
		//TODO
		return null;
	}
	
	public Red getRed(String nombre) {
		//TODO
		return null;
	}
	
	public Red borrarRed(String nombre) {
		//TODO
		return null;
	}
	
	
}
