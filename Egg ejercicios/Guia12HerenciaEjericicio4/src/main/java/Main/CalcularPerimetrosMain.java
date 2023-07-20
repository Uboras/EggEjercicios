

package Main;

import Entidades.Circulos;
import Entidades.Rectangulo;

public class CalcularPerimetrosMain {

    public static void main(String[] args) {
      
        
        Circulos cir = new Circulos(23d);
        Rectangulo rec= new Rectangulo(20,30);
        System.out.println("El Area del rectangulo " +rec.CalcularArea()+" el perimetro es "+ rec.Calcularperimetro());
        System.out.println("el Area del Circulo "+ cir.CalcularArea()+"el perimetro es "+ cir.Calcularperimetro());
    }
}
