public class JugarConLetras{ 

	// Caso #1
	public char funcionCharAt(String palabra, int numeroLetra) {
		// Variables
		char resultado = ' ';
		if((numeroLetra >= 0) && (numeroLetra < palabra.length())) {
			resultado = palabra.charAt(numeroLetra);
		}
		return resultado;
	}


	// Caso #2
	public int largoDeUnString(String palabra) {
		// Variable
		int resultado = 0;
		resultado = palabra.length();
		return resultado;
	}


	// Caso #3
	public String extraerNuevoStringDeOtro(String palabra, int numeroLetraInicio) {
		// Variables
		String resultado = "";
		if((numeroLetraInicio >= 0) && (numeroLetraInicio < palabra.length())) {
			resultado = palabra.substring(numeroLetraInicio);
		}
		return resultado;
	}


	// Caso #4
	public boolean esIgualAString(String palabra, String palabra2) {
		// Variables
		boolean resultado = true;
		resultado = palabra.equals(palabra2);
		return resultado;
	}


	// Caso #5
	public boolean compararIgnorandoCases(String palabra, String palabra2) {
		// Variables
		boolean resultado = false;
		resultado = palabra.equalsIgnoreCase(palabra2);
		return resultado;
	}


	// Caso #6
	public String limpiarString(String palabra) {
		// Variables
		String resultado = "";
		resultado = palabra.trim();
		return resultado;
	}


	// Caso #7
	public String pasarAMayuscula(String palabra) {
		String resultado = "";
		resultado = palabra.toUpperCase();
		return resultado;
	}


	// Caso #8
	public String pasarAMinusculas(String palabra) {
		String resultado = "";
		resultado = palabra.toLowerCase();
		return resultado;
	}


	// Caso #9
	public String convertirLetrasDePalabras(String palabra, char letraAReemplazar, char reemplazadora) {
		String resultado = "";
		resultado = palabra.replace(letraAReemplazar, reemplazadora);
		return resultado;
	}


	// Caso #10
	public int siExistePalabraDevuelvaIndice(String palabra, String palabraABuscar) {
		int resultado = 0;
		resultado = palabra.indexOf(palabraABuscar);
		return resultado;
	}


	// Caso #11
	public boolean seraQueStringComienzaCon(String palabra, String comienzaCon) {
		boolean resultado = false;
		resultado = palabra.startsWith(comienzaCon);
		return resultado;
	}


	// Caso #12
	public boolean seraQueStringTerminaCon(String palabra, String terminaCon) {
		boolean resultado = false;
		resultado = palabra.endsWith(terminaCon);
		return resultado;
	}

}