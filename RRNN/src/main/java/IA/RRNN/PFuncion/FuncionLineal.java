//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class FuncionLineal implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new FuncionLineal();
	public static IFuncion getInstance() { return INSTANCE; }
	private FuncionLineal() {}
	
	public double aplicarFuncion(double valor) {
		return valor;
	}
	
	public double[] aplicarFuncion(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) {
		return 1;
	}
	
	public double[] aplicarDerivada(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
