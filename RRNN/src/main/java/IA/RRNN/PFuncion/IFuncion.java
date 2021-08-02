//  @ Project : RRNN
//  @ File Name : IFuncion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public interface IFuncion {
	public double aplicarFuncion(double valor) throws Exception;
	
	public double[] aplicarFuncion(double[] valores) throws Exception;
	
	public double aplicarDerivada(double valor) throws Exception;
	
	public double[] aplicarDerivada(double[] valores) throws Exception;
}
