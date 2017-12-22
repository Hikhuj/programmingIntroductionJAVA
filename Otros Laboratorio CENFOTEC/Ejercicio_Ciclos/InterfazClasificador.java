/* IMPORTS */
import javax.swing.*;
// import java.io.FileReader;
// import java.io.IOException;

public class InterfazClasificador {

	/* INSTANCIAS */
	BackEnd backend = new BackEnd();

	/* METODOS */
	public void cantidadDeMaquinas() {

		String cantidadMaquinasString = " ";
		int cantidadMaquinas = 0;
		
		cantidadMaquinasString = JOptionPane.showInputDialog(null, "Digite cantidad de maquinas: ");
		cantidadMaquinas = obtenerResultadoTryCatch(cantidadMaquinasString);
		backend.setCantidadMaquinas(cantidadMaquinas);

	}

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

	public void setIndiceProduccionM() {

		String indiceString = " ";
		int indice = 0;

		cantidadString = JOptionPane.showInputDialog(null, "Digite Indice PM");
		indice = obtenerResultadoTryCatch(cantidadString);
		backend.setIndicePM(indice);

	}

	public void setIndiceProduccionF() {

		String indiceString = " ";
		int indice = 0;

		cantidadString = JOptionPane.showInputDialog(null, "Digite Indice PF");
		indice = obtenerResultadoTryCatch(cantidadString);
		backend.setIndicePF(indice);

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