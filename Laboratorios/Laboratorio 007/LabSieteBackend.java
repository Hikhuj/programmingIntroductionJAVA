/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/29/2017

*/

import javax.swing.JOptionPane;

public class LabSieteBackend {

	// Lista de atributos
	private int [] arreglo1 = {8, 6, 5};
	private int [] arreglo2 = {1, 3, 26, 14, 64, 27, 11};
	private int [] arreglo3 = {5, 1, 4, 76, 22};


	/***************** METODOS *****************/

	// Ejercicio #1
	// Calcular factorial
	private int calcularFactorialRecursivo(int n) {

		int resultado;

		if (n == 0) {
			
			resultado = 1;

		} else {

			resultado = n * calcularFactorialRecursivo(n - 1);

		}

		return resultado;

	}


	// Control: Ejercicio #1
	public void controlFactorialRecursivo() {

		String valor;
		int numeroUno;
		int resultado;

		JOptionPane.showMessageDialog(null, "Calcular factorial recursivo");

		valor = JOptionPane.showInputDialog("Numero para calcular factorial, debe ser entero");
		numeroUno = obtenerResultadoTryCatch(valor);

		resultado = calcularFactorialRecursivo(numeroUno);

		JOptionPane.showMessageDialog(null, "El factoral de " + numeroUno + "!:" + resultado);

	}


	// Ejercicio #2
	// Imprimir arreglo recursivamente
	/*
	private void imprimirArregloRecursivo(int [] arreglo, int i) {

		if (i == 0) {
<<<<<<< HEAD
			
			System.out.println(arreglo[0]);

		} else {

			imprimirArregloRecursivo(arreglo, (i - 1));

=======
			System.out.println(arreglo[i]);
		} else {
			return arreglo[imprimirArregloRecursivo(arreglo, i - 1)];
>>>>>>> master
		}

	}
	*/

	public void imprimirArregloRecursivo(int limite){
        
        int [] arreglo = this.arreglo1;
        int largoArreglo = this.arreglo1.length;

        if (limite == largoArreglo - 1) {
        	System.out.println("Elemento en posición " + limite + " es " + arreglo[largoArreglo]);
        } else {
			System.out.println("Elemento en posición " + limite + " es " + arreglo[largoArreglo]);
			imprimirArregloRecursivo(limite + 1);
        }

    }

	// Control: Ejercicio #2
	public void controlImprimirArregloRecursivo() {

<<<<<<< HEAD
		int parametro = (this.arreglo1.length) - 1;
		
=======
		int limite = this.arreglo1.length;

>>>>>>> master
		JOptionPane.showMessageDialog(null, "Imprimir arreglo recursivo");

		JOptionPane.showMessageDialog(null, "Obteniendo arreglo para imprimir");

<<<<<<< HEAD
		imprimirArregloRecursivo(this.arreglo1, parametro);
=======
		imprimirArregloRecursivo(limite);
>>>>>>> master

	}


	// Ejercicio #3
	// Calcular el producto punto de dos arreglos
	private int productoPunto(int [] arregloA, int [] arregloB) {

		int resultado = 0;

		if (arregloA.length > arregloB.length) {

			for (int i = 0; i < arregloB.length; i++) {
				
				arregloA[i] = arregloA[i] * arregloB[i];

			}

			for (int i = 0; i < arregloA.length; i++) {
				
				resultado += arregloA[i];

			}

		} else {

			for (int i = 0; i < arregloA.length; i++) {
				
				arregloB[i] = arregloB[i] * arregloA[i];

			}

			for (int i = 0; i < arregloB.length; i++) {
				
				resultado += arregloB[i];

			}

		}

		return resultado;

	}


