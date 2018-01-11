/* IMPORTS */
import javax.swing.*;
// import java.io.FileReader;
// import java.io.IOException;

public class InterfazClasificador {

	/* INSTANCIAS */
	BackEnd backend = new BackEnd();

	/* METODOS */

	public void cargarRegistroDeMaquinasPorCSV() {

		String urlDeCSV;
		
		urlDeCSV = JOptionPane.showInputDialog(null, "Ingrese la ruta de archivo CSV: ");
		backend.setUbicacionDeCSV(urlDeCSV);

	}

	public void setIndiceProduccionM() {

		String indiceString = " ";
		int indice = 0;

		indiceString = JOptionPane.showInputDialog(null, "Digite Indice PM");
		indice = obtenerResultadoTryCatch(indiceString);
		backend.setIndicePM(indice);

	}

	public void setIndiceProduccionF() {

		String indiceString = " ";
		int indice = 0;

		indiceString = JOptionPane.showInputDialog(null, "Digite Indice PF");
		indice = obtenerResultadoTryCatch(indiceString);
		backend.setIndicePF(indice);

	}

	/*
	/Users/rogerjoseulaterivera/Documents/PersonalRepos/programmingIntroductionJAVA/Otros Laboratorio CENFOTEC/Ejercicio_Ciclos/produccionMaquinas.csv
	*/

	public void generarCantidadDeMaquinas() {

		int cantidadMaquinas = 0;
		backend.setCantidadMaquinas();
		cantidadMaquinas = backend.getCantidadMaquinas();
		JOptionPane.showMessageDialog(null, "Cantidad de maquinas: " + cantidadMaquinas);

	}

	public void generarClasificacionDeCadaMaquina() {

		JOptionPane.showMessageDialog(null, "Clasificando maquinas, por favor espere...");
		backend.setProduccionSemanalCadaMaquina();

	}

	// Otros
	public int obtenerResultadoTryCatch(String valorString) {

		int resultado = 0;

		try{
			resultado = Integer.parseInt(valorString);
		}catch(NumberFormatException e) {
			mensajeDeErrorEntero();
		}

		return resultado;

	}

	public void mensajeDeErrorEntero() {

		System.out.println("Error: no es entero");
		System.out.println(" ");
		System.out.println(" * ------------------ Terminando Sistema -------------- *");
		System.out.println(" * ");
		System.out.println(" * ---------------------- Terminado ------------------- *");
		System.out.println(" ");
		System.exit(1);

	}

}