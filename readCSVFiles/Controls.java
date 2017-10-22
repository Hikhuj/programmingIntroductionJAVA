/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 11/10/2017

*/


// Importing libraries
import javax.swing.JOptionPane;


public class Controls {

	public void initialGreetings() {

		System.out.println("* --------------------------------------- *");
		System.out.println("|                                         |");
		System.out.println("|           Inicializando Sistema         |");
		System.out.println("|                                         |");
		System.out.println("|              Cargando Datos             |");
		System.out.println("|                                         |");
		System.out.println("* --------------------------------------- *");
		JOptionPane.showMessageDialog(null, "Initializing system\tLoading data", "Loading...", JOptionPane.INFORMATION_MESSAGE);
	
	}


	public void messageCanNotCreateFolder() {

		JOptionPane.showMessageDialog(null, "Unable to create folder or already exist", "Can not create folder",JOptionPane.ERROR_MESSAGE);
	
	}
	

	public int tryCatchFilter(String valorString) {

		int resultado = 0;

		try{

			resultado = Integer.parseInt(valorString);

		}catch(NumberFormatException e) {

			mensajeDeErrorEntero();

		}

		return resultado;

	}


	public void mensajeDeErrorEntero() {

		System.out.println("Error: no es entero");
		System.out.println(" ");
		System.out.println(" * ------------------ Terminando Sistema -------------- *");
		System.out.println(" * ");
		System.out.println(" * ---------------------- Terminado ------------------- *");
		System.out.println(" ");
		System.exit(1);

	}


	private void salirJuego() {	

		System.exit(1);

	}

}