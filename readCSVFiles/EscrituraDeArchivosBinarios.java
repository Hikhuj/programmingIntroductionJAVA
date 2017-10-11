/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.*;

public class EscrituraDeArchivosBinarios {
	
	public static void main(String [] args) {

		//FileWriter:      for text files in your system's default encoding (for example, files containing Western European characters on a Western European computer). 
		// ^^^ for text files should usually be wrapped in a BufferedFileReader

		//FileInputStream: for binary files and text files that contain 'weird' characters.


		// Using FileWriter

		// Variable que contiene el archivo a utilizar
		String fileName = "/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/studentLastNamesBinaries.txt";


		try {

			// Poner unos bytes en un Buffer para que podamos escribir en ellos
			// Usualmente esto seria una imagen de datos u otra cosa. O podria
			// ser un texto en Unicode
			String bytes = "Hello theren";
			byte [] buffer = bytes.getBytes();
			

			FileOutputStream outputStream = new FileOutputStream(fileName);


			// write() escribe tantos bytes del Buffer como el largo del buffer.
			// tambien se puede usar
			// write(buffer, offset, length)
			// en el caso de que desee escribir un numero especifico de bytes,
			// o solo una parte de el buffer.
			outputStream.write(buffer);


			// ALERTA, al terminar de usar el archivo se debe siempre cerrar
			outputStream.close();


			System.out.println("Wrote " + buffer.length + " bytes");

		} catch(IOException ex) {

			// Capturar un error en el caso de que NO SE PUEDE LEER EL ARCHIVO
			System.out.println("Error writing on file '" + fileName + "'");

			// O bien se puede utilizar la opcion simple de que imprima el error y listo
			// ex.printStackTrace();

		}




	}

}