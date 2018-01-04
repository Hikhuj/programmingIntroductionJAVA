public class ClasificadorDeProduccion {

	public static void main (String [] args) {

		InterfazClasificador interfaz = new InterfazClasificador();

		//interfaz.cantidadDeMaquinas();
		//interfaz.setProduccionDiariaCadaMaquina();
		interfaz.cargarRegistroDeMaquinasporCSV();
		interfaz.setIndiceProduccionM();
		interfaz.setIndiceProduccionF();
		interfaz.generarCantidadDeMaquinas();
		interfaz.generarClasificacionDeCadaMaquina();

	}

}