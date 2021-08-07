package IA.RRNN.PFuncion;

//@@ Project : RRNN
//@@ File Name : Funcion
//@@ Author : alonsete7,Hugo0133


public class Funcion implements IFuncion {
	public Funcion() {}
	
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
