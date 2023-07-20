/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Ejercicio7guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner motor= new Scanner(System.in);
       int opcion ; 
        System.out.println("elegir la opcion de Motor");
        opcion = motor.nextInt();
       switch (opcion) {
               case 1:   System.out.println("La bomba es una bomba de agua");

               case 2:   System.out.println("La bomba es una bomba de gasolina");
               
               case 3:   System.out.println("La bomba es una bomba de hormigón");

               case 4:   System.out.println("La bomba es una bomba de pasta alimenticia");

               default : System.out.println("No existe un valor válido para tipo de bomba");
               

                   
       
       
       }
                
        
    }
    
    
}
