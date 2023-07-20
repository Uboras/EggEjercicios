package Entidadesd;

import Servicios.Utilitarios;
import java.util.ArrayList;

public class Electrodomesticosmain {

    public static void main(String[] args) {
        Utilitarios op = new Utilitarios();
        /* Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

        ArrayList<Electrodomesticos> lista = new ArrayList();
        
int can = op.Mensajeint("Cuantas electrodomesticos");
        for (int i = 0; i < can; i++) {

            String crear = op.MensajeString("Ingrese que quiere crear 'lav' o 'tele'");
            if (crear.equalsIgnoreCase("lav")) {
                Lavadora lp = new Lavadora("Blanco", 'c', 300, 30d);
                lista.add(lp);
                
            } else if (crear.equalsIgnoreCase("tele")) {
                Televisor tele = new Televisor(10d, false, "Negro", 'b', 5);
                lista.add(tele);
            }
        }
        double sumatele = 0;
        double sumaLava = 0;
        double suma = 0;

        for (Electrodomesticos el : lista) {

            if (el instanceof Lavadora) {
                
                el.precioFinal();
                op.Mensaje("El precio de Lavadora Es " + el.getPrecio());
                sumaLava += el.getPrecio();
                suma += el.getPrecio();
            }
            if (el instanceof Televisor) {
                el.precioFinal();
                op.Mensaje("El precio del Televisor Es " + el.getPrecio());
                sumatele += el.getPrecio();
                suma += el.getPrecio();
            }

        }
        op.Mensaje("La suma de Televisores es de " + sumatele + "\nLa Suma de"
                + " Lavadoras es de " + sumaLava + "\n la suma "
                        + "total es de " + suma);
    }
}
