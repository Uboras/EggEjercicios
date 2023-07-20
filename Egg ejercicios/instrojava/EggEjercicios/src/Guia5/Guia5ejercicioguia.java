/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Random;

/**
 *
 * @author Herna
 */
public class Guia5ejercicioguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {





int[][] matrizS = new int[4][4];
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        Random otro = new Random();
         

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = otro.nextInt(21)-10;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("*********");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizT[i][j] = (matriz[i][j])* -1;
                System.out.print("[" + matrizT[i][j] + "]");

            }
            System.out.println("");
        }
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizS[i][j] =  matrizS[i][j] + matrizT[i][j];
            } 
    }
    }}