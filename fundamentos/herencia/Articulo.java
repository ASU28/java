public class Articulo extends Obra {
  private String revista;
  private int volumen;
  private int n�mero;

  public Articulo(String autor, String t�tulo, String tema, int a�o, String r,
                  int v, int n){
    super(autor, t�tulo, tema, a�o);
    revista = r;
    volumen = v;
    n�mero = n;
  }
  /** 
   * M�todo para asignar revista al art�culo
   * @param ed - revista del art�culo
   */
  public void asignarRevista(String rev){
    revista = (rev != null) ? rev : "Desconocida";
  }

  /** 
   * M�todo para asignar volumen al art�culo
   * @param v - volumen del art�culo
   */
  public void asignarVolumen(int v){
      volumen = (v <= 0) ? v : 0;
  }

  /** 
   * M�todo para asignar n�mero al art�culo
   * @param n - n�mero del art�culo
   */
  public void asignarN�mero(int n){
      n�mero = (n <= 0) ? n :0;
  }

  /**
   * M�todo para obtener la revista de publicaci�n del art�culo
   * @return String - revista del art�culo
   */
  public String obtenerRevista(){
    return revista;
  }
  /**
   * M�todo para obtener el volumen del art�culo
   * @return int - volumen del art�culo
   */
  public int obtenerVolumen(){
    return volumen;
  }
  /**
   * M�todo para obtener el n�mero del art�culo
   * @return int - n�mero del art�culo
   */
  public int obtenerNumero(){
    return n�mero;
  }

  /**
   * M�todo para obtener una cadena con los datos de la obra
   * @return String - cadena con los datos de la obra
   */
  public String toString() {
    return super.toString() + "\t" + revista + "\t" + volumen + "\t" + n�mero;
  }
}

