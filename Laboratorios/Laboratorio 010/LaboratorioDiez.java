public class LaboratorioDiez{ 

	public static void main(String [] args) {

		/* VARIABLES */
		String palabra = "Paralelepípedo";
		String palabraDos = "Paralelepedorro";
		String palabraTres = "Roger";
		String palabraCuatro = "rOgEr";
		String palabraCinco = " Don de Carl     ";
		String palabraSeis = "Un lenguaje compilado es un lenguaje de programación cuyas implementaciones son normalmente compiladores (traductores que generan código de máquina a partir del código fuente) y no intérpretes (ejecutores paso a paso del código fuente, donde no se lleva a cabo una traducción en la pre ejecución).";
		String palabraSiete = "un";
		String palabraOcho = ").";
		String palabraNueve = "fuente";
		int numeroLetra = 4;
		char resultadoDeFuncion;
		int resultadoDeFuncion2;
		String resultadoDeFuncion3;
		boolean resultadoDeFuncion4;
		boolean resultadoDeFuncion5;
		String resultadoDeFuncion6;
		String resultadoDeFuncion7;
		String resultadoDeFuncion8;
		String resultadoDeFuncion9;
		int resultadoDeFuncion10;
		boolean resultadoDeFuncion11;
		boolean resultadoDeFuncion12;
		char letraAReemplazar = 'e';
		char reemplazadora = 'x';


		/* INSTANCIAS */
		JugarConLetras jugarConLetras = new JugarConLetras();

		resultadoDeFuncion = jugarConLetras.funcionCharAt(palabra, numeroLetra);
		System.out.println("Caso #1");
		System.out.println("La posicion " + (numeroLetra + 1) + ", tiene una letra " + resultadoDeFuncion + " en la palabra " + palabra);
		System.out.println();

		resultadoDeFuncion2 = jugarConLetras.largoDeUnString(palabra);
		System.out.println("Caso #2");
		System.out.println(resultadoDeFuncion2);
		System.out.println();

		resultadoDeFuncion3 = jugarConLetras.extraerNuevoStringDeOtro(palabra, numeroLetra);
		System.out.println("Caso #3");
		System.out.println(resultadoDeFuncion3);
		System.out.println();

		resultadoDeFuncion4 = jugarConLetras.esIgualAString(palabra, palabraDos);
		System.out.println("Caso #4");
		System.out.println(resultadoDeFuncion4);
		System.out.println();

		resultadoDeFuncion5 = jugarConLetras.compararIgnorandoCases(palabraTres, palabraCuatro);
		System.out.println("Caso #5");
		System.out.println(resultadoDeFuncion5);
		System.out.println();

		resultadoDeFuncion6 = jugarConLetras.limpiarString(palabraCinco);
		System.out.println("Caso #6");
		System.out.println(resultadoDeFuncion6);
		System.out.println();

		resultadoDeFuncion7 = jugarConLetras.pasarAMayuscula(palabra);
		System.out.println("Caso #7");
		System.out.println(resultadoDeFuncion7);
		System.out.println();

		resultadoDeFuncion8 = jugarConLetras.pasarAMinusculas(palabra);
		System.out.println("Caso #8");
		System.out.println(resultadoDeFuncion8);
		System.out.println();

		resultadoDeFuncion9 = jugarConLetras.convertirLetrasDePalabras(palabra, letraAReemplazar, reemplazadora);
		System.out.println("Caso #9");
		System.out.println(resultadoDeFuncion9);
		System.out.println();

		resultadoDeFuncion10 = jugarConLetras.siExistePalabraDevuelvaIndice(palabraSeis, palabraNueve);
		System.out.println("Caso #10");
		System.out.println(resultadoDeFuncion10);
		System.out.println();

		resultadoDeFuncion11 = jugarConLetras.seraQueStringComienzaCon(palabraSeis, palabraSiete);
		System.out.println("Caso #11");
		System.out.println(resultadoDeFuncion11);
		System.out.println();

		resultadoDeFuncion12 = jugarConLetras.seraQueStringTerminaCon(palabraSeis, palabraOcho);
		System.out.println("Caso #12");
		System.out.println(resultadoDeFuncion12);
		System.out.println();

	}

}