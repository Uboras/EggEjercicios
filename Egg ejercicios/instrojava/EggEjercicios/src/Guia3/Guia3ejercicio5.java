
package GUIA3;

import java.util.Scanner;


public class Guia3ejercicio5 {
/*Escriba un programa en el cual se
ingrese un valor límite positivo, y a 
continuación solicite números al
usuario hasta que la suma de 
los números introducidos supere el límite inicial.
  */
    public static void main(String[] args) {
    
      Scanner ni = new Scanner(System.in);
        
      System.out.println("Ingrese el numero limite de la suma");
      int num = ni.nextInt();
      int suma = 0;
      do {
          System.out.println("Ingrese numeros a sumar");
          suma = suma + ni.nextInt();
       
          }while (suma<=num);
      
     //| System.out.print(suma);
        
   System.out.println(suma);

// TODO code application logic here
    }
    
}
