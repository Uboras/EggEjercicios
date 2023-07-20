
package com.mycompany.ejercicio1;

import java.util.ArrayList;

/*Persona con
atributos: nombre, apellido, edad, documento y Perro.*/

public class Persona {
    
   private String nombre;
   private String apellido;
   private Integer edad;
   private Integer documento;
   private ArrayList<Perro> mascota;

    public Persona(String nombre, String apellido, Integer edad, Integer documento, ArrayList<Perro> mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.mascota = mascota;
    }

    public Persona() {

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getMascota() {
        return mascota;
    }

    public void AgregarMascota(Perro mascot) {
       mascota.add(mascot);
    }

    @Override
    public String toString() {
        return "Se llama " + nombre + " " + apellido +  "\n tiene " + edad + " de edad\n Dni " + documento + "\n mascota= " + mascota + '}';
    }
    
    
   
   
   
}
