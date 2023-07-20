package guia5;


import java.util.Random;
import java.util.Scanner;

public class N {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rd = new Random();
        String aux=" " ;
        
        System.out.println("¿Cual es el tamaño del vector?");
       int n = leer.nextInt();
        
        int[]equipo = new int[n];


        for (int i = 0 ; i<n; i++) {
                      
                equipo[i] = rd.nextInt(150);       
        }
         for (int elemento : equipo) {
            aux= aux + " " + elemento;
            
        }
        System.out.println(aux);
    
        System.out.println("¿Qué numero queres buscar?");
       int numIng = leer.nextInt();
       int contador=0; 
        System.out.print("se encuentra en la posicion");
        for (int i = 0; i < n; i++) {
                    
       if(numIng==equipo[i]){
        ++contador; 
        System.out.print(" "+(i+1)); 
       }
        }  
       System.out.print(" y se encontro "+contador);
        if(contador==1){ System.out.println(" vez.");} else { System.out.println(" veces.");}  
    }
}

        
            
