package Main;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Servicios.Juego;
/**
 *
 * @author Herna
 */
public class RuletarusaAgua {

    public static void main(String[] args) {
        ArrayList<Jugador> lola = new ArrayList<>();

        Integer respuesta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de juegadores"));
        if (respuesta < 0 || respuesta > 6) {
            respuesta = 6;
        }

        for (int i = 0; i < respuesta; i++) {
            Jugador juga1 = new Jugador((i + 1), JOptionPane.showInputDialog("¿El nombre del Juegador?") + " " + (i + 1));
            lola.add(juga1);
        }
    
    RevolverAgua rev = new RevolverAgua();
        rev.llenarRevolverAgua();
        
        Juego juego = new Juego();
    juego.llenarJuego(lola, rev);
    juego.ronda();
    }

}
