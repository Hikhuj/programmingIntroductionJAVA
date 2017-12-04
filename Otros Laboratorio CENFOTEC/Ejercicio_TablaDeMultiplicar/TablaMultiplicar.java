public class TablaMultiplicar {

	public void tablaDeMultiplicar(int numeroDeTabla) {

		for (int i = 1; i <= 9; i++) {
			System.out.println(numeroDeTabla + " x " + i + " = " + (numeroDeTabla * i));
		}

	}

	public static void main (String [] args) {

		TablaMultiplicar moduloMultiplicar = new TablaMultiplicar();
		
		int valor = 9;

		moduloMultiplicar.tablaDeMultiplicar(valor);

	}

}