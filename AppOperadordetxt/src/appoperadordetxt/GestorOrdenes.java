/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoperadordetxt;

import java.time.LocalTime;





public class GestorOrdenes {
public void ejecucionOperaciones(){


}
    
    
    
    
    public static void horario(LocalTime time){ 
   LocalTime ahora = LocalTime
        
        if (time == ahora )
    
    }
    
   public static void par(String par){
           
    }   
   
    public static void compraOventa(String operacion) {
        if (operacion.equals("call")) {
            // Lógica para el comando1
            System.out.println(("Operacion de compra a realizar"));
        } else if (operacion.equals("put")) {
            // Lógica para el comando2
            System.out.println("Operacion de venta a realizar");
        } else {
            // Comando desconocido o no válido
            System.out.println("error en la sentencia de compra o venta");
        }
    }
}