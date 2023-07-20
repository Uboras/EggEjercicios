
package GUIA3;

import java.util.Scanner;

public class Guia3Ejercicio2 {
   /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá
   un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
   Nota: investigar la función equals() en Java.*/
    
    public static void main(String[] args) {

        Scanner fra = new Scanner(System.in);
        String frase= "eureka";
        String ingreso ;
        System.out.print("Ingrese la Frase ");
        ingreso = fra.nextLine();
        
        if (ingreso.equals(frase)){
        System.out.print("Correcto  ");
            
        } else { 
           System.out.print("Incorrecto  ");
              

        }
        
    }
    
}
