
import java.util.*;
import java.text.*;

public class AlquilerPeliculasRutinas{

	private static int nuevoIndiceAfiliado = 0,
		nuevoIndicePelicula = 0,
		nuevoIndiceEjemplar = 0,
		nuevoIndiceAlquiler = 0;

	private static String[][] listaAfiliados = new String[1000][5];		// { numCedula, nombre, apellido, numTelefono, estado }
	private static String[][] listaPeliculas = new String[500][4];		// { titulo, tipo, totalEjemplares, ejemplaresDisponibles }
	private static String[][] listaEjemplares = new String[2000][2];	// { estado, formato }
	private static String[][] listaAlquileres = new String[2000][6];	// { idAfiliado, idPelicula, idEjemplar, fechaAlquiler, estadoAlquiler, fechaDevolucion }

	private static int multaAtrasoDiario = 1500,
		diasMorosidad = 3;

	private static String estadoEjemplarDisponible = "0",
		estadoEjemplarAlquilado = "1",
		estadoEjemplarReparacion = "1";


	/*****************************************************************
	 * Rutina: obtenerNuevoIndiceAfiliado
	 * Proposito: Obtener el nuevo ID de un afiliado por registrar
	 * Parametro:
	 * Retorna: int
	 *			Indice del nuevo afiliado.
	 *****************************************************************/

	static int obtenerNuevoIndiceAfiliado(){

		return nuevoIndiceAfiliado;

	}

	/*****************************************************************
	 * Rutina: obtenerNuevoIndicePelicula
	 * Proposito: Obtener el nuevo ID de una pelicula por registrar
	 * Parametro:
	 * Retorna: int
	 *			Indice de una nueva pelicula.
	 *****************************************************************/

	static int obtenerNuevoIndicePelicula(){

		return nuevoIndicePelicula;

	}

	/*****************************************************************
	 * Rutina: obtenerNuevoIndiceEjemplar
	 * Proposito: Obtener el nuevo ID de un nuevo ejemplar
	 * Parametro:
	 * Retorna: int
	 *			Indice del nuevo ejemplar.
	 *****************************************************************/

	static int obtenerNuevoIndiceEjemplar(){

		return nuevoIndiceEjemplar;

	}

	/*****************************************************************
	 * Rutina: obtenerNuevoIndiceAlquiler
	 * Proposito: Obtener el nuevo ID de un nuevo alquiler
	 * Parametro:
	 * Retorna: int
	 *			Indice del nuevo alquiler.
	 *****************************************************************/

	static int obtenerNuevoIndiceAlquiler(){

		return nuevoIndiceAlquiler;

	}

	/*****************************************************************
	 * Rutina: registrarAfiliado
	 * Proposito: Registrar los datos del nuevo afiliado en el sistema
	 * Parametro: pnumCedula
	 *			  N\u00FAmero de c\u00E9dula
	 * Parametro: pnombre
	 *			  Nombre
	 * Parametro: papellido
	 *			  Apellido
	 * Parametro: pnumTelefono
	 *			  Numero de tel\u00E9fono
	 * Parametro: pestado
	 *			  Estado
	 * Retorna:
	 *****************************************************************/

	public static void registrarAfiliado(String pnumCedula, String pnombre, String papellido, String pnumTelefono, String pestado){

		// Registrar los datos en una fila de la matriz del nuevo afiliado
		listaAfiliados[nuevoIndiceAfiliado][0] = pnumCedula;
		listaAfiliados[nuevoIndiceAfiliado][1] = pnombre;
		listaAfiliados[nuevoIndiceAfiliado][2] = papellido;
		listaAfiliados[nuevoIndiceAfiliado][3] = pnumTelefono;
		listaAfiliados[nuevoIndiceAfiliado][4] = pestado;

		// Incrementar la matriz del nuevo afiliado
		nuevoIndiceAfiliado++;

	}

	/*****************************************************************
	 * Rutina: registrarPelicula
	 * Proposito: Registrar los datos de una nueva pelicula en el sistema
	 * Parametro: ptituloPelicula
	 *			  Titulo de la pelicula
	 * Parametro: ptipoPelicula
	 *			  Tipo de Pelicula
	 * Parametro: ptotalEjemplares
	 *			  Ejemplares totales relativos a esta pelicula
	 * Parametro: pejemplaresDisponibles
	 *			  Cantidad de Ejemplares disponibles de esta pelicula
	 * Retorna:
	 *****************************************************************/

