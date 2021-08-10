package IA.RRNN.PFuncion;

//@@ Project : RRNN
//@@ File Name : FuncionReLU
//@@ Author : alonsete7,Hugo0133


public class FuncionReLU implements IFuncion {
	public FuncionReLU() {}
	
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

	@Override
	public String getNombre() {
		return "ReLU";
	}
}
