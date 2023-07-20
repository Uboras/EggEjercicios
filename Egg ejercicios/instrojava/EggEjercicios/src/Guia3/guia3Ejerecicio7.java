package GUIA3;

import java.util.Scanner;

public class guia3Ejerecicio7 {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        String cadena;
        do {

            System.out.println("Escribi la cadena de 5 cifras \nQue comience con X y termine en O ");
            cadena = m.nextLine();

            if (cadena.length() == 5) {
                if (((cadena.substring(0, 1)).equalsIgnoreCase("X")) && ((cadena.substring(4, 5)).equalsIgnoreCase("o"))) {
                    ++contadorCorrectas;
                } else {
                    ++contadorIncorrectas;
                }
            } else {
                ++contadorIncorrectas;
            }
        } while (!cadena.equalsIgnoreCase("&&&&&"));

        System.out.println("Se tomaron " + contadorCorrectas + " Correctas y Se Ingresaron " + (--contadorIncorrectas) + " frases incorrectas ");
    }

}
