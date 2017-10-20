public class Jugador {
	
	/*** Lista de variables ***/
	private String nombreJugador;
	private int partidasGanadas;
	private int partidasPerdidas;
	private int partidasEmpatadas;
	private int valorDeJugador;
	private int valorDeGaneJugador;

	/**** Constructores ****/
	// Constructor predeterminado
	public Jugador() {
		this.nombreJugador = null;
		this.partidasGanadas = 0;
		this.partidasPerdidas = 0;
		this.partidasEmpatadas = 0;
	}

	public Jugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
		this.partidasGanadas = 0;
		this.partidasPerdidas = 0;
		this.partidasEmpatadas = 0;
	}

	// Constructor personalizado
	public Jugador(String nombreJugador, int partidasGanadas, int partidasPerdidas, int partidasEmpatadas) {
		this.nombreJugador = nombreJugador;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
		this.partidasEmpatadas = partidasEmpatadas;
	}


	/*** Metodos ***/
	public void setNombreJugador(String nombreJugador) {

		this.nombreJugador = nombreJugador;

	}

	public String getNombreJugador(){

		return nombreJugador;

	}

	public void setPartidasGanadas() {

		this.partidasGanadas = partidasGanadas + 1;

	}

	public int getPartidasGanadas() {

		return partidasGanadas;

	}

	public void setPartidasPerdidas() {

		this.partidasPerdidas = partidasPerdidas + 1;

	}

	public int getPartidasPerdidas() {

		return partidasPerdidas;

	}

	public void setPartidasEmpatadas() {

		this.partidasEmpatadas = partidasEmpatadas + 1;

	}

	public int getPartidasEmpatadas() {

		return partidasEmpatadas;

	}

	public void setValorDeJugador(int valorDeJugador) {

		this.valorDeJugador = valorDeJugador;

	}

	public int getValorDeJugador() {

		return valorDeJugador;

	}

	public void setValorDeGaneJugador(int valorDeGaneJugador) {

		this.valorDeGaneJugador = valorDeGaneJugador;

	}

	public int getValorDeGaneJugador() {

		return valorDeGaneJugador;

	}

}