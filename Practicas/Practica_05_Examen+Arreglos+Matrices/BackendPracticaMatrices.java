public class BackendPracticaMatrices {
	
	public void imprimirMatrices(int [][] matriz)
	{

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Columna " + i + "\tLinea " + j + ", indice: " + matriz[i][j]);
			}
		}

	}


	public int [][] elevarMatrizCuadrado(int [][] matriz)
	{

		int [][] resultado = matriz;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				resultado[i][j] = matriz[i][j] * matriz[i][j];
			}
		}

		return resultado;

	}


	public int [][] sumarMatricez(int [][] matriz, int [][] matriz2)
	{

		int [][] resultado = null;
		int fila1 = matriz.length;
		int columna1 = matriz[0].length;
		int fila2 = matriz2.length;
		int columna2 = matriz2[0].length;

		if ((fila1 == fila2) && (columna1 == columna2)) {
			
			
			
		}



	}

}