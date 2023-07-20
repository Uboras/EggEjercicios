package guia13exepcionesejercicio5;

import java.util.Random;

public class Guia13ExepcionesEjercicio5 {

    public static void main(String[] args) {
        Utilitarios op = new Utilitarios();
        int intentos = 0;
        int num = (int) (Math.random() * 500);
        int ingreso = 1000;
        System.out.println(num);

        do {
            try {
                intentos++;
                op.Mensaje("""
                           Jueguemos a adivinar 
                           el numero que estoy pensando(1-500)
                           empeza a decir numeros 
                           y te doy ayudita""");
                
                ingreso = op.Mensajeint("Ingrese un numero a ver si adivina");

                if (num == ingreso) {
                    System.out.println("Ganaste!!");
                    op.Mensaje("Ganaste en " + intentos + " intentos");
                    break;
                } else if (num > ingreso) {
                    op.Mensaje("El numero es mas alto");
                } else {
                    op.Mensaje("El numero es mas bajo");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                op.LeerTexto();
            }
            op.Mensaje("Intentos realizados" + intentos + " intentos");
            
        } while (num != ingreso);
    }
}
