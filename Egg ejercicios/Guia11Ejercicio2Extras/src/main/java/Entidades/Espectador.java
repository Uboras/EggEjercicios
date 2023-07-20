package Entidades;

public class Espectador {
 private String nombre;
 private int edad;
 private double dineroDis;

    public Espectador() {
    }

 
    public Espectador(String nombre, Integer edad, double dineroDis) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDis = dineroDis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getDineroDis() {
        return dineroDis;
    }

    public void setDineroDis(double dineroDis) {
        this.dineroDis = dineroDis;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDis=" + dineroDis + '}';
    }
    
 
 
    
    
            
}
