package figuras;

public class FiguraApp {
    public static void main(String[] args) {
//enlace temprano
        Circulo c=new Circulo(0, 0, 5.5);
        System.out.println("Area del c�rculo "+c.area());
        Rectangulo r=new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rect�ngulo "+r.area());
 //enlace tard�o
        Figura f=new Circulo(0, 0, 5.5);
        System.out.println("Area del c�rculo "+f.area());
        f=new Rectangulo(0, 0, 5.5, 2.0);
        System.out.println("Area del rect�ngulo "+f.area());
//array de objetos  
        Figura fig[]=new Figura[4];
        fig[0]=new Rectangulo(0,0, 5.0, 7.0);
        fig[1]=new Circulo(0,0, 5.0);
        fig[2]=new Circulo(0, 0, 7.0);
        fig[3]=new Rectangulo(0,0, 4.0, 6.0);
        Figura fMayor=figuraMayor(fig);
        System.out.println("El �rea mayor es "+fMayor.area());

        try  {
//espera la pulsaci�n de una tecla y luego RETORNO
            System.in.read();
        }catch (Exception e) {  }
    }

//determinar la figura que tiene el �rea mayor
   static Figura figuraMayor(Figura figuras[]){
        Figura mFigura=null;
        double areaMayor=0.0;
        for(int i=0; i<figuras.length; i++){
            if(figuras[i].area()>areaMayor){
                areaMayor=figuras[i].area();
                mFigura=figuras[i];
            }
        }
        return mFigura;
    }



}

