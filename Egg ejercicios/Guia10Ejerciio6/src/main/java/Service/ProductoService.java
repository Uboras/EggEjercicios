package Service;

import Entidades.Productos;
import java.util.HashMap;
import java.util.Scanner;

/*
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, 
introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos
que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave 
el nombre del producto y de valor el precio.
Realizar un menú para lograr todas 
las acciones previamente mencionadas.
 */
public class ProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Productos> listaproductos = new HashMap();

    public void menu() {
        Integer respues = 8;

        do {
            System.out.println("""
                               Ingresa la opci\u00f3n que quieras hacer 
                               1-Ingresar productos
                               2-Modificar el precio de un producto
                               3-elminiar un producto
                               4-Mostrar los productos
                               5-Salir""");

            respues = leer.nextInt();

            switch (respues) {

                case 1 -> {
                    ingresarProductos();
                    break;
                }

                case 2 -> {
                    modificarPrecio();
                    break;
                }
                case 3 -> {
                    eliminarProducto();
                    break;
                }
                case 4 -> {
                    mostrarProductos();
                    break;
                }
                case 5 -> {
                    Salir();
                    break;
                }
                default ->
                    System.out.println("No ingreso una respuesta válida");

            }
        } while (respues == 0);
    }

    public void ingresarProductos() {
        System.out.println("Ingresa el producto, nombre y precio");
        String nombre = leer.next();
        Double precio = leer.nextDouble();
Productos p1 = new Productos(nombre, precio);
        listaproductos.put(nombre, p1 );
        menu();
    }

    private void modificarPrecio() {
        System.out.println("Ingresa el producto a modificar nombre y el precio nuevo");
        String nombre = leer.next();
        Double precio = leer.nextDouble();
        Productos p1 = new Productos(nombre, precio);
       
        if(listaproductos.containsKey(nombre)){
            System.out.println("Se encontro el nombre se procede a modificar");        
        listaproductos.replace(nombre, p1);
        }else{System.out.println("No se encontro el nombre");}
        menu();
                }

    private void eliminarProducto() {
          System.out.println("Ingresa el producto a eliminar nombre");
        String nombre = leer.next();
      if(listaproductos.containsKey(nombre)){
            System.out.println("Se encontro el nombre se procede a Eliminar");        
         listaproductos.remove(nombre);
        }else{System.out.println("No se encontro el nombre");}
        menu();
       
        }

    private void mostrarProductos() {
        System.out.println(listaproductos.values());
        menu();
    }

    private void Salir() {
        System.exit(0);
        
    }
}
