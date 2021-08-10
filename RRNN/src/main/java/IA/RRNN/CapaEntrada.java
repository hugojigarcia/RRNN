package IA.RRNN;

import IA.RRNN.PFuncion.FuncionLineal;

//  @ Project : RRNN
//  @ File Name : CapaEntrada.java
//  @ Author : alonsete7,Hugo0133


public class CapaEntrada extends Capa {
	public CapaEntrada() {
		super();
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
		if(this.obtenerCapaSiguiente()!=null) {
			if(pesosSiguiente==null || pesosSiguiente.length!=this.obtenerCapaSiguiente().getNumNeuronas()) {
				throw new Exception("Error: el número de pesos no coincide con el número de neuronas de la siguiente capa");
			}
			for(int i=0;i<pesosSiguiente.length;i++) {
				Peso peso = new Peso(pesosSiguiente[i]);
				peso.asignarNeuronaAnterior(entrada);
				peso.asignarNeuronaSiguiente(this.obtenerCapaSiguiente().getNeurona(i));
				entrada.aniadirNeuronaSiguiente(peso);
				this.obtenerCapaSiguiente().getNeurona(i).aniadirNeuronaAnterior(peso);
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
	
	
	
}
