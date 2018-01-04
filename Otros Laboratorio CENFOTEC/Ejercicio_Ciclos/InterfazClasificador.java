/* IMPORTS */
import javax.swing.*;
// import java.io.FileReader;
// import java.io.IOException;

public class InterfazClasificador {

	/* INSTANCIAS */
	BackEnd backend = new BackEnd();

	/* METODOS */
	/*
	public void cantidadDeMaquinas() {

		String cantidadMaquinasString = " ";
		int cantidadMaquinas = 0;
		
		cantidadMaquinasString = JOptionPane.showInputDialog(null, "Digite cantidad de maquinas: ");
		cantidadMaquinas = obtenerResultadoTryCatch(cantidadMaquinasString);
		backend.setCantidadMaquinas(cantidadMaquinas);

	}
	*/

	/*
	public void setProduccionDiariaCadaMaquina() {

		String cantidadString = " ";
		int cantidad = 0;
		int [][] produccionDeMaquinas = new int[backend.getCantidadMaquinas()][backend.getCantidadDiasTrabajables()];
		
		for (int i = 0; i < produccionDeMaquinas.length; i++) {
			for (int j = 0; j < produccionDeMaquinas[i].length; j++) {
				cantidadString = JOptionPane.showInputDialog(null, "Produccion maquina #" + (i + 1) + " | dia: " + (j + 1));
				cantidad = obtenerResultadoTryCatch(cantidadString);
				produccionDeMaquinas[i][j] = cantidad;
			}
		}

	}
	*/

	public void cargarRegistroDeMaquinasporCSV() {

		String urlDeCSV = " ";
		
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
	public void promedioDeCadaMaquinaDesdeCSV() {
		// String direccionDeArchivo = JOptionPane.showInputDialog(null, "Ingrese URL de archivo CSV:");
		String direccionDeArchivo = "/Users/rogerjoseulaterivera/Documents/PersonalRepos/programmingIntroductionJAVA/Otros Laboratorio CENFOTEC/Ejercicio_Ciclos/produccionMaquinas.csv"
		String line = null;
		int [] produccion;
		int largoArreglo = backend.getCantidadMaquinas();
		int anchoArreglo = backend.getCantidadDiasTrabajables();
		int [][] produccionDeMaquinas = new int [][];

		/Users/rogerjoseulaterivera/Documents/PersonalRepos/programmingIntroductionJAVA/Otros Laboratorio CENFOTEC/Ejercicio_Ciclos/produccionMaquinas.csv

		try{
			FileReader archivoEnVariable = new FileReader(direccionDeArchivo);
			BufferedReader datosBuffereados = new BufferedReader(archivoEnVariable);
			while((line = datosBuffereados.readLine()) != null) {
				// System.out.println(line);
				produccion = line.split(",");
			}
			datosBuffereados.close();
		}catch(FileNotFoundException ex) {
			System.out.println("Unable to open file.");
		}catch(IOException ex) {
			System.out.println("Error reading file.");
		}
	}
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