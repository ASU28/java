public class UsaCuentas {
 public static void main(String[] pps)   {
  InOut io=new InOut();
  double capital;
  boolean otram�s=true;
  CuentaConServicios cuenta;
                                       // Solicita capital inicial
  System.out.println("�Con cu�nto quieres iniciar tu cuenta?");
  capital=io.readDouble();
  while(capital<2500) {   //Valida el dep�sito inicial para una cuenta
    System.out.println("La cantidad m�nima es de $2500");
    System.out.println("Indica de nuevo la cantidad");
    capital=io.readDouble();
  }
  cuenta=new CuentaConServicios(capital);  // Crea la cuenta
  do {        //Muestra men� de opciones y pide seleccionar alguna
    System.out.println("1.Retirar capital");
    System.out.println("2.Depositar capital");
    System.out.println("3.Consultar saldo");
    System.out.println("4.Pagar tel�fono");
    System.out.println("9.Terminar");

    switch(io.readChar()) {
    case '1':            //Retiro
      System.out.println("�Cu�nto dinero quieres retirar?");
      capital=io.readDouble();
      cuenta.retirar(capital);
      break;
    case '2':            //Dep�sito
      System.out.println("�Qu� cantidad deseas depositar?");
      capital=io.readDouble();
      cuenta.depositar(capital);
      break;
    case '3':            // Saldo
      System.out.println("Tu saldo es de:$" + cuenta.darDisponible());
      break;
    case '4':            // Pago de tel�fono
      System.out.println("�Cu�nto dinero vas a pagar?");
      capital=io.readDouble(); 
      cuenta.pagarTel�fono(capital);
      System.out.println("Tel�fono pagado, gracias");
      break;
    case '9':              //Fin del programa
      System.out.println("***   Hasta pronto.   ***");
      otram�s = false;
      break;
    default:
      System.out.println("Opci�n inv�lida");
    }
  } while(otram�s==true); 
 }
}
