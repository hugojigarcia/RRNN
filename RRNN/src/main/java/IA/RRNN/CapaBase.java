package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : CapaBase.java
//  @ Author :  Hugo



public abstract class CapaBase {
	public abstract double[] getSalida(double[] entradas);
	public abstract double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje);
}
