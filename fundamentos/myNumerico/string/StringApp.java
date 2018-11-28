package string;


public class StringApp {

    public static void main(String[] args) {
//longitud del string
 	    String str="El primer programa";
	    System.out.println("longitud "+str.length());
//comienza y termina por...
    	str="El primer programa";
        System.out.println("comienza por El      "+str.startsWith("El"));
        System.out.println("termina por programa "+str.endsWith("programa"));
//posici�n de un car�cter
	    int pos=str.indexOf('p');
        System.out.println("posici�n de la letra p "+pos);
//segunda ocuurencia de p
	    pos=str.indexOf('p', pos+1);
//comparaci�n
  	    str="Tom�s";
	    System.out.println("Orden alfab�tico "+str.compareTo("Alberto"));
  	    str="Alberto";
	    System.out.println("Orden alfab�tico "+str.compareTo("Tom�s"));
	    System.out.println("Orden alfab�tico "+str.compareTo("Alberto"));
//substring
        str="El lenguaje Java";
	    System.out.println("Substring "+str.substring(12));
	    System.out.println("Substring "+str.substring(3, 11));
 //eliminar los espacios en blanco
 	    str="  12 ";
	    System.out.println("string original               "+str);
	    System.out.println("string sin espacios en blanco "+str.trim());
 //convertir un n�mero en string
        int valor=24;
        str=String.valueOf(valor);
	    System.out.println("n�mero --> string "+str);
 //convertir un string en n�mero
	    str="  12 ";
	    int numeroInt=Integer.parseInt(str.trim());
	    System.out.println("string --> n�mero "+numeroInt);
        str="12.35 ";
	    double numeroDouble=Double.valueOf(str).doubleValue();
	    System.out.println("string --> n�mero "+numeroDouble);

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
      }
}

 