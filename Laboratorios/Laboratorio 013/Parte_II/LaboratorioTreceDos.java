import javax.swing.JOptionPane;

public class LaboratorioTreceDos {

	public static void main(String[] args) {

		/* INSTANCIAS */
		TrianguloRectangulo triRec = new TrianguloRectangulo("Triangulo Rectangulo", '+', 5, 4, 10);
		Rectangulo rec = new Rectangulo("Rectangulo", '+', 5, 10);
		Cuadrado cua = new Cuadrado("Cuadrado", '+', 5);
		FiguraGeometrica figGeo = new FiguraGeometrica("Figura", '+');

		FiguraGeometrica [] arregloDeFiguras = new FiguraGeometrica[4];
		arregloDeFiguras[0] = cua;
		arregloDeFiguras[1] = triRec;
		arregloDeFiguras[2] = rec;
		arregloDeFiguras[3] = figGeo;

		int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Usted posee tres opciones a elegir \n0. Cuadrado\n1. TrianguloRectangulo\n2. Rectangulo\n3. Cambiar simbolo de figura geometrica"));
		
		switch (valor) {
		case 0:
			int resultadoPerimetroCua = cua.calcularPerimetro();
			int resultadoAreaCua = cua.calcularArea();
			cua.imprimirFigura();
			break;
		case 1:
			int resultadoPerimetroTriRec = triRec.calcularPerimetro();
			int resultadoAreaTriRec = triRec.calcularArea();
			triRec.imprimirFigura();
			break;
		case 2:
			int resultadoPerimetroRec = rec.calcularPerimetro();
			int resultadoAreaRec = rec.calcularArea();
			rec.imprimirFigura();
			break;
		case 3:
			break;
		}
		
	}

}