import IA.RRNN.CRed;
import IA.RRNN.PFuncion.FuncionEscalon;
import IA.RRNN.PFuncion.FuncionLineal;
import IA.RRNN.PFuncion.FuncionReLU;
import IA.RRNN.PFuncion.FuncionSigmoidal;
import IA.RRNN.PFuncion.FuncionTangenteHiperbolica;
import IA.RRNN.PPersistencia.IPersistenciaRed;
import IA.RRNN.PPersistencia.PersistenciaRed;
import IA.RRNN.*;

//  @ Project : RRNN
//  @ File Name : SystemRed.java
//  @ Author : alonsete7,Hugo0133



public class SystemRed {
	public static void main(String[] args) throws Exception {
		CRed cRed = CRed.getInstance();
		Red red = cRed.crearRed("HolaMundo!",2);
		
		CapaOculta capa1 = red.obtenerCCapa().crearCapa();
		capa1.crearNeurona(1, new FuncionEscalon(), new double[] {1.1,1.2}, null);
		capa1.crearNeurona(2, new FuncionSigmoidal(), new double[] {2.1,2.2}, null);
		//capa1.crearNeurona(3, new FuncionReLU(), new double[] {3.1,3.2}, null);
		
		CapaOculta capa2 = red.obtenerCCapa().crearCapa();
		capa2.crearNeurona(4, new FuncionLineal(), new double[] {-4.1,-4.2}, null);
		
		capa1.crearNeurona(3, new FuncionReLU(), new double[] {3.1,3.2}, new double[] {-4.3});
		capa2.crearNeurona(5, new FuncionTangenteHiperbolica(), new double[] {-5.1,-5.2,-5.3}, null);
		
		IPersistenciaRed persistencia = PersistenciaRed.getInstance();
		persistencia.create(red, "C:\\Users\\hugoj\\Desktop\\REDES");
		persistencia.update(
				persistencia.read("C:\\Users\\hugoj\\Desktop\\REDES\\HolaMundo!.rn"),"C:\\Users\\hugoj\\Desktop\\REDES");
		//persistencia.delete("C:\\Users\\hugoj\\Desktop\\REDES\\TripleOR.rn");

	}
}
