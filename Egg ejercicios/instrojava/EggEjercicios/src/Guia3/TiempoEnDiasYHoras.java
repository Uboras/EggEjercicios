import java.util.Scanner;

public class TiempoEnDiasYHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un tiempo en minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(minutos + " minutos son " + dias + " días, " + horas + " horas.");
    }
}