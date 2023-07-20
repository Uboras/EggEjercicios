/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia13excepciones3;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class NewClass {
    public static void main(String[] args) {
        
        int[] tablon = new int[2];
       
        boolean tablita=false;
     

        do {
            Scanner leer = new Scanner(System.in);
            

            try {
        
                System.out.println(tablon[leer.nextInt()]);
                
            } catch (Exception e) {
                System.out.println("Vector fuera de rango");
                tablita = true;
           
            }
          
        } while (tablita==true);

    }

}

