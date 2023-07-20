/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Herna
 */
public class Hotel4Stars extends Hoteles {

    private Gimnasios gimnasio;
    private String NombreResto;
    private Integer capacidadResto;

    public Hotel4Stars(Gimnasios gimnasio, String NombreResto, Integer capacidadResto, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(cantHabitaciones, cantCamas, cantPisos,nombre, direccion, gerenteEncargado, localidad);
        this.gimnasio = gimnasio;
        this.NombreResto = NombreResto;
        this.capacidadResto = capacidadResto;
    precioHabitacion();
    }


    public String getNombreResto() {
        return NombreResto;
    }

    public void setNombreResto(String NombreResto) {
        this.NombreResto = NombreResto;
    }

    public Integer getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(Integer capacidadResto) {
        this.capacidadResto = capacidadResto;
    }

    private double valorAgregadoRestaurante() {
        double valor = 0;
        if (getCapacidadResto() > 0 && getCapacidadResto() < 31) {
            valor = 10;
        } else if (getCapacidadResto() > 30 && getCapacidadResto() < 51) {
            valor = 30;
        } else {
            valor = 50;
        }
        return valor;
    }
       

    public void precioHabitacion() {
        setPrecioHabitaciones(super.getPrecioHabitaciones() + valorAgregadoRestaurante()+ gimnasio.getValue());
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "**** Hotel" + "gimnasio=" + gimnasio.toString() + "\n Nombre Restorant " + NombreResto + "\nCapacidad Resto " + capacidadResto;

    }

}
