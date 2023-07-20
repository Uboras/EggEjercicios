/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

/**
 *
 * @author Herna
 */
public class cafetera {
    private int capacidadMaxima;
    private int CantidadActual;

    public cafetera() {
    }

    public cafetera(int capacidadMaxima, int CantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    @Override
    public String toString() {
        return "cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", CantidadActual=" + CantidadActual + '}';
    }
    
    
    
    
    
    
    
    
}
