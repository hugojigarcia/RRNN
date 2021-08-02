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
	@Override
	public void asignarSiguiente(CapaBase siguiente) { if(siguiente!=null) this.siguiente=siguiente; }
	@Override
	public CapaBase obtenerSiguiente() { return siguiente; }
	@Override
	public void asignarAnterior(CapaBase anterior) {}
	@Override
	public CapaBase obtenerAnterior() { return this; }
}
