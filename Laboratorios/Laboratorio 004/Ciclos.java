/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 09/08/2017

*/

public class Ciclos {

	/*********************************************/
	/*                   METODOS                 */
	/*********************************************/

	// Ejercicio #1
	public int sumatoriaNumeros(int numeroInicial, int numeroFinal) {

		int resultado = 0;
		int i = numeroInicial;

		while (i <= numeroFinal) {
			
			resultado = resultado + i;

			i++;

		}

		return resultado;

	}


	// Ejercicio 2
	public int sumatoriaDeUnNumero(int numeroDeSumatoria) {

		int resultado = 0;
		int i = 1;

		do {

			resultado = resultado + i;

			i++;

		}while (i <= numeroDeSumatoria);

		return resultado;

	}


	// Ejercicio 2.1
	public String devolverSumatoriaEntero(String numeroString) {

		int numero;
		boolean esPositivo;
		String resultado;


		numero = obtenerResultadoTryCatch(numeroString);
		esPositivo = esPositivo(numero);

		if (esPositivo == true) {
			
			numero = sumatoriaDeUnNumero(numero);
			resultado = "#2 Sumatoria con numero final, total: " + numero;

		}else{

			resultado = "Numero es negativo o no es valido";

		}

		return resultado;

	}


	// Ejercicio #3
	public int sumatoriaNumerosImpares(int numeroFinal) {

		int resultado = 0;
		int impar;
		
		for (int i = 0; i < numeroFinal; i++) {
			
			impar = i % 2; 

			if (impar != 0) {

				resultado = resultado + i;

			}

		}

		return resultado;

	}


	// Ejecicio #4
	public void multiplos(int n, int m) {

		int resultado = 0;

		for (int i = 0; i < n; i++) {
			
			resultado = resultado + m;
			System.out.println("Multiplo #" + (i + 1) + ", de " + m + ", es: " + resultado);

		}

	}

	/*********************************************/
	/*                 ADICIONALES               */
	/*********************************************/

	public boolean esPositivo(int numero) {

		boolean resultado = false;

		if (numero >= 0) {
			
			resultado = true;

		}

		return resultado;

	}


	// Sobrecarga: esEntero --> integer
	public boolean esEntero(int numero) { 
        
        boolean resultado;

        if (numero % 1 == 0) { 
           
            resultado = true; 

        } else { 

            resultado = false; 

        }

        return resultado;

    }


    // Sobrecarga: esEntero --> double
   	public boolean esEntero(double numero) {

   		boolean resultado;

        if (numero % 1 == 0) { 
           
            resultado = true; 

        } else { 

            resultado = false; 

        }

        return resultado;

   	}


   	public int obtenerResultadoTryCatch(String valorString) {

		int resultado = 0;

		try{

			resultado = Integer.parseInt(valorString);

		}catch(NumberFormatException e) {

			mensajeDeErrorEntero();

		}

		return resultado;

	}


	public void mensajeDeErrorEntero() {

		System.out.println("Error: no es entero");
		System.out.println(" ");
		System.out.println(" * ------------------ Terminando Sistema -------------- *");
		System.out.println(" * ");
		System.out.println(" * ---------------------- Terminado ------------------- *");
		System.out.println(" ");
		System.exit(1);

	}


}


