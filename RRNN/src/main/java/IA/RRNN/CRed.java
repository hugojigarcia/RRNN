package IA.RRNN;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	public Red crear(String nombre, int numEntradas) throws Exception {
		try {
			this.get(nombre);
		} catch (Exception e) {
			Red red = new Red(nombre, numEntradas);
			redes.add(red);
			return red;
		}
		throw new Exception("Ya hay una red llamada "+nombre);
	}
	
	public Red get(String nombre) throws Exception {
		Red red = null;
		Iterator<Red> iterator = redes.iterator();
		boolean encontrado = false;
		while(iterator.hasNext() && !encontrado ) {
			red = iterator.next();
			encontrado = red.getNombre().equals(nombre);
		}
		if(encontrado) return red;
		else throw new Exception("No hay ninguna red llamada "+nombre);
	}
	
	public Red borrar(String nombre) throws Exception {
		Red red = this.get(nombre);
		redes.remove(red);
		return red;
	}
}
