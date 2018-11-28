/**
 * Clase para trabajar cuentas de cr�dito. Este tipo de cuentas tienen adem�s
 * de un saldo o cantidad disponible, un l�mite de cr�dito y la cantidad que 
 * se adeuda
 * @author Amparo L�pez Gaona
 * @version Abril 2006
 * @see Cuenta
 */
public class CuentaDeCredito extends Cuenta {
  private final double l�mite;
  private double deuda;

  /**
   * Constructor de una cuenta de cr�dito a partir del l�mite de cr�dito especificado
   * @param cr�dito - l�mite de cr�dito otorgado
   */
  public CuentaDeCredito (double cr�dito) {
    super (cr�dito);   //  disponible = l�mite;
    l�mite = cr�dito;
    deuda = 0;
  }
  /**
   * M�todo que registra una compra mediante la cuenta de cr�dito siempre que
   * el monto de la misma sea positivo y menor que el disponible.
   * @param monto - importe de la compra
   * @return boolean - indica si se autoriza la compra o no.
   */
  public boolean comprar(double monto) {
    if (monto > 0.0 && monto < disponible ) {
      deuda += monto;
      disponible -= monto;
      return true;
    } else return false;
  }
  /**
   * M�todo para retirar dinero de una cuenta de cr�dito
   * @param monto - importe del retiro
   * @exception ExcepcionBancaria - disparada si el d�posito es negativo
   */
    public void retirar (double monto) {
    if (monto >0.0 && monto <= disponible ) {
      double comision = monto *0.02;
      super.retirar(monto+comision);
      deuda += monto + comision;
    }
  }
  /**
   * M�todo para conocer el importe de la deuda de la tarjeta de cr�dito
   * @return double - importe de la deuda.
   */
  public double obtenerValorDeuda() {
    return deuda;
  }
}
