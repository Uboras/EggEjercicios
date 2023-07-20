
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class Ejercicio4guia2 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int grados; int farengeit;
           
        System.out.println(" ¿Cuantos grados quiere convertir? ");
        grados = entrada.nextInt();
        farengeit = 32 + (9 * grados/5);
        System.out.println("Los gradso en Fahrenheut son " + farengeit );
            
    }
    
    
}
