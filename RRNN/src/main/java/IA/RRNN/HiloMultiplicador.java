package IA.RRNN;

public class HiloMultiplicador extends Thread{
	private Double salida;
	private Neurona neurona;
	private double[] entradas;
	
	public HiloMultiplicador(Neurona neurona, double[] entradas) {
		this.neurona = neurona;
		this.entradas = entradas;
		salida = null;
	}
	
	public double getSalida() throws Exception {
		if(salida == null) throw new Exception("Error: aún no se ha realizado la operación de cálculo");
		else return salida;
	}
	
	@Override
	public void run() {
		try {
			salida = neurona.getSalida(entradas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(this.getName()); //BORRAR
	}
}
