public class BackEnd {
	
	public int [][] multiplicarMatrices(int [][] matrizUno, int [][] matrizDos) {

		int largo = matrizUno[0].length;
		int ancho = matrizDos.length;
		int [][] resultado = new int[largo][ancho];
		int sumatoria = 0;

		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado[i].length; j++) {
				for (int k = 0; k < matrizUno.length; k++) {
					// sumatoria += (matrizUno[i][j] + matrizDos[j][i]);
					// resultado[i][j] = sumatoria;
					resultado[i][j] += (matrizUno[i][j] + matrizDos[j][i]);
				}
				sumatoria = 0;
			}
		}

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