

package teclado1;
import java.io.*;

public class TecladoApp1 {
  public static void main(String[] args) {
    char[] buffer=new char[255];
    System.out.println("Introduce una l�nea de texto y pulsa RETORNO ");
    try{
        Reader entrada=new InputStreamReader(System.in);
        int numBytes=entrada.read(buffer);
        System.out.println("N�mero de bytes le�dos "+numBytes);
    }catch(IOException ex){
        System.out.println("Error entrada/salida");
    }
    System.out.println("La l�nea de texto que has escrito es ");
    String str=new String(buffer);
    System.out.println(str);

    try  {
//espera la pulsaci�n de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
