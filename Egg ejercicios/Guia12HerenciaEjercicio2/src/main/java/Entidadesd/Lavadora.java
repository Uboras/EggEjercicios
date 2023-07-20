/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidadesd;

/**
 *
 * @author Herna
 */
public class Lavadora extends Electrodomesticos{
    private Double carga;

    public Lavadora(String color, char consumoEnergético, int peso, Double carga) {
        super(color, consumoEnergético, peso);
        this.carga = carga;
     
    }

    public Lavadora(){
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
public void crearLavadora(){
 
  crearElectrodomestico();
  Double cargas = op.MensajeDouble("Ingrese el peso Maximo");
    setCarga(cargas);
    
   
    }
    
   
    @Override
    public void precioFinal() {
        super.precioFinal(); 
    if (carga>30){
        setPrecio(getPrecio()+500);
    }         
    }

    @Override
    public String toString() {
        System.out.println("Lavadora");
        System.out.println(super.toString());
        return  " carga=" + carga +" precio= "+ this.precio+ '}';
    }
    
    
}
