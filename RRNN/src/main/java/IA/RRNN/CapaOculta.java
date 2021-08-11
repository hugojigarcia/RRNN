package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CapaOculta.java
//  @ Author : alonsete7,Hugo0133


public class CapaOculta extends Capa {
	private Capa capaAnterior;
	
	public CapaOculta(Capa capaAnterior) {
		super();
		this.capaAnterior = capaAnterior;
		//TODO excepcion
	}

	
	public Neurona crearNeurona(double bias, IFuncion funcion, double[] pesosAnterior, double[] pesosSiguiente) throws Exception {
		Neurona neurona = new Neurona(bias, funcion);
		//Enlazar con la capa anterior
		
		if(pesosAnterior==null || pesosAnterior.length!=capaAnterior.getNumNeuronas()) {
			throw new Exception("Error: el número de pesos anteriores no coincide con el número de neuronas de la anterior capa");
		}
		for(int i=0;i<pesosAnterior.length;i++) {
			Peso peso = new Peso(pesosAnterior[i]);
			peso.asignarNeuronaAnterior(capaAnterior.getNeurona(i));
			peso.asignarNeuronaSiguiente(neurona);
			capaAnterior.getNeurona(i).aniadirNeuronaSiguiente(peso);
			neurona.aniadirNeuronaAnterior(peso);
		}
		
		//Enlazar con la capa siguinte
		if(this.obtenerCapaSiguiente()!=null) {
			if(pesosSiguiente==null || pesosSiguiente.length!=this.obtenerCapaSiguiente().getNumNeuronas()) {
				throw new Exception("Error: el número de pesos siguientes no coincide con el número de neuronas de la siguiente capa");
			}
			for(int i=0;i<pesosSiguiente.length;i++) {
				Peso peso = new Peso(pesosSiguiente[i]);
				peso.asignarNeuronaAnterior(neurona);
				peso.asignarNeuronaSiguiente(this.obtenerCapaSiguiente().getNeurona(i));
				neurona.aniadirNeuronaSiguiente(peso);
				this.obtenerCapaSiguiente().getNeurona(i).aniadirNeuronaAnterior(peso);
			}
		}
		
		this.aniadirNeurona(neurona);
		return neurona;
		
		
	}
	
	public double[] getSalida(double[] entradas) throws Exception {
		if(this.getNumNeuronas() == 0) throw new Exception("Error: no hay neuronas en esta capa");
		if(entradas.length != this.obtenerCapaAnterior().getNumNeuronas()) throw new Exception("Error: el número de entradas no coincide con el número de neuronas de esta capa");
		double[] salidas = new double[this.getNumNeuronas()];
		HiloMultiplicador[] hilosMultiplicadores = new HiloMultiplicador[this.getNumNeuronas()];
		for(int i=0; i<this.getNumNeuronas(); i++) {
			hilosMultiplicadores[i] = new HiloMultiplicador(this.getNeurona(i), entradas);
			hilosMultiplicadores[i].start();
		}
		for(int i=0; i<this.getNumNeuronas(); i++) {
			hilosMultiplicadores[i].join();
			salidas[i] = hilosMultiplicadores[i].getSalida();
			System.out.println("salida capa: " + salidas[i]); // BORRAR
		}
		return salidas;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACION CAPAOCULTA-CAPA(anterior)
	public Capa obtenerCapaAnterior() { return capaAnterior; }
	public void asignarCapaAnterior(Capa capaAnterior) { if(capaAnterior!=null) this.capaAnterior=capaAnterior; }
	public void borrarCapaAnterior() { this.capaAnterior = null; }
	
	@Override
	public String toString() {
		String resultado = "";
		for(int i=0; i<this.getNumNeuronas(); i++) {
			try {
				resultado += "\tNEURONA " + i + ": \n" + this.getNeurona(i).toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultado;
	}
}
