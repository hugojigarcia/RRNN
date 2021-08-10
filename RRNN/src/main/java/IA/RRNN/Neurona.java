package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : Neurona.java
//  @ Author : alonsete7,Hugo0133


public class Neurona {
	private double bias;
	private IFuncion funcion;
	private List<Peso> neuronasAnteriores, neuronasSiguientes;
	
	public Neurona(double bias, IFuncion funcion) throws Exception {
		this.setFuncion(funcion);
		this.bias=bias;
		neuronasAnteriores = new ArrayList<>();
		neuronasSiguientes = new ArrayList<>();
	}
	
	public double getBias() { return bias; }
	public void setBias(double bias) { this.bias=bias;}
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACION NEURONA-NEURONA(anteriores)
	public void aniadirNeuronaAnterior(Peso peso) throws Exception { 
		if(peso==null) throw new Exception("Error: parámetro nulo");
		else neuronasAnteriores.add(peso);
	}
	public Peso obtenerNeuronaAnterior(int numNeurona) throws Exception {
		if(numNeurona<neuronasAnteriores.size()) return neuronasAnteriores.get(numNeurona);
		else throw new Exception("Error: número de neurona no válido.");
	}
	public void borrarNeuronaAnterior(int numNeurona) throws Exception {
		neuronasAnteriores.remove(this.obtenerNeuronaAnterior(numNeurona));
	}
	//RELACION NEURONA-NEURONA(anteriores)
	public void aniadirNeuronaSiguiente(Peso peso) throws Exception { 
		if(peso==null) throw new Exception("Error: parámetro nulo");
		else neuronasSiguientes.add(peso);
	}
	public Peso obtenerNeuronaSiguiente(int numNeurona) throws Exception {
		if(numNeurona<neuronasSiguientes.size()) return neuronasSiguientes.get(numNeurona);
		else throw new Exception("Error: número de neurona no válido.");
	}
	public void borrarNeuronaSiguiente(int numNeurona) throws Exception {
		neuronasSiguientes.remove(this.obtenerNeuronaSiguiente(numNeurona));
	}
	
	//RELACION NEURONA-IFUNCION
	public IFuncion getFuncion() { return funcion; }
	public void setFuncion(IFuncion funcion) throws Exception { 
		if(funcion==null) throw new Exception("Error: parámetro nulo");
		else this.funcion=funcion;
	}
}
