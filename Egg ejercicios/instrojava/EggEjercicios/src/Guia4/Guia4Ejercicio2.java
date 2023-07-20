/*
Diseñe una función que pida el nombre y la 
edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique
si son mayores o menores de edad. Después de 
cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package Guia4;

import java.util.Scanner;

public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas ");
        int n = leer.nextInt();
        nombres(n);
    }

    public static void nombres(int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Integrese la edad");
            int edad = leer.nextInt();
            if (edad < 18) {
                System.out.println(nombre + " es menor a 18 años ");
            } else {
                System.out.println(nombre + " es mayor de edad ");
            }
            System.out.println("¿Quieres seguir mostrando nombres? S/N");
            String resp = leer.next();
            if ((!"S".equalsIgnoreCase(resp))||(i==n)) {
                break;
            }
        }

    }
}
