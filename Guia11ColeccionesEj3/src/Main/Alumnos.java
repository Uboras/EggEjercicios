/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.AlumnoServicio;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class Alumnos {

  
    public static void main(String[] args) {
     
        AlumnoServicio as = new AlumnoServicio();
        
        
        as.CrearAlumnoYagregaLista();
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno\na calcular la nota final\n"+as.alumnos.toString());
        double notafinal = as.CalcularNotasFinalesIngresoNombre(nombre);
        JOptionPane.showMessageDialog(null,notafinal);
        
    }
    
}
