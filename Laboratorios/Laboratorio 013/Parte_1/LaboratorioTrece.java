public class LaboratorioTrece {
	
	
	public static void main(String[] args) {

		/* INSTANCIAS */
		BackEnd bkLabTrece = new BackEnd();

		/* VARIABLES */
		int [][] matrizUno = {{1,0,2},{-1,3,1}};
		int [][] matrizDos = {{3,1},{2,1},{1,0}};
		int [][] matrizTres = bkLabTrece.multiplicarMatrices(matrizUno, matrizDos);

		bkLabTrece.imprimirMatriz(matrizTres);

	}	

}