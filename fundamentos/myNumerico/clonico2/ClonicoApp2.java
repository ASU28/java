package clonico2;

public class ClonicoApp2 {

    public static void main(String[] args) {
        int[][] datos={{2, 5, -1}, {0, -2, 4}, {1, -3, 2}};
        Matriz obj=new Matriz(datos);
        System.out.println("antes \n"+ obj);
        f(obj);
        System.out.println("despu�s \n"+ obj);
        System.out.println("************************");
        System.out.println("antes \n"+ obj);
        g(obj);
        System.out.println("despu�s \n"+ obj);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
    public static void f(Matriz matriz){
        matriz=(Matriz)matriz.clone();
        matriz.modificar();
    }
    public static void g(Matriz matriz){
        matriz.modificar();
    }
}


