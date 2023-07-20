package GUIA3;

import java.util.Scanner;

public class Guia3Ejercicio8 {

    /*Dibujar un cuadrado de N elementos por 
    lado utilizando el carácter “*”. Por 
    ejemplo, si el cuadrado tiene 4 elementos 
    por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * * 
     */

    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        System.out.print("¿cuántos caracteres de lado y alto tiene le cuadrado?");
        int lado = o.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if ((j == 0) || (j == (lado - 1) || (i == 0) || (i == (lado - 1)))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
