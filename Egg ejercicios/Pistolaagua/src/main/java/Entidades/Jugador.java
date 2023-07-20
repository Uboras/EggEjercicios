/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Herna
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private boolean estado;//mojado o no 

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.estado = false;
    }
public boolean getEstado(){
    return estado;
}
    
public void setEstado(boolean estado){
    this.estado = estado;
}

public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El " + nombre +" " + " ¿esta Mojado?" + estado + '}';
    }
    
    
    
            
}
