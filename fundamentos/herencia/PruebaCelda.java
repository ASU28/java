public class PruebaCelda {
  public static void main (String [] pps) {
    Celda c = new Celda();

    c.asignarValor(5);   // Guarda un n�mero entero.
    System.out.println("El contenido es "+ c.obtenerValor());
    c.asignarValor(5.25);   // Guarda un n�mero real.
    System.out.println("El contenido es "+ c.obtenerValor());
    c.asignarValor(new Punto(3,5));   // Guarda un objeto.
    System.out.println("El contenido es "+ c.obtenerValor());
  }
}



