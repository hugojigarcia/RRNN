package IA.RRNN;

import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CapaOculta.java
//  @ Author : alonsete7,Hugo0133


public class CapaOculta extends Capa {
	private Capa capaAnterior, capaSiguiente;
	
	public CapaOculta() {
		//TODO
	}
	
	public CapaSalida convertirACapaSalida() {
		//TODO
		return null;
	}
	
	public Neurona crearNeurona(double bias, IFuncion funcion, double[] pesosAnterior, double[] pesosSiguiente) {
		//TODO
		return null;
	}
	
	//RELACION CAPAOCULTA-CAPA(anterior)
	public Capa obtenerCapaAnterior() { return capaAnterior; }
	public void asignarCapaAnterior(Capa capaAnterior) { if(capaAnterior!=null) this.capaAnterior=capaAnterior; }
	//RELACION CAPAOCULTA-CAPA(siguiente)
	public Capa obtenerCapaSiguiente() { return capaSiguiente; }
	public void asignarCapaSiguiente(Capa capaSiguiente) { if(capaSiguiente!=null) this.capaSiguiente=capaSiguiente; }
}
