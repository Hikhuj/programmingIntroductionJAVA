/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/08/2017

*/

import javax.swing.JOptionPane;


public class LaboratorioSeis {

	public static void main(String[] args) {

		// Listado de instancias
		LabSeisBackend backend = new LabSeisBackend();

		int [] arreglo = {1,2,4};
		int resultado;

		resultado = backend.sumaDeArreglo(arreglo);

		System.out.println(resultado);

	}

}