

import java.io.*;
import java.util.*;


public class IUAlquilerPeliculas{

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream out = System.out;	// variables objetos in y out
	static AlquilerPeliculasRutinas rutinas = new AlquilerPeliculasRutinas();
	static String[][] listaEstadosAfiliado = {
												{ "0", "Inactivo" },
												{ "1", "Activo" }
											 };

	static String[][] listaTiposPelicula = {
												{ "0", "Accion" },
												{ "1", "Todo Publico" },
												{ "2", "Comedia" } ,
												{ "3", "Super Heroes" }
										   };

	static String[][] listaEstadosEjemplar = {
												{ "0", "Disponible" },
												{ "1", "Alquilado" },
												{ "2", "Reparacion" }
											 };

	static String[][] listaFormatosEjemplar = {
												{ "0", "DVD" },
												{ "1", "Blu-ray" }
											  };

	static String[][] afiliadosPrueba = {
		{ "1-2038-9438", "Jon", "Snow", "0000-0000", "0" },
		{ "1-4233-7343", "Mary", "Watson", "9999-9999", "0" },
		{ "1-7947-2366", "Elizabeth", "Taylor", "8888-8888", "0" },
		{ "1-2387-4377", "Jason", "Moore", "7777-7777", "1" },
		{ "1-3838-2827", "Pedro", "Avila", "5555-5555", "0" },
		{ "1-2394-0298", "Domingo", "Rodriguez", "4444-4444", "0" },
		{ "1-5736-2736", "Maria", "Paloma", "3333-3333", "0" },
		{ "1-2387-1983", "El", "Chapo", "2222-2222", "1" },
		{ "1-5937-2083", "Jose", "Maria", "1111-1111", "0" }
	};


	static String[][] peliculasPrueba = { // Titulo Pelicula, Tipo de Pelicula, Total de Ejemplares, Ejemplares Disponibles
		{ "SuperNam", "0", "100", "50" },
		{ "Batnam", "1", "150", "120" },
		{ "Los 5 Fantasticos", "2", "80", "75" },
		{ "La Mujer que Maravilla", "3", "100", "100" },
		{ "El Capitan de America", "0", "50", "20" },
		{ "Linterna Fosforescente", "1", "120", "80" },
		{ "Charco de Muerte", "2", "100", "20" },
		{ "El Herrero de Hierro", "3", "120", "110" },
		{ "Batnam vs. SuperNam", "0", "100", "50" },
		{ "Los bichos X", "1", "30", "30" },
		{ "Actividad Subnormal", "2", "40", "0" }
	};

