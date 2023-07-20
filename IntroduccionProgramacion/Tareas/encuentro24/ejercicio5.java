
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAURICIO
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz = new int [3][3];
        llenar(matriz);
        mostrar(matriz);
        comprobar(matriz);
    }
    /*-------- llenar la matriz--------*/
    public static void llenar(int [][]matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Scanner leer = new Scanner(System.in);
                System.out.print("Ingrese el valor de la posicion ["+i+"]"+"["+j+"]");
                matriz[i][j] = leer.nextInt();
  
            }
            
        }
    }
    
   
    /*------- MOSTRAR LA MATRIZ--------*/
    public static void mostrar(int [][] matriz){
        System.out.println("MATRIZ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
            
        }
        System.out.println("MATRIZ TRANSPUESTA");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
    }
     /*------- COMPROBAR LA MATRIZ--------*/
    public static void comprobar(int [][]matriz){
        boolean log = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]!= -matriz[j][i]){
                    log = true;
                }
            }
            
        }
        if (log){
            System.out.println("La matriz no es antisimetrica");
        }else{
            System.out.println("La matriz es antisimetrica");
        }
    }
}
