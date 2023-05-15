
import java.util.Arrays;
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
public class CadenaServicio {

    public void mostrarVocales2(Cadena usu) {
        String vocales = "aeiou";
        int[] vector = new int[usu.getLongitud()];

        for (int i = 0; i < vocales.length(); i++) {
            int vocal = 0;
            for (int j = 0; j < usu.getLongitud(); j++) {
                if (((char) vocales.charAt(i)) == (char) usu.getFrase().charAt(j)) {
                    vocal++;
                }
            }
            vector[i] = vocal;
        }

        for (int i = 0; i < 5; i++) {
            if (vector[i] > 0) {
                System.out.println("La vocal " + vocales.charAt(i) + " se encontro: " + vector[i]);
            }
        }

    }

    public void mostrarVocales(Cadena usu) {

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int t = 0; t < usu.getLongitud(); t++) {

            char cara = Character.toLowerCase(usu.getFrase().charAt(t));

            switch (cara) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }

        }
        if (a > 0) {
            System.out.println("La a se encontro: " + a);
        }
        if (e > 0) {
            System.out.println("La a se encontro: " + a);

        }
        if (i > 0) {

            System.out.println("La a se encontro: " + a);
        }
        if (o > 0) {
            System.out.println("La a se encontro: " + a);
        }
        if (u > 0) {
            System.out.println("La a se encontro: " + a);
        }
    }

    public void invertirFrase(Cadena usu) {
        String invertida = "";

        for (int i = (usu.getLongitud() - 1); i > -1; i--) {
            char letra = (char) usu.getFrase().charAt(i);

            invertida += letra;

        }
        System.out.println(invertida);
    }

    public void Remplazar(Cadena usu) {
        Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese el caracter a cambiar por la a");
        char caracter = lp.nextLine().charAt(0);
        String frase = "¡";
        for (int i = 0; i < usu.getLongitud(); i++) {

            if ((char) (usu.getFrase().charAt(i)) == 'a') {
                frase += caracter;
            } else {
                frase += (char) (usu.getFrase().charAt(i));
            }

        }
        System.out.println(frase + " !");
    }

    public void unirFrases(Cadena usu, String frase) {
        StringBuilder nueva = new StringBuilder();
        nueva.append(usu.getFrase());
        nueva.append(" ");
        nueva.append(frase);
        System.out.println(nueva);

    }
public void compararLongitud(Cadena usu, String frase){
    if(usu.getLongitud() == frase.length()){
        System.out.println("tiene la misma cantidad de caracteres");
        
    }else{ System.out.println("tienen diferente cantidad de letras");}
    
}

public void buscadorLetras(Cadena usu){
    
    Scanner ls = new Scanner (System.in);
    System.out.println("ingrrese el daot a buscar");
    char busc = (char)ls.nextLine().charAt(0);
if (usu.getFrase().contains(Character.toString(busc)));

    System.out.println("se encontro en la palabra el caracter: "+busc);
    }
}

