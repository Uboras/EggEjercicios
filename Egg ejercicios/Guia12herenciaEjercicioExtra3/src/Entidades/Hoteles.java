package Entidades;

public abstract class Hoteles extends Alojamientos {
    protected Integer cantHabitaciones;
    protected Integer cantCamas;
    protected Integer cantPisos;
    protected Double precioHabitaciones;


    public Hoteles(Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(nombre, direccion, gerenteEncargado, localidad);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        precioHabiltacion();
    }
   

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(Integer cantCamas) {
        this.cantCamas = cantCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Hoteles con " + cantHabitaciones +" Habitaciones."+ "\ncuenta con " + cantCamas +" Camas "+ "\n tiene " + cantPisos +" Pisos"+ "\ncuesta por Habitacion " + precioHabitaciones ;
    }
    
    public void  precioHabiltacion(){
        setPrecioHabitaciones((double) (50 + (1*getCantCamas()))); 
        
    }  
}
