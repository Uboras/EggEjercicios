/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class AlumnoServicio {

    public ArrayList<Alumno> alumnos;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public AlumnoServicio() {
    }

    public void CrearAlumnoYagregaLista() {
        String respuesta = "";
        ArrayList<Integer> notas = new ArrayList();
        ArrayList<Alumno> temporal = new ArrayList();
        
        do {
            Alumno a1 = new Alumno();
            a1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Alumno"));
            for (int i = 0; i < 3; i++) {
                Integer nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota " + (i + 1) + " de 3"));
                notas.add(nota);
            }

            a1.setNotas(notas);
            temporal.add(a1);
            respuesta = JOptionPane.showInputDialog("Queres salir del constructor de alumnos\n si o no");

        } while (respuesta.equalsIgnoreCase("no"));

        setAlumnos(temporal);

    }

    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */
    public double CalcularNotasFinalesIngresoNombre(String nombre) {
        Alumno nombre1 = new Alumno();

        for (Iterator<Alumno> iterator = getAlumnos().iterator(); iterator.hasNext();) {
            Alumno aux = iterator.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                nombre1 = aux;
            }
        }

        double nota = calcularNotaFinal(nombre1);

        return nota;
    }

    public Double calcularNotaFinal(Alumno nombre) {
        int c = 0;
        Double notaFinal = 0.00;
        ArrayList<Integer> notas = nombre.getNotas();

        for (Iterator<Integer> iterator = notas.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            notaFinal += next;
            c++;
        }
        notaFinal = notaFinal / c;
        return notaFinal;
    }

}
