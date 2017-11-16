public class BackendCalculadora {
	
	private int valorUno;
	private int valorDos;
	private int reSuma;
	private int reResta;
	private int reMultiplicacion;
	private int reDivision;
	private int reAreaTriangulo;

	public void setValorUno(int valor1) {
		this.valorUno = valor1;
	}

	public void setOperacionSuma(int valor1, int valor2) {
		int resultado = 0;
		resultado = valor1 + valor2;
		this.reSuma = resultado;
	}

	public void setOperacionResta(int valor1, int valor2) {
		int resultado = 0;
		resultado = valor1 - valor2;
		this.reResta = resultado;
	}

	public void setOperacionMultiplicacion(int valor1, int valor2) {
		int resultado = 0;
		resultado = valor1 * valor2;
		this.reMultiplicacion = resultado;
	}

	public void setOperacionDivision(int valor1, int valor2) {
		int resultado = 0;
		resultado = valor1 / valor2;
		this.reDivision = resultado;
	}

	public void setAreaTriangulo(int valor1, int valor2) {
		int resultado = 0;
		resultado = valor1 * valor2;
		this.reAreaTriangulo = resultado / 2;
	}

	public int getOperacionSuma() {
		return reSuma;
	}

	public int getOperacionResta() {
		return reResta;
	}

	public int getOperacionMultiplicacion() {
		return reMultiplicacion;
	}

	public int getOperacionDivision() {
		return reDivision;
	}

	public int getAreaTriangulo() {
		return reAreaTriangulo;
	}

	public void salirSistema() {
		System.exit(1);
	}

}