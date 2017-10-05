/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/29/2017

*/

import javax.swing.JOptionPane;


public class LaboratorioSiete {

	public static void main(String[] args) {

		// Listado de instancias
		LabSieteBackend backend = new LabSieteBackend();

		// backend.getMenu();

		int [] arreglo1 = {1,1,1};
		int [] arreglo2 = {2,2};
		int resultado;

		resultado = backend.productoPunto(arreglo1, arreglo2);

		System.out.println(resultado);


	}

}