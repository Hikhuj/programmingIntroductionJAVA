/*

	@author-name: Roger Ulate Rivera
	@author-creation-date: 10/28/2017

*/

import javax.swing.JOptionPane;

public class Backend{

	/* INSTANCIAS */
	private StringBuilder palabraCodificada;

	/* VARIABLES */
	private String palabraDeJuego;
	private int intentos = 0;


	public void mensajeInicial() {
		String resultado = " ";
		JOptionPane.showMessageDialog(null, "Bienvenido al juego Ahorcado\nVamos a jugar, empecemos...");
		resultado = JOptionPane.showInputDialog(null, "Alguien que no es el jugador ingresa una palabra, la que sea:");
		setPalabraJuego(resultado);
		codificadorPalabraDeJuego();
	}

	public void mensajeGanador() {
		JOptionPane.showMessageDialog(null, "Excelente, gano!");
	}

	public void imprimirEstadoDePalabra() {
		JOptionPane.showMessageDialog(null, "Estado de palabra a adivinar:\n\"" + palabraCodificada + "\"");
	}

	public void setPalabraJuego(String palabra) {
		this.palabraDeJuego = palabra;
	}

	public String getPalabraJuego() {
		return palabraDeJuego;
	}

	public void codificadorPalabraDeJuego() {
		int resultado = palabraDeJuego.length();
		palabraCodificada = new StringBuilder();
		for (int i = 0; i < resultado; i++) {
			palabraCodificada.append("?");
		}
	}

	public boolean buscarLetraEnPalabra(char letra) {
		boolean resultado = false;
		
		for (int i = 0; i < palabraDeJuego.length(); i++) {
			if (letra == palabraDeJuego.charAt(i)) {
				palabraCodificada.replace(i, i + 1, "" + letra);
				resultado = true;
			}
		}
		return resultado;
	}

	public void aumentarFallos() {
		this.intentos = intentos + 1;
	}

	public int getAumentarFallos() {
		return intentos;
	}

	public boolean comprobarGane() {
		boolean resultado = true;
		for (int i = 0; i < palabraCodificada.length(); i++) {
			if(palabraCodificada.charAt(i) == '?') {
				resultado = false;
			}
		}
		return resultado;
	}

	public char solicitarLetra() {
		String letra = JOptionPane.showInputDialog(null, "Adivinar una letra:");
		char resultado = letra.charAt(0);
		return resultado;
	}

	public void jugar() {

		boolean gane = false;
		boolean encontroLetra;
		mensajeInicial();
		codificadorPalabraDeJuego();
		int fallos;

		do {
			imprimirEstadoDePalabra();
			encontroLetra = buscarLetraEnPalabra(solicitarLetra());
			if (encontroLetra == true) {
				JOptionPane.showMessageDialog(null, "Excelente, a encontrado una letra");
				gane = comprobarGane();
				if (gane == true) {
					mensajeGanador();
					System.exit(1);
				}
			} else {
				aumentarFallos();
				fallos = getAumentarFallos();
				if (fallos == 6) {
					JOptionPane.showMessageDialog(null, "Perdio");
					System.exit(1);
				}
			}

		} while (gane == false);
		
	}

}