package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Peso.java
//  @ Author : alonsete7,Hugo0133


public class Peso {
	private double peso;
	private Neurona neuronaAnterior, neuronaSiguiente;
	public Peso(double peso) {
		//TODO
	}
	
	public double getPeso() { return peso; }
	
	public void setPeso(double peso) {
		//TODO
	}
	
	
	//RELACION PESO-NEURONA(anterior)
	public void asignarNeuronaAnterior(Neurona neuronaAnterior) { this.neuronaAnterior=neuronaAnterior; }
	public Neurona obtenerNeuronaAnterior() { return neuronaAnterior; }
	public void borrarNeuronaAnterior() { neuronaAnterior=null;	}
	//RELACION PESO-NEURONA(siguiente)
	public void asignarNeuronaSiguiente(Neurona neuronaSiguiente) { this.neuronaSiguiente=neuronaSiguiente;	}
	public Neurona obtenerNeuronaSiguiente() { return neuronaSiguiente; }
	public void borrarNeuronaSiguiente(int numNeurona) { neuronaSiguiente=null; }
}
