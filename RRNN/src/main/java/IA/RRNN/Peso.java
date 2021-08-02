package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Peso.java
//  @ Author :  Hugo



public class Peso {
	private double peso;
	private Neurona anterior, siguiente;
	
	public Peso (double peso) {
		this.peso=peso;
	}
	
	public double getPeso() { return peso; }
	public void setPeso (double peso) { this.peso=peso; }
	
	//RELACIÓN PESO-NEURONA(anterior)
	public void asignarAnterior(Neurona anterior) { this.anterior=anterior; }
	public Neurona obtenerAnterior() {return anterior; }
	//RELACIÓN PESO-NEURONA(siguiente)
	public void asignarSiguiente(Neurona siguiente) { this.siguiente=siguiente; }
	public Neurona obtenerSiguiente() {return siguiente; } 
}
