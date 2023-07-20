package guia5;

import java.util.Random;
import java.util.Scanner;

public class Guia5Ejercicio2 {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);

        System.out.println("Ingresa la cantidad del vector");
        int n = lp.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];

        rellenarVectores(vect1, vect2, n);
        verificarIgualdad(vect1, vect2, n);
    }

    public static void rellenarVectores(int[] vect1, int[] vect2, int n) {
        Random lp = new Random();
        for (int i = 0; i < n; i++) {
            vect1[i] = (int) lp.nextInt(2);
            vect2[i] = (int) lp.nextInt(2);
            System.out.println("["+ vect1[i]+ "] 1 [" + vect2[i]+ "] 2 ");
        }

    }

    private static void verificarIgualdad(int[] vect1, int[] vect2, int n) {
        int k=0;
        System.out.print("Posiciones iguales ");
        
        
        for (int i = 0; i < n; i++) {
            if (vect1[i] == vect2[i]) {
                System.out.print(" "+ (i+1));
                ++k;

            }else if(i==0){
                System.out.println("no hay en esta comparación");break;
            }else{System.out.println(",pero en la posicion "+(i+1)+" no son iguales.");
                System.out.println("Los vectores son Iguales");
                break;
            }
        }
        if( k == n){
        System.out.println(" todas las posiciones son iguales, los vectores lo son.");
    }

    }
}


