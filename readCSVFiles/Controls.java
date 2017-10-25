/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 11/10/2017

*/


// Importing libraries
import javax.swing.JOptionPane;


public class Controls {

	/* ATTRIBUTES */
	private String opcionMenuString;
	private int opcionMenu;


	public void initialGreetings() {

		System.out.println("* --------------------------------------- *");
		System.out.println("|                                         |");
		System.out.println("|           Inicializando Sistema         |");
		System.out.println("|                                         |");
		System.out.println("|              Cargando Datos             |");
		System.out.println("|                                         |");
		System.out.println("* --------------------------------------- *");
		JOptionPane.showMessageDialog(null, "Initializing system\nLoading data", "Loading...", JOptionPane.INFORMATION_MESSAGE);
	
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


	private void systemExit() {	

		System.exit(1);

	}


	public void getMenu() {

	optionMenuString = JOptionPane.showInputDialog(null, "You will do:\n1. Create student\n2. adadadada\n3. Exit\n(Please enter an obtion from 1 to 3)");

	try {

		// Convertir el valor de opcionMenu
		optionMenu = Integer.parseInt(optionMenuString);

		if(optionMenu >= 1 && optionMenu <= 3) {
			setOpcionMenu(optionMenu);
		}else{
			JOptionPane.showMessageDialog(null, "Please choose a valid option", "Option not exist", JOptionPane.ERROR_MESSAGE);
			getMenu();
		}

	}catch(NumberFormatException e){

		JOptionPane.showMessageDialog(null, "Option is not a number, please try again", "Not a number", JOptionPane.ERROR_MESSAGE);
		System.out.println("User did not type valid option type");
		
		//systemExit();
		getMenu();

	}


	private void setOptionMenu(int optionMenu) {

		switch (optionMenu) {

			case 1:
				nuevoJuego();
				break;
			case 2:
				// Cambiar nombre de objeto y establecer estadisticas en 0
				cambiarJugadorUno();
				// Retornar al menu para continuar App
				getMenu();
				break;
			case 3:
				// Cambiar nombre de objeto y establecer estadisticas en 0
				cambiarJugadorDos();
				// Retornar al menu para continuar App
				getMenu();
				break;
			case 4:
				salirJuego();
				break;

		}

	}










}