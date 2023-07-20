
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class Guia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
       String frase;
        System.out.println("Introduzca una frase");
        frase = palabra.next();
        if("a".equalsIgnoreCase((frase.substring(0,1))))
        {System.out.println("ES CORRECTO");} 
        else {System.out.println("ES INCORRECTO");
        }
 }}