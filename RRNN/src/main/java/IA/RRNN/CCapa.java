package IA.RRNN;

import java.util.ArrayList;
import java.util.List;

//  @ Project : RRNN
//  @ File Name : CCapa.java
//  @ Author : alonsete7,Hugo0133


public class CCapa {
	private List<CapaOculta> capas;
	private CapaEntrada capaEntrada;
	
	public CCapa() {
		capas = new ArrayList<>();
		capaEntrada = new CapaEntrada();
	}
	
	public CCapa(int numEntradas) {
		capas = new ArrayList<>();
		capaEntrada = new CapaEntrada(numEntradas);
	}
	
	public int getNumCapas() {
		return capas.size();
	}
	
	public CapaOculta crearCapa() {
		Capa ultimaCapa = capas.size()==0?capaEntrada:capas.get(capas.size()-1);
		CapaOculta capaNueva = new CapaOculta(ultimaCapa);
		ultimaCapa.asignarCapaSiguiente(capaNueva);
		capas.add(capaNueva);
		return capaNueva;
	}
	
	public CapaOculta getCapa(int numCapa) throws Exception {
		if(0 <= numCapa && numCapa < capas.size()) {
			return capas.get(numCapa);
		}
		else
			throw new Exception("Error: el número de capa no es válido.");
	}
	
	public void borrarUltimaCapa() throws Exception {
		if(capas.size() > 0) {
			CapaOculta ultimaCapa = capas.get(capas.size()-1 );
			for(int i=0; i<ultimaCapa.getNumNeuronas(); i++) {
				ultimaCapa.borrar(i);
			}
			ultimaCapa.obtenerCapaAnterior().borrarCapaSiguiente();
			capas.remove(ultimaCapa);
		}
		else throw new Exception("Error: no hay más capas para borrar.");
	}
	
	public double[] getSalida(double[] entradas) throws Exception {
		if(entradas.length != capaEntrada.getNumNeuronas()) throw new Exception("Error: el número de entradas no coincide el número de entradas de la red");
		else {
			double[] salidas = entradas;
			for(CapaOculta capa: capas) {
				salidas = capa.getSalida(salidas);
			}
			return salidas;
		}
	}
	
	public double[] retropropagar(double[] entradas, double[] salidasDeseadas, double factorAprendizaje) {
		//TODO
		return null;
	}
	
	//RELACION CCAPA-CAPAENTRADA
	public CapaEntrada obtenerCapaEntrada() { return capaEntrada; }
	public void asignarCapaEntrada(CapaEntrada capaEntrada) throws Exception { 
		if(capaEntrada==null) throw new Exception("Error: parámetro nulo");
		else this.capaEntrada=capaEntrada;
	}

}
