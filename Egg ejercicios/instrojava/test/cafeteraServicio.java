
import cafetera.cafetera;
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
public class cafeteraServicio {

   cafetera c1 = new cafetera();
  
    public void llenarCafetera() {
        c1.setCapacidadMaxima(c1.getCantidadActual());

    }

    public void servirTaza(int tamano) {
        System.out.println();
        if (tamano > c1.getCantidadActual()) {
            System.out.println("No se lleno la taza al 100%");
            System.out.println("solo se lleno "+(c1.getCantidadActual()/(tamano*100)));
            c1.setCantidadActual(0);
        } else if (tamano <= c1.getCantidadActual()){
            System.out.println("la taza se lleno al 100%");
             c1.setCantidadActual((c1.getCantidadActual()-tamano));
             
        }
    }
        public void vaciarCafetera(){
            c1.setCantidadActual(0);
            
        }
        
        public void agregarCafe (int cantidad){
            
            c1.setCantidadActual(cantidad);
            c1.setCapacidadMaxima(c1.getCantidadActual());
            
        }
           
            
        
        }
    
    
    
    


