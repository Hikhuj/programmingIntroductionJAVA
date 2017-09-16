import javax.swing.JOptionPane;

public class LeyNewton {
	

	public double calcularFuerza(double masa, double aceleracion) {

		double fuerza;

		fuerza = masa * (pasarKmhAMsCuadrado(aceleracion));

		return fuerza;

	}


	public double calcularMasa(double fuerza, double aceleracion) {

		double masa;

		masa = fuerza/(pasarKmhAMsCuadrado(aceleracion));

		return masa;

	}


	public double calcularAceleracion(double fuerza, double masa) {

		double aceleracion;

		aceleracion = fuerza/masa;

		aceleracion = pasarKmhAMsCuadrado(aceleracion);

		return aceleracion;

	}


	public double pasarKmhAMsCuadrado(double kilometros) {

		double resultado;

		resultado = (kilometros * 1000)/3600;

		return resultado;

	}


	public double calcularFuerzaNeta(double masa, double velocidad, double distancia) {

		double fuerza;
		double aceleracion;
		double velocidadConvertida = pasarKmhAMsCuadrado(velocidad);
		double velocidadFinal = 0;

		aceleracion = (velocidadFinal - (velocidadConvertida * velocidadConvertida)) / (2 * distancia);

		fuerza = masa * aceleracion;

		return fuerza;

	}


	public void mensajeDeErrorStringAReal() {

		System.out.println("Error: valor no es real");
		System.out.println(" ");
		System.out.println(" * ------------------ Terminando Sistema -------------- *");
		System.out.println(" * ");
		System.out.println(" * ---------------------- Terminado ------------------- *");
		System.out.println(" ");
		System.exit(1);

	}


	public double obtenerResultadoTryCatch(String valorString) {

		double resultado = 0;

		try{

			resultado = Double.parseDouble(valorString);

		}catch(NumberFormatException e) {

			// Despliega mensaje de error
			mensajeDeErrorStringAReal();

		}

		return resultado;

	}


	public String pasarANotacionCientifica(double valorAConvertir) {

		// Lista de variables de metodo
		String resultado;
		int exponente;
		int valorAEntero;
		String valorAString;
		

		//Casteo el valor obtenido de Double a Entero
		valorAEntero = (int) valorAConvertir;


		// Convierto el valor casteado Entero a String
		valorAString = "" + valorAEntero;


		// Obtener expresion en '+' o en '-'
		if (valorAConvertir < 0) {

			exponente = (valorAString.substring(2)).length();

			resultado = "" + "-" + valorAString.charAt(1) + "." + valorAString.charAt(2) + "x10^" + exponente;

		}else{

			exponente = (valorAString.substring(1)).length();

			resultado = "" + valorAString.charAt(0) + "." + valorAString.charAt(1) + "x10^" + exponente;

		}


		return resultado;

	}

}




















