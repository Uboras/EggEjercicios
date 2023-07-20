package Entidadesd;

import Servicios.Utilitarios;

public  class Electrodomesticos {

    Utilitarios op = new Utilitarios();

    protected double precio;
    protected String color;
    protected char consumoEnergético;
    protected int peso;

    public Electrodomesticos(String color, char consumoEnergético, int peso) {
        this.color = comprobarColor(color);
        this.consumoEnergético = comprobarConsumoEnergetico(consumoEnergético);
        this.peso = peso;
       this.precio =1000; 

    }

    public Electrodomesticos() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergético() {
        return consumoEnergético;
    }

    public void setConsumoEnergético(char consumoEnergético) {
        this.consumoEnergético = consumoEnergético;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char letr = 'f';
char let = Character.toLowerCase(letra);
        switch (let) {
            case 'a':
                letr = 'a';
                break;
            case 'b':
                letr = 'b';
                break;
            case 'c':
                letr = 'c';
                break;
            case 'd':
                letr = 'd';
                break;
            case 'e':
                letr = 'e';
                break;
        }
        return letr;
    }

    private String comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
                color = "Blanco";
                break;
            case "negro":
                color = "Negro";
                break;
            case "rojo":
                color = "Rojo";
                break;
            case "Azul":
                color = "Azul";
                break;
            case "Gris":
                color = "Gris";
                break;
            default:
                color = "Blanco";
                break;
        }
        return color;
    }

    public void crearElectrodomestico() {

        this.color = op.MensajeString("ingrese el color");
        this.consumoEnergético = op.MensajeChar("Ingrese la letrade consumo ");
        this.peso= op.Mensajeint("Ingrese el peso ");

        precioFinal();
        
    }

    protected void precioFinal() {

        switch (this.consumoEnergético) {
            case 'a':
                setPrecio(getPrecio() + 1000 + (VerificarPrecio()));
            case 'b':
                setPrecio(getPrecio() + 800 + (VerificarPrecio()));
                break;
            case 'c':
                setPrecio(getPrecio() + 600 + (VerificarPrecio()));
                break;
            case 'd':
                setPrecio(getPrecio() + 500 + (VerificarPrecio()));
                break;
            case 'e':
                setPrecio(getPrecio() + 300 + (VerificarPrecio()));
                break;
            case 'f':
                setPrecio(getPrecio() + 100 + (VerificarPrecio()));
                break;
        }

    }

    private double VerificarPrecio() {
 int peso1= this.peso;
        double adicional = 0;
        if (peso1 >=1 && peso1 <= 19) {
            adicional = 100;
        } else if (peso1 <= 49) {
            adicional = 500;
        } else if (peso1 <= 79) {
            adicional = 800;
        } else {
            adicional = 1000;
        }

        return adicional;
    }

    @Override
    public String toString() {
        return "color=" + color + ", consumoEnergetico=" + consumoEnergético + ", peso=" + peso + '}';
    }
    
}
