/* Author: Roger Ulate */
/* Date: 08/25/2017 */

/*
Notas:
Cuando en la formulas estoy usando la aceleracion, 
debo convertirla de km/h a m/s y luego a m/s2. para que me devuelva 
el calculo correctamente, verificar 

*/

import javax.swing.JOptionPane;

public class Laboratorio2 {
	
	public static void main(String[] args) {

		/* INSTANCIAS */
		LeyNewton segundaLey = new LeyNewton();

		/* PARAMETROS DE PRUEBA */
		double fuerza;
		String fuerzaString;
		double masa;
		String masaString;
		double aceleracion;
		String aceleracionString;
		String distanciaString;
		double distancia;
		double resultadoFuerza;
		double resultadoMasa;
		double resultadoAceleracion;
		double resultadoPasarKmhAMsCuadrado;
		double resultadoFuerzaNeta;
		String notacionCientifica;



		//Laboratorio 1
		System.out.println(" * --------------- Conectando a Sistema ------------- *");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ------------------- Inicializado ----------------- *");
		System.out.println(" ");
		System.out.println(" ");


		double velocidadConvertida;


		/* CONSULTAR LA FUERZA */
		JOptionPane.showMessageDialog(null, "Consultar la Fuerza de acuerdo a la formula: \"F = m * a\":");

		// Pedir masa
		masaString = JOptionPane.showInputDialog("Por favor digite la masa en Kg (debe ser valor tipo real)");
		masa = segundaLey.obtenerResultadoTryCatch(masaString);

		// Pedir aceleracion
		aceleracionString = JOptionPane.showInputDialog("Por favor digite la aceleracion en Km/h (debe ser valor tipo real)");
		aceleracion = segundaLey.obtenerResultadoTryCatch(aceleracionString);

		resultadoFuerza = segundaLey.calcularFuerza(masa, aceleracion);

		JOptionPane.showMessageDialog(null, "La Fuerza de acuerdo a la formula: \"F = m * a\" es: " + resultadoFuerza + "N.");



		/* CONSULTAR LA MASA */
		JOptionPane.showMessageDialog(null, "Consultar la Masa de acuerdo a la formula: \"m = F / a\":");

		// Pedir fuerza
		fuerzaString = JOptionPane.showInputDialog("Por favor digite la fuerza en N (debe ser valor tipo real)");
		fuerza = segundaLey.obtenerResultadoTryCatch(fuerzaString);

		// Pedir aceleracion
		aceleracionString = JOptionPane.showInputDialog("Por favor digite la aceleracion en Km/h (debe ser valor tipo real)");
		aceleracion = segundaLey.obtenerResultadoTryCatch(aceleracionString);

		resultadoMasa = segundaLey.calcularMasa(fuerza, aceleracion);

		JOptionPane.showMessageDialog(null, "La Masa de acuerdo a la formula: \"m = F / a\" es: " + resultadoMasa + "Kg.");



		/* CONSULTAR LA ACELERACION */
		JOptionPane.showMessageDialog(null, "Consultar la Aceleracion de acuerdo a la formula: \"a = F / m\":");

		// Pedir Fuerza
		fuerzaString = JOptionPane.showInputDialog("Por favor digite la fuerza en N (debe ser valor tipo real)");
		fuerza = segundaLey.obtenerResultadoTryCatch(fuerzaString);

		// Pedir masa
		masaString = JOptionPane.showInputDialog("Por favor digite la masa en Kg (debe ser valor tipo real)");
		masa = segundaLey.obtenerResultadoTryCatch(masaString);

		resultadoAceleracion = segundaLey.calcularAceleracion(fuerza, masa);

		JOptionPane.showMessageDialog(null, "La Masa de acuerdo a la formula: \"a = F / m\" es: " + resultadoAceleracion + "m/s^2.");



		/* CONSULTAR LA FUERZA NETA */
		JOptionPane.showMessageDialog(null, "Consultar la fuerza neta dados los datos de masa, velocidad, distancia.");

		// Pedir Masa
		masaString = JOptionPane.showInputDialog("Por favor digite la masa en Kg (debe ser valor tipo real)");
		masa = segundaLey.obtenerResultadoTryCatch(masaString);

		// Pedir Velocidad
		aceleracionString = JOptionPane.showInputDialog("Por favor digite la aceleracion en Km/h (debe ser valor tipo real)");
		aceleracion = segundaLey.obtenerResultadoTryCatch(aceleracionString);

		// Pedir Distancia
		distanciaString = JOptionPane.showInputDialog("Por favor digite la distancia en metros (debe ser valor tipo real)");
		distancia = segundaLey.obtenerResultadoTryCatch(distanciaString);

		resultadoFuerzaNeta = segundaLey.calcularFuerzaNeta(masa, aceleracion, distancia);

		notacionCientifica = segundaLey.pasarANotacionCientifica(resultadoFuerzaNeta);
		
		JOptionPane.showMessageDialog(null, "La aceleracion neta es: " + notacionCientifica + "N.");
























		
	}

}