/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
class Jugo {

    public int numero;
    public int numero2;

  
    public void encontrarNumero() {
        Scanner lp = new Scanner(System.in);
        numero2 = 5;
        int cont = 0;
        int contVidas = 0;
        int contGanador = 0;
        do {
            contVidas++;

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese un numero del 1 al 10 hasta encontrar el correcto!");
                numero = lp.nextInt();
                cont = cont + 1;
                if (numero < numero2) {
                    System.out.println("elige un número más alto  ");
                    System.out.println("Te quedan: " + (4 - i) + " intentos");
                } else if (numero > numero2) {
                    System.out.println("elige un número más bajo  ");
                    System.out.println("Te quedan: " + (4 - i) + " intentos");

                } else if (numero == numero2) {
                    System.out.println("Encontraste el número!! ");
                    System.out.println("Lo encontraste en el intento: " + (i+1));
                    contGanador++;
                    break;

                }
            }
       
        } while (contVidas < 4);
        System.out.println("Jugador 2 ganó: " + contGanador);
        System.out.println("Jugador 1 ganó: " + (3 - contGanador));

    }
}
 

