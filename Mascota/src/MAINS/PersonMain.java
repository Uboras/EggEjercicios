/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAINS;

import entidades.Person;
import java.util.Scanner;
import servicios.PersonService;

/**
 *
 * @author Herna
 */
public class PersonMain {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        PersonService lp = new PersonService();
        Person P1 = lp.crearPersona();
        lp.calcularEdad(P1);
        System.out.println(" Ingrese la edad a comprar ");
        int edad= leer.nextInt();
        System.out.println("Es menor al edad de "+edad+" es:" + lp.menorQue(P1, 12));
        System.out.println(lp.mostrarPersona(P1));
        }
    
}
