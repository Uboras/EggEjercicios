/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoprofeso;


import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class cursoService {

    Scanner sc = new Scanner(System.in);

    public cursoService() {
    }

    /*Método cargarAlumnos(): este método le permitirá al 
    usuario ingresar los alumnos que asisten a las clases.
    Nosotros nos encargaremos de almacenar esta información 
    en un arreglo e iterar con un bucle, solicitando en cada 
    repetición que se ingrese el nombre de cada alumno.*/
    public String[] cargarAlumno() {
        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i] = sc.nextLine();

        }

        return alumnos;
    }

    /*Métorso. En este método invocamos aldo crearCurso(): el método crear curso, le pide los valores
    de los atributos al usuario y después se le asignan a sus respectivos 
    atributos para llenar el objeto Cu
    método cargarAlumnos() para asignarle valor al atributo alumnos*/

    public curso crearCurso() {
     //cursoService lp = new cursoService(); 
   
        curso nuevoCurso = new curso();

        System.out.println("ingrese los datos siguientes \nNombre del curso: ");
        nuevoCurso.setNombreCurso(sc.nextLine());
        System.out.println("Cantida de horas por dia: ");
        nuevoCurso.setCantidadHoraspordia(sc.nextDouble());
        System.out.println("Cantidad de dias a la semana: ");
        nuevoCurso.setCantidadDiasporSemana(sc.nextInt());
        System.out.println("Precio por hora: ");
        nuevoCurso.setPrecioPorHora(sc.nextDouble());
        System.out.println("Turno:");
        nuevoCurso.setTurno(sc.nextLine());
        nuevoCurso.setAlumnos(cargarAlumno());
        
        return nuevoCurso;
    }
    /*Método calcularGananciaSemanal(): este método se encarga 
    de calcular la ganancia en una semana por curso. Para ello, 
    se deben multiplicar la cantidad de horas por día, el precio
    por hora, la cantidad de alumnos y la cantidad de días a la 
    semana que se repite el encuentro.*/
public double CalcularGananciaSemanal(curso no){
    //resulta la cantiada de horas precio semana y dias
   Double resultado = (no.getCantidadHoraspordia()*no.getCantidadDiasporSemana()*no.getPrecioPorHora()*5);
    
    return resultado;}


}
  
