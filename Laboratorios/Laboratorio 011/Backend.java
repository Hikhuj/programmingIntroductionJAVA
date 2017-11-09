import java.io.*;

public class Backend {
	
	private String [] tiempo;
	private int minutos;
	private int segundos;
	private String rutaDeArchivoDeTiempo;


	public String [] establecerTiempoCronometro(String tiempo) {
		String [] resultado = tiempo.split(":", 2);
		return resultado;
	}

	public void setMinutos(String [] tiempo) {
		String obtenerMinutos;
		obtenerMinutos = tiempo[0];
		this.minutos = Integer.parseInt(obtenerMinutos);
	}

	public void setSegundos(String [] tiempo) {
		String obtenerSegundos;
		obtenerSegundos = tiempo[1];
		this.segundos = Integer.parseInt(obtenerSegundos);
	}

	public String leerTiempoDeArchivo() {
		// Obtener la ruta completa del archivo donde se vaya a mover para poder leerlo de forma dinamica,
		// por lo que si cambia el proyecto a otro lado, se puedan leer los archivos
		File directorioActual = new File("");
		String archivoALeer = directorioActual.getAbsolutePath() + "/tiempoDeDetonador/Tiempo.txt";
		// Descomentar la siguiente linea, modificarla y comentar las dos lineas anteriores para usar path directo
		// String archivoALeer = "/Users/rogerjoseulaterivera/PersonalRepos/programmingIntroductionJAVA/Laboratorios/Laboratorio 011/tiempoDeDetonador/Tiempo.txt";
		String linea = null;
		String tiempoObtenido = " ";
		// String archivoALeer = getObtenerRutaDeTiempo();

		try {
			FileReader leerArchivo = new FileReader(archivoALeer);
			BufferedReader datosBuffereados = new BufferedReader(leerArchivo);
			while((linea = datosBuffereados.readLine()) != null) {
				tiempoObtenido = linea;
			}
			datosBuffereados.close();
		} catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + archivoALeer + "'");
		} catch(IOException ex) {
			System.out.println("Error reading file '" + archivoALeer + "'");
		}

		tiempoObtenido = tiempoObtenido.trim();

		return tiempoObtenido;
	}

	public void iniciarSistema() {
		String [] tiempoObtenido = establecerTiempoCronometro(leerTiempoDeArchivo());
		this.tiempo = tiempoObtenido;
		setMinutos(this.tiempo);
		setSegundos(this.tiempo);
		cronometro();
	}

	/*
	En el caso que quiera usar un tiempo diferente al tradicional,
	en donde puedo obtener mas de 3 digitos o bien mas de 60 segundos
	public void cronometro() {
		int delayTime = 1000;
		// Obtener atributos de tiempo por copia para poder estarlos modificando
		// en la operacion
		int min = this.minutos;
		int seg = this.segundos;
		String tiempoImpreso = " ";

		// Conteo para ir restando a minutos
		while(min >= 0){
			// Conteo para ir restando a segundos
			while(seg >= 0){
				// Imprimir tiempo
				tiempoImpreso = "Tiempo restante: " + min + ":" + seg + ".";
				System.out.println(tiempoImpreso);
				// System.out.println("Tiempo restante: " + min + ":" + seg + ".");
				guardarTiempo(tiempoImpreso);
				// reducir los segundos en n-1
				seg = seg - 1;
				// retraso para similar un reloj
				delayTimer(delayTime);
			}
			// una vez que una ronda de N segundos se completa llegando a 0
			// se resetea los segundos de nuevo a N para poder hacer una nueva ronda de M minutos
			seg = this.segundos;
			// reducir minutos en m-1
			min = min - 1;
		}
	}
	*/

	public void cronometro() {
		// Lista de variables
		int delayTime = 1000;
		// Obtener atributos de tiempo por copia para poder estarlos modificando
		// en la operacion
		int min = this.minutos;
		int seg = this.segundos;
		String tiempoImpreso = " ";

		if ( (min >= 0 && min <= 60) && (seg >= 0 && seg <= 59) ) {
			// Conteo para ir restando a minutos
			while(min >= 0){
				// Conteo para ir restando a segundos
				while(seg >= 0){
					// Imprimir tiempo
					tiempoImpreso = "Tiempo restante: " + min + ":" + seg + ".";
					System.out.println(tiempoImpreso);
					guardarTiempo(tiempoImpreso);
					// reducir los segundos en n-1
					seg = seg - 1;
					// retraso para similar un reloj
					delayTimer(delayTime);
				}
				// una vez que una ronda de N segundos se completa llegando a 0
				// se resetea los segundos de nuevo a N para poder hacer una nueva ronda de M minutos
				seg = 59;
				// reducir minutos en m-1
				min = min - 1;
			}
		}else{
			// Si los minutos y/o segundos no cumple el estandar, desplegar siguiente mensaje
			System.out.println("Los minutos y/o los segundos no estan dentro del estandar");
		}
	}

	// Contador de tiempo (reutilizable)
	public void delayTimer(int delay) {
		try{
			Thread.sleep(delay);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public void guardarTiempo(String tiempoImpreso) {
		// Obtener la ruta completa del archivo donde se vaya a mover para poder leerlo de forma dinamica,
		// por lo que si cambia el proyecto a otro lado, se puedan leer los archivos
		File directorioActual = new File("");
		String rutaDeEscritura = directorioActual.getAbsolutePath() + "/log/RegistroDeTiempo.txt";
		// Descomentar la siguiente linea, modificarla y comentar las dos lineas anteriores para usar path directo
		// String rutaDeEscritura = "/Users/rogerjoseulaterivera/PersonalRepos/programmingIntroductionJAVA/Laboratorios/Laboratorio 011/log/RegistroDeTiempo.txt";

		try {
			FileWriter fileWriter = new FileWriter(rutaDeEscritura, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(tiempoImpreso);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch(IOException ex) {
			System.out.println("Error writing on file '" + rutaDeEscritura + "'");
		}
	}
}