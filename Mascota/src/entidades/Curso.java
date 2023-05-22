package entidades;

import java.util.Scanner;

public class Curso {

    private String nombreCurso;
    private double cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private long precioPorHora;
    private String[] alumnos = new String[5];
    Scanner leer = new Scanner(System.in);

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, long precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String isTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public long getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(long precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    /* Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.*/
    public Curso CrearCurso() {

        Curso lp = new Curso();
        System.out.print("Ingrese el nombre del curso");
        lp.setNombreCurso(leer.next());
        System.out.print("Ingrese cantidad de horas por dia");
        lp.setCantidadHorasPorDia(leer.nextDouble());
        System.out.print("Ingrese cantidada de dias por semana");
        lp.setCantidadDiasPorSemana(leer.nextInt());
        System.out.print("Ingrese el turno");
        lp.setTurno(leer.nextLine());
        System.out.print("Ingrese Precio por hora");
        lp.setPrecioPorHora(leer.nextLong());

        lp.alumnos = cargarAlumnos();

        return lp;
    }

    public String[] cargarAlumnos() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = leer.nextLine();
            System.out.println("Se cargo el alumno n°: " + (++i));
        }

        return alumnos;
    }
    
    
    public void calcularGanancciaSemanal(Curso pe){
        
        double ganancia = pe.getCantidadHorasPorDia()*pe.getPrecioPorHora()* pe.cantidadDiasPorSemana*5;
        System.out.println("La gananacia semanal es de : "+ganancia);
    }
    
}
