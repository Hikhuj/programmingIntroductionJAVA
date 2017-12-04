import javax.swing.JOptionPane;

public class TrianguloRectangulo extends FiguraGeometrica{
	
	/* VARIABLES */
	private int base;
	private int altura;
	private int hipotenusa;

	/* CONSTRUCTOR */
	public TrianguloRectangulo(String nombreRecibido, char simboloRecibido, int base, int altura, int hipotenusa) {
		super(nombreRecibido, simboloRecibido);
		this.base = base;
		this.altura = altura;
		this.hipotenusa = hipotenusa;
	}

	/* METODOS */
	public int calcularPerimetro() {
		int resultado = this.base + this.altura + this.hipotenusa;
		return resultado;
	}

	public int calcularArea() {
		int resultado = (this.base * this.altura) / 2;
		return resultado;
	}

	public void solicitarDato() {
		int baseDeTrianguloRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Base de triangulo rectangulo?"));
		int alturaDeTrianguloRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura de triangulo rectangulo?"));
		int hipotenusaDeTrianguloRec = Integer.parseInt(JOptionPane.showInputDialog(null, "Hipotenusa de triangulo rectangulo?"));
		this.base = baseDeTrianguloRec;
		this.altura = alturaDeTrianguloRec;
		this.hipotenusa = hipotenusaDeTrianguloRec;
	}

	public void imprimirFigura() {
		System.out.println("Nombre de figura:" + super.nombre);
		for (int i = 0; i < this.base; i++) {
			for (int j = 0; j < this.altura; j++) {
				System.out.println(super.simbolo);
			}
			System.out.println("\t");
		}
	}

}