	public static void registrarPelicula(String ptituloPelicula, String ptipoPelicula, String ptotalEjemplares, String pejemplaresDisponibles){

		// Registrar los datos en una fila de la matriz de la nueva pelicula
		listaPeliculas[nuevoIndicePelicula][0] = ptituloPelicula;
		listaPeliculas[nuevoIndicePelicula][1] = ptipoPelicula;
		listaPeliculas[nuevoIndicePelicula][2] = ptotalEjemplares;
		listaPeliculas[nuevoIndicePelicula][3] = pejemplaresDisponibles;

		// Incrementar la matriz de la nueva pelicula
		nuevoIndicePelicula++;

	}

	/*****************************************************************
	 * Rutina: registrarEjemplar
	 * Proposito: Registrar los datos de un nuevo ejemplar en el sistema
	 * Parametro: pestadoEjemplar
	 *			  Estado dej Ejemplar
	 * Parametro: pformatoEjemplar
	 *			  Formato del Ejemplar
	 * Retorna:
	 *****************************************************************/

	public static void registrarEjemplar(String pestadoEjemplar, String pformatoEjemplar){

		// Registrar los datos en una fila de la matriz del nuevo ejemplar
		listaEjemplares[nuevoIndiceEjemplar][0] = pestadoEjemplar;
		listaEjemplares[nuevoIndiceEjemplar][1] = pformatoEjemplar;

		// Incrementar el indice del nuevo ejemplar
		nuevoIndiceEjemplar++;

	}

	/*****************************************************************
	 * Rutina: registrarAlquiler
	 * Proposito: Registrar los datos de un nuevo alquiler en el sistema
	 * Parametro: pestadoEjemplar
	 *			  Estado dej Ejemplar
	 * Parametro: pformatoEjemplar
	 *			  Formato del Ejemplar
	 * Retorna:
	 *****************************************************************/

	public static void registrarAlquiler(int pidAfiliado, int pidPelicula, int pidEjemplar){

		String fechaAlquiler = new Date().toString();

		// Registrar los datos en una fila de la matriz del nuevo alquiler
		listaAlquileres[nuevoIndiceAlquiler][0] = String.valueOf(pidAfiliado);
		listaAlquileres[nuevoIndiceAlquiler][1] = String.valueOf(pidPelicula);
		listaAlquileres[nuevoIndiceAlquiler][2] = String.valueOf(pidEjemplar);
		listaAlquileres[nuevoIndiceAlquiler][3] = String.valueOf(fechaAlquiler);
		listaAlquileres[nuevoIndiceAlquiler][4] = "0";
		listaAlquileres[nuevoIndiceAlquiler][5] = "";

		// Incrementar el indice del nuevo alquiler
		nuevoIndiceAlquiler++;

	}

	/*****************************************************************
	 * Rutina: verificarNuevaCedula
	 * Proposito: Verificar la existencia de un numero de cedula en el registro
	 * Parametro: pnumCedula
	 *			  N\u00FAmero de c\u00E9dula
	 * Retorna: boolean
	 *			Existe o no la cedula en el registro (verdadero = si, falso = no)
	 *****************************************************************/

	public static boolean verificarNuevaCedula(String pnumCedula) {

		// Obtener el ID del afiliado en base a su Cedula (-1 si no es encontrado)
		int idUsuario = buscarAfiliadoPorCedula(pnumCedula);
		boolean cedulaExistente = false;

		if (idUsuario > -1) {
			// El usuario fue encontrado
			cedulaExistente = true;
		}

		return cedulaExistente;

	}

	/*****************************************************************
	 * Rutina: verificarDisponibilidadPelicula
	 * Proposito: Verificar la disponibilidad de una pelicula por su ID
	 * Parametro: pidPelicula
	 *			  ID de la pelicula
	 * Retorna: boolean
	 *			Hay o no disponibilidad de esta pelicula en el sistema? (verdadero = si, falso = no)
	 *****************************************************************/

	public static boolean verificarNuevaPelicula(int pidPelicula) {

		boolean peliculaDisponible = false;
		int disponibilidadEjemplares = Integer.parseInt(listaPeliculas[pidPelicula][3]); // Obtener la disponibilidad de la lista de Peliculas

		if (disponibilidadEjemplares > 0) {
			// Hay peliculas disponibles
			peliculaDisponible = true;
		}

		return peliculaDisponible;

	}

