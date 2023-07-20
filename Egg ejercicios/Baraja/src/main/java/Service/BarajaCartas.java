package Service;

import Entidades.Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class BarajaCartas {

    private HashSet<Cartas> baraja = new HashSet<>();
    private HashSet<Cartas> barajaMostrada = new HashSet<>();
    private Integer contadorMostradas;

    public HashSet<Cartas> getBarajaMostrada() {
        return barajaMostrada;
    }

    public void setBarajaMostrada(HashSet<Cartas> barajaMostrada) {
        this.barajaMostrada = barajaMostrada;
    }

    public Integer getContadorMostradas() {
        return contadorMostradas;
    }

    public void setContadorMostradas(Integer contadorMostradas) {
        this.contadorMostradas = contadorMostradas;
    }

    @Override
    public String toString() {
        return "BarajaCartas{" + "baraja=" + baraja + '}';
    }

    public HashSet<Cartas> getBaraja() {
        return baraja;
    }

    public void setBaraja(HashSet<Cartas> baraja) {
        this.baraja = baraja;
    }

    public BarajaCartas() {

        String[] palo = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palos : palo) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    Cartas carta = new Cartas(numero, palos);
                    baraja.add(carta);
                    System.out.println(carta);
                }
            }
            System.out.println(" ");

        }
    }

    public void barajar() {
        ArrayList<Cartas> aux = new ArrayList<>(baraja);
        Collections.shuffle(aux);
        HashSet<Cartas> aux1 = new HashSet(aux);
        setBaraja(aux1);

    }

    public void siguienteCarta() {
        for (Cartas car : baraja) {
            JOptionPane.showMessageDialog(null, car.toString());
            barajaMostrada.add(car);
            baraja.remove(car);
            break;
        }
    }

    public void cartasDisponibles() {
        System.out.println("Quedan" + baraja.size() + "Cartas");
    }

    public void darCartas(Integer numeCartas) {
        int cont = 0;
       HashSet<Cartas> aux = new HashSet<>();
       mostarBaraja();    
       for (Iterator<Cartas> it = baraja.iterator(); it.hasNext();) {
                Entidades.Cartas car = it.next();
                cont++;
                System.out.println(car.toString() + " " + cont);
                System.out.println("A");
                aux.add(car);
                System.out.println("b");
                baraja.remove(car);
                System.out.println("c");
                if( cont == numeCartas){
                    break;}
                
            }
    barajaMostrada.addAll(aux);

    }

    public void cartasMonton() {
        for (Cartas cartas : barajaMostrada) {
            System.out.println(cartas);
        }
    }

    public void mostarBaraja() {

        for (Cartas cartas : baraja) {
            System.out.println(cartas);
        }
    }
}
