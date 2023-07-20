
package Main;

import Service.ProductoService;

/*
Se necesita una aplicación para una tienda en la cual
queremos almacenar los distintos
productos que venderemos y el precio que tendrán. 
Además, se necesita que la

*/

public class Tienda {

    public static void main(String[] args) {
     
        ProductoService ps = new ProductoService();
             
        ps.menu();
        
    }
}
