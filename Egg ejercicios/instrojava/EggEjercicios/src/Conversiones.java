
import java.util.Scanner;




/*Crea una aplicación que a través de una función
nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a
dólares, yenes o libras. La función tendrá 
como parámetros, la cantidad de euros y la 
moneda a convertir que será una cadena,
este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class Conversiones{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros y a que tipo de moneda la "
                + "queres convertir\nEscribe\n |Do| para convertirlos en dolares\n"
                + " |Ye| para convertirlos en yenes\n |Li| para convertirlos en Libras");
        System.out.println("Cantidad: ");
        int euros = leer.nextInt();
        System.out.println("A que monedad: ");
        String monConv = leer.next();

        convertor(euros, monConv);
    }

    public static void convertor(int euros, String monConv) {
double moneda=0;
       if(monConv.equalsIgnoreCase("Do")){
        //dolar
        moneda = euros * 1.28611;
       }else if(monConv.equalsIgnoreCase("Li")){
        //libras 
        moneda = euros * 0.86;
      
       }else if(monConv.equalsIgnoreCase("Ye")){
       //yenes
        moneda = euros * 129.852;
       }
        System.out.println("La conversion de "+euros+" de euros a "+monConv+" es: "+moneda);
       
    }

}
