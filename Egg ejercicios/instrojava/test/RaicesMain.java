/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class RaicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio lp = new RaicesServicio();
        Raices raiz1 = lp.crearRaices();
        lp.calcular(raiz1);
    }
    
}
