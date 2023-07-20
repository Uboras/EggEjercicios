
package Entidades;


public abstract class Edificio {
    protected Integer ancho;
    protected Integer largo;
    protected Integer Alto;
    
    
    public abstract Double calcularSuperficie();
    public abstract Double calcularVolumen();
    
}
