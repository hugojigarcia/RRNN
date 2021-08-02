package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Generador.java
//  @ Author :  Hugo



public class Generador extends CapaBase {
	private CapaBase siguiente;
	public Generador() {
		siguiente = null;
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
	
	//RELACIÓN GENERADOR-CAPABASE(siguiente)
	public void asignarSiguiente(CapaBase siguiente) { if(siguiente!=null) this.siguiente=siguiente; }
	public CapaBase obtenerSiguiente() { return siguiente; }
}
