package IA.RRNN.PPersistencia;

import java.io.IOException;

import IA.RRNN.Red;

//  @ Project : RRNN
//  @ File Name : IPersistenciaRed.java
//  @ Author : alonsete7,Hugo0133


public interface IPersistenciaRed {
	public void create(Red red, String rutaDirectorio) throws Exception;
	
	public Red read(String rutaArchivo) throws IOException;
	
	public void update(Red red, String rutaArchivo);
	
	public void delete(String rutaArchivo);
}
