import javax.swing.JOptionPane;

public class Menu {

	private String opcionMenuString;
	private int opcionMenu;
	private int turnosJugados = 1;
	private int turnosParaJugar = 9;
	private int delay = 25000;
	private boolean posicionMarcada;
	private boolean marcaValida;
	private boolean jugadorGana;


	Jugador jugador1 = new Jugador();
	Jugador jugador2 = new Jugador();
	Juego juego = new Juego();


	public void getMenu() {

		opcionMenuString = JOptionPane.showInputDialog(null, "Elija un numero correspondiente a una opcion\n1. Jugar de nuevo\n2. Cambiar el Jugador 1\n3. Cambiar el jugador 2\n4. Salir del juego\n(Debe ingresar un valor entero del 1 al 4)");

		try {

			// Convertir el valor de opcionMenu
			opcionMenu = Integer.parseInt(opcionMenuString);

			if(opcionMenu >= 1 && opcionMenu <= 4) {
				setOpcionMenu(opcionMenu);
			}else{
				JOptionPane.showMessageDialog(null, "Opcion de menu fuera de rango, seleccione de nuevo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
				getMenu();
			}

		}catch(NumberFormatException e){

			JOptionPane.showMessageDialog(null, "El valor que ingreso no es un numero, por favor intente de nuevo", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
			System.out.println(" Error al convertir a Entero: Valor ingresado no es numero");
			
			// Si se comenta la siguiente linea y se descomenta getMenu() generara problemas, ya que el usuario si hace click en CANCEL, no podra salir nunca a menos que agrege el valor necesario para salirDeSistema.
			System.exit(1);
			
			// Puede descomentarse la siguiente funcion para hacer que si se equivoca vuelve a llamar al menu, pero debido a esto, si el usuario hace click en CANCEL, nunca saldra a menos que ingrese el valor necesario para salirDelSistema.
			//getMenu();

		}

	}

	private void setOpcionMenu(int opcionMenu) {

		switch (opcionMenu) {

			case 1:
				nuevoJuego();
				break;
			case 2:
				// Cambiar nombre de objeto y establecer estadisticas en 0
				cambiarJugadorUno();
				// Retornar al menu para continuar App
				getMenu();
				break;
			case 3:
				// Cambiar nombre de objeto y establecer estadisticas en 0
				cambiarJugadorDos();
				// Retornar al menu para continuar App
				getMenu();
				break;
			case 4:
				salirJuego();
				break;

		}

	}

	private void nuevoJuego(){

		System.out.println("Iniciando juego");

		JOptionPane.showMessageDialog(null, "Lea las instrucciones que apareceran impresas en la consola,\ntendra 30 segundos para leer", "Antes de comenzar", JOptionPane.ERROR_MESSAGE);

		// Instrucciones de juego
		juego.instruccionesMarcadoDeTablero();
		delayTimer();


		juego.setTablero();

		
		while(turnosJugados <= turnosParaJugar) {

			if((turnosJugados % 2) != 0){

				// Continua jugador 1
				JOptionPane.showMessageDialog(null, "Jugador 1: Su turno, defina las coordenadas para marcar\nPodra ver el tablero de juego en la Consola", "Jugador", JOptionPane.PLAIN_MESSAGE);

				// tablero antes de marcado
				System.out.println("Tablero antes de que " + jugador1.getNombreJugador() + " marque.");
				juego.imprimirTablero(juego.getTablero());
				System.out.println();

				do{

					juego.setFila(jugador1.getNombreJugador());
					juego.setColumna(jugador1.getNombreJugador());
					boolean marcaValida = juego.verificadorDeMarca(jugador1.getValorDeJugador());

					// Mensaje a jugador si la marca ya esta ocupada
					if(marcaValida == false) {

						JOptionPane.showMessageDialog(null, "La marca ya existe.\nDebera volver a intentarlo de nuevo.", "Oops!", JOptionPane.ERROR_MESSAGE);

						turnosJugados = turnosJugados - 1;

					}

				} while (marcaValida != false);

				System.out.println("Tablero despues de que " + jugador1.getNombreJugador() + " marca.");
				juego.imprimirTablero(juego.getTablero());
				System.out.println();


				jugadorGana = juego.determinarSiGana(juego.getTablero(),jugador1.getValorDeGaneJugador());


				if(jugadorGana == true) {

					jugador1.setPartidasGanadas();
					jugador2.setPartidasPerdidas();
					juego.mensajeDeGanador(jugador1.getNombreJugador());

					System.out.println();
					System.out.println("Tablero ganador");
					juego.imprimirTablero(juego.getTablero());
					System.out.println();
					turnosJugados = 1;
					delayTimer();
					getMenu();

				}

			}else{

				// Continua jugador 2
				JOptionPane.showMessageDialog(null, "Jugador 2: Su turno, defina las coordenadas para marcar\nPodra ver el tablero de juego en la Consola", "Jugador", JOptionPane.PLAIN_MESSAGE);

				// tablero antes de marcado
				System.out.println("Tablero antes de que " + jugador2.getNombreJugador() + " marque.");
				juego.imprimirTablero(juego.getTablero());
				System.out.println();


				do{

					juego.setFila(jugador2.getNombreJugador());
					juego.setColumna(jugador2.getNombreJugador());
					boolean marcaValida = juego.verificadorDeMarca(jugador2.getValorDeJugador());

					// Mensaje a jugador si la marca ya esta ocupada
					if(marcaValida == false) {

						JOptionPane.showMessageDialog(null, "La marca ya existe.\nDebera volver a intentarlo de nuevo.", "Oops!", JOptionPane.ERROR_MESSAGE);

						turnosJugados = turnosJugados - 1;

					}

				} while (marcaValida != false);

				System.out.println("Tablero despues de que " + jugador2.getNombreJugador() + " marca.");
				juego.imprimirTablero(juego.getTablero());
				System.out.println();


				jugadorGana = juego.determinarSiGana(juego.getTablero(),jugador2.getValorDeGaneJugador());


				if(jugadorGana == true) {

					jugador2.setPartidasGanadas();
					jugador1.setPartidasPerdidas();
					juego.mensajeDeGanador(jugador2.getNombreJugador());

					System.out.println();
					System.out.println("Tablero ganador");
					juego.imprimirTablero(juego.getTablero());
					System.out.println();
					turnosJugados = 1;
					delayTimer();
					getMenu();

				}

			}

			turnosJugados++;

		}

		// Si se llega a este punto: aumentar Empates a jugador1 y jugador2

		// testear quitando o manteniendo la siguiente linea
		turnosJugados = 1;
		jugador1.setPartidasEmpatadas();
		jugador2.setPartidasEmpatadas();

	}


	private void cambiarJugadorUno() {
		
		// Nombrede Jugador 1 cuando comienza el sistema
		System.out.println("Nombre de Jugador 1 al iniciar sistema: " + jugador1.getNombreJugador());
		
		// Obtener el nuevo nombre del objeto
		String nombreDeJugador1 = JOptionPane.showInputDialog(null, "Nombre nuevo de jugador 1:");

		// Evalua si el nombre esta vacio
		if((nombreDeJugador1 == null) || (nombreDeJugador1.isEmpty())) {

			JOptionPane.showMessageDialog(null, "No ingreso un nombre valido o no ingreso un nombre para Jugador 1", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
			cambiarJugadorUno();

		}else {

			// Objeto se reseteara valores numericos en 0 y nombre a el ingresado en la line a anterior
			jugador1 = new Jugador(nombreDeJugador1, 0, 0, 0);

			// Historial para consola, imprime el jugador almacenado en el objeto
			System.out.println("Nombre nuevo de jugador 1 en DB es: " + jugador1.getNombreJugador());

		}

	}

	private void cambiarJugadorDos() {
		
		// Nombrede Jugador 2 cuando comienza el sistema
		System.out.println("Nombre de Jugador 2 al iniciar sistema: " + jugador2.getNombreJugador());

		// Obtener el nuevo nombre del objeto
		String nombreDeJugador2 = JOptionPane.showInputDialog(null, "Nombre nuevo de jugador 2:");

		// Evalua si el nombre esta vacio
		if((nombreDeJugador2 == null) || (nombreDeJugador2.isEmpty())) {

			JOptionPane.showMessageDialog(null, "No ingreso un nombre valido o no ingreso un nombre para Jugador 2", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
			cambiarJugadorDos();

		}else {

			// Objeto se reseteara valores numericos en 0 y nombre a el ingresado en la line a anterior
			jugador2 = new Jugador(nombreDeJugador2, 0, 0, 0);

			// Historial para consola, imprime el jugador almacenado en el objeto
			System.out.println("Nombre nuevo de jugador 2 en DB es: " + jugador2.getNombreJugador());

		}
	
	}

	private void salirJuego() {
		
		System.exit(1);

	}

	public void mensajeBienvenida() {
		
		JOptionPane.showMessageDialog(null, "Bienvenidos al juego de Gato", "Lab: 10 - Juego Gato", JOptionPane.INFORMATION_MESSAGE);
	
	}

	private void delayTimer() {

		try{
			Thread.sleep(this.delay);
		}catch(InterruptedException e){
			System.out.println(e);
		}

	}

	public void establecerJugadores() {

		// Preparacion de jugador 1
		// cambiarJugadorUno();
		jugador1 = new Jugador("Jugador 1");
		
		// Establece el valor del jugador para marcar
		jugador1.setValorDeJugador(1);

		// Establece el valor para ganar del jugador
		jugador1.setValorDeGaneJugador(3);

		// Preparacion de jugador 2
		// cambiarJugadorDos();
		jugador2 = new Jugador("Jugador 2");
		
		// Establece el valor del jugador para marcar
		jugador2.setValorDeJugador(5);

		// Establece el valor para ganar del jugador
		jugador2.setValorDeGaneJugador(15);

	}

}