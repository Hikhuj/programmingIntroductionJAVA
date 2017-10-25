/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 11/10/2017

*/

// Importing libraries
import java.io.File;
import javax.swing.JOptionPane;


public class FileManager {

	/* INSTANCES */
	File folder = null;
	Controls controlAplicacion = new Controls();


	/* ATTRIBUTES */
	private String folderPath;


	/* METODOS */
	public void setRequestFolderPath() {
		
		//	Obtain folder's name to later use
		this.folderPath = JOptionPane.showInputDialog("Installing database, please write where you want to install it:\n(e.g.:/path/path/folderName):");
	
	}


	public String getRequestFolderPath() {

		// Returns student database path
		return folderPath;

	}


	public void setFolderPath(String folderPath) {
		
		/*
			Gets the path from the user, if exist, will not write
		*/

		// Attributes
		boolean canExecuteCommand;
		// Create Object to stock the Directory Path
		folder = new File(folderPath);

		canExecuteCommand = folder.exists();

		if (canExecuteCommand == false) {
			// Order the method to create the directory and folder
			folder.mkdir();
		} else {
			controlAplicacion.messageCanNotCreateFolder();
		}

	}

	Crear un mini encrriptador con el metodo de String .replace(letra vieja, letra nueva)










}