
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Escribir un programa que pida tu nombre
 * , lo guarde en una variable y lo muestre por pantalla.
 *
 * @author Herna
 */
public class Ejercicio2guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner entrada = new Scanner(System.in);

String name ;

System.out.print("¿Cual es tu Nombre?");
name = entrada.nextLine();

System.out.println(name +  " ¿Eres tu de verdad?");


    }
    
}
