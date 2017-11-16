/* IMPORTS */
import java.io.*;

public class Backend {
	
	//METODOS
	private String rutaArchivoFuente;
	private String rutaArchivoBasePuentesHidrogeno;
	private String rutaArchivoPuentesHidrogenoInvertidos;
	private String archivoDeLetras;
	private int delayTime = 1000;

	public void setRutaArchivoFuente() {
		/*
			Obtiene la ruta de un archivo preexistente en la raiz del proyecto 
		*/
		File directorioActual = new File("");
		String resultado = directorioActual.getAbsolutePath() + "/resources/cadenasADN.txt";
		this.rutaArchivoFuente = resultado;
	}

	public void setRutaArchivoBasePuentesHidrogeno() {
		/*
			Obtiene la ruta de un archivo preexistente en la raiz del proyecto 
		*/
		File directorioActual = new File("");
		String resultado = directorioActual.getAbsolutePath() + "/resources/puentesHidrogeno.txt";
		this.rutaArchivoBasePuentesHidrogeno = resultado;
	}

	public void setRutaArchivoPuentesHidrogenoInvertidos() {
		/*
			Obtiene la ruta de un archivo preexistente en la raiz del proyecto 
		*/
		File directorioActual = new File("");
		String resultado = directorioActual.getAbsolutePath() + "/resources/puentesHidrogenoInvertidos.txt";
		this.rutaArchivoPuentesHidrogenoInvertidos = resultado;
	}

	public void almacenarLetrasEnVariables(String archivoALeer) {
		String linea = null;
		String resultado = " ";
		StringBuilder letras = new StringBuilder();
		
		try {
			FileReader leerArchivo = new FileReader(archivoALeer);
			BufferedReader datosBuffereados = new BufferedReader(leerArchivo);
			while((linea = datosBuffereados.readLine()) != null) {
				letras = letras.append(linea);
			}
			datosBuffereados.close();
		} catch(FileNotFoundException ex) {
			System.out.println("Unable to open file '" + archivoALeer + "'");
		} catch(IOException ex) {
			System.out.println("Error reading file '" + archivoALeer + "'");
		}

		resultado = letras.toString();

		this.archivoDeLetras = resultado.trim();
	}

	public void escribirEnArchivos() {
		String archivo = archivoDeLetras.toUpperCase();
		char letra;
		String complemento;

		for (int i = 0; i < archivo.length(); i++) {
			letra = archivo.charAt(i);
			complemento = obtenerComplemento(letra);
			escribirPuentesHidrogeno(letra, complemento);
			escribirPuentesHidrogenoInvertidos(letra, complemento);
		}
	}

	public void escribirPuentesHidrogeno(char letra, String complemento) {
		try {
			FileWriter fileWriter = new FileWriter(rutaArchivoBasePuentesHidrogeno, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("" + letra + "=" + complemento + "\n");
			bufferedWriter.close();
		} catch(IOException ex) {
			System.out.println("Error writing on file '" + rutaArchivoBasePuentesHidrogeno + "'");
		}
	}

	public void escribirPuentesHidrogenoInvertidos(char letra, String complemento) {
		try {
			FileWriter fileWriter = new FileWriter(rutaArchivoPuentesHidrogenoInvertidos, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("" + complemento + "=" + letra + "\n");
			bufferedWriter.close();
		} catch(IOException ex) {
			System.out.println("Error writing on file '" + rutaArchivoPuentesHidrogenoInvertidos + "'");
		}
	}

	public String obtenerComplemento(char letra) {
		String resultado = "";

		if (letra == 'A') {
			resultado = "T";
		} else if (letra == 'T') {
			resultado = "A";
		} else if (letra == 'C') {
			resultado = "G";
		} else {
			resultado = "C";
		}

		return resultado;
	}

	public void proceso() {
		System.out.println("1. Iniciando Sistema");
		System.out.println("2. Estableciendo ruta: Archivo fuente");
		delayTimer(delayTime);
		setRutaArchivoFuente();
		System.out.println("3. Estableciendo ruta: Archivo Puentes Hidrogeno");
		delayTimer(delayTime);
		setRutaArchivoBasePuentesHidrogeno();
		System.out.println("4. Estableciendo ruta: Archivo Puentes Hidrogeno Invertidos");
		delayTimer(delayTime);
		setRutaArchivoPuentesHidrogenoInvertidos();
		System.out.println("5. Almacenando letras en DB");
		delayTimer(delayTime);
		almacenarLetrasEnVariables(rutaArchivoFuente);
		System.out.println("6. Escribiendo en archivos");
		delayTimer(delayTime);
		escribirEnArchivos();
		System.out.println("7. Archivos listos");
		delayTimer(delayTime);
	}

	public void delayTimer(int delay) {
		try{
			Thread.sleep(delay);
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}