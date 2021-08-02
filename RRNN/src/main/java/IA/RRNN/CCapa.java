package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CCapa.java
//  @ Author :  Hugo



public class CCapa {
	private Generador generador;
	private Sumidero sumidero;
	private int numCapas;
	
	public CCapa(int numEntradas) {
		//TODO
		generador = new Generador();
		sumidero = new Sumidero();
		generador.asignarSiguiente(sumidero);
		sumidero.asignarAnterior(generador);
		numCapas = 0;
	}
	
	public Capa crear(int numNeuronas, IFuncion funcion) {
		//TODO pesos de neuronas y conexion con capa anteior
		Capa capa = new Capa(numNeuronas, funcion, sumidero.obtenerAnterior(), sumidero);
		sumidero.obtenerAnterior().asignarSiguiente(capa);
		sumidero.asignarAnterior(capa);
		numCapas++;
		return capa;
	}
	
	public Capa get(int numCapa) throws Exception {
		if(numCapa >= numCapas) throw new Exception(numCapa+" supera el index de neuronas de esta capa(0-"+(numCapas-1)+")");
		else {
			CapaBase capa = sumidero.obtenerSiguiente();
			for(int i=0; i<numCapa; i++) capa = capa.obtenerSiguiente();
			return (Capa) capa;
		}
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
