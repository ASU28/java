/**
 * Clase para registrar los datos de un libro
 * @author  Amparo L�pez Gaona
 * @version Abril 2006
 * @see Obra
 */
public class Libro extends Obra {
  private String editorial;

  /** Constructor de un libro
   * @param autor- nombre del autor del libro
   * @param t�tulo- t�tulo del libro
   * @param tema - tema de clasificaci�n del libro
   * @param a�o - a�o de publicaci�n del libro
   * @param ed - editorial del libro
   */
  public Libro(String autor, String t�tulo, String tema, int a�o, String ed){
    super(autor, t�tulo, tema, a�o);
    editorial = ed;
  }

  /**
   * M�todo para obtener la editorial del libro
   * @return String - editorial del libro
   */
  public String obtenerEditorial(){
    return editorial;
  }

  /** 
   * M�todo para asignar editorial al libro
   * @param ed - editorial del libro
   */
  public void asignarEditorial(String ed){
    editorial = (ed != null) ? ed : "Desconocida";
  }

  /**
   * M�todo para obtener una cadena con los datos del libro
   * @return String - cadena con los datos del libro
   */
  public String toString() {
    return super.toString() + "\t" + editorial;
  }
}

