/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/16/2017

*/

// Importing libraries
public class Backend{
	
	// Ejercicio #1
	public int [][] matrizIdentidad(int largo, int ancho) {

		int [][] resultado = null;
		int j;

		// Evaluacion
		if (largo == ancho) {
			resultado = new int[largo][ancho];
			for (int i = 0; i < resultado.length; i++ ) {
				j = i;
				resultado[i][j] = 1;
			}
		}

		return resultado;

	}



	// Ejercicio #2
	public void encontrarAdyacencias(int [] arreglo){
		
		int resultado = 0;
		for (int i = 1; i < arreglo.length; i++) {
			if(arreglo[i-1] == arreglo[i]) {
				System.out.println("Adyacencia " + (resultado += 1));
				System.out.println("En " + arreglo[i - 1] + " y " + arreglo[i]);
			}
		}

	}


	// Ejercicio #3
	public int [] menorNumeroEnMatriz(int [][] matriz) {

		int [] resultado = new int [2];

		for (int i = 1; i < matriz.length; i++) {
			for (int j = 1; j < matriz[i].length; j++) {
				if (matriz[i - 1][j - 1] < matriz[i][j]) {
					resultado[0] = i - 1;
					resultado[1] = j - 1;
				} else {
					resultado[0] = i;
					resultado[1] = j;
				}
			}
		}

		return resultado;

	}


	// Ejercicio #4
	public int [] invertirValores(int [] arreglo) {

		int [] resultado = new int[arreglo.length];

		for (int i = 0; i < resultado.length; i++) {
			resultado[i] = arreglo[arreglo.length - i - 1];
		}

		return resultado;

	}


	// Ejercicio #5.2
	public void imprimirMatriz(int [][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(", ");
			}
			System.out.println("");
		}

	}


	// Ejercicio #5.1
	public void imprimirArreglo(int [] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("El valor " + i + " del arreglo es: " + arreglo[i]);
		}

	}

}