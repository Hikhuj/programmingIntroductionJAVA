import javax.swing.JOptionPane;

public class Juego {

	private int[][] tableroJuego;
	private int filas = 3;
	private int columnas = filas;
	private String filaString;
	private String columnaString;
	private int fila;
	private int columna;

	
	public void setTablero() {

		this.tableroJuego = new int[filas][columnas];

	}

	public int[][] getTablero() {

		return tableroJuego;

	}
	
	public void setFila(String nombreDeJugador) {

		filaString = JOptionPane.showInputDialog(null, nombreDeJugador + ": Ingrese el numero de linea");

		try {

			fila = Integer.parseInt(filaString);

			if(fila >= 0 && fila <= (filas - 1)) {

				this.fila = fila;

			}else{

				JOptionPane.showMessageDialog(null, "Numero de fila fuera de rango", "Fuera de Rango", JOptionPane.ERROR_MESSAGE);
				setFila(nombreDeJugador);

			}

		}catch(NumberFormatException e){

			JOptionPane.showMessageDialog(null, "Numero de fila no valido, intente de nuevo", "No Valido", JOptionPane.ERROR_MESSAGE);
			System.out.println("Jugador 1: Error al convertir a Entero: Valor ingresado no es numero");
			setFila(nombreDeJugador);

		}

	}

	public void setColumna(String nombreDeJugador) {

		columnaString = JOptionPane.showInputDialog(null, nombreDeJugador + ": Ingrese el numero de columna");

		try {

			// Convertir
			columna = Integer.parseInt(columnaString);

			if(columna >= 0 && columna <= (columnas - 1)) {

				this.columna = columna;

			}else{
				
				JOptionPane.showMessageDialog(null, "Numero de columna fuera de rango", "Fuera de Rango", JOptionPane.ERROR_MESSAGE);
				setColumna(nombreDeJugador);

			}

		}catch(NumberFormatException e){

			JOptionPane.showMessageDialog(null, "Numero de columna no valido, intente de nuevo", "No Valido", JOptionPane.ERROR_MESSAGE);
			System.out.println(" Error al convertir a Entero: Valor ingresado no es numero");
			setColumna(nombreDeJugador);

		}

	}

	public boolean verificadorDeMarca(int valorDeJugador) {

		boolean resultado = true;
		int filaDeJugador = getFila();
		int columnaDeJugador = getColumna();

		if (tableroJuego[filaDeJugador][columnaDeJugador] == 0){

			marcar(filaDeJugador, columnaDeJugador, valorDeJugador);

		}else{

			resultado = false;

		}

		return resultado;

	}

	private void marcar(int filaDeJugador, int columnaDeJugador, int valorDeJugador) {

		tableroJuego[filaDeJugador][columnaDeJugador] = valorDeJugador;

	}

	public int getFila() {

		return fila;

	}

	public int getColumna() {

		return columna;

	}

	public void instruccionesMarcadoDeTablero() {

		// Instrucciones basicas de juego
		System.out.println();
		System.out.println("<-------------------------------------------------------------------------------------------------------------->");
		System.out.println();
		System.out.println("Los numeros del costado izquierdo del tablero\nson las coordenadas de filas del tablero");
		System.out.println();
		System.out.println("Los numeros arriba del tablero\nson las coordenadas de columnas del tablero");
		System.out.println();
		System.out.println("Las coordenadas deberan ingresarse en ese mismo orden,\nprimero el numero de Fila, seguido del numero de Columna");
		System.out.println();
		System.out.println("        0  1  2");
		System.out.println("0 --> |  |  |  |");
		System.out.println("1 --> |  |  |  |");
		System.out.println("2 --> |  |  |  |");
		System.out.println();
		System.out.println("<-------------------------------------------------------------------------------------------------------------->");
		System.out.println();

	}

