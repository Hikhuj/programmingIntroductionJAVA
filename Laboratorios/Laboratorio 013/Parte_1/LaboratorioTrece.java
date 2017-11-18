public class LaboratorioTrece {
	
	
	public static void main(String[] args) {

		/* INSTANCIAS */
		BackEnd bkLabTrece = new BackEnd();

		/* VARIABLES */
		int [][] array1 = {{1,0,2},{-1,3,1}};
		int [][] array2 = {{3,1},{2,1},{1,0}};
		int largo = array1[0].length;
		int ancho = array2.length;
		int [][] array3 = new int[largo][ancho];

		array3 = bkLabTrece.multiplicarMatrices(array1, array2);

		bkLabTrece.imprimirMatriz(array3);

	}	

}