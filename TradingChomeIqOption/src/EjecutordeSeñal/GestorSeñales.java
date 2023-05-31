/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjecutordeSeñal;

import Entidades.MouseyTeclado;
import Entidades.Senales;
import java.awt.AWTException;
import java.time.LocalTime;

public class GestorSeñales {

    public static void ubicacionmouseCompra(Senales senal) throws AWTException {
        
        MouseyTeclado mouse = new MouseyTeclado();

        try {

            // ingresar el par( hacer el click al par)
            //SELECCIONA EL PAR DE LA LISTA
            mouse.ingresarElPar(senal.getPares());
            //sellecciona Los minutos de duracion
            minduracion(senal.getDuracion());
            //Boton de compra
            mouse.BotonCompra();

        } catch (AWTException e) {
        }
    }

    public static void ubicacionmouseventa(Senales senal) throws AWTException {

      
        MouseyTeclado mouse = new MouseyTeclado();

        try {
            // ingresar el par( hacer el click al par)
            //SELECCIONA EL PAR DE LA LISTA
            mouse.ingresarElPar(senal.getPares());
            //sellecciona Los minutos de duracion
            minduracion(senal.getDuracion());
            //Boton de VENTA
            mouse.BotonVenta();

        } catch (AWTException e) {
        }
    }

    public static boolean horario(Senales senal) {
        boolean result;
        LocalTime ahora = LocalTime.now();
        LocalTime fechaInicio = senal.getFechaInicio();
     

        while (!ahora.equals(fechaInicio)) {
            ahora = LocalTime.now();
            if (ahora.isAfter(fechaInicio)) {
                System.out.println("se paso el horario"); break;
            }
        }
        result = ahora.equals(fechaInicio);
        return result;
    }

    public static void minduracion(int duracion) throws AWTException {
        MouseyTeclado mouse = new MouseyTeclado();

        switch (duracion) {
            case 5:
                mouse.Duracion5min();

                break;
            case 15:
                mouse.Duracion15min();
                break;
            case 1:
                mouse.Duracion1min();
            default:

        }

    }

    public static void compraOventa(Senales senal) throws AWTException {
        //verifica la comra o ventA Y Ejecuta el proceso
          MouseyTeclado mouse = new MouseyTeclado();
        switch (senal.getOperacion()) {
            case "CALL":
                ubicacionmouseCompra(senal);
                break;
            case "PUT":
                ubicacionmouseventa(senal);
                break;
            default:
               mouse.Mensajes("error en la sentencia de compra o venta");
                break;
        }
    }
}
