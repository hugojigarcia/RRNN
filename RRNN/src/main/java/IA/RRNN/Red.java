package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Red.java
//  @ Author : alonsete7,Hugo0133


public class Red {
	private String nombre;
	private CCapa cCapa;
	
	public Red(String nombre) {
		this.nombre=nombre;
		cCapa = new CCapa();
	}
	
	public Red(String nombre, int numEntradas) {
		this.nombre=nombre;
		cCapa = new CCapa(numEntradas);
	}
	
	public String getNombre() { return nombre; }
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACIÓN RED-CCAPA
	public CCapa obtenerCCapa() { return cCapa; }
	public void asignarCCapa(CCapa cCapa) { if(cCapa!=null) this.cCapa=cCapa; }
}
