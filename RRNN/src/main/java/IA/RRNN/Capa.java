package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

//  @ Project : RRNN
//  @ File Name : Capa.java
//  @ Author : alonsete7,Hugo0133


public abstract class Capa {
	private List<Neurona> neuronas;
	
	public Capa() {
		neuronas = new ArrayList<>();
	}
	
	public Neurona get(int numNeurona) throws Exception {
		if(0 <= numNeurona && numNeurona < getNumNeuronas())
			return neuronas.get(numNeurona);
		else
			throw new Exception("Error: número de neurona no válido.");
	}
	
	public int getNumNeuronas() {
		return neuronas.size();
	}
	
	public Neurona borrar(int numNeurona) throws Exception {
		if(0 <= numNeurona && numNeurona < getNumNeuronas())
			return neuronas.remove(numNeurona);
		else
			throw new Exception("Error: número de neurona no válido.");
	}
	
	public abstract double[] getSalida(double[] entradas);
	
	public abstract double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje);
}
