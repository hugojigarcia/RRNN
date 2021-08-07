package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : Neurona.java
//  @ Author : alonsete7,Hugo0133


public class Neurona {
	private double bias;
	private List<Peso> neuronasAnteriores, neuronasSiguientes;
	
	public Neurona(double bias, IFuncion funcion) {
		//TODO
		neuronasAnteriores = new ArrayList<>();
		neuronasSiguientes = new ArrayList<>();
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
	
	//RELACION NEURONA-NEURONA(anteriores)
	public void aniadirNeuronaAnterior(Peso peso) { 
		//TODO
	}
	public Peso obtenerNeuronaAnterior(int numNeurona) {
		//TODO
		return null;
	}
	public void borrarNeuronaAnterior(int numNeurona) {
		//TODO
	}
	//RELACION NEURONA-NEURONA(anteriores)
	public void aniadirNeuronaSiguiente(Peso peso) { 
		//TODO
	}
	public Peso obtenerNeuronaSiguiente(int numNeurona) {
		//TODO
		return null;
	}
	public void borrarNeuronaSiguiente(int numNeurona) {
		//TODO
	}
}
