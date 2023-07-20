package Entidades.Main;

import Entidades.Alojamientos;
import Entidades.Camping;
import Entidades.Gimnasios;
import Entidades.Hotel4Stars;
import Entidades.Hotel5Stars;
import Entidades.Recidencias;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Alojamientos> lista = new ArrayList();

        String[] nombreResto = {"Don Julio", "La Cabrera", "El Trapiche", "La Brigada", "Tegui", "Parrilla"
            + " Peña", "La Dorita", "La Pecora Nera", "La Parolaccia", "La Cabrera Norte", "La Carnicería"
            + "", "Cabaña Las Lilas", "Elena", "La Cabrera Sur", "Fervor", "Osaka", "Sarkis", "La Cabrera "
            + "Centro", "Narda Comedor", "Café San Juan"};

        String[] nombre = {"Lucía", "Matías", "Valentina", "Santiago", "Camila", "Nicolás", "Isabella", "Facundo"
            + "", "Mía", "Benjamín", "Luna", "Joaquín", "Martina", "Alejandro", "Emilia", "Sebastián", "Emma"
            + "", "Gabriel", "Renata", "Tomás"};

        String[] nombreHotel = {"Hotel Alvear Palace", "Faena Hotel Buenos Aires", "Llao Llao Hotel & Resort, Golf-Spa",
            "Park Hyatt Buenos Aires", "Hilton Buenos Aires", "Sheraton Buenos Aires Hotel & Convention Center", "Four Seasons"
            + "otel Buenos Aires", "Hotel Madero Buenos Aires", "Meliá Buenos Aires Hotel", "InterContinental"
            + " Buenos Aires", "Alvear Art Hotel", "Hotel Panamericano Buenos Aires", "Palacio"
            + "Duhau - Park Hyatt Buenos Aires", "Alvear Icon Hotel", "Hotel "
            + "Club Frances", "Algodon Mansion", "Sofitel Buenos"
            + " Aires Recoleta", "Hotel Costa Galana", "Hotel L'Auberge", "Hotel Caesar Park Silver Obelisco"};

        for (int i = 0; i < 4; i++) {
            Hotel4Stars ho = new Hotel4Stars(Gimnasios.values()[((int) Math.random() * Gimnasios.values().length)], nombreResto[(int) Math.random() * nombreResto.length], ((int) Math.random() * 200), ((int) (Math.random() * 200)), ((int) Math.random() * 200), ((int) Math.random() * 10), nombreHotel[(int) Math.random() * nombreHotel.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length]);
            System.out.println(ho);
           Hotel5Stars ho1 = new Hotel5Stars(10, 10, 20, Gimnasios.values()[((int) Math.random() * Gimnasios.values().length)], nombreResto[(int) Math.random() * nombreResto.length], ((int) Math.random() * 200), ((int) (Math.random() * 200)), ((int) Math.random() * 200), ((int) Math.random() * 10), nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length]);
           // System.out.println(ho1);            
//Camping(Integer QCarpasMax, Integer QdeBanos, boolean restorante, boolean privacidad, double metrosQdos, String nombre, String direccion, String gerenteEncargado, String localidad) {     
            Camping camp = new Camping(((int) Math.random() * 10), ((int) Math.random() * 10), true, true, ((double) Math.random() * 10), nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length]);
            System.out.println(camp);
            // Recidencias(Integer QHabitaciones, boolean descuentoGremio, boolean campoDeportivo, boolean privacidad, double metrosQdos, String nombre, String direccion, String gerenteEncargado, String localidad) {
            Recidencias res = new Recidencias(((int) Math.random() * 10), true, true, true, ((double) Math.random() * 10), nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length], nombre[(int) Math.random() * nombre.length]);
            System.out.println(res);
            lista.add(ho);
            //lista.add(ho1);
            lista.add(camp);
            lista.add(res);

        }

    }

}
