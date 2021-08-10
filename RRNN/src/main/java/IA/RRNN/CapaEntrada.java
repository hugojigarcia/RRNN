package IA.RRNN;

import IA.RRNN.PFuncion.FuncionLineal;

//  @ Project : RRNN
//  @ File Name : CapaEntrada.java
//  @ Author : alonsete7,Hugo0133


public class CapaEntrada extends Capa {
	private CapaOculta capaSiguiente;
	
	public CapaEntrada() {
		super();
		capaSiguiente = null;
	}
	
	public CapaEntrada(int numEntradas) {
		this();
		for(int i=0; i<numEntradas; i++) {
			try {
				crearEntrada(new double[0]);
			} catch (Exception ignored) {}
		}
	}
	
	public Neurona crearEntrada(double[] pesosSiguiente) throws Exception {
		Neurona entrada = new Neurona(1, new FuncionLineal());
		if(capaSiguiente!=null) {
			if(pesosSiguiente==null || pesosSiguiente.length!=capaSiguiente.getNumNeuronas()) {
				throw new Exception("Error: el número de pesos no coincide con el número de neuronas de la siguiente capa");
			}
			for(int i=0;i<pesosSiguiente.length;i++) {
				Peso peso = new Peso(pesosSiguiente[i]);
				peso.asignarNeuronaAnterior(entrada);
				peso.asignarNeuronaSiguiente(capaSiguiente.getNeurona(i));
				entrada.aniadirNeuronaSiguiente(peso);
				capaSiguiente.getNeurona(i).aniadirNeuronaAnterior(peso);
			}
		}
		
		this.aniadirNeurona(entrada);
		return entrada;
	}
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	
	//RELACION CAPAENTRADA-CAPA
	public CapaOculta obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(CapaOculta capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
	public void borrarCapaSiguiente() { this.capaSiguiente = null; } 
}