	/*****************************************************************
	 * Rutina: devolverPelicula
	 * Proposito: Aplica la devolucion de una pelicula y la finalizacion de un alquiler en el sistema
	 * Parametro: pidAlquiler
	 *
	 * Retorna:
	 *****************************************************************/

	static void devolverPelicula(int pidAlquiler){

		String fechaDevolucion = new Date().toString();
		listaAlquileres[pidAlquiler][4] = "1"; // Actualizar el estado del alquiler a 1 : Devuelto
		listaAlquileres[pidAlquiler][5] = fechaDevolucion; // Actualizar la fecha de devolucion del alquiler

	}

	/*****************************************************************
	 * Rutina: buscarAlquiler
	 * Proposito: Buscar un alquiler espec\u00EDfico basado en el ID de un afiliado y el ID de una pel\u00EDcula
	 * Parametro: pidAfiliado
	 *			  ID del afiliado.
	 * Parametro: pidPelicula
	 *			  ID de la pelicula.
	 *
	 * Retorna: int
	 *			ID del alquiler (-1 si no fue encontrado).
	 *****************************************************************/

	static int buscarAlquiler(int pidAfiliado, int pidPelicula){

		int idAlquiler = -1,
			idAlquilerActual = 0;

		// Iterar por cada alquiler hasta encontrar uno que corresponda al afiliado actual y la pelicula
		while (idAlquilerActual < nuevoIndiceAlquiler && idAlquiler == -1) {

			if (
				Integer.parseInt(listaAlquileres[idAlquilerActual][0]) == pidAfiliado // Comparar el afiliado en el historial con el actual
					&&
				Integer.parseInt(listaAlquileres[idAlquilerActual][1]) == pidPelicula // Comparar la pelicula en el historial con la actual
				) {

				// El alquiler corresponde al buscado
				idAlquiler = idAlquilerActual;

			}

			idAlquilerActual++;

		}

		return idAlquiler;

	}

	/*****************************************************************
	 * Rutina: modificarEstadoEjemplar
	 * Proposito: Modifica el estado de un Ejemplar y su pel\u00EDcula correspondiente
	 * Parametro: pidPelicula
	 *			  ID de la pelicula.
	 * Parametro: pidEjemplar
	 *			  ID del ejemplar.
	 * Parametro: pestadoEjemplar
	 *			  Estado textual "numerico" del Ejemplar.
	 *
	 * Retorna:
	 *
	 *****************************************************************/

	static void modificarEstadoEjemplar(int pidEjemplar, int pidPelicula, String pestadoEjemplar){

		String estadoEjemplarActual =
		listaEjemplares[pidEjemplar][0];

		// Logica perteneciente a la pelicula que esta relacionada a este Ejemplar
		switch (estadoEjemplarActual) { // Estado actual

			case "0": // Disponible

				switch (pestadoEjemplar) { // Nuevo estado

					case "1": // Alquilado
					case "2": // Reparacion

						// Reducir la cantidad de ejemplares disponibles para la pelicula
						listaPeliculas[pidPelicula][3] = String.valueOf(Integer.parseInt(listaPeliculas[pidPelicula][3])-1);
						break;

				}

				break;

			case "1": // Alquilado

				switch (pestadoEjemplar) { // Nuevo estado

					case "0": // Disponible

						// Incrementar la cantidad de ejemplares disponibles para la pelicula
						listaPeliculas[pidPelicula][3] = String.valueOf(Integer.parseInt(listaPeliculas[pidPelicula][3])+1);
						break;

				}

				break;

			case "2": // En Reparacion

				switch (pestadoEjemplar) { // Nuevo estado

					case "0": // Disponible

						// Incrementar la cantidad de ejemplares disponibles para la pelicula
						listaPeliculas[pidPelicula][3] = String.valueOf(Integer.parseInt(listaPeliculas[pidPelicula][3])+1);
						break;

				}

				break;

		}

		// Actualizar el estado del ejemplar
		listaEjemplares[pidEjemplar][0] = pestadoEjemplar;

	}

	/*****************************************************************
	 * Rutina: verificarNuevaPelicula
	 * Proposito: Verificar la existencia de una pelicula por su titulo en el registro
	 * Parametro: ptituloPelicula
	 *			  Titulo de la pelicula
	 * Retorna: boolean
	 *			Existe o no la pelicula en el registro (verdadero = si, falso = no)
	 *****************************************************************/

