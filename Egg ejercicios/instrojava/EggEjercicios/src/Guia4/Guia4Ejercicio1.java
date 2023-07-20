/*
 Crea una aplicación que le pida dos números al 
suario y este pueda elegir entre sumar, restar,
multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben
devolver sus resultados para imprimirlos en el main. 
 */
package Guia4;

import java.util.Scanner;

public class Guia4Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuales numeros queres operar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resp = 0;
        do {
            System.out.println("1-Suma\n2-Resta\n3-Multiplicar\n4-Dividir\n5-Salir");
            resp = leer.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("La suma es: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("La multi es: " + multi(num1, num2));
                    break;
                case 4: double division=divi(num1, num2);
                    System.out.println("La division es: " +division );
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("La respuesta no es correcta");
            }

        } while (resp != 5);

    }

    private static int suma(int num1, int num2) {

        int suma = num1 + num2;
        return suma;

    }

    private static int resta(int num1, int num2) {

        int resta = num1 - num2;
        return resta;
    }

    private static int multi(int num1, int num2) {

        int multi = num1 * num2;
        return multi;
    }

    private static double divi(int num1, int num2) {
double numd=num1;double numd2=num2; 
        double divi = numd / numd2;
        return divi;
    }

}
