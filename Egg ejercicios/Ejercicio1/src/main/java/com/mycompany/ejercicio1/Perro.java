
package com.mycompany.ejercicio1;

/**
 *
 * @author Herna
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño ;
    
//{"Mediano","Chico","Grande"}
    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

 


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Mascota " + "Se llama" + nombre + " es un " + raza + "\n y tiene " + edad + " de tamaño " + tamaño + '}';
    }
    }
    
    
    
    

