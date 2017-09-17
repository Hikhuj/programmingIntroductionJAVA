public class Futbolista {
	
	// Atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int cedula;
	private String posicionDeJuego;
	private int edad;
	private int nivelAcondicionamiento;
	private double pesoKg;
	private double estaturaMtrs;
	private char genero;
	private boolean amarillasAcumuladas;


	// Metodos
	public Futbolista() {

		nombre = null;
		apellido1 = null;
		apellido2 = null;
		cedula = 0000000;
		posicionDeJuego = null;
		edad = 0;
		nivelAcondicionamiento = 0;
		pesoKg = 0.0;
		estaturaMtrs = 0.00;
		genero = 'N';
		amarillasAcumuladas = false;

	}

	public Futbolista(String nombre,
						String apellido1,
						String apellido2, 
						int cedula,
						String posicionDeJuego,
						int edad,
						int nivelAcondicionamiento,
						double pesoKg,
						double estaturaMtrs,
						char genero,
						boolean amarillasAcumuladas) {

		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.cedula = cedula;
		this.posicionDeJuego = posicionDeJuego;
		this.edad = edad;
		this.nivelAcondicionamiento = nivelAcondicionamiento;
		this.pesoKg = pesoKg;
		this.estaturaMtrs = estaturaMtrs;
		this.genero = genero;
		this.amarillasAcumuladas = amarillasAcumuladas;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return nombre;

	}

	public void setApellido1(String apellido1) {

		this.apellido1 = apellido1;

	}

	public String getApellido1() {

		return apellido1;

	}

	public void setApellido2(String apellido2) {

		this.apellido2 = apellido2;

	}

	public String getApellido2() {

		return apellido2;

	}

	public void setCedula(int cedula) {

		this.cedula = cedula;

	}

	public int getCedula() {

		return cedula;

	}

	public void setPosicionJuego(String posicionDeJuego) {

		this.posicionDeJuego = posicionDeJuego;

	}

	public String getPosicionJuego() {

		return posicionDeJuego;

	}

	/*
		La edad solo puede ser enteros y unicamente hasta 3 cifras
	*/
	public void setEdad(int edad) {

		this.edad = edad;

	}

	public int getEdad() {

		return edad;

	}

	/*
		Nivel de Acondicionamiento debe ser una escala de
		0 = pesima
		a
		10 = excelente
	*/
	public void setNivelAcondicionamiento(int nivelAcondicionamiento) {

		this.nivelAcondicionamiento = nivelAcondicionamiento;

	}

	public int getNivelAcondicionamiento() {

		return nivelAcondicionamiento;

	}

	public void setPesoKg(double pesoKg) {

		this.pesoKg = pesoKg;

	}

	public double getPesoKg() {

		return pesoKg;

	}

	public void setEstaturaMtrs(double estaturaMtrs) {

		this.estaturaMtrs = estaturaMtrs;

	}

	public double getEstaturaMtrs() {

		return estaturaMtrs;

	}

	public void setGenero(char genero) {

		this.genero = genero;

	}

	public char getGenero() {

		return genero;

	}

	public void setAmarillasAcumuladas(boolean amarillasAcumuladas) {

		this.amarillasAcumuladas = amarillasAcumuladas;

	}

	public boolean getAmarillasAcumuladas() {

		return amarillasAcumuladas;

	}

}