package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : CapaEntrada.java
//  @ Author : alonsete7,Hugo0133


public class CapaEntrada extends Capa {
	private Capa capaSiguiente;
	
	public CapaEntrada() {
		//TODO
	}
	
	public CapaEntrada(int numEntradas) {
		//TODO
	}
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	public Neurona crearEntrada(double[] pesosSiguiente) {
		//TODO
		return null;
	}
	
	//RELACION CAPAENTRADA-CAPA
	public Capa obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(Capa capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
}