	static String[][] ejemplaresPrueba = {  // Estado, Formato
		{ "0", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" },
		{ "0", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" },
		{ "0", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" },
		{ "0", "2" },
		{ "1", "1" },
		{ "0", "0" },
		{ "0", "1" },
		{ "1", "2" }
	};

	static int[][] alquileresPrueba = { // ID del Afiliado, ID de la Pelicula, ID del Ejemplar
		{ 0, 1, 0 },
		{ 1, 5, 1 },
		{ 2, 3, 2 },
		{ 3, 6, 3 },
		{ 4, 2, 4 },
		{ 5, 5, 5 },
		{ 6, 3, 6 },
		{ 7, 7, 7 },
		{ 8, 2, 8 },
		{ 9, 4, 9 },
		{ 0, 3, 10 },
		{ 1, 6, 11 },
		{ 2, 3, 12 },
		{ 3, 5, 13 },
		{ 4, 1, 14 },
		{ 5, 7, 15 },
		{ 6, 4, 16 },
		{ 7, 7, 17 },
		{ 8, 3, 18 },
		{ 9, 4, 19 }
	};

	/******************************************************************
	* Modulo Principal que permite ejecutar la aplicaci\u00F3n
	*
	*******************************************************************/

	public static void main(String[] args)throws java.io.IOException, java.text.ParseException{

		int opc;
		boolean noSalir = true;
		String[][] listaMenu = new String [][] { { "A", "Men\u00FA de Afiliados:"},
											                       { "A", "1", "Registro de un Afiliado."},
                                             { "A", "2", "Desactivar un Afiliado."},
                                             { "A", "3", "Consultar informaci\u00F3n de un afiliado."},
                                             { "B", "Men\u00FA de Pel\u00EDculas:"},
                                             { "B", "4", "Registro de una pel\u00EDcula."},
                                             { "B", "5", "Registro de un ejemplar."},
                                             { "B", "6", "Alquilar una pel\u00EDcula."},
                                             { "B", "7", "Devolver una pel\u00EDcula."},
                                             { "B", "8", "Modificar el estado de un ejemplar."},
                                             { "B", "9", "Imprimir el inventario de las pel\u00EDculas."},
                                             { "C", "Men\u00FA del sistema:"},
                                             { "C", "10", "Informaci\u00F3n general."},
                                             { "C", "11", "Probar el sistema."},
                                             { "C", "12", "Reiniciar el sistema."} };


		do{
			mostrarMenu(listaMenu);
			opc = leerOpcion();
			noSalir = ejecutarAccion(opc);
		}while (noSalir);

	}

	/*****************************************************************
	 * Rutina: mostrarMenu
	 * Proposito: Presentar el men\u00FA de opciones
	 * Parametros: plista
	 			   La lista de opciones que debe tener el menu.
	 *
	 * Retorna:
	 *****************************************************************/

	static void mostrarMenu(String[][] plista){

		for(int i=0;i<plista.length;i++){
			if (plista[i].length == 2){
				// Item principal del menu
				out.println("\n"+plista[i][0]+". "+plista[i][1]);
			} else {
				// Sub-item del menu
				out.println(plista[i][1]+". "+plista[i][2]);
			}
		}

		out.println();

	}

	/*****************************************************************
	 * Rutina: leerOpcion
	 * Proposito: Obtener del usuario la opc\u00ED\u00F3n escogida
	 * Parametros:
	 *
	 * Retorna: int
	 *			La opcion ingresada por el usuario.
	 *****************************************************************/

	static int leerOpcion()throws java.io.IOException{

		int opcion;

		out.print("Seleccione su opci\u00a2n: ");
		opcion = Integer.parseInt(in.readLine());
		out.println();

		return opcion;

	}

	/*****************************************************************
	 * Rutina: ejecutarAccion
	 * Proposito: Ejecutar la acci\u00F3n que corresponde a la opc\u00ED\u00F3n escogida
	 * Parametro: popcion
	 *			  Opcion ingresada por el usuario.
	 *
	 * Retorna: boolean
	 *			Un valor que indica si se desea continuar o salir del men\u00FA
	 *****************************************************************/

	static boolean ejecutarAccion(int popcion)throws java.io.IOException, java.text.ParseException{


		boolean noSalir = true;
		int numProd=0;

		switch(popcion){


			case 1: // Registro de afiliado

				registrarAfiliado();
				break;

			case 2: // Desactivar un afiliado

				desactivarAfiliado();
				break;

			case 3: // Consultar informaci\u00F3n de un afiliado

				consultarInfoAfiliado();
				break;


			case 4: // Registrar una pel\u00EDcula

				registrarPelicula();
				break;

			case 5: // Registrar un ejemplar.

				registrarEjemplar();
				break;

			case 6: // Alquilar una pel\u00EDcula.

				registrarAlquiler();
				break;

			case 7: // Devolver una pel\u00EDcula.

				devolverPelicula();
				break;

			case 8: // Modificar el estado de un ejemplar.

				modificarEstadoEjemplar();
				break;

			case 9: // Imprimir el inventario de las pel\u00EDculas.

				imprimirInventarioPeliculas();
				break;

			case 10: // Informaci\u00F3n general.

				imprimirInformacionGeneral();
				break;

			case 11: // Probar el sistema.

				probarSistema();
				break;

			case 12: // Reiniciar el sistema.

				out.println("Reiniciando el sistema...");
				rutinas.reiniciarSistema();
				out.println("Sistema reiniciado exitosamente!");
				esperarEntrada();
				break;

			default:

				out.println("Opcion inv\u00E1lida");
				out.println();
				esperarEntrada();
				break;
		}
		return noSalir;

	}

	/*****************************************************************
	 * Rutina: registrarAfiliado
	 * Proposito: Registrar un afiliado en el sistema
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void registrarAfiliado()throws java.io.IOException{

		// Solicitar el numero de cedula
		out.println("Por favor ingrese el n\u00FAmero de c\u00E9dula del nuevo afiliado.");
		String numCedula = in.readLine();

		// Verificar que no exista un cliente con este numero de cedula
		boolean clienteExistente = rutinas.verificarNuevaCedula(numCedula);
		if (!clienteExistente) {
			// La cedula no ha sido registrada

			// Solicitar Nombre del Afiliado
			out.println("\nPor favor ingrese el nombre del nuevo afiliado.");
			String nomAfiliado = in.readLine();

			// Solicitar el Apellido del Afiliado
			out.println("\nPor favor ingrese el apellido de " + nomAfiliado + ".");
			String apellidoAfiliado = in.readLine(),
				nombreCompletoAfiliado = nomAfiliado + " " + apellidoAfiliado;

			// Solicitar el Numero de Telefono del Afiliado
			out.println("\nPor favor ingrese el n\u00FAmero de tel\u00E9fono de " + nombreCompletoAfiliado + ".");
			String numTelefonoAfiliado = in.readLine();

			// Solicitar el Estado del Afiliado
			String estadoAfiliado = solicitarDatoDeArreglo("estado de la cuenta de " + nombreCompletoAfiliado, listaEstadosAfiliado);

			// Registrar el nuevo Afiliado en el sistema
			out.println("\n\nRegistrando el afiliado no. "+rutinas.obtenerNuevoIndiceAfiliado()+"...");
			rutinas.registrarAfiliado(numCedula, nomAfiliado, apellidoAfiliado, numTelefonoAfiliado, estadoAfiliado);
			out.println(nombreCompletoAfiliado + " ha sido registrado exitosamente!");

		} else {
			// Alguien mas ha sido registrado con esta cedula
			out.println("\nYa existe un afiliado con este n\u00FAmero de c\u00E9dula. \n");
		}

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: registrarPelicula
	 * Proposito: Registrar una nueva pelicula en el sistema.
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void registrarPelicula()throws java.io.IOException{

		// Solicitar el titulo de la pelicula
		out.println("Por favor ingrese el t\u00EDtulo de la pel\u00EDcula que desea registrar.");
		String tituloPelicula = in.readLine();

		// Verificar que el titulo no haya sido registrado anteriormente
		boolean peliculaExistente = rutinas.verificarNuevaPelicula(tituloPelicula);
		if (!peliculaExistente) {
			// La pelicula no ha sido registrada antes

			// Solicitar el tipo de pelicula.
			String tipoPelicula = solicitarDatoDeArreglo("tipo de la pel\u00EDcula "+tituloPelicula, listaTiposPelicula);

			// Solicitar el total de Ejemplares
			out.println("\nPor favor ingrese el total de ejemplares para la pel\u00EDcula: " + tituloPelicula + ".");
			String totalEjemplares = in.readLine();

			// Solicitar la cantidad de Ejemplares disponibles
			out.println("\nPor favor ingrese la cantidad de ejemplares disponibles para la pel\u00EDcula: " + tituloPelicula + ".");
			String ejemplaresDisponibles = in.readLine();

			// Registrar la pelicula
			out.println("\n\nRegistrando la pel\u00EDcula " + tituloPelicula + " ID: " + rutinas.obtenerNuevoIndicePelicula() + "...");
			rutinas.registrarPelicula(tituloPelicula, tipoPelicula, totalEjemplares, ejemplaresDisponibles);
			out.println("Registro exitoso!");

		} else {
			// La pelicula ha sido registrada antes

			out.println("\nLa pel\u00EDcula " + tituloPelicula + " ha sido encontrada en el sistema, por favor intente con un titulo diferente si es una versi\u00F3n diferente de la pelicula registrada.");

		}

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: registrarEjemplar
	 * Proposito: Registrar una nueva pelicula en el sistema.
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void registrarEjemplar()throws java.io.IOException{

		// Solicitar el estado y formato del nuevo ejemplar
		String estadoEjemplar = solicitarDatoDeArreglo("estado del ejemplar", listaEstadosEjemplar),
			formatoEjemplar = solicitarDatoDeArreglo("formato del ejemplar", listaFormatosEjemplar);

		// Registar el ejemplar en el sistema
		out.println("\n\nRegistrando el ejemplar no." + rutinas.obtenerNuevoIndiceEjemplar() + "...");
		rutinas.registrarEjemplar(estadoEjemplar, formatoEjemplar);
		out.println("Registro completado exitosamente!");

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: registrarAlquiler
	 * Proposito: Registrar un alquiler de una pel\u00EDcula en el sistema
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void registrarAlquiler()throws java.io.IOException, java.text.ParseException{

		// Solicitar el ID del afiliado
		int idAfiliado = obtenerIDDato("el afiliado", rutinas.obtenerNuevoIndiceAfiliado());
		String inspeccionMorosidad = rutinas.verificarMorosidadPorAfiliado(idAfiliado);

		if (idAfiliado != -1 && inspeccionMorosidad.equals("")) {

			// El ID del afiliado es valido
			int idPelicula = obtenerIDDato("la pelicula", rutinas.obtenerNuevoIndicePelicula());
			boolean peliculaDisponible = rutinas.verificarNuevaPelicula(idPelicula);

			if (idPelicula != -1 && peliculaDisponible) {

				// El ID de la pelicula es valido
				int idEjemplar = obtenerIDDato("el ejemplar", rutinas.obtenerNuevoIndiceEjemplar());

				if (idEjemplar != -1) {

					out.println("Registrando alquiler no." + rutinas.obtenerNuevoIndiceAlquiler());
					rutinas.registrarAlquiler(idAfiliado, idPelicula, idEjemplar);
					out.println("El alquiler ha sido registrado exitosamente!");

				} else {

					// El ID del ejemplar no pudo ser validado
					out.println("El alquiler no pudo ser ingresado dado a que el ejemplar no existe en el sistema.");

				}

			} else {

				if (idPelicula == -1) {


					// El ID de la pelicula no pudo ser validada
					out.println("El alquiler no pudo ser ingresado dado a que la pelicula no existe en el sistema.");

				} else if (!peliculaDisponible) {

					// La pelicula no esta disponible
					out.println("No hay ejemplares disponibles para alquilar de la pelicula solicitada.");

				}

			}

		} else {

			if (idAfiliado == -1) {

				// El ID del afiliado no pudo ser validado
				out.println("El alquiler no pudo ser ingresado dado a que el afiliado no existe en el sistema.");

			} else if (!inspeccionMorosidad.equals("")) {

				// El afiliado cuenta con morosidad
				out.println("El afiliado cuenta con morosidad por lo que no se le puede efectuar el alquiler.");

			}


		}

		esperarEntrada();

	}


	/*****************************************************************
	 * Rutina: imprimirInformacionGeneral
	 * Proposito: Imprime la cantidad de afiliados registrados, peliculas
	 *			  en el sistema y monto total de moras.
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void imprimirInformacionGeneral()throws java.io.IOException,java.text.ParseException{

		String informacionGeneral = rutinas.informacionGeneral();

		out.println(informacionGeneral);

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: imprimirInventarioPeliculas
	 * Proposito: Imprime el inventario de las peliculas y sus ejemplares
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void imprimirInventarioPeliculas()throws java.io.IOException,java.text.ParseException{

		String inventarioPeliculas = rutinas.informacionInventarioPeliculas();

		out.println(inventarioPeliculas);

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: devolverPelicula
	 * Proposito: Inicia el proceso pertinente a la devolucion de una pelicula alquilada
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void devolverPelicula()throws java.io.IOException,java.text.ParseException{

		// Solicitar el ID del afiliado
		int idAfiliado = obtenerIDDato("el afiliado", rutinas.obtenerNuevoIndiceAfiliado());

		if (idAfiliado != -1) {

			// El ID del afiliado es valido
			int idPelicula = obtenerIDDato("la pelicula", rutinas.obtenerNuevoIndicePelicula());

			if (idPelicula != -1) {

				// El ID de la pelicula es valido
				// Verificar que existe un alquiler correspondiente al afiliado y la pelicula
				int idAlquiler = rutinas.buscarAlquiler(idAfiliado, idPelicula);
				if (idAlquiler != -1) {

					// Alquiler encontrado
					// Verificar morosidad
					String resultadoAlquiler = "";
					resultadoAlquiler += rutinas.verificarMorosidadPorAlquiler(idAlquiler);
					out.println(resultadoAlquiler);
					// Aplicar devolucion en el sistema
					out.println("\n---Aplicando devoluci\u00F3n de la pel\u00EDcula---");
					rutinas.devolverPelicula(idAlquiler);
					out.println("\nLa devoluci\u00F3n ha sido completada con \u00E9xito!");

				} else {

					// Alquiler no encontrado
					out.println("\nNingun alquiler pendiente ha sido encontrado para la pel\u00EDcula y el afiliado presentados anteriormente.");
				}

			} else {

				// El ID de la pelicula es invalido
				out.println("La pel\u00EDcula no pudo ser devuelta ya que esta no fue reconocida por el sistema.");

			}

		} else {

			// El ID del afiliado no es valido
			out.println("La pel\u00EDcula no pudo ser devuelta ya que el afiliado no pudo ser reconocido por el sistema.");

		}

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: modificarEstadoEjemplar
	 * Proposito: Inicia el proceso de modificacion de un ejemplar
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void modificarEstadoEjemplar()throws java.io.IOException,java.text.ParseException{

		// Solicitar el ID de la pelicula
		int idPelicula = obtenerIDDato("la pelicula", rutinas.obtenerNuevoIndicePelicula());

		if (idPelicula != -1) {

			// El ID de la pelicula es valido
			int idEjemplar = obtenerIDDato("el ejemplar", rutinas.obtenerNuevoIndiceEjemplar());

			if (idEjemplar != -1) {

				// El ID del ejemplar es valido
				// Solicitar el Estado del Ejemplar
				String estadoEjemplar = solicitarDatoDeArreglo("estado del ejemplar", listaEstadosEjemplar);
				// Modificar el estado del Ejemplar y su Pel\u00EDcula correspondiente
				out.println("\nModificando el estado de ejemplar no." + idEjemplar + "...");
				rutinas.modificarEstadoEjemplar(idPelicula,idEjemplar,estadoEjemplar);
				out.println("\nModificacion exitosa!");

			} else {

				// El ID del ejemplar es invalido
				out.println("\nEl ejemplar no pudo ser encontrado por el sistema.");

			}

		} else {

			// El ID de la pelicula no es valido
			out.println("\nEl ejemplar no pudo ser buscado ya que la pel\u00EDcula no pudo ser encontrada por el sistema.");

		}

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: desactivarAfiliado
	 * Proposito: Desactivar un afiliado en el sistema
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void desactivarAfiliado()throws java.io.IOException{

		boolean continuarOperacion = true,
			afiliadoEncontrado = false;

		// Solicitar el ID del Afiliado
		int numAfiliado = obtenerIDDato("el afiliado", rutinas.obtenerNuevoIndiceAfiliado());

		if (numAfiliado != -1) {

			rutinas.desactivarAfiliado(numAfiliado);
			afiliadoEncontrado = true;

		}

		if (!afiliadoEncontrado) {

			out.println("El afiliado que se intent\u00F3 desactivar no pudo ser encontrado por el sistema...");

		} else {

			out.println("El afiliado ha sido desactivado exitosamente.");

		}

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: solicitarDatoDeArreglo
	 * Proposito: Solicitar un dato filtrado por un arreglo utilizando una solicitud generada dinamicamente
	 * Parametro: pnombreDato
	 *			  Nombre del dato que sera usado en la solicitud.
	 * Parametro: parregloDatos
	 *			  Arreglo de datos a utilizar como base.
	 *
	 * Retorna: String
	 *			Tipo de pelicula textual "numerico" para uso de la aplicacion.
	 *****************************************************************/

	static String solicitarDatoDeArreglo(String pnombreDato, String[][]parregloDatos)throws java.io.IOException{

		// Construir la solicitud
		String solicitudUsuario = "\nPor favor ingrese el " + pnombreDato + ".",
			entradaUsuario;
		String tiposPosibles[] = new String[parregloDatos.length];
		boolean tipoValido = false;

		for(int i=0;i<parregloDatos.length;i++){

			solicitudUsuario += "\n" + parregloDatos[i][0] + ": " + parregloDatos[i][1];
			tiposPosibles[i] = parregloDatos[i][0];

		}

		do {
			out.println(solicitudUsuario);
			entradaUsuario = in.readLine();
			// Revisar si el valor ingresado es valido
			for (String valor : tiposPosibles) {
				if (valor.equals(entradaUsuario)) {
					tipoValido = true;
				}
			}
			if (!tipoValido) {
				out.println("El " + pnombreDato + " ingresado es inv\u00E1lido, por favor intente denuevo.");
			}
		} while (!tipoValido);

		return entradaUsuario;

	}

	/*****************************************************************
	 * Rutina: obtenerIDDato
	 * Proposito: Obtiene el ID de un dato especifico en base a la entrada del usuario
	 * Parametro: pnomDato
	 *			  Nombre textual del dato en cuestion.
	 *
	 * Retorna: int
	 *			ID del dato obtenido (-1 si no se encuentra)
	 *****************************************************************/

	static int obtenerIDDato(String pnomDato, int plimiteID)throws java.io.IOException{

		boolean continuarOperacion = true,
			datoEncontrado = false;

		// Solicitar el ID de la Pelicula
		out.println("Por favor ingrese el ID de " + pnomDato + ".");
		int idEntrada = Integer.parseInt(in.readLine());

		do {
			if (idEntrada < plimiteID) {

				// El Numero de Pelicula esta en el rango de afiliados existentes
				datoEncontrado = true;

			} else {

				// El Numero de Pelicula no es valido
				out.println("El ID ingresado es inv\u00E1lido, intente denuevo o ingrese -1 para volver al men\u00FA principal.");
				idEntrada = Integer.parseInt(in.readLine());
				if (idEntrada == -1) {
					continuarOperacion = false;
				}
			}
		} while (continuarOperacion && !datoEncontrado);

		return idEntrada;

	}

	/*****************************************************************
	 * Rutina: probarSistema
	 * Proposito: Probar el sistema con los datos de prueba
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void probarSistema()throws java.io.IOException{

		// Registrar afiliados de prueba
		out.println("Registrando afiliados...");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
		for(int i=0; i < afiliadosPrueba.length; i++){

			// Registrar afiliado
			out.println("Registrando a "+afiliadosPrueba[i][1]+" "+afiliadosPrueba[i][2]+"...");
			rutinas.registrarAfiliado(afiliadosPrueba[i][0], afiliadosPrueba[i][1], afiliadosPrueba[i][2], afiliadosPrueba[i][3], afiliadosPrueba[i][4]);
			out.println(afiliadosPrueba[i][1]+" "+afiliadosPrueba[i][2]+" ha sido registrado exitosamente!\n");

		}
		out.println("\nAfiliados registrados exitosamente!");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// Registrar peliculas de prueba
		out.println("\nRegistrando peliculas...");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
		for(int i=0; i < peliculasPrueba.length; i++){

			// Registrar pelicula
			out.println("Registrando "+peliculasPrueba[i][0]+"...");
			rutinas.registrarPelicula(peliculasPrueba[i][0], peliculasPrueba[i][1], peliculasPrueba[i][2], peliculasPrueba[i][3]);
			out.println(peliculasPrueba[i][0]+" ha sido registrada exitosamente!\n");

		}
		out.println("\nPeliculas registradas exitosamente!");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// Registrar ejemplares de prueba
		out.println("\nRegistrando ejemplares...");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
		for(int i=0, iE=1; i < ejemplaresPrueba.length; i++, iE++){

			// Registrar ejemplar
			out.println("Registrando Ejemplar no."+iE+"...");
			rutinas.registrarEjemplar(ejemplaresPrueba[i][0], ejemplaresPrueba[i][1]);
			out.println("Ejemplar registrado exitosamente!\n");

		}
		out.println("\nEjemplares registrados exitosamente!");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// Registrar alquileres de prueba
		out.println("\nRegistrando alquileres...");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~\n");
		for(int i=0, iE=1; i < alquileresPrueba.length; i++, iE++){

			// Registrar ejemplar
			out.println("Registrando Alquiler no."+iE+"...");
			rutinas.registrarAlquiler(alquileresPrueba[i][0], alquileresPrueba[i][1], alquileresPrueba[i][2]);
			out.println("Alquiler registrado exitosamente!\n");

		}
		out.println("\nAlquileres registrados exitosamente!");
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: consultarInfoAfiliado
	 * Proposito: Consultar la informaci\u00F3n perteneciente a un afiliado
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void consultarInfoAfiliado()throws java.io.IOException, java.text.ParseException{

		boolean consultaValida = true;
		String resultadoBusqueda = "",
			tipoConsulta;
		int idAfiliado;

		do {

			out.println("Por favor indique el dato por el cual quiere buscar al usuario: \n1: N\u00FAmero de c\u00E9dula.\n2: ID de usuario.\n(ingrese -1 para salir)");
			tipoConsulta = in.readLine();

			switch(tipoConsulta){
				case "1": // Numero de Cedula
					resultadoBusqueda = "";
					out.println("Por favor ingrese el n\u00FAmero de c\u00E9dula del Afiliado.");
					idAfiliado = rutinas.buscarAfiliadoPorCedula(in.readLine());
					if (idAfiliado != -1) {
						// El afiliado existe
						resultadoBusqueda = rutinas.agruparInformacionAfiliado(idAfiliado);
						consultaValida = true;
					} else {
						// El afiliado no existe
						out.println("La c\u00E9dula ingresada no corresponde a ningun afiliado, por favor intente denuevo.");
						consultaValida = false;
					}
				break;
				case "2": // ID de Afiliado
					resultadoBusqueda = "";
					out.println("Por favor ingrese el ID del Afiliado.");
					idAfiliado = Integer.parseInt(in.readLine());
					if (idAfiliado <= rutinas.obtenerNuevoIndiceAfiliado() && idAfiliado >= 0){
						// El ID esta dentro del rango de IDs validos
						resultadoBusqueda = rutinas.agruparInformacionAfiliado(idAfiliado);
						consultaValida = true;
					} else {
						// El ID supera el rango de IDs validos
						out.println("El ID ingresado no corresponde a ningun afiliado, por favor intente denuevo.");
						consultaValida = false;
					}
				break;
				default:
					consultaValida = false;
					if (!tipoConsulta.equals("-1")) {
						out.println("*** VALOR INVALIDO ***\nPor favor ingrese 1 o 2 (-1 para salir)...");
					}
			}

		} while (!consultaValida && !tipoConsulta.equals("-1"));

		out.println(resultadoBusqueda);

		esperarEntrada();

	}

	/*****************************************************************
	 * Rutina: esperarEntrada
	 * Proposito: Solicitar al usuario una entrada para continuar
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	static void esperarEntrada()throws java.io.IOException{

		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		out.println("Por favor ingrese cualquier valor para continuar...");
		in.readLine();

	}

}
