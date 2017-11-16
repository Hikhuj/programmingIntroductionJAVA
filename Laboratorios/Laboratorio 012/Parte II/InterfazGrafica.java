import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
public class InterfazGrafica implements ActionListener, WindowListener
{
  
  // Constantes
  
  
  
  // Botones
  private JButton botonAbrir;  
  private JButton botonGuardar; 
  
  // Elementos de edicion
  private JTextField textoDeUnaLinea;
  private JTextArea textoMultilinea;
  
  // Elementos de visualizacion
  private JLabel etiqueta;
  
  public InterfazGrafica()
  {
    JFrame ventana  = new JFrame();
    ventana.setLayout(null);
    ventana.setBounds(150,100,535, 480); // x,y, ancho,alto
    
    ventana.addWindowListener(this);
    
    botonAbrir = new JButton("Abrir");
    botonAbrir.setBounds(10,50,100,30);
    botonAbrir.addActionListener(this);
    
    ventana.getContentPane().add(botonAbrir);
    
    botonGuardar = new JButton("Guardar");
    botonGuardar.setBounds(120,50,100,30);
    botonGuardar.addActionListener(this);
    ventana.getContentPane().add(botonGuardar);
    
    textoDeUnaLinea = new JTextField();
    textoDeUnaLinea.setBounds(10,150,500,30);
    ventana.getContentPane().add(textoDeUnaLinea);
    
    textoMultilinea = new JTextArea ();
    //textoMultilinea.setBounds(10,185,300,200);
    //ventana.getContentPane().add(textoMultilinea);
    
    JScrollPane scroll = new JScrollPane(textoMultilinea);
    scroll.setBounds(10,185,500,200);
    ventana.getContentPane().add(scroll);
    
    etiqueta = new JLabel("Esto es una etiqueta");
    etiqueta.setBounds(10,100,500,30);
    ventana.getContentPane().add(etiqueta);
    
    
    ventana.addComponentListener(new ComponentAdapter(){
    
      public void componentResized(ComponentEvent evt){
      
        Dimension nuevoTamanio = evt.getComponent().getBounds().getSize();
        double ancho = nuevoTamanio.getWidth();
        double alto = nuevoTamanio.getHeight();
        scroll.setBounds(10,185,(int)(ancho-30),(int)(alto - 185-50));
      }
    
    });
    
    ventana.setVisible(true);
    
  }
  
  public void actionPerformed(ActionEvent evento)
  {
    System.out.println("Se llamo al evento con "+ evento);
    String nombreDelEvento = evento.getActionCommand();
    Object quienLlamaAlMetodo = evento.getSource();
    
    if(quienLlamaAlMetodo == botonAbrir)
    {
      etiqueta.setText("Voy a abrir el archivo: " + textoDeUnaLinea.getText());
      abrirArchivo();
    }
    else if (quienLlamaAlMetodo == botonGuardar)
    {
      etiqueta.setText("Voy a guardar el archivo: " + textoDeUnaLinea.getText());
      guardarArchivo();
    }
    
  }
  
  public void abrirArchivo()
  {
    String ruta = this.textoDeUnaLinea.getText();
    LectorDeArchivos lector = new LectorDeArchivos(ruta);
    String contenido = lector.leerArchivo();
    textoMultilinea.setText(contenido);
    lector.cerrar();
  }
  
  public void guardarArchivo()
  {
   String ruta = this.textoDeUnaLinea.getText();
   EscritorDeArchivos escritor = new EscritorDeArchivos(ruta,false);
     escritor.escribir(textoMultilinea.getText());
     escritor.cerrar();
  }
  
  
   public void windowActivated(WindowEvent event) {
    System.out.println("The window has been activated");
  }
  
  public void windowClosed(WindowEvent event) {
    System.out.println("La ventana ha sido cerrada");
  }
  
  public void windowClosing(WindowEvent event) {
    System.out.println("Se va a cerrar la ventana");
  }
  
  public void windowDeactivated(WindowEvent event) {
    System.out.println("La ventana se ha desactivado");
  }
  
  public void windowDeiconified(WindowEvent event) {
    System.out.println("La ventana se ha restaurado");
  }
  
  public void windowIconified(WindowEvent event) {
    System.out.println("La ventana se ha minimizado");
  }
  
  public void windowOpened(WindowEvent event) {
    System.out.println("La ventana se ha abierto");
  }
  
  public static void main (String args[])
  {
    InterfazGrafica i = new InterfazGrafica();
  }
  
}
