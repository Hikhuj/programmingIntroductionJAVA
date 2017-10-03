/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/28/2017

*/

import javax.swing.JOptionPane;

public class LabSeisBackend {

	// Atributos
	private int [] arreglo = {12,45,65,23,76,12};

	/*********************************************/
	/*                   METODOS                 */
	/*********************************************/

	// Ejercicio #1
	private int sumatoria(int x, int n) {

		int resultado = x;
		int aumento = x + 1;

		for (int i = aumento; i <= n; i++) {
			
			resultado += i;

		}

		return resultado;

	}


	// Para MENU
	public void controlSumatoria() {

		int numeroUno;
		int numeroDos;
		String valor;
		String valorDos;
		int resultado = 0;

		JOptionPane.showMessageDialog(null, "Calcular sumatoria en i desde x hasta n");

		valor = JOptionPane.showInputDialog("Numero entero desde comenzare a contar");
		numeroUno = obtenerResultadoTryCatch(valor);

		valorDos = JOptionPane.showInputDialog("Numero entero hasta donde llegare a calcular");
		numeroDos = obtenerResultadoTryCatch(valorDos);

		resultado = sumatoria(numeroUno, numeroDos);

		JOptionPane.showMessageDialog(null, "El total de la sumatoria es: " + resultado);

	}

	
	private boolean calcularNumeroPrimo(int valor){

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
		
		
		if(valor != 1) {

			// Recorre de i hasta el limite (hasta VALOR inclusivo).
			while(i < valor){

				int residuo = valor % i;
				int cociente = valor / i;

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


	private void imprimirNumerosPrimos(int limite) {

		boolean resultado;

		for (int i = 1; i <= limite; i++) {
			
			resultado = calcularNumeroPrimo(i);

			if (resultado == true) {
				
				System.out.println("Numero " + i + " es primo");

			}

		}

	}


	// Para MENU
	public void controlImprimirNumerosPrimos() {

		int numeroUno;
		String valor;
		int resultado = 0;

		JOptionPane.showMessageDialog(null, "Imprimir numeros primos hasta un limite dado");

		valor = JOptionPane.showInputDialog("Dame el numero limite tipo entero hasta donde calculare");
		numeroUno = obtenerResultadoTryCatch(valor);

		imprimirNumerosPrimos(numeroUno);

		JOptionPane.showMessageDialog(null, "Revisar terminal para resultado");

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


	// Ejercicio #4
	private int sumaDeArreglo(int [] sumaArreglo) {

		int resultado = 0;

		for (int i = 0; i < sumaArreglo.length; i++) {
			
			resultado += sumaArreglo[i];

		}

		return resultado;

	}


	// Para MENU
	public void controlSumaDeArreglo() {

		JOptionPane.showMessageDialog(null, "Imprimire arreglo que obtengo");

		sumaDeArreglo(arreglo);

		JOptionPane.showMessageDialog(null, "Revisar terminal para resultado");

	}


	public void getMenu() {

		// Variables
		String opcionMenuString;
		int opcionMenu;

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Sumatoria\n2. Imprimir numeros primos\n3. Imprimir un arreglo tipo entero\n4. Sumatoria de un arreglo");

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
				controlSumatoria();

				// Retornar al menu para continuar App
				getMenu();

				break;

			case 2:
				controlImprimirNumerosPrimos();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;

			case 3:
				controlImprimirArreglo();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;

			case 4:
				controlSumaDeArreglo();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;

			case 5:
				salirJuego();
				
				break;

		}

	}
	

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


