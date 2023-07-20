package GUIA3;


import java.util.Scanner;


public class Guia3EjerExtr1 {
/*Dado un tiempo en minutos, calcular su equivalente en 
    días y horas. Por ejemplo, si el usuario ingresa 1600 minutos,
    el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
    public static void main(String[] args) {
      Scanner m = new Scanner(System.in);
    
       System.out.println("Escribi la cantidad de minutos " );
            int numeroMinutos = m.nextInt();
           // System.out.println((minuto/60/24)%1)0;
            int dias = numeroMinutos/60/24;
            int horas = ((numeroMinutos/60)-(dias*24));
            
         System.out.println("Son en dias "+dias+" , horas "+horas+" y minutos ");
      
             
      
      
    }
    
}
