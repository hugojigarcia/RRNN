import IA.RRNN.CRed;
import IA.RRNN.CapaOculta;
import IA.RRNN.Red;
import IA.RRNN.PFuncion.FuncionEscalon;
import IA.RRNN.PFuncion.FuncionLineal;
import IA.RRNN.PFuncion.FuncionReLU;
import IA.RRNN.PFuncion.FuncionSigmoidal;
import IA.RRNN.PFuncion.FuncionTangenteHiperbolica;
import IA.RRNN.PPersistencia.IPersistenciaRed;
import IA.RRNN.PPersistencia.PersistenciaRed;

public class PruebasSalida {
	public static void main(String[] args) throws Exception {
		CRed cRed = CRed.getInstance();
		Red red = cRed.crearRed("PrácticaIA",2);
		
		CapaOculta capa1 = red.obtenerCCapa().crearCapa();
		capa1.crearNeurona(1, new FuncionSigmoidal(), new double[] {-1, 0}, null);
		capa1.crearNeurona(1, new FuncionSigmoidal(), new double[] {2, 4}, null);
		
		CapaOculta capa2 = red.obtenerCCapa().crearCapa();
		capa2.crearNeurona(1, new FuncionSigmoidal(), new double[] {2.5, -3.5}, null);
		
		double[] salidas = red.getSalida(new double[] {0.2, 0.7});
		for(double salida: salidas) {
			System.out.print(salida+ ", ");
		}
		
		
		
		
		
//		IPersistenciaRed persistencia = PersistenciaRed.getInstance();
//		persistencia.create(red, "C:\\Users\\hugoj\\Desktop\\REDES");
//		persistencia.update(
//				persistencia.read("C:\\Users\\hugoj\\Desktop\\REDES\\HolaMundo!.rn"),"C:\\Users\\hugoj\\Desktop\\REDES");
//		//persistencia.delete("C:\\Users\\hugoj\\Desktop\\REDES\\TripleOR.rn");

	}

}
