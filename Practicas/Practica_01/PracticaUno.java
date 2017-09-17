public class PracticaUno {
	
	public static void main(String[] args) {

		// Instancias
		Futbolista jugador = new Futbolista();


		// Variables predeterminadas
		String nombreJugador = "Roger";
		String apellido1Jugador = "Ulate";
		String apellido2Jugador = "Rivera";
		int cedulaJugador = 1234567;
		String posicionDeJuegoJugador = "Delantero";
		int edadJugador = 24;
		int nivelAcondicionamientoJugador = 3;
		double pesoKgJugador = 70.5;
		double estaturaMtrsJugador = 1.60;
		char generoJugador = 'M';
		boolean amarillasAcumuladasJugador = true;


		// Variables para usar
		String resultadoNombreJugador;
		String resultadoApellido1Jugador;
		String resultadoApellido2Jugador;
		int resultadoCedulaJugador;
		String resultadoPosicionDeJuegoJugador;
		int resultadoEdadJugador;
		int resultadoNivelAcondicionamientoJugador;
		double resultadoPesoKgJugador;
		double resultadoEstaturaMtrsJugador;
		char resultadoGeneroJugador;
		boolean resultadoAmarillasAcumuladasJugador;


		// guardar los datos preguntados
		jugador.setNombre(nombreJugador);
		jugador.setApellido1(apellido1Jugador);
		jugador.setApellido2(apellido2Jugador);
		jugador.setCedula(cedulaJugador);
		jugador.setPosicionJuego(posicionDeJuegoJugador);
		jugador.setEdad(edadJugador);
		jugador.setNivelAcondicionamiento(nivelAcondicionamientoJugador);
		jugador.setPesoKg(pesoKgJugador);
		jugador.setEstaturaMtrs(estaturaMtrsJugador);
		jugador.setGenero(generoJugador);
		jugador.setAmarillasAcumuladas(amarillasAcumuladasJugador);


		// Obtener los datos 
		resultadoNombreJugador = jugador.getNombre();
		System.out.println(resultadoNombreJugador);

		resultadoApellido1Jugador = jugador.getApellido1();
		System.out.println(resultadoApellido1Jugador);

		resultadoApellido2Jugador = jugador.getApellido2();
		System.out.println(resultadoApellido2Jugador);

		resultadoCedulaJugador = jugador.getCedula();
		System.out.println(resultadoCedulaJugador);

		resultadoPosicionDeJuegoJugador = jugador.getPosicionJuego();
		System.out.println(resultadoPosicionDeJuegoJugador);

		resultadoEdadJugador = jugador.getEdad();
		System.out.println(resultadoEdadJugador);

		resultadoNivelAcondicionamientoJugador = jugador.getNivelAcondicionamiento();
		System.out.println(resultadoNivelAcondicionamientoJugador);

		resultadoPesoKgJugador = jugador.getPesoKg();
		System.out.println(resultadoPesoKgJugador);

		resultadoEstaturaMtrsJugador = jugador.getEstaturaMtrs();
		System.out.println(resultadoEstaturaMtrsJugador);

		resultadoGeneroJugador = jugador.getGenero();
		System.out.println(resultadoGeneroJugador);

		resultadoAmarillasAcumuladasJugador = jugador.getAmarillasAcumuladas();
		System.out.println(resultadoAmarillasAcumuladasJugador);

	}

}