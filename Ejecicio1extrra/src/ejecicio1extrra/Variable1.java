/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejecicio1extrra;

import java.util.Scanner;

public class Variable1 {
    
private String mesSecreto; 
final private String[] meses = new String[]{"enero", "febrero",
    "marzo", "abril", "Mayo", 
    "Junio", "Julio", "Agosto", "septiembre", 
    "octubre","noviembre","diciembre"};

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }
    
    public Variable1() {
        }
    

private void AsignarMessecreto(String[] meses){
mesSecreto = meses[(int)(Math.random()* meses.length)];
   // System.out.println(mesSecreto);
}
public void adivinarMes (Variable1 nombre){
    Scanner leer =new Scanner(System.in);
    Variable1 lp = new Variable1();
      
    lp.AsignarMessecreto(meses);
    
    String mesIng;
    do{
    System.out.println("Adivine el mes secreto. Introduzca el"
            + " nombre del mes en minúsculas");
   mesIng = leer.next();
    
    if (mesIng.equalsIgnoreCase(nombre.getMesSecreto())){
        System.out.println("¡Ha acertado!");
    }else {
        System.out.println("No ha acertado. Intente "
                + "adivinarlo introduciendo otro mes: ");
    }
    }while((mesIng.equalsIgnoreCase(nombre.getMesSecreto())== false) );
}
}


