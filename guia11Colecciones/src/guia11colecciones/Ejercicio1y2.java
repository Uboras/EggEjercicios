/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class Ejercicio1y2 {

    /*Diseñar un programa que lea y guarde razas de perros en un 
    ArrayList de tipo String. El programa pedirá una raza de perro 
    en un bucle, el mismo se guardará en la lista y después se le preguntará 
    al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
     */
    public static void main(String[] args) {

        JOptionPane dial = new JOptionPane();
        List<String> raza = new ArrayList<>();
        String respuesta = "";
        do {
            String razaIng = JOptionPane.showInputDialog("Ingrese la raza de perros");
            raza.add(razaIng);
            respuesta = JOptionPane.showInputDialog("¿desea salir del programa para ingresar razas?\n si o no");
        } while (respuesta.equalsIgnoreCase("no"));

        
    JOptionPane.showMessageDialog(null, raza);
     
   /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
  
    String razaBusc = JOptionPane.showInputDialog("¿Ingrese la raza a buscar?");
   boolean encontrado = false;
    
        for (Iterator<String> iterator = raza.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if (next.equalsIgnoreCase(razaBusc)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }
    if (encontrado == true){
        JOptionPane.showMessageDialog(null, "Se a encontrado y \neliminado la raza de la lista");
    }else {JOptionPane.showMessageDialog(null, "No se a encontrado y no  \npudo ser eliminado la raza de la lista");
    }
        Collections.sort(raza);
        JOptionPane.showMessageDialog(null, raza);
        
    }

}