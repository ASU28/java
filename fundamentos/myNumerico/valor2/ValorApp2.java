package valor2;

public class ValorApp2 {
    public static void main(String[] args) {
        Entero aInt=new Entero(3);
        System.out.println("Antes de llamar a la funci�n");
        System.out.println("objeto.miembro "+aInt.valor);
        funcion(aInt);
        System.out.println("Despu�s de llamar a la funci�n");
        System.out.println("objeto.miembro "+aInt.valor);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
    public static void funcion(Entero xInt){
        xInt.valor=5;
    }
}
