package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : Capa.java
//  @ Author :  Hugo



public class Capa extends CapaBase {
	private CapaBase anterior, siguiente;
	private CNeurona cNeurona;
	public Capa(int numNeuronas, IFuncion funcion, CapaBase anterior, CapaBase siguiente) {
		//TODO
		this.anterior = anterior;
		this.siguiente = siguiente;
		cNeurona = new CNeurona();
	}
	
	@Override
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	@Override
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACIÓN CAPA-CAPABASE(anterior)
	public void asignarAnterior(CapaBase anterior) { if(anterior!=null) this.anterior=anterior; }
	public CapaBase obtenerAnterior() { return anterior; }
	//RELACIÓN GENERADOR-CAPABASE(siguiente)
	public void asignarSiguiente(CapaBase siguiente) { if(siguiente!=null) this.siguiente=siguiente; }
	public CapaBase obtenerSiguiente() { return siguiente; }
	//RELACIÓN CAPA-CNEURONA
	public void asignarCNeurona(CNeurona cNeurona) { if(cNeurona!=null) this.cNeurona=cNeurona; }
	public CNeurona obtenerCNeurona() { return cNeurona; }
}
