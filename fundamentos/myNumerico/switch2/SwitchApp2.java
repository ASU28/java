package switch2;

public class SwitchApp2 {
    public static void main(String[] args) {
        int mes=2;
        int a�o=1992;
        int numDias=30;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if ( ((a�o % 4 == 0) && !(a�o % 100 == 0)) || (a�o % 400 == 0) )
                    numDias = 29;
                else
                    numDias = 28;
                break;
            default:
                System.out.println("Este mes no existe");
                break;
        }
        System.out.println("El mes "+mes+" del a�o "+a�o+" tiene "+numDias+" d�as");
        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) { }
    }
}

