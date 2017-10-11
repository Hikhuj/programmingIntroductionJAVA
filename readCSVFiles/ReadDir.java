/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/10/2017

*/

// Importing libraries
import java.io.File;


/*

	CURRENTLY NOT WORKING

*/


public class ReadDir {

	public static void main(String[] args) {

		File file = null;
		String [] paths;

		try {

			// Create new file object
			file = new File("/tmp");


			// Array of files and directory
			paths = file.list();


			// for each name in the path array
			for(String path:paths) {

				// Prints filename and directory name
				System.out.println(path);

			}

		} catch(Exception e) {

			// If any error occurs
			e.printStackTrace();

		}

	}

}