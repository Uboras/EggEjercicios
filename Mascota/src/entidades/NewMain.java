/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class NewMain {

    
    public static void main(String[] args) {
     Rectangulo lp = new Rectangulo();
      
     lp.setBase(5);
      lp.setAltura(10);
      lp.Perimetro();
      lp.Superficie();
      lp.rectanguloDibujado();
     System.out.println(lp.toString());
    }
    
}
