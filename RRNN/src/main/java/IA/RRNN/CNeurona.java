package IA.RRNN;

import java.util.ArrayList;
import IA.RRNN.PFuncion.IFuncion;

//  @ Project : RRNN
//  @ File Name : CNeurona.java
//  @ Author :  Hugo



public class CNeurona {
	private ArrayList<Neurona> neuronas;
	
	public CNeurona() {
		neuronas = new ArrayList<>();
	}
	
	public Neurona crear(double bias, IFuncion funcion, ArrayList<Neurona> anteriores, ArrayList<Neurona> siguientes) {
		//TODO ver como se asigna el peso
		Neurona neurona = new Neurona(bias,funcion);
		for(Neurona anterior:anteriores) neurona.aniadirAnterior(new Peso(0, anterior, neurona));
		for(Neurona siguiente:siguientes) neurona.aniadirSiguiente(new Peso(0, neurona, siguiente));
		neuronas.add(neurona);
		return neurona;
	}
	
	public Neurona get(int numNeurona) throws Exception {
		if(numNeurona < neuronas.size()) return neuronas.get(numNeurona);
		else throw new Exception(numNeurona+" supera el index de neuronas de esta capa(0-"+(neuronas.size()-1)+")"); 
	}
	
	public Neurona borrarUltimaNeurona() {
		//TODO
		return null;
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
