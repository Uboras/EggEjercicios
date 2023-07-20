/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Herna
 */
public class Asientos {
   private Espectador sentado;
   private String asientoNum;

   
    public Asientos(Espectador sentado, String asientoNum) {
        this.sentado = sentado;
        this.asientoNum = asientoNum;
    }

    public Asientos() {
    }

    public Espectador getSentado() {
        return sentado;
    }

    public void setSentado(Espectador sentado) {
        this.sentado = sentado;
    }

    public String getAsientoNum() {
        return asientoNum;
    }

    public void setAsientoNum(String asientoNum) {
        this.asientoNum = asientoNum;
    }

    @Override
    public String toString() {
       String respuesta ="b";
        if (!sentado.getNombre().equalsIgnoreCase(" ")){
            respuesta = "X";
        }else { respuesta= " ";}
        return  asientoNum +" "+ respuesta ;
    }
   
}
