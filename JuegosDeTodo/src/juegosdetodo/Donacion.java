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
public class Donacion {

    public Donacion(){
        
    }
    
    public void cuadroDonacion() {

        String cbu = "Cbu= " + " 12301293102930139\n";
        String paypal = "Paypal= " + " hernanmanera@hotmail.com.ar\n";

        // Crear el mensaje del cuadro de diálogo
        String mensaje = "Cbu " + cbu + "\nPaypal" + paypal + ".";

        // Mostrar el cuadro de diálogo
        JOptionPane.showConfirmDialog(null, cbu + "\n " + paypal, "Ayudanos Donando en: ", 0);
    }

}
