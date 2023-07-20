
package Entidades;


public abstract class Alojamientos {

    protected String nombre;
    protected String direccion;
    protected String gerenteEncargado;
    protected String localidad;

    public Alojamientos(String nombre, String direccion, String gerenteEncargado, String localidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerenteEncargado = gerenteEncargado;
        this.localidad = localidad;
    }

    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Alojamiento " + nombre + "\ndireccion=" + direccion + "\ngerenteEncargado=" + gerenteEncargado + "\nlocalidad=" + localidad ;
    }


}
