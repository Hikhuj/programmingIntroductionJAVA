/* Version 2.0 */

public class Elemento
{
  
  private float masaAtomica;
  private String simboloQuimico;
  private String nombre;
  private int numeroAtomico;
  private float electronegatividad;


  // Metodos
  public float getMasaAtomica(){
    return masaAtomica;
  }
  
  public String getSimboloQuimico(){
    return simboloQuimico;
  }

  public String getNombre(){
    return nombre;
  }

  public int getNumeroAtomico(){
    return numeroAtomico;
  }

  public float getElectronegatividad(){
    return electronegatividad;
  }

  public void setMasaAtomica(float masaAtomicaParametro){
    this.masaAtomica = masaAtomica;
  }
  
  public void setSimboloQuimico(String simboloQuimicoParametro){
    this.simboloQuimico = simboloQuimico;
  }

  public void setNombre(String nombreParametro){
    this.nombre = nombre;
  }

  public void setNumeroAtomico(int numeroAtomicoParametro){
    this.numeroAtomico = numeroAtomicoParametro;
  }

  public void setElectronegatividad(float electronegatividadParametro){
    this.electronegatividad = electronegatividadParametro;
  }
  
}