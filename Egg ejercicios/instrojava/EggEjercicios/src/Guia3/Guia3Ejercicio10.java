package GUIA3;

import java.util.Scanner;

public class Guia3Ejercicio10{

    /*Dibujar un cuadrado de N elementos por lado 
    utilizando el carácter “*”. Por ejemplo, si 
    el cuadrado tiene 4 elementos por lado se 
    deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
    
     */
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);

        int resp;
        do {
            System.out.println(" ¿Cuandos mide el lado? ");
            int lado = qw.nextInt();

            System.out.println("El esquema quedaria así");

            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    if ((i == 0) || (j == 0) || (j == lado - 1) || (i == lado - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }

            System.out.println(" ¿Deseas volver a comenzar?\n1-S\n2-N");
            resp = qw.nextInt();
        } while (resp == 1);

    }

}

