/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;


public class ejerciciouno {

    public static void main(String[] args) {
 Scanner lo = new Scanner(System.in);
 
        System.out.println("cuantos numeros queres sumar?"); int n = lo.nextInt();
        int suma=0;
        int[] vec = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valores a sumar. faltan "+(n-i)+" valores." );
        vec[i]=lo.nextInt();
        suma=suma+vec[i];
        }
        System.out.println("La suma de los valores son: "+suma);
    }
}
