/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidads;

/**
 *
 * @author Herna
 */
class Barco {
    protected Integer matricula;
    protected Integer escola;
    protected Integer anioFabricacion;

    public Barco(Integer matricula, Integer escola, Integer anioFabricacion) {
        this.matricula = matricula;
        this.escola = escola;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco() {
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEscola() {
        return escola;
    }

    public void setEscola(Integer escola) {
        this.escola = escola;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", escola=" + escola + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
   
  
}
