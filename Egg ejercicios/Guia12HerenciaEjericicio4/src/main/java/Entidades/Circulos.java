
package Entidades;

import Interface.Calculos;


public class Circulos implements Calculos{

    private double radio;

    public Circulos(double radio) {
        this.radio = radio;
    }

    public Circulos() {
    }

    
    @Override
    public Double Calcularperimetro() {
       return PI * radio*2;}

    @Override
    public Double CalcularArea() {
        return PI*(Math.pow(radio, 2)); }
}
