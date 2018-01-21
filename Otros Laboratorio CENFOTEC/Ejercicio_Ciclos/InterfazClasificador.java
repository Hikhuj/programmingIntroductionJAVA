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
	/Users/rogerjoseulaterivera/PersonalRepos/programmingIntroductionJAVA/Otros Laboratorio CENFOTEC/Ejercicio_Ciclos/produccionMaquinas2.csv

	Locacion en casa:
	/Users/rogerjoseulaterivera/Documents/PersonalRepos/programmingIntroductionJAVA/Otros Laboratorio CENFOTEC/Ejercicio_Ciclos/produccionMaquinas2.csv
	*/

	public void mostrarCantidadDeMaquinas() {

		int cantidadMaquinas = 0;
		backend.setCantidadMaquinas();
		cantidadMaquinas = backend.getCantidadMaquinas();
		JOptionPane.showMessageDialog(null, "Cantidad de maquinas: " + cantidadMaquinas);

	}

	public void generarProduccionSemanalMaquinas() {

		JOptionPane.showMessageDialog(null, "Generando produccion semanal de cada maquina, por favor espere...");
		backend.setProduccionSemanalCadaMaquina();

	}

	public void imprimirProduccionSemanalMaquinas() {

		int [] promedios = backend.getProduccionSemanalCadaMaquina();

		JOptionPane.showMessageDialog(null, "Imprimiendo promedios... Ver en consola.");

		for (int i = 0; i < promedios.length; i++) {
			System.out.println("Maquina: " + (i+1) + " ->" + promedios[i] + " botellas.");
		}

	}
	
	public void generarClasificacionMaquinasPorProduccion() {

		JOptionPane.showMessageDialog(null, "Clasificando promedio semanal de maquinas acorde a IPM, por favor espere...");
		backend.setClasificarCadaMaquina();

	}

	public void imprimirClasificacionMaquinasPorProduccion() {

		String [] clasificacion = null;

		clasificacion = backend.getClasificarCadaMaquina();

		JOptionPane.showMessageDialog(null, "Imprimiendo clasificacion de maquinas... Ver en consola.");

		for (int i = 0; i < clasificacion.length; i++) {
			int numeroMaquina = i + 1;

			System.out.println("Maquina " + numeroMaquina + ", clasificacion es --> " + clasificacion[i]);
		}

	}


	/*
		Aqui va la funcion de llamar a la maquina de mayor produccion
	*/


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