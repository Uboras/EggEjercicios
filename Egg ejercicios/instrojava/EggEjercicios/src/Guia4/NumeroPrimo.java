/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;


        public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese el numero a verificar... ");
    int numero = leer.nextInt();
                
        boolean esPrimo = esPrimo(numero);
        System.out.println("El número " + numero + " es primo: " + esPrimo);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
        
        
    
    

