/*******************************************************************
 * Program Name: Contador de monedas
 * Purpose: Devolver la cantidad de monedas para llegar a un monto
 * Created: 
 * Modifications: 
 *******************************************************************/

import java.io.*;
import javax.swing.*;

public class CambioAutomatico {

	public int [] cantidadMonedas(int monto) {

		int [] resultado = new int[4];
		int [] monedas = {50, 20, 10, 5};
		int operacion = monto;

		for (int i = 0; i < monedas.length; i++) {
			resultado[i] = operacion / monedas[i];
			operacion = operacion - (resultado[i] * monedas[i]);
		}

		return resultado;

	}

	public void imprimirArreglos(int [] arreglo) {

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}

	public static void main(String[] args) {

		CambioAutomatico cambioAutomatico = new CambioAutomatico();

		int monto = 225;
		int [] array = new int[4];

		array = cambioAutomatico.cantidadMonedas(monto);

		cambioAutomatico.imprimirArreglos(array);

	}			

}