/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Herna
 */
public class Recidencias extends AlojamientosExtra {

    private Integer QHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Recidencias(Integer QHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privacidad, double metrosQdos, String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(privacidad, metrosQdos, nombre, direccion, gerenteEncargado, localidad);
        this.QHabitaciones = QHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

   

    

    public Integer getQHabitaciones() {
        return QHabitaciones;
    }

    public void setQHabitaciones(Integer QHabitaciones) {
        this.QHabitaciones = QHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    private String Gremio() {
        String val = "no";
        if (isDescuentoGremio()) {
            val = "si";
        }
        return val; 
    }

    private String Campo() {
        String val = "no";
        if (isCampoDeportivo()) {
            val = "si";
        }
        return val;

    }

    @Override
    public String toString() {
        return "Recidencias{" + "cantidad Habitaciones=" + QHabitaciones + " tiene "+Gremio() + " descuento Gremio, "+ Campo()+" tiene  campoDeportivo";
    
    }
}
