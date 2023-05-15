
import java.util.Scanner;

public class WalkenApp {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        System.out.println("Dolar?");
        int dolar=lp.nextInt();
        System.out.print("cantidad de pokemones en 8-9: ");
        int ocnu = lp.nextInt();
        System.out.print("Cantidad de pokemones en 6-7: ");
        int sesi = lp.nextInt();
        double wlk = 0.036;
        primera(ocnu, sesi, wlk,dolar);
        // comparacion 

        System.out.print("Cantida de pokemones en 8-9: ");
        int ocnu1 = lp.nextInt();
        System.out.print("cantidad de pokemones en 8-9 Papoteados: ");
        int ocnu180 = lp.nextInt();
        System.out.print("Cantidad de pokemones en 6-7: ");
        int sesi1 = lp.nextInt();
        segunda(ocnu1, sesi1, ocnu180, wlk, dolar);
    }

    private static void primera(int ocnu, int sesi, double wlk, int dolar) {
        double suma =((ocnu * 2.02 * 12) + (sesi * 1.01 * 12));
        System.out.println("Gananacia diaria: " + suma + " Cantidad al 100%" + "\n ganancia 40%: " + (suma * 0.4)
                + "\n Ganancia 30%: " + (suma * 0.3)
                + "\n Ganancia 20%: " + (suma * 0.2));
        System.out.println("gananacia mensual: " + (suma * 30) + " [" + (suma * 30 * wlk * dolar) + "] $."
                + "\n ganancia 40%: " + (suma * 30 * 0.4) + " [" + (suma * 30 * 0.4 * wlk * dolar) + "] $."
                + "\n Ganancia 30%: " + (suma * 30 * 0.3) + " [" + (suma * 30 * 0.3 * wlk * dolar) + "] $."
                + "\n Ganancia 20%: " + (suma * 30 * 0.2) + " [" + (suma * 30 * 0.2 * wlk * dolar) + "] $.");

    }

    private static void segunda(int ocnu1, int sesi1, int ocnu180, double wlk, int dolar ) {
        double suma0 = (ocnu180 * 2.02 * 12);
        double suma1 = (suma0 * 0.6);
        System.out.println(suma1);
        double suma = (((ocnu1 - ocnu180) * 2.02 * 12) + (sesi1 * 1.01 * 12));
        System.out.println("Gananacia diaria: " + (suma + suma0) + " Cantidad al 100%" + "\n ganancia 40%: " + ((suma * 0.4) + suma1)
                + "\n Ganancia 30%: " + ((suma * 0.3) + suma1)
                + "\n Ganancia 20%: " + ((suma * 0.2) + suma1)
                + "\n Ganancia Mejorados: " + (suma1));
        System.out.println("gananacia mensual: " + ((suma0 + suma) * 30) + " [" + ((suma0 + suma) * 30 * wlk * dolar) + "] $."
                + "\n ganancia 40%: " + ((suma * 30 * 0.4) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.4)) * wlk * dolar) + "] $."
                + "\n Ganancia 30%: " + ((suma * 30 * 0.3) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.3)) * wlk * dolar) + "] $."
                + "\n Ganancia 20%: " + ((suma * 30 * 0.2) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.2)) * wlk * dolar) + "] $.");

    }
}
