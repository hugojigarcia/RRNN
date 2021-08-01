//  @ Project : RRNN
//  @ File Name : IPersistenciaRed.java
//  @ Author :  Hugo


package IA.RRNN.PPersistencia;

import IA.RRNN.Red;

public interface IPersistenciaRed {
	public IPersistenciaRed getInstance();
	
	public void create(Red red);
	
	public void read(Red nombre);
	
	public void update(Red red);
	
	public void delete(Red nombre);
}
