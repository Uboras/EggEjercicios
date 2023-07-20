/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.BarajaCartas;

/**
 *
 * @author Herna
 */
public class JuegoCartas {

       public static void main(String[] args) {
        BarajaCartas baraja = new BarajaCartas();
       
        System.out.println("!!!!!");
        System.out.println(baraja);
        
        baraja.darCartas(5);   
        System.out.println("Barajar Mazo");
        baraja.barajar();
        
        System.out.println("cartas disponibles");
        baraja.cartasDisponibles();
       
        System.out.println("Cartas del monton");
        baraja.cartasMonton();
        
        System.out.println("Mostrar baraja");
        baraja.mostarBaraja();
       
        System.out.println("Siguiente carta");
        baraja.siguienteCarta();
      
        System.out.println(" cartas ");
        baraja.cartasDisponibles();

       
    }
}
