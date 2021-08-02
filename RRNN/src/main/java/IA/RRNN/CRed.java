package IA.RRNN;

import java.util.ArrayList;

//  @ Project : RRNN
//  @ File Name : CRed.java
//  @ Author :  Hugo



public class CRed {
	//ATRIBUTOS
	private ArrayList<Red> redes;
	//SINGLETON
	private final static CRed INSTANCE = new CRed();
	public static CRed getInstance() { return INSTANCE; }
	private CRed() {
		redes = new ArrayList<>();
	}
	
	public void crear(String nombre, int numEntradas) {
		//TODO
	}
	
	public Red get(String nombre) {
		//TODO
		return null;
	}
	
	public Red borrar(String nombre) {
		//TODO
		return null;
	}
}
