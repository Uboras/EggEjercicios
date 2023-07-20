/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class PardeNumeroService {
    
    
    
    
    
    public void mostrarValores(PardeNumeros su){
        System.out.println(su);
    }

public void devolverMayor(PardeNumeros su){
    System.out.println(Math.max(su.getNum1(),su.getNum2()));
}
public void calcularPotencia(PardeNumeros su){
    
    System.out.println("el numero maximo potenciado alnumero minimo es "+Math.pow((Math.max(su.getNum1(),su.getNum2())),(Math.min(su.getNum1(),su.getNum2()))));
}

public void calculaRaiz(PardeNumeros su){
    System.out.println("La raiz cuadrada del valor minimos es\n "+Math.sqrt(Math.abs(Math.min(su.getNum1(),su.getNum2())))+ "\n-----");
}
}
