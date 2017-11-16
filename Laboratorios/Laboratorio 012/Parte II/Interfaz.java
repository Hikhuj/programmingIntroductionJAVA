/* IMPORTS */
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class Interfaz {
	
	/* INSTANCIAS */
	BackendCalculadora bkCalculadora = new BackendCalculadora();

	/* BOTONES */
	private JButton botonSuma;
	private JButton botonResta;
	private JButton botonMultiplicacion;
	private JButton botonDivision;
	private JButton botonAreaTriangulo;
	private JButton botonSalirSistema;

	/* CAMPOS DE TEXTO */
	private JTextField textoValorUno;
	private JTextField textoValorDos;
	private JTextField textoResultado;

	/* ETIQUETAS */
	private JLabel valorUno;
	private JLabel valorDos;
	private JLabel resultadoOperacion;

	JFrame ventana;

	public void iniciarSistema() {

		ventana = new JFrame();



		/* ETIQUETAS */
		valorUno = new JLabel("Ingrese valor 1:");
		valorUno.setBounds(20,20,120,40);
		ventana.add(valorUno);

		valorDos = new JLabel("Ingrese valor 2:");
		valorDos.setBounds(250,20,120,40);
		ventana.add(valorDos);

		resultadoOperacion = new JLabel("Resultado:");
		resultadoOperacion.setBounds(20,50,120,40);
		ventana.add(resultadoOperacion);



		/* CAMPOS PARA TEXTO */
		textoValorUno = new JTextField("3");
		textoValorUno.setText("0");
		textoValorUno.setBounds(120,25,100,30); //x axis, y axis, width, height
		ventana.add(textoValorUno);

		textoValorDos = new JTextField("3");
		textoValorDos.setText("0");
		textoValorDos.setBounds(350,25,100,30); //x axis, y axis, width, height
		ventana.add(textoValorDos);

		textoResultado = new JTextField(" ");
		textoResultado.setEnabled(false);
		textoResultado.setBounds(120,55,100,30); //x axis, y axis, width, height
		ventana.add(textoResultado);



		/* BOTONES */
		botonSuma = new JButton("Suma");
		botonSuma.setBounds(20,100,120,40); //x axis, y axis, width, height
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int valor1 = (int) Integer.parseInt(textoValorUno.getText());
				int valor2 = (int) Integer.parseInt(textoValorDos.getText());
				bkCalculadora.setOperacionSuma(valor1, valor2);
				textoResultado.setText(String.valueOf(bkCalculadora.getOperacionSuma()));
			}
		});
		ventana.add(botonSuma);

		botonResta = new JButton("Resta");
		botonResta.setBounds(140,100,120,40); //x axis, y axis, width, height
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int valor1 = (int) Integer.parseInt(textoValorUno.getText());
				int valor2 = (int) Integer.parseInt(textoValorDos.getText());
				bkCalculadora.setOperacionResta(valor1, valor2);
				textoResultado.setText(String.valueOf(bkCalculadora.getOperacionResta()));
			}
		});
		ventana.add(botonResta);

		botonMultiplicacion = new JButton("Multiplicacion");
		botonMultiplicacion.setBounds(20,140,120,40); //x axis, y axis, width, height
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int valor1 = (int) Integer.parseInt(textoValorUno.getText());
				int valor2 = (int) Integer.parseInt(textoValorDos.getText());
				bkCalculadora.setOperacionMultiplicacion(valor1, valor2);
				textoResultado.setText(String.valueOf(bkCalculadora.getOperacionMultiplicacion()));
			}
		});
		ventana.add(botonMultiplicacion);

		botonDivision = new JButton("Division");
		botonDivision.setBounds(140,140,120,40); //x axis, y axis, width, height
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int valor1 = (int) Integer.parseInt(textoValorUno.getText());
				int valor2 = (int) Integer.parseInt(textoValorDos.getText());
				bkCalculadora.setOperacionDivision(valor1, valor2);
				textoResultado.setText(String.valueOf(bkCalculadora.getOperacionDivision()));
			}
		});
		ventana.add(botonDivision);

		botonAreaTriangulo = new JButton("Area de Triangulo");
		botonAreaTriangulo.setBounds(20,180,240,40); //x axis, y axis, width, height
		botonAreaTriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				int valor1 = (int) Integer.parseInt(textoValorUno.getText());
				int valor2 = (int) Integer.parseInt(textoValorDos.getText());
				bkCalculadora.setAreaTriangulo(valor1, valor2);
				textoResultado.setText(String.valueOf(bkCalculadora.getAreaTriangulo()));
			}
		});
		ventana.add(botonAreaTriangulo);

		botonSalirSistema = new JButton("Salir");
		botonSalirSistema.setBounds(350,400,120,40); //x axis, y axis, width, height
		botonSalirSistema.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					bkCalculadora.salirSistema();
				}
			}
		);
		ventana.add(botonSalirSistema);


		/* VENTANA */
		ventana.setBounds(450,200,500,500); //x axis, y axis, width, height
		ventana.setLayout(null);
		// Si el panel es visible o no
		ventana.setVisible(true);
		// Definir si panel es redimencionable o no
		ventana.setResizable(false);
		// agregar titulo de ventana
		ventana.setTitle("Calculadora");
		// Se indica que al cerrarse la ventana del panel se terminara la ejecucion del programa
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


}