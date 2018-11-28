/**
 * Clase para manejar cuentas bancarias con la posibilidad de pagar
 * el tel�fono.
 * @author  Amparo L�pez Gaona
 * @see     Cuenta
 * @version Abril 2006
 */
public class CuentaConServicios extends Cuenta {
  /*
   * Constructor de CuentaConServicios, simplemente llama al contructor
   * de la clase Cuenta.
   */
  public CuentaConServicios(double montoInicial) {
    super(montoInicial);
  }
  /*
   * M�todo para pagar el tel�fono tomando dinero de la cuenta
   * con la que se llama a este m�todo.
   * @param monto - Cantidad que debe pagarse
   */
    public void pagarTel�fono(double monto) { 
    retirar(monto);
                // C�digo para pagar el tel�fono
    disponible += 100.00;
  }
}

