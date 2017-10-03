/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/29/2017

*/

import javax.swing.JOptionPane;

public class LabSieteBackend {

	// Atributos
	private int [] arreglo = {12,45,65,23,76,12};



	/***************** METODOS *****************/

	public int calcularFactorial(int n) {

		int resultado;

		if (n == 0) {
			
			resultado = 0;

		} else {

			resultado = calcularFactorial(n) * calcularFactorial(n - 1);

		}

		return resultado;

	}


	// Ejercicio #3
	private void imprimirArreglo(int [] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			
			System.out.println(arreglo[i]);

		}

	}


	// Para MENU
	public void controlImprimirArreglo() {

		JOptionPane.showMessageDialog(null, "Imprimir arreglo");

		imprimirArreglo(this.arreglo);

		JOptionPane.showMessageDialog(null, "Revisar terminal para resultado");

	}


	/*
	public void getMenu() {

		// Variables
		String opcionMenuString;
		int opcionMenu;

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Productoria\n2. Tirar dados y obtener suma total de numeros obtenidos\n3. Calcular serie Harmonica\n4. Salir del juego");

		try {

			// Convertir el valor de opcionMenu
			opcionMenu = Integer.parseInt(opcionMenuString);

			if(opcionMenu >= 1 && opcionMenu <= 4) {

				setOpcionMenu(opcionMenu);

			}else{

				JOptionPane.showMessageDialog(null, "Opcion de menu fuera de rango, seleccione de nuevo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
				getMenu();

			}

		}catch(NumberFormatException e){

			JOptionPane.showMessageDialog(null, "El valor que ingreso no es un numero, por favor intente de nuevo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
			System.out.println(" Error al convertir a Entero: Valor ingresado no es numero");
			
			// Si se comenta la siguiente linea y se descomenta getMenu() generara problemas, ya que el usuario si hace click en CANCEL, no podra salir nunca a menos que agrege el valor necesario para salirDeSistema.
			System.exit(1);
			
			// Puede descomentarse la siguiente funcion para hacer que si se equivoca vuelve a llamar al menu, pero debido a esto, si el usuario hace click en CANCEL, nunca saldra a menos que ingrese el valor necesario para salirDelSistema.
			//getMenu();

		}

	}


	public void setOpcionMenu(int opcionMenu) {

		switch (opcionMenu) {

			case 1:
				controlProductoria();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			case 2:
				controlDadosTotalTirados();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			case 3:
				controlSerieHarmonica();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			case 4:
				salirJuego();
				
				break;

		}

	}
	*/
	

	/*********************************************/
	/*                 ADICIONALES               */
	/*********************************************/

   	public int obtenerResultadoTryCatch(String valorString) {

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


