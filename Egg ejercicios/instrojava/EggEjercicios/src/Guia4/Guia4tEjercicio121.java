import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Guia4tEjercicio121{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pw = new Scanner(System.in);
        
        
        System.out.println("Ingrese los digitos a verificar si \nel primer numero es multiplo del segundo ");
        int num1 =pw.nextInt() , num2 =pw.nextInt();

        esmultiplo(num1, num2);

    }

    public static void esmultiplo(int num1, int num2) {

        boolean multiplo = false;
        int mult;
        mult = (num1 %num2);
        if (mult == 0) {
            multiplo = true;
        }
        System.out.println("la afirmacion si es multiplo es: " + multiplo);
        

    }
}
