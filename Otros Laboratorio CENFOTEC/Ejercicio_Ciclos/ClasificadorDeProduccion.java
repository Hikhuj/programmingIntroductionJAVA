public class ClasificadorDeProduccion {

	public static void main (String [] args) {

		InterfazClasificador interfaz = new InterfazClasificador();

		//interfaz.cantidadDeMaquinas();
		//interfaz.setProduccionDiariaCadaMaquina();
		interfaz.cargarRegistroDeMaquinasPorCSV();
		interfaz.setIndiceProduccionM();
		interfaz.setIndiceProduccionF();
		interfaz.mostrarCantidadDeMaquinas();
		interfaz.generarProduccionSemanalMaquinas();
		interfaz.imprimirProduccionSemanalMaquinas();
		interfaz.generarClasificacionMaquinasPorProduccion();
		interfaz.imprimirClasificacionMaquinasPorProduccion();
		System.exit(1);

	}

}