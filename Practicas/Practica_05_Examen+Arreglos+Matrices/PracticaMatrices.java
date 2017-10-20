public class PracticaMatrices {
	
	public static void main(String [] args) {

		BackendPracticaMatrices backend = new BackendPracticaMatrices();

		int [][] matriz = {{7,4,9},{4,3,0},{1,7,3}};
		backend.imprimirMatrices(matriz);


		int [][] matriz2;
		matriz2 = backend.elevarMatrizCuadrado(matriz);
		backend.imprimirMatrices(matriz2);


		int [][] matriz3 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int [][] matriz4 = matriz3;
		int [][] resultado = null;


		


	}

}