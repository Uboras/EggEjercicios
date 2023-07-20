package Servicio;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class ServiPeliculas {

    private ArrayList<Peliculas> peliculasGuardas;

    /* En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
   
     */
    public ArrayList<Peliculas> getPeliculasGuardas() {
        return peliculasGuardas;
    }

    public void setPeliculasGuardas(ArrayList<Peliculas> peliculasGuardas) {
        this.peliculasGuardas = peliculasGuardas;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPeliculasYGuardar() {
        String respuesta = "";
        ArrayList<Peliculas> peliculascreadas = new ArrayList();

        do {
            Peliculas p1 = new Peliculas();
            System.out.println("Ingrese el Titulo de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            p1.setDirector(leer.next());
            System.out.println("Ingrese la Duracion de la pelicula");
            p1.setDuracion(leer.nextDouble());
            System.out.println("¿quiere seguir creando peliculas?");
            respuesta = leer.next();

            peliculascreadas.add(p1);

        } while (respuesta.equalsIgnoreCase("si"));
setPeliculasGuardas(peliculascreadas);

    }

    //  • Mostrar en pantalla todas las películas.
    public void mostrarPeliculas() {

        for (Object peli : peliculasGuardas) {
            System.out.println(peli.toString());
        }
    }

//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void pelisMenos1hs() {

        for (Peliculas peli : peliculasGuardas) {
            if (peli.getDuracion() < 1) {
                System.out.println(peli);

            }

        }

    }

//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void ordenMmenor() {

        Collections.sort(peliculasGuardas, Comparator.comparingDouble(Peliculas::getDuracion).reversed());

        mostrarPeliculas();

    }
    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.

    public void ordenmenorMayor() {

        Collections.sort(peliculasGuardas, Comparator.comparingDouble(Peliculas::getDuracion));

        mostrarPeliculas();

    }

//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordentitulo() {

        Collections.sort(peliculasGuardas, Comparator.comparing(Peliculas::getTitulo));
        mostrarPeliculas();
    }

//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenDirector() {
        Collections.sort(peliculasGuardas, Comparator.comparing(Peliculas::getTitulo));
        mostrarPeliculas();
    }

    public void menu(){
    String resp ="no";
        
        do{  
        System.out.println("-----------------------------------------------------\nBienvenidos, seleccione la opcion que quiera realizar:");
        System.out.println("1:Crear un listado de peliculas\n2:Mostrar el listado de peliculas"
                + "\n3:Mostrarlas de mayor duracion"+"\n4:Mostrarlasde menor a mayor"
                + "\n4:Mostrar en orden alfabetico por titulo\n6:Mostrar en orden alfabetico por director"
                + "\n7:Las peliculas de menor duracion (-1hs)\n0: Salir.\n---------------------------------------------------------");
        
        Integer respuesta = leer.nextInt();
        
        switch (respuesta){
            case 1: crearPeliculasYGuardar();break;
            case 2: mostrarPeliculas();break;
            case 3: ordenMmenor();break;
            case 4:ordenmenorMayor();break;
            case 5:ordentitulo();break;
            case 6:ordenDirector();break;
            case 7:pelisMenos1hs();break;
            case 0: resp = "si" ;break;
    }
    

           

        } while (resp.equalsIgnoreCase("si"));
    
}
}
    
