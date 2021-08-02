package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Sumidero.java
//  @ Author :  Hugo



public class Sumidero extends CapaBase {
	private CapaBase anterior;
	public Sumidero() {
		anterior = null;
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
	
	//RELACIÓN SUMIDERO-CAPABASE(anterior)
	@Override
	public void asignarAnterior(CapaBase anterior) { if(anterior!=null) this.anterior=anterior; }
	@Override
	public CapaBase obtenerAnterior() { return anterior; }
	@Override
	public void asignarSiguiente(CapaBase siguiente) {	}

	@Override
	public CapaBase obtenerSiguiente() { return this; }
}
