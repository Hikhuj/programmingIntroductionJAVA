public class ejercicioDos {
	
	public static void main (String[] args){

		Loro loro = new Loro();
		Loro loro2 = new Loro();

		String resultadoLoro;
		String resultadoLoro2;

		String nombreLoro = "Roger";
		String nombreLoro2 = "Jose";

		loro.bautizarLoro(nombreLoro);
		loro2.bautizarLoro(nombreLoro2);

		loro.decirNombre();
		loro2.decirNombre();

	}

}