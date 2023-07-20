/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Servicio.ServiPeliculas;

/**
 *
 * @author Herna
 */
public class PeliculasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        ServiPeliculas sp = new ServiPeliculas();
        
        
        sp.menu();
        
        
    }
    
}
