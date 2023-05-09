/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosdetodo;

/**
 *
 * @author Herna
 */
public class FichasTablero {
   private int altura;
   private int base;
   private String color;

    public FichasTablero() {
    }

    public FichasTablero(int altura, int base,String color) {
        this.altura = altura;
        this.base = base;
        this.color= color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   
   
   
}
