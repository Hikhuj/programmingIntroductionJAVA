/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/04/2017

*/

import javax.swing.JOptionPane;


public class LaboratorioTres {

	public static void main(String[] args) {

		// Instanciar clase
		Matematicas metoMate = new Matematicas();

		//Lista de Variables
		String opcionDeMenuString;
		int opcionDeMenu = 0;
		String ingreseElNumero = "Por favor ingrese el numero a evaluar:";
		String ingreseLosNumeros = "Por favor ingrese los numeros a evaluar";


		// Mensaje de Bienvenida
		JOptionPane.showMessageDialog(null, "Bienvenidos al Laboratorio 3", "Laboratorio 3", JOptionPane.INFORMATION_MESSAGE);

		// Obtener del usuario la opcion que quiere realizar.
		opcionDeMenuString = JOptionPane.showInputDialog(null, "Elige una opcion:\n1. Numero par?\n2. Valor absoluto\n3. Valor maximo\n4. Redondear\n9. Salir\nDebe ser un valor entero");

		// Comprobacion de que sea un dato correcto
		try {

			// Convertir el valor de opcionDeMenu
			opcionDeMenu = Integer.parseInt(opcionDeMenuString);

		}catch(NumberFormatException e){

			metoMate.mensajeDeError();

		}

		if(opcionDeMenu >= 0 && opcionDeMenu <= 5){

			switch(opcionDeMenu) {

				case 1:

					//Lista de Variables
					String numeroAEvaluarString;
					int numeroAEvaluar = 0;

					//Solicitamos al usuario los valores para el metodo Numero Par
					numeroAEvaluarString = JOptionPane.showInputDialog(null, ingreseElNumero + ", (debe ser entero):");

					//Evaluamos si numero es valido
					try{

						numeroAEvaluar = Integer.parseInt(numeroAEvaluarString);

					}catch(NumberFormatException e) {

						metoMate.mensajeDeError();

					}

					// Guardar resultado de metodo en variable
					String numeroPar = metoMate.evaluarPar(numeroAEvaluar);

					// Imprimir resultado
					System.out.println(numeroPar);

					JOptionPane.showMessageDialog(null, numeroPar, "Numero es Par?", JOptionPane.INFORMATION_MESSAGE);

					// Termina proceso de Case 1:
					break;

				case 2:

					//Lista de Variables
					String valorAbsolutoString;
					int valorAbsolutoEntero = 0;
					int resultadoValorAbsoluto;

					//Solicitamos al usuario los valores para el metodo Valor Absoluto
					valorAbsolutoString = JOptionPane.showInputDialog(null, ingreseElNumero + ", (debe ser entero):");

					try{

						valorAbsolutoEntero = Integer.parseInt(valorAbsolutoString);

					}catch(NumberFormatException e) {

						metoMate.mensajeDeError();

					}

					// Guardar resultado de metodo en variable
					resultadoValorAbsoluto = metoMate.valorAbsoluto(valorAbsolutoEntero);

					// Imprimir resultado
					System.out.println(resultadoValorAbsoluto);

					JOptionPane.showMessageDialog(null, "El valor absoluto de " + valorAbsolutoString + " es " + resultadoValorAbsoluto, "Valor Absoluto", JOptionPane.INFORMATION_MESSAGE);

					// Termina proceso de Case 2:
					break;
					
				case 3:

					//Lista de Variables
					String valor1String;
					String valor2String;
					String valor3String;
					int valor1Entero = 0;
					int valor2Entero = 0;
					int valor3Entero = 0;
					int resultadoValorMaximo;

					//Solicitar valores al usuario
					valor1String = JOptionPane.showInputDialog(null, ingreseElNumero + " (valor 1, debe ser entero): ");
					valor2String = JOptionPane.showInputDialog(null, ingreseElNumero + " (Valor 2, debe ser entero): ");
					valor3String = JOptionPane.showInputDialog(null, ingreseElNumero + " (Valor 3, debe ser entero): ");

					try{

						valor1Entero = Integer.parseInt(valor1String);
						valor2Entero = Integer.parseInt(valor2String);
						valor3Entero = Integer.parseInt(valor3String);

					}catch(NumberFormatException e) { 

						JOptionPane.showMessageDialog(null, "Uno de los valores no fue correcto, vuelva a ingresar al sistema", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

						metoMate.mensajeDeError();

					}

					// Guardar resultado de metodo en variable
					resultadoValorMaximo = metoMate.valorMaximo(valor1Entero, valor2Entero, valor3Entero);

					//Imprimir resultado
					System.out.println(resultadoValorMaximo);

					JOptionPane.showMessageDialog(null, "De los valores: " + valor1Entero + ", " + valor2Entero + " y " + valor3Entero + ", el mayor de ellos es: " + resultadoValorMaximo, "Valor Maximo", JOptionPane.INFORMATION_MESSAGE);

					// Termina proceso de Case 3:
					break;

				case 4:

					// Lista de variables
					String doubleARedondearString;
					Double doubleARedondear = 0.0;
					int resultadoDoubleARedondear;

					doubleARedondearString = JOptionPane.showInputDialog(null, ingreseElNumero + " (ingresar un valor real)");

					try{

						doubleARedondear = Double.parseDouble(doubleARedondearString);

					}catch(NumberFormatException e) {

						metoMate.mensajeDeError();

					}

					// Guardar resultado de metodo en variable
					resultadoDoubleARedondear = metoMate.metodoRedondear(doubleARedondear);

					// Imprimir resultado
					System.out.println(resultadoDoubleARedondear);

					JOptionPane.showMessageDialog(null, "El resultado de redondear " + doubleARedondear + " es: " + resultadoDoubleARedondear, "Redondear Numero", JOptionPane.INFORMATION_MESSAGE);

					// Termina proceso de Case 4:
					break;

				case 5:

				JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema", "Cerrando Sistema", JOptionPane.INFORMATION_MESSAGE);

				// Cerrar sistema
				System.exit(1);

			}

		}else{

			JOptionPane.showMessageDialog(null, "Ingreso una opcion de sistema no valida,\nCerrando sistema de forma segura\nPuede reiniciarlo nuevamente", "Opcion Invalida de Menu", JOptionPane.ERROR_MESSAGE);

		}



	}

}
