
package guia5;

import java.util.Random;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
public class guia5Ejercicio4 {
    public static void main(String[] args) {
 
        int [] nuMero = new int [50]; 
        Random rd = new Random();
        for (int i = 0; i < 50; i++) {
            nuMero[i]=(int)(Math.random()*50000);
            
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(" "+nuMero[i]);
        }
        
        
        int un=0,dos=0,tres=0,cua=0,cin=0;      
                        
        for (int i = 0; i < 50; i++) {
            if (nuMero[i]/10==0){
                ++un;
            } else if(nuMero[i]/100==0){
                ++dos;                
            } else if(nuMero[i]/1000==0){
                ++tres;
            }else if(nuMero[i]/10000==0){
                ++cua;
            }else if(nuMero[i]/100000==0){
                  ++cin;
        
        }
           
    }
     System.out.println("La cantidad de numeros \nde un digito:"+un+" \nde dos "+dos+"\n de tres "+tres+"\n de cuatro "+cua+"\n de cinco "+cin);
}}
