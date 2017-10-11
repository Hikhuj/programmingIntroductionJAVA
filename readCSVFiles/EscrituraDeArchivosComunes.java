/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.*;

public class EscrituraDeArchivosComunes {
	
	public static void main(String [] args) {

		//FileWriter:      for text files in your system's default encoding (for example, files containing Western European characters on a Western European computer). 
		// ^^^ for text files should usually be wrapped in a BufferedFileReader

		//FileInputStream: for binary files and text files that contain 'weird' characters.


		// Using FileWriter

		// Variable que contiene el archivo a utilizar
		String fileName = "/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentLastNames.txt";


		try {

			// FileWriter assume default encoding
			// Se crea un objeto de tipo fileWriter para recibir y almacenar temporalmente el archivo a escribir
			FileWriter fileWriter = new FileWriter(fileName);


			// Always wrap FileReader in BufferedReader
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


			// Se debe notar que write() no anexa automaticamente el caracter
			// de NuevaLinea
			bufferedWriter.write("Hello there,");
			bufferedWriter.write(" here is some text.");
			bufferedWriter.newLine();
			bufferedWriter.write("We are writing");
			bufferedWriter.write(" the text to the file.");


			// ALERTA, al terminar de usar el archivo
			bufferedWriter.close();

		} catch(IOException ex) {

			// Capturar un error en el caso de que NO SE PUEDE LEER EL ARCHIVO
			System.out.println("Error writing on file '" + fileName + "'");

			// O bien se puede utilizar la opcion simple de que imprima el error y listo
			// ex.printStackTrace();

		}




	}

}