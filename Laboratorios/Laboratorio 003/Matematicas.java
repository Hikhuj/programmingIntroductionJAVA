/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/04/2017

*/

import javax.swing.JOptionPane;

public class Matematicas {

	// Recibe INT para evaluar si es PAR, devuelve STRING
	public String evaluarPar(int entero){

		String result = " ";
		int valor = entero % 2;


		if(valor == 0){

			result = "El numero es par";

		}else{

			result = "El numero es impar";

		}

		return result;

	}


	// Recibe INT para obtener valor absoluto, devuelve INT
	public int valorAbsoluto(int entero){

		int result = 0;

		if(entero >= 0){

			result = entero;

		}else{

			result = -1 * entero;

		}

		return result;

	}


	// Recibe tres valores INT para verificar el maximo y devuelve un INT
	public int valorMaximo(int entero1, int entero2, int entero3){

		int result = 0;

		if(entero1 > entero2){

			if(entero1 > entero3){

				result = entero1;

			}else{

				result = entero3;

			}

		}else{

			if(entero2 > entero3){

				result = entero2;

			}else{

				if(entero3 > entero1){

					result = entero3;

				}else{

					result = entero1;

				}

			}

		}

		return result;

	}	


	// Recibe un DOUBLE y redondeara o no, devuelve un INT
	public int metodoRedondear(double valor1){

		// Si envio 4.4 debo recibir un 4.0 ya que no se podra redondear

		int entero = (int)valor1;
		double decimal = valor1 - entero;
		double limite = 0.5;
		int result = 0;

		if(decimal > limite){

			result = entero + 1;

		}else{

			result = entero;

		}

		return result;

	}


	public void mensajeDeError(){

		JOptionPane.showMessageDialog(null, "Error al convertir numero", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
		System.out.println(" ");
		System.out.println(" * ------------------ Terminando Sistema -------------- *");
		System.out.println(" * ");
		System.out.println(" * ---------------------- Terminado ------------------- *");
		System.out.println(" ");
		System.exit(1);

	}

}