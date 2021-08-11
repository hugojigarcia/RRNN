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
		this.asignarFuncion(funcion);
		this.bias=bias;
		neuronasAnteriores = new ArrayList<>();
		neuronasSiguientes = new ArrayList<>();
	}
	
	public double getBias() { return bias; }
	public void setBias(double bias) { this.bias=bias;}
	
	public double getSalida(double[] entradas) throws Exception {
		if(entradas.length != neuronasAnteriores.size()) throw new Exception("Error: el número de entradas no coincide con el número de neuronas de la capa anterior");
		double salida = bias;
		for(int i=0; i<entradas.length; i++) {
			salida += entradas[i] * neuronasAnteriores.get(i).getPeso();
		}
		return funcion.aplicarFuncion(salida);
	}
	
	public double retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return 0;
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
	public IFuncion obtenerFuncion() { return funcion; }
	public void asignarFuncion(IFuncion funcion) throws Exception { 
		if(funcion==null) throw new Exception("Error: parámetro nulo");
		else this.funcion=funcion;
	}
	
	@Override
	public String toString() {
		String resultado = "\t\tBIAS: " + bias + " / FUNCIÓN DE ACTIVACIÓN: " + funcion.getNombre() + "\n";
		for(int i=0; i<this.neuronasAnteriores.size(); i++) {
			try {
				resultado += "\t\tPESO " + i + ": "+ this.neuronasAnteriores.get(i).getPeso() + "\n";
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
}
