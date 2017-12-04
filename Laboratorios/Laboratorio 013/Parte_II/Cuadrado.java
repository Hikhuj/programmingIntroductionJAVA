import javax.swing.JOptionPane;

public class Cuadrado extends FiguraGeometrica{
	
	/* VARIABLES */
	private int lado;


	/* CONSTRUCTOR */
	public Cuadrado(String nombreRecibido, char simboloRecibido, int lado) {
		super(nombreRecibido, simboloRecibido);
		this.lado = lado;
	}

	/* METODOS */

	public int calcularPerimetro() {
		int resultado = 4 * this.lado;
		return resultado;
	}

	public int calcularArea() {
		int resultado = this.lado * this.lado;
		return resultado;
	}

	public void solicitarDato() {
		int ladoDeCuadrado = Integer.parseInt(JOptionPane.showInputDialog(null, "Medida de un solo lado del cuadrado?"));
		this.lado = ladoDeCuadrado;
	}

	public void imprimirFigura() {
		System.out.println("Nombre de figura:" + super.nombre);
		for (int i = 0; i < this.lado; i++) {
			for (int j = 0; j < this.lado; i++) {
				System.out.println(super.simbolo);
			}
			System.out.println("\n");
		}
	}

}