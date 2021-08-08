package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : CapaEntrada.java
//  @ Author : alonsete7,Hugo0133


public class CapaEntrada extends Capa {
	private Capa capaSiguiente;
	
	public CapaEntrada() {
		super();
		capaSiguiente = null;
	}
	
	public CapaEntrada(int numEntradas) {
		this();
		for(int i=0; i<numEntradas; i++) {
			crearEntrada(new double[0]);
		}
	}
	
	public Neurona crearEntrada(double[] pesosSiguiente) {
		//Neurona entrada = new Neurona(1,)
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
	
	
	//RELACION CAPAENTRADA-CAPA
	public Capa obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(Capa capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
	public void borrarCapaSiguiente() { this.capaSiguiente = null; } 
}
