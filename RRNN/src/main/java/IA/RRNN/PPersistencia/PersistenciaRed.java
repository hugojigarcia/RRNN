package IA.RRNN.PPersistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import IA.RRNN.CCapa;
import IA.RRNN.CapaOculta;
import IA.RRNN.Neurona;
import IA.RRNN.Red;

//  @ Project : RRNN
//  @ File Name : PersistenciaRed.java
//  @ Author : alonsete7,Hugo0133


public class PersistenciaRed implements IPersistenciaRed {
	private final static IPersistenciaRed INSTANCE = new PersistenciaRed();
	private PersistenciaRed() {}
	public static IPersistenciaRed getInstance() { return INSTANCE; }
	
	public void create(Red red, String rutaDirectorio) throws Exception {
		String ruta = rutaDirectorio+"\\"+red.getNombre()+".rn";
		FileWriter writer = new FileWriter(ruta, false);
		
		
		
		writer.write(red.getNombre());
		CCapa cCapa = red.obtenerCCapa();
		writer.write(cCapa.obtenerCapaEntrada().getNumNeuronas());
		
		
		for(int i=0;i<cCapa.getNumCapas();i++) {
			CapaOculta capaAux = cCapa.getCapa(i);
			writer.write(capaAux.getNumNeuronas());
			
			for(int j=0; j<capaAux.getNumNeuronas();j++) {
				Neurona neuronaAux = capaAux.getNeurona(j);
				writer.write(""+neuronaAux.getBias());
				writer.write(neuronaAux.obtenerFuncion().getNombre());
				writer.write(convertirPesosALinea(neuronaAux, capaAux.obtenerCapaAnterior().getNumNeuronas()));
			}
		}
		
		writer.close();

	}
	private String convertirPesosALinea (Neurona neuronaAux, int numNeuronasCapaAnterior) throws Exception {
		String resultado = "";
		for(int i=0;i<numNeuronasCapaAnterior;i++) {
			resultado+=neuronaAux.obtenerNeuronaAnterior(i).getPeso();
			if(i<numNeuronasCapaAnterior-1) resultado+=",";
		}
		
		return resultado;
	}
	
	public Red read(String rutaArchivo) throws IOException {
		//TODO
		Red red = null;
		FileReader reader = new FileReader(rutaArchivo);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String linea = bufferedReader.readLine();

		while (linea != null) {
			
			linea=bufferedReader.readLine();
		}
		bufferedReader.close();
		reader.close();


		return red;
	}
	
	public void update(Red red, String rutaArchivo) {
		//TODO
	}
	
	public void delete(String rutaArchivo) {
		//TODO
	}
}
