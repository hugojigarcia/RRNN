//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class FuncionEscalon implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new FuncionEscalon();
	public static IFuncion getInstance() { return INSTANCE; }
	private FuncionEscalon() {}
	
	public double aplicarFuncion(double valor) {
		return valor>0?1:0;
	}
	
	public double[] aplicarFuncion(double[] valores) {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) throws Exception {
		throw new Exception("La función de activación escalón no tiene derivada");
	}
	
	public double[] aplicarDerivada(double[] valores) throws Exception {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
