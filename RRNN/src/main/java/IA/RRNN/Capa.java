package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

//  @ Project : RRNN
//  @ File Name : Capa.java
//  @ Author : alonsete7,Hugo0133


public abstract class Capa {
	private List<Neurona> neuronas;
	private CapaOculta capaSiguiente;
	
	public Capa() {
		neuronas = new ArrayList<>();
		capaSiguiente=null;
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
	
	//RELACION CAPA-NEURONA
	public Neurona getNeurona(int numNeurona) throws Exception {
		if(0 <= numNeurona && numNeurona < getNumNeuronas())
			return neuronas.get(numNeurona);
		else
			throw new Exception("Error: número de neurona no válido.");
	}
	
	public void aniadirNeurona(Neurona neurona) { if(neurona!=null) neuronas.add(neurona); }
	public void borrarNeurona(int numNeurona) throws Exception {
		neuronas.remove(this.getNeurona(numNeurona));
	}
	
	//RELACION CAPA-CAPAOCULTA(siguiente)
	public CapaOculta obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(CapaOculta capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
	public void borrarCapaSiguiente() { this.capaSiguiente = null; } 
}
