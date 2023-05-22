/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Person;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class PersonService {
   /*  Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado*/
    
  public Person crearPersona(){
    Scanner leer = new Scanner(System.in);
    Person persona1= new Person() ; 
    System.out.println("Ingrese el nombre");
    persona1.setNombre(leer.nextLine());
    System.out.println("fecha de nacimiento en Orden (AAAA/MM/DD)");
    Date nacimiento = new Date(leer.nextInt()-1900, leer.nextInt()-1, leer.nextInt());
    persona1.setFeNacimiento(nacimiento);
return persona1;}
 
//    Método calcularEdad que calcule la edad del usuario utilizando el
//atributo de fecha de nacimiento y la fecha actual.

public int calcularEdad(Person pe){
 Date atual = new Date();
    Date nacimiento = pe.getFeNacimiento();
    
       // se quita si cumple años antes o despues de hoy.
    int edad = (nacimiento.getYear()-atual.getYear());
    
    if (atual.getMonth() < nacimiento.getMonth() || (atual.getMonth() == nacimiento.getMonth()
                        && atual.getDate() < nacimiento.getDate())) {
            edad--;
        }
return edad;

}

/* Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario*/

public boolean menorQue(Person pe, int edad){
   
    
return (calcularEdad(pe) > edad);
}
//Mostrar atributos.

public String mostrarPersona(Person pe){
    return pe.toString();
 }

}
  

