package IA.RRNN;

import java.util.ArrayList;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : Neurona.java
//  @ Author :  Hugo



public class Neurona {
	private double bias;
	private ArrayList<Peso> anteriores;
	private ArrayList<Peso> siguientes;
	private IFuncion funcion;
	
	public Neurona(double bias, IFuncion funcion) {
		//TODO bias
		this.funcion=funcion;
		this.bias = bias;
		anteriores = new ArrayList<>();
		siguientes = new ArrayList<>();
	}
	
	public double getBias() { return bias; }
	
	public void setBias(double bias) { this.bias=bias; }
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACIÓN NEURONA-PESO(anterior)
	public void aniadirAnterior(Peso anterior) { anteriores.add(anterior); }
	public Peso obtenerAnterior(int numNeurona) { return anteriores.get(numNeurona);}
	public Peso borrarAnteriorUltima() { return anteriores.remove(anteriores.size()-1); } 
	//RELACIÓN NEURONA-PESO(siguiente)
	public void aniadirSiguiente(Peso siguiente) { siguientes.add(siguiente); }
	public Peso obtenerSiguiente(int numNeurona) { return siguientes.get(numNeurona); }
	public Peso borrarSiguientePeso() { return siguientes.remove(siguientes.size()-1); } 
}
