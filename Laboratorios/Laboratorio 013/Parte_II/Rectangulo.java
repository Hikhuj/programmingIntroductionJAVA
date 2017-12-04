import javax.swing.JOptionPane;

public class Rectangulo extends FiguraGeometrica{
	
	/* VARIABLES */
	private int largo;
	private int ancho;

	/* CONSTRUCTOR */
	public Rectangulo(String nombreRecibido, char simboloRecibido, int largo, int ancho) {
		super(nombreRecibido, simboloRecibido);
		this.largo = largo;
		this.ancho = ancho;
	}

	/* METODOS */
	public int calcularPerimetro() {
		int resultado = this.largo + this.largo + this.ancho + this.ancho;
		return resultado;
	}

	public int calcularArea() {
		int resultado = this.largo * this.ancho;
		return resultado;
	}

	public void solicitarDato() {
		int baseDeTrianguloRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Ancho de rectangulo?"));
		int alturaDeTrianguloRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Largo de rectangulo?"));
		this.ancho = baseDeTrianguloRec;
		this.largo = alturaDeTrianguloRec;
	}

	public void imprimirFigura() {
		System.out.println("Nombre de figura:" + super.nombre);
		for (int i = 0; i < this.ancho; i++) {
			for (int j = 0; j < this.largo; j++) {
				System.out.println(super.simbolo);
			}
			System.out.println("\n");
		}
	}

}