
import java.util.Scanner;

/*** Crea una clase "Cuenta" que tenga atributos como 
 * "saldo" y "titular". Luego, crea un método 
 * "retirar_dinero" que permita retirar una cantidad de 
 * dinero del saldo de la cuenta. Asegúrate de que el saldo 
 * nunca sea negativo después de realizar una transacción de retiro.*/

public class cuenta {
    public double saldo;
    public String titular;

    public cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public cuenta() {
    }
    
    
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuánto queres retirar?" );
        double retiro= leer.nextDouble();
        
        if (retiro>saldo ){ 
            System.out.println("Su saldo es insuficiente! Pruebe con menos");
        }else {
        saldo -=retiro;
            System.out.println("Su saldo es "+saldo+" despues del retiro de "+retiro);
        
        }
        
    }

}
