package guia5;

import java.util.Scanner;

public class NewMain1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int cont=0; int num=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingresar numeros del 1-9 hasta compretar cada fila");
                    num = leer.nextInt();
                    if ((num > 0) && (num < 10)) {
                        matriz[i][j] = num;
                        ++cont;
                    }
                } while ((num>9)&&(num<0));
            }
        }
        boolean filas = sumafilas(matriz);
        boolean columnas = sumacolumnas(matriz);
        boolean diagonales = sumadiagonales(matriz);
        
        if ((filas = columnas) && (columnas = diagonales)) {
            System.out.println("Es mágica");
        } else {
            System.out.println("No es magica");

        }
    }

    public static boolean sumafilas(int[][] matriz) {
        boolean filas;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    suma1 = suma1 + matriz[i][j];
                }
                if (i == 1) {
                    suma2 = suma2 + matriz[i][j];
                    if (i == 2) {
                        suma3 = suma3 + matriz[i][j];
                    }
                }
            }
        }
 System.out.println(suma1+" "+suma2+" "+suma3);
        if ((suma1 == suma2) && (suma2 == suma3)) {
            filas= true;
        } else {
            filas = false;
        }
        return filas;
    }

    private static boolean sumacolumnas(int[][] matriz) {
        boolean columnas;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    suma1 = suma1 + matriz[i][j];
                }
                if (j == 1) {
                    suma2 = suma2 + matriz[i][j];
                    if (j == 2) {
                        suma3 = suma3 + matriz[i][j];
                    }
                }
            }
        }
 System.out.println(suma1+" "+suma2+" "+suma3);
        if ((suma1 == suma2) && (suma2 == suma3)) {
           columnas = true;
        } else {
             columnas = false;
        }
        return columnas;
    }

    private static boolean sumadiagonales(int[][] matriz) {
        boolean diagonales;
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == i) {
                    suma1 = suma1 + matriz[i][j];
                }
                if (j + i == 2) {
                    suma1 = suma1 + matriz[i][j];
                }
            }
        }
        System.out.println(suma1+" "+suma2);
        if ((suma1 == suma2)) {
           diagonales= true;
        } else {
            diagonales= false;
        }
        return diagonales;
    }
}
