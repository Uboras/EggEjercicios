/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidads;

/**
 *
 * @author Herna
 */
public class BarcosMotor extends Barco {
    
    private Integer potencia;

    public BarcosMotor(Integer matricula, Integer escola, Integer anioFabricacion, Integer potencia) {
        super(matricula, escola, anioFabricacion);
        this.potencia = potencia;
    }

    public BarcosMotor() {
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }


    @Override
    public String toString() {
   System.out.println(super.toString());
        return "BarcosMotor{" + "potencia=" + potencia + '}';
    }
    
    
}
