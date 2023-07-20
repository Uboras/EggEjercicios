package guia5;


import java.util.Scanner;


public class Guia5ejercicio6 {
 
    public static void main(String[] args) {
     int[] vect = new int[9];
     int[][] matriz = new int[3][3];
     Scanner leer = new Scanner(System.in);
      int k=0; 
     
     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              do {
                System.out.println("ingresar datos para "+i+" "+j);
                matriz[i][j]= leer.nextInt();
                vect[k]=matriz[i][j];
                
               } while ((matriz[i][j]> 10) && (matriz[i][j]<0)); ++k;
            }
        }
             
     
     int suma1= sumacion1(vect);
     int suma2= sumacion2(vect);
     int suma3= sumacion3(vect);
       
     if((suma1 ==suma2)&&(suma2 ==suma3)){
         System.out.println("Es mágico");
        }else{ System.out.println("No es Mágico");
             }
    
}

    private static int sumacion1(int[] vect) {
        int suma=0;
        int suma0=vect[0]+vect[1]+vect[2];
        int suma1=vect[3]+vect[4]+vect[5];
        int suma2=vect[6]+vect[7]+vect[8];
        
        if((suma0 ==suma2)&&(suma2 ==suma1)){
    suma = suma0;}
        
        return suma;
    }

    private static int sumacion2(int[] vect) {
         int suma=0;
        int suma0=vect[0]+vect[1]+vect[2];
        int suma1=vect[3]+vect[4]+vect[5];
        int suma2=vect[6]+vect[7]+vect[8];
        
        if((suma0 ==suma2)&&(suma2 ==suma1)){
    suma = suma0;}
        
      
    return suma;
    }

    private static int sumacion3(int[] vect) {
         int suma=0;
        int suma0=vect[0]+vect[4]+vect[8];
        int suma1=vect[6]+vect[4]+vect[2];
       
        
        if((suma0 ==suma1)){
    suma = suma0;}
        
      
    return suma;
    }
}