	public void imprimirTablero(int [][] tableroJuego) {

		for (int i = 0; i < tableroJuego.length; i++) {
			System.out.println();
			System.out.print("|");
			for (int j = 0; j < tableroJuego[i].length; j++) {

				if(tableroJuego[i][j] == 0) {

					System.out.print(" " + "|");

				}

				if(tableroJuego[i][j] == 1) {

					System.out.print("X" + "|");

				}

				if(tableroJuego[i][j] == 5) {

					System.out.print("O" + "|");

				}

			}
		}
		System.out.println();
		System.out.println();

	}

	// Metodo interno de clase
	private boolean evaluarFilas(int [][] tableroJuego, int valorDeGaneJugador) {
		
		// La variable valorDeGaneJugador es el valor entero que se pondra a nive logico en la matriz.
		// Jugador 1 = 1, Jugador 2 = 5;
		// Si al evaluar, suma 3, Jugador 1 gana
		// Si al evaluar, suma 15, jugador 2 gana
		boolean resultado = false;
		
		for(int i = 0; i < tableroJuego.length; i++) {
			int sumaLinea = 0;
			for(int j = 0; j < tableroJuego[i].length; j++) {
				sumaLinea = sumaLinea + tableroJuego[i][j];
			}
			if(sumaLinea == valorDeGaneJugador) {
				resultado = true;
			}
		}
		return resultado;

	}

	// Metodo interno de clase
	private boolean evaluarColumnas(int [][] tableroJuego, int valorDeGaneJugador) {
		boolean resultado = false;

		for (int i = 0 ; i < tableroJuego.length ; i++) {
    		int sumaColumna = 0;
    		for (int j = 0 ; j < tableroJuego[i].length; j++) {
        		sumaColumna += tableroJuego[j][i]; 
    		}
    		if(sumaColumna == valorDeGaneJugador) {
				resultado = true;
			}
		}

		return resultado;

	}

	// Metodo interno de clase
	private boolean evaluarDiagonalIzquierda(int [][] tableroJuego, int valorDeGaneJugador){

		boolean resultado = false;
		int sumaDiagonalIzquierda = 0;

		for (int i = 0; i < tableroJuego.length; i++) {
			sumaDiagonalIzquierda += tableroJuego[i][i];
		}
		
		if(sumaDiagonalIzquierda == valorDeGaneJugador) {
			resultado = true;
		}

		return resultado;

	}

	// Metodo interno de clase
	private boolean evaluarDiagonalDerecha(int [][] tableroJuego, int valorDeGaneJugador) {

		boolean resultado = false;
		int sumaDiagonalDerecha = 0;

		for (int i = 0; i < tableroJuego.length; i++) {
			sumaDiagonalDerecha += tableroJuego[i][tableroJuego.length - i - 1];
		}

		if(sumaDiagonalDerecha == valorDeGaneJugador) {
			resultado = true;
		}

		return resultado;

	}

	public boolean determinarSiGana(int [][]tableroJuego, int valorDeGaneJugador) {

		boolean resultado = false;
		String formatoDeJugada = "";
		boolean evaluacionDeFilas = evaluarFilas(tableroJuego, valorDeGaneJugador);
		boolean evaluacionDeColumnas = evaluarColumnas(tableroJuego, valorDeGaneJugador);
		boolean evaluacionDeDiagonalIzquierda = evaluarDiagonalIzquierda(tableroJuego, valorDeGaneJugador);
		boolean evaluacionDeDiagonalDerecha = evaluarDiagonalDerecha(tableroJuego, valorDeGaneJugador);


		if(evaluacionDeFilas == true || evaluacionDeColumnas == true || evaluacionDeDiagonalIzquierda == true || evaluacionDeDiagonalDerecha == true){

			resultado = true;

		}

		return resultado;

	}

	public void mensajeDeGanador(String nombreDeJugador) {

		JOptionPane.showMessageDialog(null, "Excelente, " + nombreDeJugador + " gano esta partida.", "Felicidades", JOptionPane.PLAIN_MESSAGE);

	}

}