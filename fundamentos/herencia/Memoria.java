/**
 *  Clase para simular una memoria en la que se puede almacenar cualquier
 *  tipo de dato.
 *  @author  Amparo L�pez Gaona
 *  @version Abril 2006
 */
public class Memoria {
  DepositoDato [] mem;

/** 
 * Constructor por omisi�n, crea una memoria para 100 elementos.
 */
  public Memoria() {
    mem = new DepositoDato[100];
    for (int i = 0; i < mem.length; i++) {
      mem[i] = new DepositoDato();
    }
  }
/** 
 * Constructor por omisi�n, crea una memoria para la cantidad
 * especificada de elementos.
 * @param tama�o - capacidad de la memoria.
 */
  public Memoria(int tama�o) {
    mem = (tama�o > 0) ? new DepositoDato[tama�o] : new DepositoDato[100];
    for (int i = 0; i < mem.length; i++) {
      mem[i] = new DepositoDato();
    }
  }
/**
 * M�todo para almacenar un dato en la posici�n especificada.
 * @param pos - posici�n en que almacenar� el dato
 * @param val - valor que se asignar�.
 */
  public void almacenarDato(int pos, Object val) {
    if (pos > 0 && pos < mem.length) {
      mem[pos].asignarValor(val);
    }
  }
/**
 * M�todo para recuperar el valor almacenado en la posici�n especificada.
 * @param pos - posici�n de la que se tomar� el dato
 * @return Object - valor almacenado.
 */
  public Object obtenerDato(int pos) {
    return (pos > 0 && pos < mem.length) ? mem[pos].obtenerValor() : null;
  }

}

