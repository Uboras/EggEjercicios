package entidades;

import java.util.Date;

public class Person {
   private String nombre;
    private Date feNacimiento;

    public Person() {
    }

    
    
    public Person(String nombre, Date feNacimiento) {
        this.nombre = nombre;
        this.feNacimiento = feNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFeNacimiento() {
        return feNacimiento;
    }

    public void setFeNacimiento(Date feNacimiento) {
        this.feNacimiento = feNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " ,Nacio el : " + feNacimiento;
    }
    
    
}