	public static boolean verificarNuevaPelicula(String ptituloPelicula) {

		int idPelicula = buscarPeliculaPorTitulo(ptituloPelicula); // Buscar el ID de la pelicula por su titulo (-1 si no se encuentra)
		boolean peliculaExistente = false;

		if (idPelicula > -1) {
			// La pelicula fue encontrada
			peliculaExistente = true;
		}

		return peliculaExistente;

	}

	/*****************************************************************
	 * Rutina: buscarPeliculaPorTitulo
	 * Proposito: Buscar el Indice de una pelicula usando el titulo como filtro de busqueda
	 * Parametro: ptituloPelicula
	 *			  Titulo de la pelicula
	 * Retorna: int
	 *			Indice de la Pelicula (-1 si no se encuentra)
	 *****************************************************************/

	public static int buscarPeliculaPorTitulo(String ptituloPelicula) {

		int idPelicula = -1;

		int peliculaAct = 0;
		String tituloPeliculaAct;

		// Iterar por cada pelicula registrada hasta encontrar una relacion
		while (peliculaAct < nuevoIndicePelicula && idPelicula == -1) {

			tituloPeliculaAct = listaPeliculas[peliculaAct][0]; // Extraer el titulo de la lista de peliculas

			if (tituloPeliculaAct.equals(ptituloPelicula)) {

				// El titulo corresponde al buscado
				idPelicula = peliculaAct;

			}

			peliculaAct++;

		}

		return idPelicula;

	}

	/*****************************************************************
	 * Rutina: buscarAfiliadoPorCedula
	 * Proposito: Buscar el ID de un afiliado basado en su cedula
	 * Parametro: pnumCedula
	 *			  N\u00FAmero de c\u00E9dula
	 * Retorna: int
	 *			ID del usuario (-1 si no se encuentra)
	 *****************************************************************/

	public static int buscarAfiliadoPorCedula(String pnumCedula) {

		int idAfiliado = -1;
		int afiliadoAct = 0;
		String cedulaAfiliadoAct;

		// Iterar por cada afiliado hasta encontrar una relacion
		while (afiliadoAct < nuevoIndiceAfiliado && idAfiliado == -1) {

			// Extraer la cedula del afiliado para comparar con la solicitada
			cedulaAfiliadoAct = listaAfiliados[afiliadoAct][0];

			if (cedulaAfiliadoAct.equals(pnumCedula)) {

				// La cedula corresponde con la solicitada por lo que guardamos el ID
				idAfiliado = afiliadoAct;

			}

			afiliadoAct++;

		}

		return idAfiliado;

	}

	/*****************************************************************
	 * Rutina: desactivarAfiliado
	 * Proposito: Desactiva un Afiliado por ID
	 * Parametro: pidAfiliado
	 *			  ID del Afiliado
	 * Retorna:
	 *****************************************************************/

	public static void desactivarAfiliado(int pidAfiliado){

		// Actualizar el estado del afiliado (0 = desactivado)
		listaAfiliados[pidAfiliado][4] = "0";

	}

	/*****************************************************************
	 * Rutina: agruparInformacionAfiliado
	 * Proposito: Agrupa la informaci\u00F3n de un Afiliado por ID
	 * Parametro: pidAfiliado
	 *			  ID del Afiliado
	 * Retorna: String
	 *			La informaci\u00F3n del Afiliado en formato legible.
	 *****************************************************************/

	public static String agruparInformacionAfiliado(int pidAfiliado)throws java.text.ParseException{

		String numeroCedula = listaAfiliados[pidAfiliado][0],
			nombreAfiliado = listaAfiliados[pidAfiliado][1],
			apellidoAfiliado = listaAfiliados[pidAfiliado][2],
			telefonoAfiliado = listaAfiliados[pidAfiliado][3],
			estadoAfiliado = listaAfiliados[pidAfiliado][4],
			informacionAfiliado;

		switch (estadoAfiliado){
			case "0":
				estadoAfiliado = "Cuenta inactiva.";
				break;
			case "1":
				estadoAfiliado = "Cuenta activa.";
				break;
		}

		// Agrupar informaci\u00F3n general
		informacionAfiliado = "*** INFORMACION GENERAL ***\n\n" +
				"Nombre: " + nombreAfiliado + " " + apellidoAfiliado + "\n" +
				"N\u00FAmero de C\u00E9dula: " + numeroCedula + "\n" +
				"N\u00FAmero de Tel\u00E9fono: " + telefonoAfiliado + "\n" +
				"Estado: " + estadoAfiliado + "\n\n";

		// Agrupar informaci\u00F3n de pel\u00EDculas alquiladas
		informacionAfiliado += informacionAlquileresAfiliado(pidAfiliado);

		return informacionAfiliado;

	}

