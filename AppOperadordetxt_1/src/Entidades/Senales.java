/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalTime;


/**
 *
 * @author Herna
 */
public class Senales {

    private LocalTime fechaInicio;
    private String pares;
    private String operacion;
    private Integer duracion;

    public Senales() {
    }

    public Senales(LocalTime fechaInicio, String pares, String operacion, Integer duracion) {
        this.fechaInicio = fechaInicio;
        this.pares = pares;
        this.operacion = operacion;
        this.duracion = duracion;
    }

    public LocalTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getPares() {
        return pares;
    }

    public void setPares(String pares) {
        this.pares = pares;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    
    @Override
    public String toString() {
        return "Señal:" + " " + fechaInicio + " " + pares + " " + operacion + " " + duracion + '}';
    }

}
