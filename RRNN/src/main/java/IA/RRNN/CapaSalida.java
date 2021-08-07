package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CapaSalida.java
//  @ Author : alonsete7,Hugo0133


public class CapaSalida extends Capa {
	private Capa capaAnterior;
	
	public CapaSalida() {
		//TODO
	}
	
	public CapaOculta convertirACapaOculta() {
		//TODO
		return null;
	}
	
	public Neurona crearNeurona(double bias, IFuncion funcion, double[] pesosAnterior) {
		//TODO
		return null;
	}
	
	//RELACION CAPAOCULTA-CAPA(anterior)
	public Capa obtenerCapaAnterior() { return capaAnterior; }
	public void asignarCapaAnterior(Capa capaAnterior) { if(capaAnterior!=null) this.capaAnterior=capaAnterior; }
}
