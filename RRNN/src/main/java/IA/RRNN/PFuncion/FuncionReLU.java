//  @ Project : RRNN
//  @ File Name : Funcion.java
//  @ Author :  Hugo


package IA.RRNN.PFuncion;


public class FuncionReLU implements IFuncion {
	//SINGLETON
	private final static IFuncion INSTANCE = new FuncionReLU();
	public static IFuncion getInstance() { return INSTANCE; }
	private FuncionReLU() {}
	
	public double aplicarFuncion(double valor) {
		return Math.max(0, valor);
	}
	
	public double[] aplicarFuncion(double[] valores){
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarFuncion(valores[i]);
		return resultado;
	}
	
	public double aplicarDerivada(double valor) throws Exception {
			if(valor>0) return 1;
			else throw new Exception("La función de activación ReLU no tiene derivada para valores menores o igales a 0");
	}
	
	public double[] aplicarDerivada(double[] valores) throws Exception {
		double[] resultado = new double[valores.length];
		for(int i=0;i<valores.length;i++) resultado[i] = this.aplicarDerivada(valores[i]);
		return resultado;
	}
}
