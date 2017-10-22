/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/


// Importing libraries
import javax.swing.JOptionPane;


public class App {

	public static void main(String[] args) {

		Student student = new Student();
		Controls controls = new Controls();
		FileManager fileManager = new FileManager();

		String valor;
		boolean valor2;

		controls.initialGreetings();

		fileManager.setRequestFolderPath();

		valor = fileManager.getRequestFolderPath();

		fileManager.setFolderPath(valor);

		fileManager.setFolderPath(valor);

	}

}