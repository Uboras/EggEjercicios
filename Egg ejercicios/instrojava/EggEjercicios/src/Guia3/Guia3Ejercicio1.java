
package GUIA3;

import java.util.Scanner;

public class Guia3Ejercicio1 {
    //Crear un programa que dado un número determine si es par o impar

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int mod;
        System.out.println("Danos el numero a determinar si es par o no ");
        num = leer.nextInt();
       
        if (num%2==0) {
        System.out.println("El numero es par");
        } else {System.out.println(" El numero es no par ");}                
              
    }
    
}
