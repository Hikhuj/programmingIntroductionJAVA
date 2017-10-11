/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.*;

public class LecturaDeArchivosBinarios {
	
	public static void main(String [] args) {

		//FileReader:      for text files in your system's default encoding (for example, files containing Western European characters on a Western European computer). 
		// ^^^ for text files should usually be wrapped in a BufferedFileReader

		//FileInputStream: for binary files and text files that contain 'weird' characters.


		// Using FileReader

		// Variable que contiene el archivo a utilizar
		String fileName = "/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentNames.txt";

		try {

			// Usar esto para leer datos
			byte[] buffer = new byte[1000];


			// Crear objeto para utilizar la informacion del archivo
			FileInputStream inputStream = new FileInputStream(fileName);


			// Read llena el buffer con datos y retorna el numero de bytes leidos (el cual
			// por supuesto pueden ser menos que el tamano del buffer, pero nunca sera mas).
			int total = 0;
			int nRead = 0;


			while((nRead = inputStream.read(buffer)) != -1) {

				System.out.println(new String(buffer));
				total += nRead;

			}


			// Recordar siempre cerrar el archivo
			inputStream.close();


			// Se imprime la cantidad de bytes del archivo
			System.out.println("*--------------------------*");
			System.out.println("|Read " + total + " bytes  |");
			System.out.println("*--------------------------*");


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