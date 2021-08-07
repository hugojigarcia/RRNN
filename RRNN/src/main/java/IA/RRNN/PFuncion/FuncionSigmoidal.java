package IA.RRNN.PFuncion;

//  @@ Project : RRNN
//  @@ File Name : FuncionSigmoidal
//  @@ Author : alonsete7,Hugo0133


public class FuncionSigmoidal implements IFuncion {
	public FuncionSigmoidal() {}
	
	public double aplicarFuncion(double valor) {
		return 1/(1+ Math.pow(Math.E, -valor));
	}
	
	public double[] aplicarFuncion(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) {
		return aplicarFuncion(valor)*(1-aplicarFuncion(valor));
	}
	
	public double[] aplicarDerivada(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
