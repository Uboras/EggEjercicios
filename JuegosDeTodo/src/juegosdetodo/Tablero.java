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
public class Tablero {

    private String[] tablero;

    public Tablero() {
    }

    public Tablero(String[] tablero) {
        this.tablero = tablero;
    }

    public String[] getTablero() {
        return tablero;
    }

    public void setTablero(String[] tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + '}';
    }

}
