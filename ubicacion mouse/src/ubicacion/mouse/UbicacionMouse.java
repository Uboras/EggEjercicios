/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicacion.mouse;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

/**
 *
 * @author Herna
 */
public class UbicacionMouse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          PointerInfo pointerInfo = MouseInfo.getPointerInfo();
                Point punto = pointerInfo.getLocation();
                int x = (int) punto.getX();
                int y = (int) punto.getY();
                System.out.println("La posición del puntero del mouse es: X=" + x + ", Y=" + y);
    }
    
}
