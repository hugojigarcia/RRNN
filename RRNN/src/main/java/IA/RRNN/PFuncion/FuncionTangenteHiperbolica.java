//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class FuncionTangenteHiperbolica implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new FuncionTangenteHiperbolica();
	public static IFuncion getInstance() { return INSTANCE; }
	private FuncionTangenteHiperbolica() {}
	
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
