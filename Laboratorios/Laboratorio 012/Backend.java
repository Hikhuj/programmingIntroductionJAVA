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

	public void escribir() {

		String archivo = archivoDeLetras;
		try {
			FileWriter fileWriter = new FileWriter(rutaArchivoBasePuentesHidrogeno, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(tiempoImpreso);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch(IOException ex) {
			System.out.println("Error writing on file '" + rutaDeEscritura + "'");
		}

	}

	public void proceso() {
		setRutaArchivoFuente();
		setRutaArchivoBasePuentesHidrogeno();
		setRutaArchivoPuentesHidrogenoInvertidos();
		leerYAlmacenarLetras(rutaArchivoFuente);

	}




}