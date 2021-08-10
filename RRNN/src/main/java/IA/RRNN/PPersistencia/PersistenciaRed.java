package IA.RRNN.PPersistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		
		//ESCRITURA DATOS GENERALES RED
		writer.write(red.getNombre()+"\n");
		CCapa cCapa = red.obtenerCCapa();
		writer.write(cCapa.obtenerCapaEntrada().getNumNeuronas()+"\n");
		
		for(int i=0;i<cCapa.getNumCapas();i++) {
			//ESCRITURA DATOS CAPA
			CapaOculta capaAux = cCapa.getCapa(i);
			writer.write(capaAux.getNumNeuronas()+"\n");
			
			for(int j=0; j<capaAux.getNumNeuronas();j++) {
				//ESCRITURA DATOS NEURONA
				Neurona neuronaAux = capaAux.getNeurona(j);
				writer.write(""+neuronaAux.getBias()+"\n");
				writer.write(neuronaAux.obtenerFuncion().getNombre()+"\n");
				writer.write(convertirPesosALinea(neuronaAux, capaAux.obtenerCapaAnterior().getNumNeuronas())+"\n");
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
	
	public Red read(String rutaArchivo) throws Exception {
		Red red = null;
		FileReader reader = new FileReader(rutaArchivo);
		BufferedReader bufferedReader = new BufferedReader(reader);

		String linea = bufferedReader.readLine();
		red = new Red(linea, Integer.parseInt(bufferedReader.readLine()));
		
		linea = bufferedReader.readLine();
		//CREA LAS CAPAS
		while (linea != null) {
			CapaOculta capa = red.obtenerCCapa().crearCapa();
			int numNeuronas = Integer.parseInt(linea);
			//CREA LAS NEURONAS
			for(int i=0;i<numNeuronas;i++) {
				double bias = Double.parseDouble(bufferedReader.readLine()); //BIAS
				linea=bufferedReader.readLine(); //NOMBRE FUNCION
				double[] pesosAnterior = convertirLineaAPesos(bufferedReader.readLine()); //PESOS CON CAPA ANTERIOR
				capa.crearNeurona(bias, FactoryFunciones.getInstance().crearFuncion(linea), pesosAnterior,null);
			}
			
			linea=bufferedReader.readLine();
		}
		bufferedReader.close();
		reader.close();

		return red;
	}
	private double[] convertirLineaAPesos (String linea)  {
		String[] textoNumeros = linea.split(",");
		double[] resultado = new double[textoNumeros.length];
		
		for(int i=0;i<textoNumeros.length;i++) resultado[i]=Double.parseDouble(textoNumeros[i]);
		
		return resultado;
	}
	
	public void update(Red red, String rutaArchivo) throws Exception {
		String ruta = rutaArchivo.substring(0,rutaArchivo.lastIndexOf("\\"));
		
		this.create(red, ruta);
	}
	
	public void delete(String rutaArchivo) throws Exception {
		File file = new File(rutaArchivo); 
	    if (!file.delete()) { 
	      throw new Exception("El archivo a borrar no se ha encontrado");
	    }
	}
}