	/*****************************************************************
	 * Rutina: informacionAlquileresAfiliado
	 * Proposito: Agrupa la informaci\u00F3n de los alquileres de un Afiliado por ID
	 * Parametro: pidAfiliado
	 *			  ID del Afiliado
	 * Retorna: String
	 *			La informaci\u00F3n de los alquileres del Afiliado en formato legible.
	 *****************************************************************/

	public static String informacionAlquileresAfiliado(int pidAfiliado)throws java.text.ParseException{

		String resulInspeccion = "",
			cabeceraInspeccion = "*** INFORMACION DE ALQUILERES ***\n\n",
			nombreAfiliado = listaAfiliados[pidAfiliado][1],
			apellidoAfiliado = listaAfiliados[pidAfiliado][2];
		int alquilerActual = 0,
			idAfiliadoAlquiler,
			idPeliculaAlquiler;
		String nombrePelicula,
			fechaAlquiler,
			infoMorosidad;

		// Iterar por cada alquiler para extraer los datos relacionados al Afiliado
		while (alquilerActual < nuevoIndiceAlquiler) {

			// Extraer el ID del afiliado para compararlo con el solicitado
			idAfiliadoAlquiler = Integer.parseInt(listaAlquileres[alquilerActual][0]);

			if (idAfiliadoAlquiler == pidAfiliado){

				// El alquiler corresponde al afiliado actual
				idPeliculaAlquiler = Integer.parseInt(listaAlquileres[alquilerActual][1]);
				nombrePelicula = listaPeliculas[idPeliculaAlquiler][0];
				fechaAlquiler = listaAlquileres[alquilerActual][3];
				infoMorosidad = verificarMorosidadPorAlquiler(alquilerActual);
				resulInspeccion += "\nID de Pelicula: " + idPeliculaAlquiler + ", Nombre de Pelicula: "
					+ nombrePelicula + ", Fecha de Alquiler: " + fechaAlquiler + " ( " + infoMorosidad + " ).";

			}

			alquilerActual++;

		}

		if (resulInspeccion.equals("")){
			// Historial de alquileres vac\u00EDo para el afiliado actual
			resulInspeccion = "El historial de alquileres para " + nombreAfiliado + " " + apellidoAfiliado + " actual est\u00E1 limpio.";
		}

		return cabeceraInspeccion + resulInspeccion;

	}

	/*****************************************************************
	 * Rutina: informacionGeneral
	 * Proposito: Agrupa la informaci\u00F3n general de la aplicacion
	 * Parametro:
	 *
	 * Retorna: String
	 *			La informaci\u00F3n general relativa a la aplicacion.
	 *****************************************************************/

	public static String informacionGeneral()throws java.text.ParseException{

		String informacionGeneral = "\n*** INFORMACION GENERAL ***\n\n"
			+ "Cantidad de Afiliados: " + nuevoIndiceAfiliado + "\n"
			+ "Cantidad de Peliculas: " + nuevoIndicePelicula + "\n"
			+ "Cantidad de Morosidad: " + calcularMorosidadTotal() + "\n";
		return informacionGeneral;

	}

	/*****************************************************************
	 * Rutina: informacionInventarioPeliculas
	 * Proposito: Agrupa la informaci\u00F3n del inventario de las peliculas
	 * Parametro:
	 *
	 * Retorna: String
	 *			La informaci\u00F3n relativa al inventario de las peliculas.
	 *****************************************************************/

