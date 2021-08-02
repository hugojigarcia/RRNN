package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CCapa.java
//  @ Author :  Hugo



public class CCapa {
	private Generador generador;
	private Sumidero sumidero;
	
	public CCapa(int numEntradas) {
		//TODO
		generador = new Generador();
		sumidero = new Sumidero();
		generador.asignarSiguiente(sumidero);
		sumidero.asignarAnterior(generador);
	}
	
	public Capa crear(int numNeuronas, IFuncion funcion) {
		//TODO
		return null;
	}
	
	public Capa get(int numCapa) {
		//TODO
		return null;
	}
	
	public Capa borrarUltimaCapa() {
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
	
	//RELACIÓN CCAPA-GENERADOR
	public void asignarGenerador(Generador generador) { if(generador!=null) this.generador=generador; }
	public Generador obtenerGenerador() { return generador; }
	//RELACIÓN CCAPA-GENERADOR
	public void asignarSumidero(Sumidero sumidero) { if(sumidero!=null) this.sumidero=sumidero; }
	public Sumidero obtenerSumidero() { return sumidero; }
}
