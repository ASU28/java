/**
 * Clase para registrar los datos de una obra literaria.
 * @author  Amparo L�pez Gaona
 * @version Abril 2006
 */
public class Obra {
  private String autor;
  private String t�tulo;
  private String tema;
  private int a�o;

  /** Constructor de una obra
   * @param a- nombre del autor de la obra
   * @param t- t�tulo de la obra
   * @param tem - tema de clasificaci�n de la obra
   * @param an - a�o de publicaci�n de la obra
   */
  public Obra(String a, String t, String tem, int an){
    autor = a;
    t�tulo = t;
    tema = tem;
    a�o = an;
  }
  /** M�todo para asignar valor al autor de la obra
   * @param nombre - nombre del autor de la obra
   */
  public void asignarAutor (String nombre) {
    autor = nombre;
  }
  /** M�todo para asignar t�tulo a la obra
   * @param t- t�tulo de la obra
   */
  public void asignarT�tulo (String t) {
    t�tulo = t;
  }
  /** M�todo para asignar tema a la obra
   * @param t - tema de la obra
   */
  public void asignarTema (String t) {
    tema = t;
  }
  /** M�todo para asignar a�o a la obra
   * @param a - a�o de publicaci�n de la obra
   */
  public void asignarA�o (int a) {
    a�o = a;
  }
  /**
   * M�todo para obtener el autor de la obra
   * @return String - nombre del autor de la obra
   */
  public String obtenerAutor () {
    return autor;
  }
  /**
   * M�todo para obtener el tema de la obra
   * @return String - tema de la obra
   */
  public String obtenerTema () {
    return tema;
  }

  /**
   * M�todo para obtener el t�tulo de la obra
   * @return String - t�tulo de la obra
   */
  public String obtenerT�tulo () {
    return t�tulo;
  }

  /**
   * M�todo para obtener el a�o de la obra
   * @return int - a�o de publicaci�n de la obra
   */
  public int obtenerA�o () {
    return a�o;
  }
  /**
   * M�todo para obtener una cadena con los datos de la obra
   * @return String - cadena con los datos de la obra
   */
  public String toString() {
    return autor + "\t"+ t�tulo + "\t"+ tema + "\t" + a�o;
  }
}


