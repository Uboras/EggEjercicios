package Entidades;



public class Cine {

 
    private Pelicula peli;
    private double precio;
    private Sala sala;

    
    
    public Cine() {
    }

    public Cine(Pelicula peli, Sala sala, double precio) {
        this.peli = peli;
        this.sala = sala;
        this.precio = precio;
    }
    
    
    public Pelicula getPeli() {
        return peli;
    }

    public void setPeli(Pelicula peli) {
        this.peli = peli;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{"+peli + "\n, sala=" + sala +" Pelicula "+ peli + "\n, precio=" + precio + '}';
    }

}
