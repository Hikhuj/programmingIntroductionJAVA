import javax.swing.JOptionPane;

// Clase base, clase papa
public class FiguraGeometrica {
	
	/* VARIABLES */
	protected String nombre;
	protected char simbolo;

	/* CONSTRUCTOR */
	public FiguraGeometrica (String nombreRecibido, char simboloRecibido) {
		this.nombre = nombreRecibido;
		this.simbolo = simboloRecibido;
	}

	/* METODOS */
	public void setSimbolo() {
		String simboloDigitado = JOptionPane.showInputDialog(null, "Simbolo para utilizar en impresion:");
		char simboloRecibido = simboloDigitado.charAt(0);;
		this.simbolo = simboloRecibido;
	}

	public String getNombre() {
		return nombre;
	}

}