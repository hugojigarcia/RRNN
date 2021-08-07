package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

//  @ Project : RRNN
//  @ File Name : CCapa.java
//  @ Author : alonsete7,Hugo0133


public class CCapa {
	private List<Capa> capas;
	
	public CCapa() {
		capas = new ArrayList<>();
		CapaEntrada capaEntrada = new CapaEntrada();
		CapaSalida capaSalida = new CapaSalida();
		capaEntrada.asignarCapaSiguiente(capaSalida);
		capaSalida.asignarCapaAnterior(capaEntrada);
		capas.add(capaEntrada);
		capas.add(capaSalida);
	}
	
	public CCapa(int numEntradas) {
		//TODO
		this();
	}
	
	public int getNumCapas() {
		//TODO
		return 0;
	}
	
	public CapaOculta crearCapa() {
		//TODO
		return null;
	}
	
	public CapaOculta getCapa(int numCapa) {
		//TODO
		return null;
	}
	
	public CapaOculta borrarUltimaCapa() {
		//TODO
		return null;
	}
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}

}
