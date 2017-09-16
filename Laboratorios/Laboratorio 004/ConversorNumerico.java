/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/08/2017

*/

public class ConversorNumerico {

	public String convertirALetras(int numero) {

		String resultado;
		String [] numeroString = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};

		if(numero > 0 && numero < 11) {
			
			resultado = "" + "Usted ingreso un " + numero + ", y obtendra la palabra: " + numeroString[numero - 1];

		} else {

			resultado = "Ingreso un valor de: " + numero + ". \nDebe ser un valor entre 1 y 10 inclusivo.";

		}

		return resultado;

	}


	public int convertirANumeros(String numeroString) {

		int resultado = 0;
		boolean valor;
		String [] numerosStringAceptados = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
		int [] numeroEntero = {1,2,3,4,5,6,7,8,9,10};

		for (int i = 0; i < numerosStringAceptados.length; i++) {
			
			if ((numeroString.equalsIgnoreCase(numerosStringAceptados[i])) == true) {

				resultado = numeroEntero[i];

			}

		}

		return resultado;

	}

}