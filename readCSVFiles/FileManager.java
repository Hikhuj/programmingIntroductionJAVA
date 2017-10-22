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
		this.folderPath = JOptionPane.showInputDialog("Please add the path to save the student database:");
	
	}

	public String getRequestFolderPath() {

		// Returns student database path
		return folderPath;

	}

	public void setFolderPath(String folderPath) {
		
		/*
			Gets the path from the user, evaluates if exists the path
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







}