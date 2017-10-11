/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.*;

public class LecturaDeArchivosComunes {
	
	public static void main(String [] args) {

		//FileReader:      for text files in your system's default encoding (for example, files containing Western European characters on a Western European computer). 
		// ^^^ for text files should usually be wrapped in a BufferedFileReader

		//FileInputStream: for binary files and text files that contain 'weird' characters.


		// Using FileReader

		// Variable que contiene el archivo a utilizar
		String fileName = "/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentNames.txt";

		// Hace referencia a una linea a la vez (se usara para el proceso)
		String line = null;

		try {

			// FileReader reads text files in the default encoding
			// Se crea un objeto de tipo FileReader
			FileReader fileReader = new FileReader(fileName);


			// Always wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);


			while((line = bufferedReader.readLine()) != null) {

				System.out.println(line);

			}


			// ALERTA, al terminar de usar el archivo
			bufferedReader.close();

		} catch(FileNotFoundException ex) {

			// Capturar un error en el caso de que NO SE ENCUENTRA EL ARCHIVO
			System.out.println("Unable to open file '" + fileName + "'");

		} catch(IOException ex) {

			// Capturar un error en el caso de que NO SE PUEDE LEER EL ARCHIVO
			System.out.println("Error reading file '" + fileName + "'");

			// O bien se puede utilizar la opcion simple de que imprima el error y listo
			// ex.printStackTrace();

		}




	}

}