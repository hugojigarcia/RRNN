package IA.RRNN;

import java.util.ArrayList;
import java.util.Iterator;
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
		redes = new ArrayList<>();
	}
	
	public Red crearRed(String nombre) throws Exception {
		try {
			this.getRed(nombre);
		} catch (Exception e) {
			Red aux = new Red(nombre);
			redes.add(aux);
			return aux;
		}
		throw new Exception("Error: ya existe una red con este nombre");
	}
	
	public Red crearRed(String nombre, int numEntradas) throws Exception {
		try {
			this.getRed(nombre);
		} catch (Exception e) {
			Red aux = new Red(nombre, numEntradas);
			redes.add(aux);
			return aux;
		}
		throw new Exception("Error: ya existe una red con este nombre");
	}
	
	public Red getRed(String nombre) throws Exception{
		Iterator<Red> it = redes.iterator();
		Red aux = null;
		Boolean encontrado = false;
		while(it.hasNext() && !encontrado) {
			aux = it.next();
			encontrado = aux.getNombre().equals(nombre);				
		}
		if(encontrado)
			return aux;
		else
			throw new Exception("Error: no existe una red con ese nombre");
	}
	
	public Red borrarRed(String nombre) throws Exception {
		Red red = this.getRed(nombre);
		redes.remove(red);
		return red;
	}
	
	
}
