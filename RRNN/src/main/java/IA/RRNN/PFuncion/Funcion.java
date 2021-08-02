//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class Funcion implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new Funcion();
	public static IFuncion getInstance() { return INSTANCE; }
	private Funcion() {}
	
	public double aplicarFuncion(double valor) {
		//TODO
		return 0;
	}
	
	public double[] aplicarFuncion(double[] valores) {
		//TODO
		return null;
	}
	
	public double aplicarDerivada(double valor) {
		//TODO
		return 0;
	}
	
	public double[] aplicarDerivada(double[] valores) {
		//TODO
		return null;
	}
}
