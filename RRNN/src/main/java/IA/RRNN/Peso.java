package IA.RRNN;

//  @ Project : RRNN
//  @ File Name : Peso.java
//  @ Author :  Hugo



public class Peso {
	private double peso;
	private Neurona anterior, siguiente;
	
	public Peso (double peso, Neurona anterior, Neurona siguiente) {
		this.peso=peso;
		this.anterior=anterior;
		this.siguiente=siguiente;
	}
	
	public double getPeso() { return peso; }
	public void setPeso (double peso) { this.peso=peso; }
	
	//RELACIÓN PESO-NEURONA(anterior)
	public void asignarAnterior(Neurona anterior) { if(anterior!=null) this.anterior=anterior; }
	public Neurona obtenerAnterior() {return anterior; }
	//RELACIÓN PESO-NEURONA(siguiente)
	public void asignarSiguiente(Neurona siguiente) { if(siguiente!=null) this.siguiente=siguiente; }
	public Neurona obtenerSiguiente() {return siguiente; } 
}
