/**
 * Clase para registrar los datos de una tesis
 * @author  Amparo L�pez Gaona
 * @version Abril 2006
 * @see Obra
 */
public class Tesis extends Obra {
  private String director;
  private String grado;

  /** Constructor de una tesis
   * @param autor- nombre del autor de la tesis
   * @param t�tulo- t�tulo de la tesis
   * @param tema - tema de clasificaci�n de la tesis
   * @param a�o - a�o de publicaci�n de la tesis
   * @param d - director de la tesis
   * @param g - grado 
   */
  public Tesis(String autor, String t�tulo, String tema, int a�o, String d,
               String g){
    super(autor, t�tulo, tema, a�o);
    director = d;
    grado = g;
  }

  /**
   * M�todo para obtener la director de la tesis
   * @return String - director de la tesis
   */
  public String obtenerDirector(){
    return director;
  }

  /** 
   * M�todo para asignar director a la tesis
   * @param ed - director de la tesis
   */
  public void asignarDirector(String d){
    director = (d != null) ? d : "Amparo L�pez Gaona";
  }

  /**
   * M�todo para obtener la grado de la tesis
   * @return String - grado de la tesis
   */
  public String obtenerGrado(){
    return grado;
  }

  /** 
   * M�todo para asignar grado a la tesis
   * @param ed - grado de la tesis
   */
  public void asignarGrado(String g){
    grado = (g != null) ? g : "Licenciatura";
  }

  /**
   * M�todo para obtener una cadena con los datos de la tesis
   * @return String - cadena con los datos de la tesis
   */
  public String toString() {
    return super.toString() + "\t" + director +"\t" + grado;
  }
}
