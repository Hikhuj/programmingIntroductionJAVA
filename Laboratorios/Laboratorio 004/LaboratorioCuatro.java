/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/08/2017

*/

import javax.swing.JOptionPane;


public class LaboratorioCuatro {

	public static void main(String[] args) {

		// Nuevas variables
		String valor;
		String valorDos;
		int numeroALetra;
		String resultadoUno;
		int resultadoDos;
		int numeroUno;
		int numeroDos;
		int resultadoTres;
		String numeroString;
		String resultadoCuatro;
		int resultadoCinco;



		// Listado de instancias
		ConversorNumerico conversorNumerico = new ConversorNumerico();
		Ciclos ciclos = new Ciclos();



		// Impresiones
		System.out.println(" * --------------- Conectando a Sistema ------------- *");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ------------------- Inicializado ----------------- *");
		System.out.println(" ");
		System.out.println(" ");



		//Parte I
		JOptionPane.showMessageDialog(null, "Ejercicios, Parte I");

		// Ejercicio #1
		valor = JOptionPane.showInputDialog("Convertire un numero entero de 1 al 10 a letras, por favor ingrese el numero:");
		numeroALetra = ciclos.obtenerResultadoTryCatch(valor);
		resultadoUno = conversorNumerico.convertirALetras(numeroALetra);
		JOptionPane.showMessageDialog(null, "El pasar el numero " + numeroALetra + " a letras es: " + resultadoUno);

		// Ejercicio #2
		valor = JOptionPane.showInputDialog("Convertire un nombre de numero de 1 al 10 a numero, por favor escriba el numero en letras:");
		resultadoDos = conversorNumerico.convertirANumeros(valor);
		JOptionPane.showMessageDialog(null, "El pasar el numero en letras " + valor + " a numero es: " + resultadoDos);



		//Parte II
		JOptionPane.showMessageDialog(null, "Ejercicios, Parte II");

		// Ejercicio #1
		JOptionPane.showMessageDialog(null, "Con un ciclo tipo While calculare la sumatoria desde un numero hasta otro numero");
		valor = JOptionPane.showInputDialog("Ingrese el numero desde donde comenzare a calcular");
		numeroUno = ciclos.obtenerResultadoTryCatch(valor);
		valorDos = JOptionPane.showInputDialog("Ingrese el numero hasta donde calculare");
		numeroDos = ciclos.obtenerResultadoTryCatch(valorDos);
		resultadoTres = ciclos.sumatoriaNumeros(numeroUno, numeroDos);
		JOptionPane.showMessageDialog(null, "El resultado de la sumatoria de " + numeroUno + " hasta " + numeroDos + " es de:" + resultadoTres);

		// Ejercicio #2
		JOptionPane.showMessageDialog(null, "Usando un ciclo tipo Do/While calculare la sumatoria de un numero");
		valor = JOptionPane.showInputDialog("Ingrese el numero hasta donde llegare");
		resultadoCuatro = ciclos.devolverSumatoriaEntero(valor);
		JOptionPane.showMessageDialog(null, "La sumatoria de " + valor + " es: " + resultadoCuatro);

		// Ejercicio #3
		JOptionPane.showMessageDialog(null, "Utilizando un ciclo for, calculare y retornare la suma de todos los numeros impares entre 0 al numero que me des.");
		valor = JOptionPane.showInputDialog("Ingrese un numero entero que sera mi limite");
		numeroUno = ciclos.obtenerResultadoTryCatch(valor);
		resultadoCinco = ciclos.sumatoriaNumerosImpares(numeroUno);
		JOptionPane.showMessageDialog(null, "La sumatoria de los numeros impares hasta el " + valor + ", es de: " + resultadoCinco);

		// Ejercicio #4
		JOptionPane.showMessageDialog(null, "Imprimire la cantidad de multiplos que me digas desde donde me digas, el resultado lo mostrare en CONSOLA");
		valor = JOptionPane.showInputDialog("Dame la cantidad de multiplos que debere imprimir");
		numeroUno = ciclos.obtenerResultadoTryCatch(valor);
		valorDos = JOptionPane.showInputDialog("Dame la el numoer desde donde comenzare y tambien sera el multiplo que calculare");
		numeroDos = ciclos.obtenerResultadoTryCatch(valorDos);
		ciclos.multiplos(numeroUno, numeroDos);


	}

}