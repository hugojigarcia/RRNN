package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CapaOculta.java
//  @ Author : alonsete7,Hugo0133


public class CapaOculta extends Capa {
	private Capa capaAnterior, capaSiguiente;
	
	public CapaOculta(Capa capaAnterior) {
		super();
		this.capaAnterior = capaAnterior;
		//TODO excepcion
		this.capaSiguiente = null;
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
		if(capaSiguiente!=null) {
			if(pesosSiguiente==null || pesosSiguiente.length!=capaSiguiente.getNumNeuronas()) {
				throw new Exception("Error: el número de pesos siguientes no coincide con el número de neuronas de la siguiente capa");
			}
			for(int i=0;i<pesosSiguiente.length;i++) {
				Peso peso = new Peso(pesosSiguiente[i]);
				peso.asignarNeuronaAnterior(neurona);
				peso.asignarNeuronaSiguiente(capaSiguiente.getNeurona(i));
				neurona.aniadirNeuronaSiguiente(peso);
				capaSiguiente.getNeurona(i).aniadirNeuronaAnterior(peso);
			}
		}
		
		this.aniadirNeurona(neurona);
		return neurona;
		
		
	}
	
	public double[] getSalida(double[] entradas) {
		//TODO
		return null;
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACION CAPAOCULTA-CAPA(anterior)
	public Capa obtenerCapaAnterior() { return capaAnterior; }
	public void asignarCapaAnterior(Capa capaAnterior) { if(capaAnterior!=null) this.capaAnterior=capaAnterior; }
	public void borrarCapaAnterior() { this.capaAnterior = null; }
	//RELACION CAPAOCULTA-CAPA(siguiente)
	public Capa obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(Capa capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
	public void borrarCapaSiguiente() { this.capaSiguiente = null; }
}
