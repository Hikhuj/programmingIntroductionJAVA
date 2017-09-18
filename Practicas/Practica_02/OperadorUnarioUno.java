public class OperadorUnarioUno {
	
	public static void main(String[] args) {

		int x = 4;
		System.out.println("Variable x antes de modificarse: " + x);
		int y = (x++ * 5) / 3;
		System.out.println("Variable x despues de modificarse: " + x);
		System.out.println("Variable y total: " + y);

		// Comentario

	}

} 