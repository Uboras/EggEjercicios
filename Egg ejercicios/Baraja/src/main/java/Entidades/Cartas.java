/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Herna
 */
public class Cartas {
    private Integer numero;
    private String palos;

    public Cartas() {
    }

    public Cartas(Integer numero, String palos) {
        this.numero = numero;
        this.palos = palos;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalos() {
        return palos;
    }

    public void setPalos(String palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Carta " + numero + " de " + palos + "\n"+'}';
    }
    
    
}
