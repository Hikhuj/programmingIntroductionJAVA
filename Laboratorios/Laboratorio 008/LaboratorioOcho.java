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
		int [][] matriz = {{23,2,8,7},{21,11,9,4},{1,21,2,12}};
		//int [][] matriz = {{-5, 0, -1}, {10, 15, 30}, {2, 6, 5}};
		int [] resultado = new int[arreglo3.length];
		int [] resultado2 = new int[2];
		int [][] resultado3 = null;
		int largo = 5;
		int ancho = 5;

		System.out.println();


		// Ejercicio #1 
		System.out.println("EJERCICIO #1: MATRIZ IDENTIDAD");
		resultado3 = labOcho.matrizIdentidad(largo, ancho);
		labOcho.imprimirMatriz(resultado3);
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