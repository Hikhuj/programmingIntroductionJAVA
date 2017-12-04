public class BackEnd {
	
	public int [][] multiplicarMatrices(int [][] matrizUno, int [][] matrizDos) {
	    int[][] resultado = new int[matrizUno.length][matrizDos[0].length];
	    // se comprueba si las matrices se pueden multiplicar
	    if (matrizUno[0].length == matrizDos.length) {
	        for (int i = 0; i < matrizUno.length; i++) {
	            for (int j = 0; j < matrizDos[0].length; j++) {
	                for (int k = 0; k < matrizUno[0].length; k++) {
	                    // aquí se multiplica la matriz
	                    resultado[i][j] += matrizUno[i][k] * matrizDos[k][j];
	                }
	            }
	        }
	    }
	    /**
	     * si no se cumple la condición se retorna una matriz vacía
	     */
	    return resultado;
	}

	public void imprimirMatriz(int [][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(", ");
			}
			System.out.println("");
		}
	}

}