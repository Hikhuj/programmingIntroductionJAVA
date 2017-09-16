/* Version 2.0 */

public class ProgramaQuimica 
{
  
  public static void main (String args[])
  {
    
    // Espacio de Elemento 1.
    Elemento elemento1 = new Elemento();

    // Asignamos los valores a los metodos set.
    elemento1.setMasaAtomica(1.00794f);
    elemento1.setSimboloQuimico("H");
    elemento1.setNombre("Hidrógeno");
    elemento1.setNumeroAtomico(1);
    elemento1.setElectronegatividad(2.20f);

    // Devolver los valores.
    float masaAtomicaElemento1 = elemento1.getMasaAtomica();
    String simboloQuimicoElemento1 = elemento1.getSimboloQuimico();
    String nombreElemento1 = elemento1.getNombre();
    int numeroAtomicoElemento1 = elemento1.getNumeroAtomico();
    float electronegatividadElemento1 = elemento1.getElectronegatividad();


    // Impresion de Elemento 1.
    // Todo esto lo podemos poner dentro de la misma clase, en este ejemplo, ya podemos ahorrarnos mucho espacio en el Main
    System.out.println("La masa atómica de " + nombreElemento1 + " es " + masaAtomicaElemento1 + ".");
    System.out.println("El símbolo atómico de " + nombreElemento1 + " es " + simboloQuimicoElemento1 + ".");
    System.out.println("El nombre del elemento es " + nombreElemento1 + ".");
    System.out.println("El número atómico de " + nombreElemento1 + " es " + numeroAtomicoElemento1 + ".");
    System.out.println("La electronegatividad de " + nombreElemento1 + " es " + electronegatividadElemento1 + ".");

    System.out.println("");
    System.out.println("");
    System.out.println("< ----------------------------------------------- >");
    System.out.println("");
    System.out.println("");


    // Espacio de Elemento 2.
    Elemento elemento2 = new Elemento();

    // Asignamos los valores a los metodos set.
    elemento2.setMasaAtomica(55.845f);
    elemento2.setSimboloQuimico("Fe");
    elemento2.setNombre("Hierro");
    elemento2.setNumeroAtomico(26);
    elemento2.setElectronegatividad(1.83f);

    // Devolver los valores.
    float masaAtomicaElemento2 = elemento2.getMasaAtomica();
    String simboloQuimicoElemento2 = elemento2.getSimboloQuimico();
    String nombreElemento2 = elemento2.getNombre();
    int numeroAtomicoElemento2 = elemento2.getNumeroAtomico();
    float electronegatividadElemento2 = elemento2.getElectronegatividad();


    // Impresion de Elemento 2.
    // Todo esto lo podemos poner dentro de la misma clase, en este ejemplo, ya podemos ahorrarnos mucho espacio en el Main
    System.out.println("La masa atómica de " + nombreElemento2 + " es " + masaAtomicaElemento2 + ".");
    System.out.println("El símbolo atómico de " + nombreElemento2 + " es " + simboloQuimicoElemento2 + ".");
    System.out.println("El nombre del elemento es " + nombreElemento2 + ".");
    System.out.println("El número atómico de " + nombreElemento2 + " es " + numeroAtomicoElemento2 + ".");
    System.out.println("La electronegatividad de " + nombreElemento2 + " es " + electronegatividadElemento2 + ".");

    
  }
  
}