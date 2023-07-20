package Guia4;


import java.util.Scanner;

public class Guia4Ejercicio11{

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba la frase a codificar ");
        String frase = leer.nextLine();
      
        String fraseL = convert(frase);

        System.out.println("La frase codificada es " + fraseL);
    }

    public static String convert(String frase) {
            String fraseL = " ";
        int largo = frase.length();
        if (((frase.substring(largo - 1, largo)).equals("."))) {
            for (int i = 0; largo > i; i++) {

                switch (frase.substring(i, i + 1)) {

                    case "a":
                        fraseL = fraseL + "@";
                        break;
                    case "e":
                        fraseL = fraseL + "#";
                        break;
                    case "i":
                        fraseL = fraseL + "$";
                        break;
                    case "o":
                        fraseL = fraseL + "%";
                        break;
                    case "u":
                        fraseL = fraseL + "*";
                        break;
                    default:
                        fraseL = fraseL + frase.substring(i, i + 1);
                        break;

                }
            }
        } else {
            
        }
         return fraseL;
    }
}
