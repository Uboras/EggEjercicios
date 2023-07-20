package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class Juego {

    private RevolverAgua rev;
    private ArrayList<Jugador> jugadores;

    public RevolverAgua getRev() {
        return rev;
    }

    public void setRev(RevolverAgua rev) {
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> juga, RevolverAgua rev) {

        setJugadores(juga);
        setRev(rev);
    }

    public void ronda() {
        Integer cont = 0;
        Integer contadorJugadores = 0;
        do {
            for (Jugador juga : jugadores) {
                JOptionPane.showMessageDialog(null, juga.getNombre() + " Se esta disparando y ....");

                if (rev.Mojar(rev)) {
                    juga.setEstado(true);
                    cont++;
                    JOptionPane.showMessageDialog(null, " Se Mojo, Perdio!!! ");
                    JOptionPane.showMessageDialog(null, juga.toString());
                    contadorJugadores++;
                    break;
                } else {
                    rev.siguienteChorro();
                    JOptionPane.showMessageDialog(null, juga.getNombre() + " Se salvo, vamos por el siguiente ");
                    contadorJugadores++;
                }
            }
        } while (cont == 0 || jugadores.size() == contadorJugadores);

    }

}
