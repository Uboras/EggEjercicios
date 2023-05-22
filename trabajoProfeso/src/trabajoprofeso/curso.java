/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprofeso;

/**
 *
 * @author Herna
 */
public class curso {
    private String nombreCurso;
    private double cantidadHoraspordia;
    private int cantidadDiasporSemana;
    private double precioPorHora;
    private String turno;
    private String[] alumnos =new String[5];

    public curso() {
    }

    
    public curso(String nombreCurso, double cantidadHoraspordia, int cantidadDiasporSemana, double precioPorHora, String turno, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoraspordia = cantidadHoraspordia;
        this.cantidadDiasporSemana = cantidadDiasporSemana;
        this.precioPorHora = precioPorHora;
        this.turno = turno;
        this.alumnos = alumnos;
    }

       
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHoraspordia() {
        return cantidadHoraspordia;
    }

    public void setCantidadHoraspordia(double cantidadHoraspordia) {
        this.cantidadHoraspordia = cantidadHoraspordia;
    }

    public int getCantidadDiasporSemana() {
        return cantidadDiasporSemana;
    }

    public void setCantidadDiasporSemana(int cantidadDiasporSemana) {
        this.cantidadDiasporSemana = cantidadDiasporSemana;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "curso{" + "nombreCurso=" + nombreCurso + ", cantidadHoraspordia=" + cantidadHoraspordia + ", cantidadDiasporSemana=" + cantidadDiasporSemana + ", precioPorHora=" + precioPorHora + ", turno=" + turno + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
    
}
