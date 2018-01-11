import javax.swing.*;
import java.io.*;

public class BackEnd {

	/* ATRIBUTOS */
	private String ubicacionDeCSV;
	private int [][] controlProduccionMaquinas;
	private int cantidadMaquinas;
	private int cantidadDiasTrabajo = 5;
	private int indicePM;
	private int indicePF;
	private String [] clasificacionDeCadaMaquina;
	private int [] produccionSemanalCadaMaquina;
	private int maquinaMayorProduccionCantidad;
	private String maquinaMayorProduccionNombre;
	private String clasificacionFabrica;


	/* METODOS */
	public void setUbicacionDeCSV(String direccionDeArchivo) {

		this.ubicacionDeCSV = direccionDeArchivo;

	}

	public String getUbicacionDeCSV() {

		return ubicacionDeCSV;

	}

	public void setCantidadMaquinas() {

		String direccionDeCSV = getUbicacionDeCSV();
		String line = null;
		int cantidadDeMaquinas = 0;
		BufferedReader datosBuffereados = null;

		try{
			datosBuffereados = new BufferedReader(new FileReader(direccionDeCSV));
			while((line = datosBuffereados.readLine()) != null) {
				cantidadDeMaquinas++;
			}
			datosBuffereados.close();
		}catch(FileNotFoundException ex) {
			System.out.println("Unable to open file.");
		}catch(IOException ex) {
			System.out.println("Error reading file.");
		}

		cantidadMaquinas = cantidadDeMaquinas;

	}

	public int getCantidadMaquinas() {

		return cantidadMaquinas;

	}

	public int getCantidadDiasTrabajables() {

		return cantidadDiasTrabajo;

	}

	public void setIndicePM(int numero) {

		this.indicePM = numero;

	}

	public int getIndicePM() {

		return indicePM;

	}

	public void setIndicePF(int numero) {

		this.indicePF = numero;

	}

	public int getIndicePF() {

		return indicePF;

	}

	public void setProduccionSemanalCadaMaquina() {
		
		/*
			Proceso de funcion:
			Obtener la direccion de CSV
			Leer una linea
			Pasarla a arreglo
			Sumar todos los valores
			Almacenar el resultado en un espacio de arreglo
			Repetir hasta leer todas las lineas
		*/

		// VARIABLES
		String rutaCSV = getUbicacionDeCSV();
		int [] resultado = new int[getCantidadMaquinas()];
		String [] produccion = new String[getCantidadDiasTrabajables()];
		BufferedReader datosBuffereados = null;
		String line = null;
		int numeroDeMaquina = 0;

		try{

			// Buferear datos
			datosBuffereados = new BufferedReader(new FileReader(rutaCSV));

			// Recorrer cada linea
			while((line = datosBuffereados.readLine()) != null) {

				produccion = line.split(",");
				String numeroString = "";
				int numero = 0;
				int promedio = 0;
				
				for (int i = 0; i < produccion.length; i++) {
					numero = Integer.parseInt(produccion[i]);
					promedio += numero;
				}

				resultado[numeroDeMaquina] = promedio;

				numeroDeMaquina++;

			}

		// Excepciones en la lectura
		}catch(FileNotFoundException ex) {
			System.out.println("Unable to open file.");
		}catch(IOException ex) {
			System.out.println("Error reading file.");
		}

		// Almacenar resultado en una variable
		this.produccionSemanalCadaMaquina = resultado;

	}

	public int [] getProduccionSemanalCadaMaquina() {

		return produccionSemanalCadaMaquina;

	}

	public void imprimirProduccionSemanalCadaMaquina() {

		int [] promedioDeMaquinas = getProduccionSemanalCadaMaquina();

		for (int i = 0; i < promedioDeMaquinas.length; i++) {
			System.out.println("Maquina " + i + " | Promedio: " + promedioDeMaquinas[i]);
		}

	}

	/* Clasificacion de la produccion de cada maquina, pero debo obtener la produccion semanal de cada maquina promediada primero
	public void setClasificarCadaMaquina() {
		
		// VARIABLES INICIALIZADAS
		String rutaCSV = getUbicacionDeCSV();
		String [] resultado = new String[getCantidadMaquinas()];
		String line = null;


		try{

			FileReader archivoEnVariable = new FileReader(rutaCSV);
			BufferedReader datosBuffereados = new BufferedReader(archivoEnVariable);
			while((line = datosBuffereados.readLine()) != null) {

				for (int i = 0; i < produccionSemanalCadaMaquina.length; i++) {
					if (produccionSemanalCadaMaquina[i] > indicePM) {
						resultado[i] = "Excelente";
					}else if(produccionSemanalCadaMaquina[i] == indicePM) {
						resultado[i] = "Buena";
					}else {
						resultado[i] = "Deficiente";
					}
				}

			}

		}catch(FileNotFoundException ex) {
			System.out.println("Unable to open file.");
		}catch(IOException ex) {
			System.out.println("Error reading file.");
		}

		this.clasificacionDeCadaMaquina = resultado;

	}
	*/

	public String[] getClasificarCadaMaquina() {

		return clasificacionDeCadaMaquina;

	}

	public void setMaquinaMayorProduccion() {

		int cantidadMayor = 0;
		String nombreMaquinaCantidadMayor = " ";

		for (int i = 0; i < produccionSemanalCadaMaquina.length; i++) {
			if (produccionSemanalCadaMaquina[i] > cantidadMayor) {
				cantidadMayor = produccionSemanalCadaMaquina[i];
				nombreMaquinaCantidadMayor = " " + produccionSemanalCadaMaquina[i];
			}
		}

		this.maquinaMayorProduccionCantidad = cantidadMayor;
		this.maquinaMayorProduccionNombre = nombreMaquinaCantidadMayor;

	}

	public int getMaquinaMayorProduccionCantidad() {

		return maquinaMayorProduccionCantidad;

	}

	public String getMaquinaMayorProduccionNombre() {

		return maquinaMayorProduccionNombre;

	}

	public void setControlProduccionMaquinas(int [][] produccionDeMaquinas) {

		this.controlProduccionMaquinas = produccionDeMaquinas;

	}

	public int [][] getControlProduccionMaquinas() {

		return controlProduccionMaquinas;

	}

}