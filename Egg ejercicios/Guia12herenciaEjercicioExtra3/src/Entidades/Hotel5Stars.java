
package Entidades;


public class Hotel5Stars extends Hotel4Stars {
    
    private Integer cantidadSalones;
    private Integer cantidadSuites;
    private Integer cantidadLimusinas;

    public Hotel5Stars(Integer cantidadSalones, Integer cantidadSuites, Integer cantidadLimusinas, Gimnasios gimnasio, String NombreResto, Integer capacidadResto, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos,String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(gimnasio, NombreResto, capacidadResto, cantHabitaciones, cantCamas, cantPisos, nombre, direccion, gerenteEncargado, localidad);
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimusinas = cantidadLimusinas;
        precioHabitacion(cantidadLimusinas);
    }




   

    public Integer getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(Integer cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(Integer cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }
   
    
      public void precioHabitacion(int can) {
        setPrecioHabitaciones(super.getPrecioHabitaciones()+((can*15)));
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Hotel5Stars{" + "cantidadSalones=" + cantidadSalones + ", cantidadSuites=" + cantidadSuites + ", cantidadLimusinas=" + cantidadLimusinas + '}';
    }
    
    
    
}
