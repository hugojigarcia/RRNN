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
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) {
		//TODO
		return 0;
	}
	
	public double[] aplicarDerivada(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
