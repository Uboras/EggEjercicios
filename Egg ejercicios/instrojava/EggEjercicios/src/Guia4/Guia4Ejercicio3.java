/*
Crea una aplicación que a través de una función 
nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y 
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
1.* 0.86 libras es un 1 €
2.* 1.28611 $ es un 1 €
3.* 129.852 yenes es un 1 €
 */
package Guia4;

import java.util.Scanner;

public class Guia4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir...");
        double euros = leer.nextDouble();
        System.out.println("convertirla a \nDolar\nYenes\nLibras");
        String monedaConv = leer.next();

        double resultado = convertidor(euros, monedaConv);

        System.out.println("La conversion de " + euros + " es de : " + resultado + " en " + monedaConv);
    }

    private static double convertidor(double euros, String monedaConv) {
        double resultado = 0;
        
        switch (monedaConv) {
            case "D": resultado = (euros * 129.852);  break;
            case "Yenes": resultado = (euros * 1.28611);  break;
            case "Libras": resultado = (euros * 0.86);    break;
            default:
                System.out.println("El tipo de cambio es incorrecto");
        }
        return resultado;

    }

}
