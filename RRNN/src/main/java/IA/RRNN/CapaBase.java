package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : CapaBase.java
//  @ Author :  Hugo



public abstract class CapaBase {
	public abstract double[] getSalida(double[] entradas);
	public abstract double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje);
	
	//RELACIONES
	public abstract void asignarAnterior(CapaBase anterior);
	public abstract CapaBase obtenerAnterior();
	public abstract void asignarSiguiente(CapaBase siguiente);
	public abstract CapaBase obtenerSiguiente();
}
