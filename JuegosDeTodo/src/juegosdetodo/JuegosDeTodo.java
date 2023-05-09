/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosdetodo;

import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class JuegosDeTodo {

    public JuegosDeTodo() {
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Donacion don = new Donacion();
        String[] opciones = {"1", "2", "3","4"};
        int opcion = (int) JOptionPane.showInputDialog(null, "selecione Juego", "¿Que juego quieres jugar?\n"+"1 - Damas"+"2 - Tateti"+"3 -donaciones\"", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        switch (opcion) {
            case 1:
                System.out.println("Las damas");
                
                break;
            case 2:
                System.out.println("Las tateti");
                break;
            case 3:
                System.out.println("Las Proximamente");
                break;
        }

        don.cuadroDonacion();
    }

}