	public static String informacionInventarioPeliculas()throws java.text.ParseException{

		String resulInspeccion = "",
			cabeceraInspeccion = "*** INFORMACION DE INVENTARIO ***\n\n",
			informacionPeliculas,
			informacionEjemplares,
			nombrePelicula,
			inventarioPeliculaTotal,
			inventarioPeliculaDisponible,
			estadoEjemplar,
			formatoEjemplar;
		int peliculaActual = 0,
			ejemplarActual = 0;

		// Informacion General de Peliculas
		informacionPeliculas = "Peliculas Registradas: " + nuevoIndicePelicula + ".\n";

		// Procesar cada pelicula
		while (peliculaActual < nuevoIndicePelicula) {

			// Separar la informacion necesaria en sus variables correspondientes
			nombrePelicula = listaPeliculas[peliculaActual][0];
			inventarioPeliculaTotal = listaPeliculas[peliculaActual][2];
			inventarioPeliculaDisponible = listaPeliculas[peliculaActual][3];

			// Agrupar la informacion
			informacionPeliculas += "\n\n" + peliculaActual + ". "
				+ nombrePelicula + ":\n\t+ Ejemplares: " + inventarioPeliculaTotal
				+ "\n\t+ Disponibles: " + inventarioPeliculaDisponible;

			peliculaActual++;

		}

		// Informacion General de Peliculas
		informacionEjemplares = "\n\nEjemplares Registrados: " + nuevoIndiceEjemplar + ".\n";

		// Procesar cada ejemplar
		while (ejemplarActual < nuevoIndiceEjemplar) {

			// Separar la informacion necesaria en sus variables correspondientes
			estadoEjemplar = listaEjemplares[ejemplarActual][0];
			formatoEjemplar = listaEjemplares[ejemplarActual][1];

			// Agrupar la informacion
			informacionEjemplares += "\nID de Ejemplar: " + ejemplarActual + ", Estado del Ejemplar: "
				+ estadoEjemplar + ", Formato: " + formatoEjemplar;

			ejemplarActual++;

		}

		resulInspeccion = informacionPeliculas + informacionEjemplares;

		return cabeceraInspeccion + resulInspeccion;

	}

	/*****************************************************************
	 * Rutina: verificarMorosidadPorAfiliado
	 * Proposito: Verifica la morosidad de un afiliado por su Indice
	 * Parametro: pidAfiliado
	 *			  ID del Afiliado
	 * Retorna: String
	 *			La informacion relativa a la morosidad del afiliado.
	 *****************************************************************/

	 public static String verificarMorosidadPorAfiliado(int pidAfiliado)throws java.text.ParseException{

	 	String resulInspeccion = "";
		int alquilerActual = 0,
			idAfiliadoAlquiler,
			morosidadAlquiler;

		while (alquilerActual < nuevoIndiceAlquiler) {

			idAfiliadoAlquiler = Integer.parseInt(listaAlquileres[alquilerActual][0]);
			if (idAfiliadoAlquiler == pidAfiliado){

				// El alquiler corresponde al afiliado actual
				morosidadAlquiler = calcularMorosidadAlquiler(alquilerActual);

				if (morosidadAlquiler != -1) {

					resulInspeccion = "Afiliado moroso.";

				}

			}

			alquilerActual++;

		}

		return resulInspeccion;

	 }

	/*****************************************************************
	 * Rutina: verificarMorosidadPorAlquiler
	 * Proposito: Verifica la morosidad de un alquiler por su Indice
	 * Parametro: pidAlquiler
	 *			  ID del Alquiler
	 * Retorna: String
	 *			La informacion relativa a la morosidad del alquiler.
	 *****************************************************************/

