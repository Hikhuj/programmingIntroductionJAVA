/* IMPORTS */
import java.io.*;

public class Backend {
	
	//METODOS
	private String rutaArchivoFuente;
	private String rutaArchivoBasePuentesHidrogeno;
	private String rutaArchivoPuentesHidrogenoInvertidos;
	private String archivoDeLetras;

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
		String resultado = directorioActual.getAbsolutePath() + "/resources/02_basePuentesHidrogeno.txt";
		this.rutaArchivoBasePuentesHidrogeno = resultado;
	}

	public void setRutaArchivoPuentesHidrogenoInvertidos() {
		/*
			Obtiene la ruta de un archivo preexistente en la raiz del proyecto 
		*/
		File directorioActual = new File("");
		String resultado = directorioActual.getAbsolutePath() + "/resources/03_puentesHidrogenoInvertidos.txt";
		this.rutaArchivoPuentesHidrogenoInvertidos = resultado;
	}

	public void leerYAlmacenarLetras(String archivoALeer) {
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

	/*
	public void escribirPuentesHidrogeno() {
		String archivo = archivoDeLetras.toUpperCase();
		char letra;
		String complemento;

		try {
			FileWriter fileWriter = new FileWriter(rutaArchivoBasePuentesHidrogeno, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i < archivo.length(); i++) {
				letra = archivo.charAt(i);
				complemento = obtenerComplemento(letra);
				bufferedWriter.write("" + letra + "=" + complemento + "\n");
				escribirPuentesHidrogenoInvertidos(letra, complemento);
			}
			bufferedWriter.close();
		} catch(IOException ex) {
			System.out.println("Error writing on file '" + rutaArchivoBasePuentesHidrogeno + "'");
		}
	}
	*/
	
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
		setRutaArchivoFuente();
		setRutaArchivoBasePuentesHidrogeno();
		setRutaArchivoPuentesHidrogenoInvertidos();
		leerYAlmacenarLetras(rutaArchivoFuente);
		System.out.println(archivoDeLetras.length());
		escribirEnArchivos();
		// escribirPuentesHidrogeno();

	}




}