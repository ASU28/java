package valor;

public class ValorApp {
    public static void main(String[] args) {
        int a=3;
        System.out.println("antes de la llamada: a="+a);
        funcion(a);
        System.out.println("despu�s de la llamada: a="+a);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }

    public static void funcion(int x){
        x=5;
        System.out.println("dentro de la funci�n: a="+x);
    }
}


 