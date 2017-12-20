public class BackEnd {

	/* ATRIBUTOS */
	private int [][] controlProduccionMaquinas;
	private int cantidadMaquinas;
	private int cantidadDiasTrabajo = 5;
	private int indicePM;
	private int indicePF;
	private String [] clasificacionDeCadaMaquina;
	private int [] produccionSemanalCadaMaquina;
	private int maquinaMayorProduccionCantidad;
	private String maquinaMayorProduccionNombre;
	private String clasificacionFabrica;


	/* METODOS */
	public void setCantidadMaquinas(int numero) {

		this.cantidadMaquinas = numero;

	}

	public int getCantidadMaquinas() {

		return cantidadMaquinas;

	}

	public int getCantidadDiasTrabajables() {

		return cantidadDiasTrabajo;

	}

	public void setIndicePM(int numero) {

		this.indicePM = numero;

	}

	public int getIndicePM() {

		return indicePM;

	}

	public void setIndicePF(int numero) {

		this.indicePF = numero;

	}

	public int getIndicePF() {

		return indicePF;

	}

	public void setClasificarCadaMaquina() {
		
		String [] resultado = new String[cantidadMaquinas];

		for (int i = 0; i < produccionSemanalCadaMaquina.length; i++) {
			if (produccionSemanalCadaMaquina[i] > indicePM) {
				resultado[i] = "Excelente";
			}else if(produccionSemanalCadaMaquina[i] == indicePM) {
				resultado[i] = "Buena";
			}else {
				resultado[i] = "Deficiente";
			}
		}

		this.clasificacionDeCadaMaquina = resultado;

	}

	public String[] getClasificarCadaMaquina() {

		return clasificacionDeCadaMaquina;

	}

	public void setProduccionSemanalCadaMaquina() {

		int [] resultado = new int[cantidadMaquinas];
		int produccionSemanal = 0;

		for (int i = 0; i < controlProduccionMaquinas.length; i ++) {
			for (int j = 0; j < controlProduccionMaquinas[i].length; j++) {
				produccionSemanal += controlProduccionMaquinas[i][j];
			}
			resultado[i] = produccionSemanal;
			produccionSemanal = 0;
		}

		this.produccionSemanalCadaMaquina = resultado;

	}

	public int [] getProduccionSemanalCadaMaquina() {

		return produccionSemanalCadaMaquina;

	}

	public void setMaquinaMayorProduccion() {

		int cantidadMayor = 0;
		String nombreMaquinaCantidadMayor = " ";

		for (int i = 0; i < produccionSemanalCadaMaquina.length; i++) {
			if (produccionSemanalCadaMaquina[i] > cantidadMayor) {
				cantidadMayor = produccionSemanalCadaMaquina[i];
				nombreMaquinaCantidadMayor = " " + produccionSemanalCadaMaquina[i];
			}
		}

		this.maquinaMayorProduccionCantidad = cantidadMayor;
		this.maquinaMayorProduccionNombre = nombreMaquinaCantidadMayor;

	}

	public int getMaquinaMayorProduccionCantidad() {

		return maquinaMayorProduccionCantidad;

	}

	public String getMaquinaMayorProduccionNombre() {

		return maquinaMayorProduccionNombre;

	}

	public void setControlProduccionMaquinas(int [][] produccionDeMaquinas) {

		this.controlProduccionMaquinas = produccionDeMaquinas;

	}

	public int [][] getControlProduccionMaquinas() {

		return controlProduccionMaquinas;

	}

}