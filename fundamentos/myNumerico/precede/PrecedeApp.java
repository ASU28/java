package precede;

public class PrecedeApp {
    public static void main(String[] args) {
        int tF=80;
        System.out.println("la temperatura Fahrenheit es "+tF);
        int tC=(tF-32)*5/9;
        System.out.println("la temperatura cent�grada es "+tC);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }
}

