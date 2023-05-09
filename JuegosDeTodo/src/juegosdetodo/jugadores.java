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
public class jugadores {

    private String nombre;
    private String colorFichas;
    private int lugar;

    public jugadores() {
    }

    public jugadores(String nombre, String colorFichas, int numLugar) {
        this.nombre = nombre;
        this.colorFichas = colorFichas;
        this.lugar = numLugar;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorFichas() {
        return colorFichas;
    }

    public void setColorFichas(String colorFichas) {
        this.colorFichas = colorFichas;
    }

    public int getNumLugar() {
        return lugar;
    }

    public void setNumLugar(int numLugar) {
        this.lugar = numLugar;
    }

    @Override
    public String toString() {
        return "jugadores{" + "nombre= " + nombre + "\ncolorFichas= " + colorFichas + "\nLugar= " + lugar + '}';
    }

    
    
    
    
}
