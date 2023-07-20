package Service;

import Entidades.Asientos;
import Entidades.Asientos;
import Entidades.Asientos;
import Entidades.Cine;
import Entidades.Cine;
import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Espectador;
import Entidades.Espectador;
import Entidades.Pelicula;
import Entidades.Pelicula;
import Entidades.Pelicula;
import Entidades.Sala;
import Entidades.Sala;
import Entidades.Sala;
import Service.Utilitarios;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ServiceCine {

    public static Set<Espectador> espe = new HashSet();
    public static Set<Pelicula> Cartelera = new HashSet();
    public Cine SalaAtlas = new Cine();
    public Cine SalaCorrientes = new Cine();
    public Cine SalaArmenia = new Cine();

    static Utilitarios op = new Utilitarios();

    public ServiceCine() {
    }
//crea espectadores al azar

    public void crearEspectadores() {
        int cont = 0;
        Set<Espectador> aux = new HashSet();
        for (int i = 0; i < (Math.random() * 1000); i++) {
            Random ne = new Random();
            Espectador nuevo = new Espectador(("Juan Pablo " + i), ne.nextInt(60), Math.random() * 1000);
            cont++;
            aux.add(nuevo);
        }
        espe.addAll(aux);
        System.out.println("Se crearon " + cont + " espectadores.");
    }
//crea salas de cine con pelicula, salon y precio

    public void crearCine() {
        op.Mensaje("Vamos a crear una Sala de Cine");
        Cine cineaux = new Cine(MetodoPelicula(), new Sala(), op.Mensajeint("Precio?"));
        switch ((op.Mensajeint("A que cine se va a mostar la pelicula\n1.Atlas\n2.Corrientes\n3.Armenia"))) {
            case 1 ->
                SalaAtlas = cineaux;
            case 2 ->
                SalaCorrientes = cineaux;
            case 3 ->
                SalaArmenia = cineaux;
        }
    }

//OPCIONES PARA AGREGAR LA PELICULA A LA SALA NUEVA
    private Pelicula MetodoPelicula() {
        Pelicula peli = new Pelicula();
        Integer num = 0;
        do {
            num = op.Mensajeint("Opciones:\n1.Crear pelicula nueva\n2.Agregar una existente");
        } while (num > 2 || num < 1);
        switch (num) {
            case 1:
                peli = crearPelicula();
                break;
            case 2:
                peli = buscarCartelera();
                break;
        }
        return peli;
    }

    //CREAR UNA PELICULA NUEVA 
    private Pelicula crearPelicula() {

        Pelicula peli = new Pelicula(op.MensajeString("Ingrese Titulo"), op.Mensajeint("Ingrese Duracion"), op.Mensajeint("La edad minima"), op.MensajeString("Director"));
        Cartelera.add(peli);
        return peli;
    }
// BUSCAR UNA PELICULA EN CARTELERA (LISTA)

    private Pelicula buscarCartelera() {
        Pelicula peli = new Pelicula();
        MostarCartelera();
        String nombre = op.MensajeString("Ingrese el nombre de la pelicula");
        for (Pelicula pelicula : Cartelera) {
            if (pelicula.getTitulo().equalsIgnoreCase(nombre)) {
                peli = pelicula;
                break;
            }
        }
        if (peli.getTitulo() == null) {
            op.Mensaje("No se encontro el nombre, vuelva a elegir o crear pelicula nueva");
            MetodoPelicula();
        }
        return peli;
    }
    //crear Cartelera directamente

    public void CrearCartelera() {
        op.Mensaje("Vamos a agregar peliculas a la cartelera");
        int num = op.Mensajeint("¿Cuantas peliculas vas a agregar?");
        for (int i = 0; i < num; i++) {
            crearPelicula();
            op.Mensaje("Agregaste " + (i + 1) + " peliculas");

        }
    }

    public void MostarCartelera() {
        for (Pelicula peli : Cartelera) {
            System.out.println(peli);
        }
    }

    public void Boleteria() {
        int cont = 0;
        ArrayList<Espectador> atlas = new ArrayList();
        ArrayList<Espectador> Corrientes = new ArrayList();
        ArrayList<Espectador> Armenia = new ArrayList();

        op.Mensaje("Es la hora de la pelicula, vamos entrando...");
        for (Espectador e : espe) {
            if (e.getDineroDis() > SalaAtlas.getPrecio() && e.getEdad() > SalaAtlas.getPeli().getEdad()) {
                atlas.add(e);
            } else if (e.getDineroDis() > SalaCorrientes.getPrecio() && e.getEdad() > SalaCorrientes.getPeli().getEdad()) {
                Corrientes.add(e);
            } else if (e.getDineroDis() > SalaArmenia.getPrecio() && e.getEdad() > SalaArmenia.getPeli().getEdad()) {
                Armenia.add(e);
            } else {
                cont++;
            }

            llenadoSalaAtlas(atlas);
            llenadoSalaCorrientes(Corrientes);
            llenadoSalaArmenia(Armenia);

        }
        System.out.println(cont + "espectadores no pudieron ingresar a ninguna de las salas");
    }

    private void llenadoSalaAtlas(ArrayList<Espectador> e) {
        Sala aux = new Sala();
        Asientos[][] salaux = new Asientos[8][6];
        //inicializo con un asiento null 
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Asientos nuevo = new Asientos();
                salaux[i][j] = nuevo;
            }
        }
        //relleno con los espectadores
        int cont = 0;
        int numList = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                cont++;
                Asientos nuevo = new Asientos(e.get(numList = (int) Math.random() * e.size()), null);
                switch (i) {
                    case 1:
                        nuevo.setAsientoNum("A" + (j + 1));
                    case 2:
                        nuevo.setAsientoNum("B" + (j + 1));
                    case 3:
                        nuevo.setAsientoNum("C" + (j + 1));
                    case 4:
                        nuevo.setAsientoNum("D" + (j + 1));
                    case 5:
                        nuevo.setAsientoNum("E" + (j + 1));
                    case 6:
                        nuevo.setAsientoNum("F" + (j + 1));
                    case 7:
                        nuevo.setAsientoNum("G" + (j + 1));
                    case 8:
                        nuevo.setAsientoNum("H" + (j + 1));

                }

                salaux[i][j] = (nuevo);
                e.remove(nuevo.getSentado());
            }

        }

        aux.setSala((Set<Asientos>[][]) salaux);
        SalaAtlas.setSala(aux);
        if (cont == (8 * 6)) {
            System.out.println("Sala llena");
        } else {
            System.out.println("Faltaron por completar " + ((8 * 6) - cont) + " lugares");
        }
    }

    private void llenadoSalaCorrientes(ArrayList<Espectador> e) {
        Sala aux = new Sala();
        Asientos[][] salaux = new Asientos[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Asientos nuevo = new Asientos();
                salaux[i][j] = nuevo;
            }
        }
        int numList = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                var nuevo = new Asientos(e.get(numList = (int) Math.random() * e.size()), null);
                switch (i) {
                    case 1:
                        nuevo.setAsientoNum("A" + (j + 1));
                    case 2:
                        nuevo.setAsientoNum("B" + (j + 1));
                    case 3:
                        nuevo.setAsientoNum("C" + (j + 1));
                    case 4:
                        nuevo.setAsientoNum("D" + (j + 1));
                    case 5:
                        nuevo.setAsientoNum("E" + (j + 1));
                    case 6:
                        nuevo.setAsientoNum("F" + (j + 1));
                    case 7:
                        nuevo.setAsientoNum("G" + (j + 1));
                    case 8:
                        nuevo.setAsientoNum("H" + (j + 1));

                }

                salaux[i][j] = (nuevo);
                e.remove(nuevo.getSentado());
            }

        }

        aux.setSala((Set<Asientos>[][]) salaux);
        SalaCorrientes.setSala(aux);
    }

    private void llenadoSalaArmenia(ArrayList<Espectador> e) {
        Sala aux = new Sala();
        Asientos[][] salaux = new Asientos[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Asientos nuevo = new Asientos();
                salaux[i][j] = nuevo;
            }
        }
        int numList = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                var nuevo = new Asientos(e.get(numList = (int) Math.random() * e.size()), null);
                switch (i) {
                    case 1:
                        nuevo.setAsientoNum("A" + (j + 1));
                    case 2:
                        nuevo.setAsientoNum("B" + (j + 1));
                    case 3:
                        nuevo.setAsientoNum("C" + (j + 1));
                    case 4:
                        nuevo.setAsientoNum("D" + (j + 1));
                    case 5:
                        nuevo.setAsientoNum("E" + (j + 1));
                    case 6:
                        nuevo.setAsientoNum("F" + (j + 1));
                    case 7:
                        nuevo.setAsientoNum("G" + (j + 1));
                    case 8:
                        nuevo.setAsientoNum("H" + (j + 1));

                }

                salaux[i][j] = nuevo;
                e.remove(nuevo.getSentado());
            }

        }

        aux.setSala((Set<Asientos>[][]) salaux);
        SalaArmenia.setSala(aux);
    }

    public void MostrarSalas(int a) {
        switch (a) {
            case 1:
                System.out.println(SalaAtlas.toString());
                break;
            case 2:
                System.out.println(SalaCorrientes.toString());
                break;
            case 3:
                System.out.println(SalaArmenia.toString());
                break;
            default:
                System.out.println("No es una sala creada");
                break;
        }
    }
}
