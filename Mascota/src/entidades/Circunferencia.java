package entidades;

public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio(double radio) {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double area(double radio) {
        this.radio = radio;
        area = ((Math.PI * radio) * (Math.PI * radio));
        return area;
    }
    
public double perimetro(double radio){
    perimetro=(2*Math.PI*radio);
    return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio= " + radio + ", area= " + area + ", perimetro= " + perimetro + '}';
    }
}

