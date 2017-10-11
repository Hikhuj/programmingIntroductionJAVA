/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.File;

public class CreateDir {

	public static void main(String args[]){

		// Getting file directory as constant or by user input
		String directoryFolderName = "/Users/rogerjoseulaterivera/PersonalRepos/readCSVFiles/TAKETHIS";


		// Create Object to stock the Directory Path
		File createDirectory = new File(directoryFolderName);


		// Order the method to create the directory and folder
		createDirectory.mkdirs();

	}

}