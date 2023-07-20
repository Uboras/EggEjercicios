/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Interface.Calculos;

/**
 *
 * @author Herna
 */
public class Rectangulo implements Calculos{
private double Alto;
private double Largo;

    public Rectangulo(double Alto, double Largo) {
        this.Alto = Alto;
        this.Largo = Largo;
    }

    public Rectangulo() {
    }

    public double getAlto() {
        return Alto;
    }

    public void setAlto(double Alto) {
        this.Alto = Alto;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }
   


@Override
    public Double Calcularperimetro() {
   
   return ((getAlto()+getLargo())*2); }

    @Override
    public Double CalcularArea() {
  
  return (getAlto()*getLargo());}
    
}
