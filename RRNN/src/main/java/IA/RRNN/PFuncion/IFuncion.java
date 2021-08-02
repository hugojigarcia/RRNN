//  @ Project : RRNN
//  @ File Name : IFuncion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public interface IFuncion {
	public double aplicarFuncion(double valor);
	
	public double[] aplicarFuncion(double[] valores);
	
	public double aplicarDerivada(double valor);
	
	public double[] aplicarDerivada(double[] valores);
}
