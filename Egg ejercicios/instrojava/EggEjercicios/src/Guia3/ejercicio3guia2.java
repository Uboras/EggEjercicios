
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
public class ejercicio3guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String frase ;
        System.out.println(" Danos una frase a convertir ");
        frase = entrada.nextLine();
        System.out.println("Tu nombre en mayusculas es: " + frase.toUpperCase());
        System.out.println("Tu nombre en mayusculas es: " + frase.toLowerCase());
    }
    
}
