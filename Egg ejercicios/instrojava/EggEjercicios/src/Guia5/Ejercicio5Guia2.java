
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
public class Ejercicio5Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre 
        por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
         */
        Scanner entrada = new Scanner(System.in);
        double num1 = 0;

        System.out.println("Danos un numero para trabajar");
        num1 = entrada.nextDouble();
        
        double doble = num1 * 2;
        double triple = num1 * 3;
        double raiz = Math.sqrt(num1);
        
        System.out.println("El doble del numero " + num1 + " es " + doble);
        System.out.println("El triple del numero " + num1 + " es " + triple);
        System.out.println("La raiz cuadrada del numero " + num1 + " es " + raiz);

    }

}
