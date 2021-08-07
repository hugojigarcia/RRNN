package IA.RRNN.PFuncion;

//  @@ Project : RRNN
//  @@ File Name : FuncionTangenteHiperbolica
//  @@ Author : alonsete7,Hugo0133


public class FuncionTangenteHiperbolica implements IFuncion {
	public FuncionTangenteHiperbolica() {}
	
	public double aplicarFuncion(double valor) {
		return 2/(1+ Math.pow(Math.E, -2*valor))-1;
	}
	
	public double[] aplicarFuncion(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) {
		return 1-Math.pow(aplicarFuncion(valor),2);
	}
	
	public double[] aplicarDerivada(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
