/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

public class Integrador {

    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
       
        EstudianteService lp = new EstudianteService();
        for (int i = 0; i < 8; i++) {
        estudiantes[i] = lp.crearEstudiante();
        }
        lp.calcularPromedioNotas(estudiantes);
      double prom = lp.usarPromedio(estudiantes);
  
      lp.mostarEstudiantesMasPromedio( lp.alumnosConNotaMayorPromedio(estudiantes,prom ));
           }
}
