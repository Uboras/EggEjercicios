package entidades;

import java.util.Scanner;

public class LoteriaClass {

    public int[][][] matriz = new int[99][99][99];
    public int numeroIngresado;

    //inicilalizar vector de 99 posiciones
    public void loteria() {
    }

    //ingreso de numeros al vector del usuario
    public void loteriaIngresoNumerosMatriz() {
        for (int i = 0; i < 100; i++) {
          matriz[i][0][0] = i;
        }
    }
    public void impresion(){
        for (int i = 0; i < 100; i++) {
            System.out.print(matriz[i][0][0]);
        }System.out.println(" ");
    }

    public void loteriaIngresoNumeros() {
        Scanner leer = new Scanner(System.in);
        int numIng = leer.nextInt();

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {

                    if (i == numIng) {
                        int c=j;
                        matriz[i][j][k] = matriz[i][++c][0];
                    }
                }
            }
        }
    }
    //probabilidad de salida nuevamente.

    public void loteriaProbabilidad() {
        for (int j = 0; j < 100; j++) {

            for (int k = 0; k < 100; k++) {

                matriz[0][0][k] = matriz[0][0][j/100];
            }
        }
    }

    // top 5 y porcentajes
    public void impresionTop5() {

    }

    void numeroIngresado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