	// Control: Ejercicio #3
	public void controlProductoPunto() {

		// int [] arregloInterno1;
		// int [] arregloInterno2;
		int resultado = 0;

		JOptionPane.showMessageDialog(null, "Calcular producto punto de dos arreglos obtenidos");

		JOptionPane.showMessageDialog(null, "Obtener arreglo 1 del sistema");
		// arregloInterno1 = this.arreglo1;

		JOptionPane.showMessageDialog(null, "Obtener arreglo 2 del sistema");
		// arregloInterno2 = this.arreglo2;

		resultado = productoPunto(this.arreglo1, this.arreglo2);

		JOptionPane.showMessageDialog(null, "El producto punto de los dos arreglos obtenidos es: " + resultado);

	}


	// Ejercicio #4
	// Sumar todos los valores
	private int sumaDeArreglo(int [] sumaArreglo) {

		int resultado = 0;

		for (int i = 0; i < sumaArreglo.length; i++) {
			
			resultado += sumaArreglo[i];

		}

		return resultado;

	}


	// Control: Ejercicio #4
	public void controlSumaDeArreglo() {

		int resultado;

		JOptionPane.showMessageDialog(null, "Sumar todos los numeros de un arreglo");

		resultado = sumaDeArreglo(this.arreglo1);

		JOptionPane.showMessageDialog(null, "El total de sumar el arreglo " + this.arreglo1 + ", es: " + resultado);

	}


	// Ejercicio #5
	// Suma de dos arreglos con la suma de los primeros dos
	private int [] sumaDeIndicesEnUnArreglo(int [] arregloA, int [] arregloB) {

		int [] resultado = new int[0];

		if (arregloA.length > arregloB.length) {

			for (int i = 0; i < arregloB.length; i++) {
				
				arregloA[i] = arregloA[i] + arregloB[i];

			}

			resultado = arregloA;

		} else {

			for (int i = 0; i < arregloA.length; i++) {
				
				arregloB[i] = arregloB[i] + arregloA[i];

			}

			resultado = arregloB;

		}

		return resultado;

	}


	// Control: Ejercicio #5
	public void controlSumaDeIndicesEnUnArreglo() {

		// int [] arregloInterno1;
		// int [] arregloInterno2;
		int [] resultado;

		JOptionPane.showMessageDialog(null, "Calcular producto punto de dos arreglos obtenidos");

		JOptionPane.showMessageDialog(null, "Obteniendo arreglo 1 del sistema");
		// arregloInterno1 = this.arreglo1;

		JOptionPane.showMessageDialog(null, "Obteniendo arreglo 2 del sistema");
		// arregloInterno2 = this.arreglo2;

		resultado = sumaDeIndicesEnUnArreglo(this.arreglo1, this.arreglo2);

		JOptionPane.showMessageDialog(null, "Ver el resultado en consola");

		controlImprimirArreglo(resultado);

	}


	public void getMenu() {

		// Variables
		String opcionMenuString;
		int opcionMenu;

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Calcular factorial recursivo\n2. Imprimir arreglo recursivamente\n3. Calcular el producto punto de dos arreglos\n4. Sumar todos los valores\n5. Suma de dos arreglos con la suma de los primeros dos y devolver arreglo\n6. Salir del juego");

		try {

			// Convertir el valor de opcionMenu
			opcionMenu = Integer.parseInt(opcionMenuString);

			if(opcionMenu >= 1 && opcionMenu <= 6) {

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
				controlFactorialRecursivo();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			case 2:
				controlImprimirArregloRecursivo();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			case 3:
				controlProductoPunto();
				
				// Retornar al menu para continuar App
				getMenu();
				
				break;
			
			case 4:
				controlSumaDeArreglo();
				
				// Retornar al menu para continuar App
				getMenu();

				break;

			case 5:
				controlSumaDeIndicesEnUnArreglo();
				
				// Retornar al menu para continuar App
				getMenu();

				break;		

			case 6:
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


	private void imprimirArreglo(int [] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			
			System.out.print(arreglo[i] + ", ");

		}

	}


	public void controlImprimirArreglo(int [] arreglo) {

		JOptionPane.showMessageDialog(null, "Imprimir arreglo");

		imprimirArreglo(arreglo);

		JOptionPane.showMessageDialog(null, "Revisar terminal para resultado");

	}


}


