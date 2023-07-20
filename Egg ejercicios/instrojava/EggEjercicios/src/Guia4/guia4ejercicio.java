
import java.util.Scanner;

public class guia4ejercicio {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese los numeros a operar");
        int num1 = lp.nextInt();
        int num2 = lp.nextInt();
        int resp=0;
do{
        System.out.println("Que queres hacer?\n1-Sumar\n2-restar\n3-Multiplicar\n4-division");
         resp = lp.nextInt();

        switch (resp) {
            case 1: int suma =funcionSuma(num1,num2); System.out.println("La suma es: "+suma);break;
            case 2: int resta= funcionResta(num1,num2);System.out.println("La resta es: "+resta);break;
            case 3: int multi= funcionmulti(num1,num2);System.out.println("La multi es: "+multi);break;
            case 4: double division= funciondiv(num1,num2);System.out.println("La division es: "+division);break;
            default:System.out.println("La opcion no es correcta");break;
        }
        }while((resp>4)||(resp<0));
       


    }

    private static int funcionSuma(int num1, int num2) {
     
        int su = num1+num2;return su;
 }

    private static int funcionResta(int num1, int num2) {
        int re = num1-num2;return re;
    }

    private static int funcionmulti(int num1, int num2) {
     int mu = num1*num2;return mu;
    }

    private static double funciondiv(int num1, int num2) {
      double num1b=num1; double num2b=num2;
      double di = num1b/num2b;return di;
}
}