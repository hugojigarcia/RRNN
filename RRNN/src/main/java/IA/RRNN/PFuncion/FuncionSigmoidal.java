//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class FuncionSigmoidal implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new FuncionSigmoidal();
	public static IFuncion getInstance() { return INSTANCE; }
	private FuncionSigmoidal() {}
	
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
