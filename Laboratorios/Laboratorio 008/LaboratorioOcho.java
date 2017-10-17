/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/16/2017

*/

// Importing libraries
public class LaboratorioOcho{
	
	public static void main(String[] args) {

		Backend labOcho = new Backend();

		int [] arreglo = {1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0};
		int [] arreglo2 = {4,8,2,7};
		int [] arreglo3 = {6,7,8,9,10};
		int [][] matriz = {{14,9,8,7},{21,11,1,23},{11,21,19,12}};
		int [] resultado = new int[arreglo3.length];
		int [] resultado2 = new int[2];

		System.out.println();


		// Ejercicio #2
		System.out.println("EJERCICIO #2: ADYACENCIAS");
		labOcho.encontrarAdyacencias(arreglo);
		System.out.println();


		// EJERCICIO #3
		System.out.println("EJERCICIO #3: NUMERO MENOR DE EN UNA MATRIZ");
		resultado2 = labOcho.menorNumeroEnMatriz(matriz);
		labOcho.imprimirArreglo(resultado2);
		System.out.println();


		// EJERCICIO #4
		System.out.println("EJERCICIO #4: VALORES INVERTIDOS");
		resultado = labOcho.invertirValores(arreglo3);
		labOcho.imprimirArreglo(resultado);





	}

}