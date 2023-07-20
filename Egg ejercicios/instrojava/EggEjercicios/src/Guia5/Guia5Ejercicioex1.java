package guia5;

import java.util.Scanner;

public class Guia5Ejercicioex1 {

    public static void main(String[] args) {

        Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese el tamña del vector");
        int n = lp.nextInt();
        int[] vector = new int[n];
        int k = 0, suma = 0;
        do {
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese los numeros a añadir al vector");
                vector[i] = lp.nextInt();
                suma = suma + vector[i];
            }
        } while (k > n);

        System.out.println("La suma: " + suma);
    }

}
