/*--------------------------------|
|  (C) Angel Franco Garc�a        |
|   Este programa se puede usar   |
|    sin restricci�n alguna       |
|---------------------------------*/

/** Este es el primer programa de una
serie dedicada explicar los fundamentos del lenguaje Java */


package primero;
 public class PrimeroApp{
    public static void main(String[] args) {
//imprime un mensaje
        String mensaje="El primer programa";
       	System.out.println(mensaje);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

