/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/08/2017

*/

import javax.swing.JOptionPane;

public class Backend {


	/*********************************************/
	/*                   METODOS                 */
	/*********************************************/
	// Ejercicio #1: Calcular Factorial
	private long calcularFactorial(int factorialDe) {

		/*
		Usando esto dria siempre el doble, por lo que habria que dividir siempre a la mitad


		long resultado = 2;

		for (int i = 1; i <= factorialDe; i++) {
			
			resultado *= i;

		}

		return resultado;
		*/

		long resultado = 1;

		for (int i = 2; i <= factorialDe; i++) {
			
			resultado *= i;

		}

		return resultado;

	}


	public void controlCalcularFactorial() {

		int numeroUno;
		String valor;
		long resultado;

		JOptionPane.showMessageDialog(null, "Calcular Factorial");

		valor = JOptionPane.showInputDialog("Numero hasta donde calculadre factorial");
		numeroUno = obtenerResultadoTryCatch(valor);

		resultado = calcularFactorial(numeroUno);

		JOptionPane.showMessageDialog(null, "El factorial de " + numeroUno + "! = " + resultado);


	}


	// Ejercicio #4 de Ciclos
	private int productoria(int valor, int valor2) {

		int resultado = valor;

		for (int i = valor + 1; i <= valor2; i++) {
			
			resultado = resultado * i;

		}

		return resultado;

	}


	public void controlProductoria() {

		int numeroUno;
		int numeroDos;
		String valor;
		String valor2;
		int resultado;

		JOptionPane.showMessageDialog(null, "Obtener la cantidad de multiplicacionnes de numero a otro.");

		valor = JOptionPane.showInputDialog("Numero desde comenzate a multiplicar");
		numeroUno = obtenerResultadoTryCatch(valor);

		valor2 = JOptionPane.showInputDialog("Numero inclusivo hasta donde llegare con la multiplicacion");
		numeroDos = obtenerResultadoTryCatch(valor2);

		resultado = productoria(numeroUno, numeroDos);

		JOptionPane.showMessageDialog(null, "El resultado de multiplicar " + numeroUno + " hasta " + numeroDos + " es: " + resultado);

	}


	// Ejercicio #8 de Ciclos
	private int dadosTotalTiradas() {

		int resultado = 0;
		int tiradaAleatoria;

		for (int i = 0; i < 10; i++) {
			
			tiradaAleatoria = (int)(Math.random() * 10);

			resultado = resultado + tiradaAleatoria;
			
		}

		return resultado;

	}


	public void controlDadosTotalTirados() {

		int numeroUno;

		JOptionPane.showMessageDialog(null, "Tirar el dado 10 veces, sumar cada numero obtenido de la tirada y sumar todo.");

		numeroUno = dadosTotalTiradas();

		JOptionPane.showMessageDialog(null, "El resultado de sumar todas las 10 tiradas de un dado es: " + numeroUno);

	}


	// Ejercicion #13 de Ciclos
	private int serieHarmonica(int valor) {

		int resultado = 0;

		for (int i = 1; i <= valor; i++) {
			
			resultado = resultado + (1/i);

		}

		return resultado;

	}


	public void controlSerieHarmonica() {

		int numeroUno;
		String valor;
		int resultado;

		JOptionPane.showMessageDialog(null, "Calcular una serie harmonica");

		valor = JOptionPane.showInputDialog("Numero hasta donde llegara la serie (1/i), ingrese el valor de i");
		numeroUno = obtenerResultadoTryCatch(valor);

		resultado = serieHarmonica(numeroUno);

		JOptionPane.showMessageDialog(null, "El control de la Serie Harmonica es: " + resultado);

	}


	public void getMenu() {

		// Variables
		String opcionMenuString;
		int opcionMenu;

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Calcular Factorial\n2. Productoria\n3. Tirar dados y obtener suma total de numeros obtenidos\n4. Calcular serie Harmonica\n5. Salir del juego");

		try {

			// Convertir el valor de opcionMenu
			opcionMenu = Integer.parseInt(opcionMenuString);

			if(opcionMenu >= 1 && opcionMenu <= 5) {

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
				controlCalcularFactorial();

				// Retornar al menu para continuar App
				getMenu();

				break;

			case 2:
				controlProductoria();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;

			case 3:
				controlDadosTotalTirados();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;

			case 4:
				controlSerieHarmonica();
				
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

	public boolean esPositivo(int numero) {

		boolean resultado = false;

		if (numero >= 0) {
			
			resultado = true;

		}

		return resultado;

	}


	// Sobrecarga: esEntero --> integer
	public boolean esEntero(int numero) { 
        
        boolean resultado;

        if (numero % 1 == 0) { 
           
            resultado = true; 

        } else { 

            resultado = false; 

        }

        return resultado;

    }


    // Sobrecarga: esEntero --> double
   	public boolean esEntero(double numero) {

   		boolean resultado;

        if (numero % 1 == 0) { 
           
            resultado = true; 

        } else { 

            resultado = false; 

        }

        return resultado;

   	}


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


