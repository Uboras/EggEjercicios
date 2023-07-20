
package Entidads;

import java.util.Date;


public class EjercicioBarco {

    public static void main(String[] args) {
    Date fechaAlquiler = new Date(2000-1900,12,12);
    Date fechaDevolucion = new Date(2000-1900,12,15);    
    Amarre ama = new Amarre("Posicion1",432334324l,fechaAlquiler , fechaDevolucion, 1 , new Yate(2, 2332, 12, 2023,23 ));
        System.out.println(ama); 
        System.out.println(ama.CalcularAlquiler());
        
    }
}
