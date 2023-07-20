/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class PardeNumeros {
    private int num1;
    private int num2;

      public PardeNumeros() {
        num1 =(int) (Math.random() * 20);
        num2 =(int) (Math.random() * 13);
    }

  
   

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "PardeNumeros{" + "El primer numero es:" + num1 + "\by el segundo es=" + num2 + '}';
    }
    
    
    
    
    
}
