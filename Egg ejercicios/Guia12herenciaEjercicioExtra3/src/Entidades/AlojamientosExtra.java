
package Entidades;

public class AlojamientosExtra extends Alojamientos {
protected boolean privacidad;
protected double metrosQdos;

    public AlojamientosExtra(boolean privacidad, double metrosQdos, String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(nombre, direccion, gerenteEncargado, localidad);
        this.privacidad = privacidad;
        this.metrosQdos = metrosQdos;
    }

  
  

    
   


    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }

    public double getMetrosQdos() {
        return metrosQdos;
    }

    public void setMetrosQdos(double metrosQdos) {
        this.metrosQdos = metrosQdos;
    }
private String privacidad(){
    String val ="no";
    if (isPrivacidad()){
        val="si";
    }
return val; }
    
    @Override
    public String toString() {
        return "Alojamientos No hotel "+ privacidad() + " es privado  "  + "tiene"+ metrosQdos + "MetrosQdos=";
          }



    
}