	 public static String verificarMorosidadPorAlquiler(int pidAlquiler)throws java.text.ParseException{

	 	String resulInspeccion = "",
	 		fechaAlquilerTextual = listaAlquileres[pidAlquiler][3],
	 		estadoAlquiler = listaAlquileres[pidAlquiler][4],
	 		fechaDevolucionTextual = listaAlquileres[pidAlquiler][5];
	 		DateFormat formatoFechas = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		int morosidadAlquiler = calcularMorosidadAlquiler(pidAlquiler);

	 	if (estadoAlquiler.equals("0")) {
	 		// Alquiler efectivo (sin devolver)

	 		Date fechaAlquiler = formatoFechas.parse(fechaAlquilerTextual);
			Date fechaActual = new Date();
		 	int diasDeMorosidad = (int)((fechaActual.getTime() - fechaAlquiler.getTime())) / (24 * 60 * 60 * 1000) - diasMorosidad;

		 	if (diasDeMorosidad > 0) {
		 		// Existe morosidad para el Alquiler actual
		 		int morosidadMonetaria = (diasDeMorosidad - 2) * multaAtrasoDiario;
		 		resulInspeccion = "Cuenta con morosidad de " + diasDeMorosidad + " d\u00EDas (" + morosidadMonetaria + " colones).";
		 	} else {
		 		// No existe morosidad
		 		resulInspeccion = "A\u00FAn cuenta con " + Math.abs(diasDeMorosidad) + " d\u00EDas para devolver la pel\u00EDcula.";
		 	}

	 	} else {
	 		// Alquiler completado

	 		Date fechaAlquiler = formatoFechas.parse(fechaAlquilerTextual);
			Date fechaDevolucion = formatoFechas.parse(fechaDevolucionTextual);
		 	int diasDeMorosidad = (int)((fechaDevolucion.getTime() - fechaAlquiler.getTime())) / (24 * 60 * 60 * 1000) - diasMorosidad;

		 	if (diasDeMorosidad > 0) {
		 		// Existe morosidad para el Alquiler actual
		 		int morosidadMonetaria = (diasDeMorosidad - 2) * multaAtrasoDiario;
		 		resulInspeccion = "El alquiler fue completado con morosidad de " + diasDeMorosidad + " d\u00EDas (" + morosidadMonetaria + " colones).";
		 	} else {
		 		// No existe morosidad
		 		resulInspeccion = "El alquiler ha sido completado sin morosidad.";
		 	}

	 	}

	 	return resulInspeccion;

	 }

	/*****************************************************************
	 * Rutina: calcularMorosidadAlquiler
	 * Proposito: Calcula el monto del morosidad para un alquiler
	 * Parametro: pidAlquiler
	 *			  ID del Alquiler
	 * Retorna: int
	 *			La morosidad del alquiler (-1 si no cuenta con morosidad).
	 *****************************************************************/

	public static int calcularMorosidadAlquiler(int pidAlquiler)throws java.text.ParseException{

	 	int morosidadAlquiler = -1;

	 	String fechaAlquilerTextual = listaAlquileres[pidAlquiler][3],
	 		estadoAlquiler = listaAlquileres[pidAlquiler][4],
	 		fechaDevolucionTextual = listaAlquileres[pidAlquiler][5];
	 		DateFormat formatoFechas = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

	 	if (estadoAlquiler.equals("0")) {
	 		// Alquiler efectivo (sin devolver)

	 		Date fechaAlquiler = formatoFechas.parse(fechaAlquilerTextual);
			Date fechaActual = new Date();
		 	int diasDeMorosidad = (int)((fechaActual.getTime() - fechaAlquiler.getTime())) / (24 * 60 * 60 * 1000) - diasMorosidad;

		 	if (diasDeMorosidad > 0) {
		 		// Existe morosidad para el Alquiler actual
		 		int morosidadMonetaria = diasDeMorosidad * multaAtrasoDiario;
		 		morosidadAlquiler = morosidadMonetaria;
		 	}

	 	}

	 	return morosidadAlquiler;

	}

	/*****************************************************************
	 * Rutina: reiniciarSistema
	 * Proposito: Reinicia los arreglos para iniciar el sistema desde 0 sin reiniciar la aplicacion
	 * Parametro:
	 *
	 * Retorna:
	 *****************************************************************/

	public static void reiniciarSistema(){

		listaAfiliados = new String[1000][5];
		listaPeliculas = new String[500][4];
		listaEjemplares = new String[2000][2];
		listaAlquileres = new String[2000][6];
		nuevoIndiceAfiliado = 0;
		nuevoIndicePelicula = 0;
		nuevoIndiceEjemplar = 0;
		nuevoIndiceAlquiler = 0;


	}

	/*****************************************************************
	 * Rutina: calcularMorosidadTotal
	 * Proposito: Calcula el monto del morosidad total de todos los alquileres
	 * Parametro:
	 *
	 * Retorna: int
	 *			La morosidad total.
	 *****************************************************************/

	public static int calcularMorosidadTotal()throws java.text.ParseException{

	 	int morosidadTotal = 0,
	 		morosidadAlquiler = 0;


	 	for (int i = 0; i < nuevoIndiceAlquiler; i++){

	 		morosidadAlquiler = calcularMorosidadAlquiler(i);

	 		if (morosidadAlquiler != -1) {

	 			morosidadTotal += morosidadAlquiler;

	 		}

	 	}

	 	return morosidadTotal;

	}

}
