package IA.RRNN.PPersistencia;

import IA.RRNN.Red;

//  @ Project : RRNN
//  @ File Name : IPersistenciaRed.java
//  @ Author : alonsete7,Hugo0133


public interface IPersistenciaRed {
	public void create(Red red);
	
	public Red read(String nombre);
	
	public void update(Red red);
	
	public void delete(String nombre);
}
