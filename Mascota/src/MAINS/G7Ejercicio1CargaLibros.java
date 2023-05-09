package MAINS;

import entidades.G7Ejercicio1Libros;
import java.util.Scanner;

public class G7Ejercicio1CargaLibros {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        G7Ejercicio1Libros libro1 = new G7Ejercicio1Libros();// se crea el objeto
        //   System.out.println("Escribe el Isbn: "); isbn = lp.nextLine();
        System.out.println("Ingrese isbn");
        libro1.isbn = lp.next();
        System.out.println("Ingrese Autor");
        libro1.autor = lp.next();
        System.out.println("Ingrese titulo");
        libro1.titulo = lp.next();
        System.out.println("Ingrese numero de paginas");
        libro1.numPaginas = lp.nextInt();

        MostrarEventos(libro1);
        System.out.println();
    }

    public static void MostrarEventos(G7Ejercicio1Libros libro1) {

        System.out.println(libro1);
    }

}
