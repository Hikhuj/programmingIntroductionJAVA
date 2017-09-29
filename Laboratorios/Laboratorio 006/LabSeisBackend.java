/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/28/2017

*/

import javax.swing.JOptionPane;

public class LabSeisBackend {


	/*********************************************/
	/*                   METODOS                 */
	/*********************************************/

	// Ejercicio #1
	public int sumatorio(int x, int n) {

		int resultado = x;
		int aumento = x + 1;

		for (int i = aumento; i <= n; i++) {
			
			resultado += i;

		}

		return resultado;

	}

	
	public boolean calcularNumeroPrimo(int limite){

		/*
		Numero ES PRIMO o NO:

		Descripcion: Divisible entre SI y 1.
		Aqui se obtiene el RESIDUO y el COCIENTE, me permite corroborar dos verdades, 
		
		* (para ser # PRIMO el RESIDUO debe ser != 0 && COCIENTE > DIVISOR).

		Pruebas: 
		Numeros Primos: 2, 3, 5, 7, 11, 223*
		Numeros NO Primos: 

		*/

		// Variables del metodo.
		int i = 2;
		boolean resultado = true;
		
		
		if(limite != 1) {

			// Recorre de i hasta el limite (hasta VALOR inclusivo).
			while(i <= limite){

				int residuo = limite % i;
				int cociente = limite / i;

				if(residuo == 0) {

					if(cociente <= i){

						//resultado = "No es primo";
						resultado = false;

					}

				}

				// Evaluar siguiente divisor al Incrementar el contador.
				i++;

			}

		}else{

			// Si el # recibido en VALOR == 1, siempre sera PRIMO.
			resultado = true;

		}

		// Retornar resultado de la funcion
		return resultado;

	}
	

	// Ejercicio #3
	public void imprimirArreglo(int [] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			
			System.out.println(arreglo[i]);

		}

	}

	// Ejercicio #4
	public int sumaDeArreglo(int [] arreglo) {

		int resultado = 0;

		for (int i = 0; i < arreglo.length; i++) {
			
			resultado += arreglo[i];

		}

		return resultado;

	}


	/*
	public void getMenu() {

		// Variables
		String opcionMenuString;
		int opcionMenu;

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Sumatoria\n2. Imprimir numeros primos\n3. Calcular serie Harmonica\n4. Salir del juego");

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

	/*
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


