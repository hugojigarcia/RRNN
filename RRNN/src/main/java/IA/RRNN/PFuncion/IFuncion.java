package IA.RRNN.PFuncion;

//@@ Project : RRNN
//@@ File Name : IFuncion
//@@ Author : alonsete7,Hugo0133


public interface IFuncion {
	public String getNombre();
	
	public double aplicarFuncion(double valor) throws Exception;
	
	public double[] aplicarFuncion(double[] valores) throws Exception;
	
	public double aplicarDerivada(double valor) throws Exception;
	
	public double[] aplicarDerivada(double[] valores) throws Exception;
}
