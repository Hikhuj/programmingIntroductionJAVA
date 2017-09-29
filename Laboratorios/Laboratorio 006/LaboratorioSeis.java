/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/28/2017

*/

import javax.swing.JOptionPane;


public class LaboratorioSeis {

	public static void main(String[] args) {

		// Listado de instancias
		LabSeisBackend backend = new LabSeisBackend();

		int limite = 5;
		boolean resultado;

		resultado = calcularNumeroPrimo(limite);

		System.out.println(resultado);

	}

}