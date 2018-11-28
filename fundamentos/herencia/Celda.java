/**
 *  Clase para almacenar cualquier tipo de dato
 *  @author  Amparo L�pez Gaona
 *  @version Abril 2006
 */
public class Celda {
  private Object valor;
/** 
 * Constructor por omisi�n, asigna el valor null.
 */
  public Celda () {
    valor = null;  
  }
/**
 * M�todo para asignar valor al objeto.
 * @param val - valor que se asignar�.
 */
  public void asignarValor(Object val) {
    valor = val;
  }
/**
 * M�todo para recuperar el valor almacenado.
 * @return Object - valor almacenado.
 */
  public Object obtenerValor() {
    return valor;
  }
}

