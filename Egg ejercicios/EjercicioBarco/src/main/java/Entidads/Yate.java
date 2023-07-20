/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidads;

/**
 *
 * @author Herna
 */
public class Yate extends BarcosMotor {
    private Integer camarotes;

    public Yate(Integer camarotes, Integer matricula, Integer escola, Integer anioFabricacion, Integer potencia) {
        super(matricula, escola, anioFabricacion, potencia);
        this.camarotes = camarotes;
    }

    public Yate() {
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "BarcoMotorYate{" + "camarotes=" + camarotes + '}';
    }




}
