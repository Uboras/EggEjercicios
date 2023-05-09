
import java.util.Scanner;

public class WalkenApp {

    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);

        System.out.print("cantidad de pokemones en 8-9: ");
        int ocnu = lp.nextInt();
        System.out.print("Cantidad de pokemones en 6-7: ");
        int sesi = lp.nextInt();
        double wlk = 0.042;
        primera(ocnu, sesi, wlk);
        // comparacion 

        System.out.print("Cantida de pokemones en 8-9: ");
        int ocnu1 = lp.nextInt();
        System.out.print("cantidad de pokemones en 8-9 Papoteados: ");
        int ocnu180 = lp.nextInt();
        System.out.print("Cantidad de pokemones en 6-7: ");
        int sesi1 = lp.nextInt();
        segunda(ocnu1, sesi1, ocnu180, wlk);
    }

    private static void primera(int ocnu, int sesi, double wlk) {
        int suma = (int) ((ocnu * 2.02 * 12) + (sesi * 1.01 * 12));
        System.out.println("Gananacia diaria: " + suma + " Cantidad al 100%" + "\n ganancia 40%: " + (suma * 0.4)
                + "\n Ganancia 30%: " + (suma * 0.3)
                + "\n Ganancia 20%: " + (suma * 0.2));
        System.out.println("gananacia mensual: " + (suma * 30) + " [" + (suma * 30 * wlk * 400) + "] $."
                + "\n ganancia 40%: " + (suma * 30 * 0.4) + " [" + (suma * 30 * 0.4 * wlk * 400) + "] $."
                + "\n Ganancia 30%: " + (suma * 30 * 0.3) + " [" + (suma * 30 * 0.3 * wlk * 400) + "] $."
                + "\n Ganancia 20%: " + (suma * 30 * 0.2) + " [" + (suma * 30 * 0.2 * wlk * 400) + "] $.");

    }

    private static void segunda(int ocnu1, int sesi1, int ocnu180, double wlk) {
        int suma0 = (int) (ocnu180 * 2.02 * 12);
        int suma1 = (int) (suma0 * 0.6);
        System.out.println(suma1);
        int suma = (int) (((ocnu1 - ocnu180) * 2.02 * 12) + (sesi1 * 1.01 * 12));
        System.out.println("Gananacia diaria: " + (suma + suma0) + " Cantidad al 100%" + "\n ganancia 40%: " + ((suma * 0.4) + suma1)
                + "\n Ganancia 30%: " + ((suma * 0.3) + suma1)
                + "\n Ganancia 20%: " + ((suma * 0.2) + suma1)
                + "\n Ganancia Mejorados: " + (suma1));
        System.out.println("gananacia mensual: " + ((suma0 + suma) * 30) + " [" + ((suma0 + suma) * 30 * wlk * 400) + "] $."
                + "\n ganancia 40%: " + ((suma * 30 * 0.4) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.4)) * wlk * 400) + "] $."
                + "\n Ganancia 30%: " + ((suma * 30 * 0.3) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.3)) * wlk * 400) + "] $."
                + "\n Ganancia 20%: " + ((suma * 30 * 0.2) + suma1 * 30) + " [" + (((suma1 * 30) + (suma * 30 * 0.2)) * wlk * 400) + "] $.");

    }
}
