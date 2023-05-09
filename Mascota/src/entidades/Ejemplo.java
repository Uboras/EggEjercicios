
package entidades;

import java.util.Scanner;

public class Ejemplo {
   
    public static void main(String[] args) {
   Scanner op = new Scanner(System.in);
   double radio= 10.11; 
   Circunferencia lp = new Circunferencia(radio);    
    
    
        System.out.println(lp.toString());

    
    }
    
}
