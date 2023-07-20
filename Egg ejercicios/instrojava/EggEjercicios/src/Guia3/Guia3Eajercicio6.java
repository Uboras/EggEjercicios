
import java.util.Scanner;

public class Guia3Eajercicio6 {

    public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);

        System.out.println("Ingrese Dos numeros positivos ");
        int num = ni.nextInt();
        int num2 = ni.nextInt();
        
        String salida = "n";
        double division = 0.0;
        division = num / num2;
      do {  
        System.out.print("Menu \n1-Suma\n2-Resta\n3-Multiplicar\n4-Dividir\n5-Salir\n Elija Opción:  ");
        int resp = ni.nextInt();
                
             
        switch (resp) {

            case 1:
                System.out.println(" La suma es: " +(num + num2)); break;
            case 2:
                System.out.println("La resta es: " + (num - num2)); break;
            case 3:
                System.out.println("La multiplicacion es: " + (num * num2)); break;
            case 4:
                System.out.println("La division es: " + division); break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salida = ni.next();
                         break;
                
             default:
                System.out.print("La opcion no es correcta "); 
        }
   } while ( (!salida.equalsIgnoreCase("s")));
      }
    }
    

