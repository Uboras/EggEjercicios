/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Herna
 */
class EstudianteService {

    Scanner leer = new Scanner(System.in);

    public EstudianteService() {
    }

    /*Se crean los estudiantes de uno en uno con ingreso de los usuarios*/
    public Estudiante crearEstudiante() {

        Estudiante m = new Estudiante();
        System.out.println("Escribir nombre y la nota final");
        m.setNombre(leer.next());
        m.setNota(leer.nextInt());

        return m;
    }

    /*se calcula el promedio y se muestra en pantalla*/
    public void calcularPromedioNotas(Estudiante[] estudiantes) {
        Double suma = 0.00;

        for (int i = 0; i < 8; i++) {
            suma += (double) estudiantes[i].getNota();
        }
        System.out.println("El promedio del curso es es :" + (suma / 8));
    }

    /*queda un metodo para sacar el promedio y  usarlo como parametro*/
    public double usarPromedio(Estudiante[] estudiantes) {
        Double suma = 0.00;

        for (int i = 0; i < 8; i++) {
            suma += estudiantes[i].getNota();
        }
        return (suma / 8);
    }

    /*se calcula el estudiante que tiene mas nota que el promedio y se guarda en un vector*/
    public String[] alumnosConNotaMayorPromedio(Estudiante[] estudiantes, double promedio) {

        String[] estudiantesMayorPromedio = new String[8];
        Arrays.fill(estudiantesMayorPromedio, "*");

        int j = 0;
        for (int i = 0; i < 8; i++) {
            if (estudiantes[i].getNota() > promedio) {
                estudiantesMayorPromedio[j] = (estudiantes[i].getNombre());
                j++;
            }
        }
        return estudiantesMayorPromedio;
    }

    /*Se cuenta los lugares vacios y llenos y se muestran ordenados por alfabeto*/
    public void mostarEstudiantesMasPromedio(String[] estudiantesMayorPromedio) {
        /* se cuentan lugares nullos*/
        int contador = 0;

        for (String elemento : estudiantesMayorPromedio) {
            if (elemento.equals("*")) {
                contador++;
            }
        }
        /*se imprime en */
        System.out.println("-------------------------------\n***Felicidades Superaron el promedio***");
        System.out.print(" - ");
        for (int i = 0; i < (8 - contador); i++) {
            System.out.print(estudiantesMayorPromedio[i] + " - ");
        }
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("Excelente Trabajo sigan en ese camino");

    }
}
