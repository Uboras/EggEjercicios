/*
Realizar un programa que solo permita introducir solo 
frases o palabras de 8 de largo. Si el usuario ingresa 
una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package GUIA3;

import java.util.Scanner;

public class Guia3Ejercicio3 {

    public static void main(String[] args) {

        Scanner fras = new Scanner(System.in);
        String frase;

        System.out.println("introdusca la Frase");
        frase = fras.nextLine();
while (frase.length()== 8){
        if (frase.length() == 8) {
            System.out.println("Correcto ");
        } else {
            System.out.println("Incorrecto ");
        }

    }
    }
}
