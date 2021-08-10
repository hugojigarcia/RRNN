package IA.RRNN.PFuncion;

//@@ Project : RRNN
//@@ File Name : FuncionLineal
//@@ Author : alonsete7,Hugo0133


public class FuncionLineal implements IFuncion {
	public FuncionLineal() {}
	
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

	@Override
	public String getNombre() {
		return "Lineal";
	}
}
