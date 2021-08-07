package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : Neurona.java
//  @ Author : alonsete7,Hugo0133


public class Neurona {
	private double bias;
	public Neurona anterior;
	public Neurona siguiente;
	public Neurona(double bias, IFuncion funcion) {
		//TODO
	}
	
	public double getBias() { return bias; }
	
	public void setBias(double bias) {
		//TODO
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
