
import entidades.Personal1;
import entidades.PersonalServicio;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonalServicio ps = new PersonalServicio();
        //cantidad de personas a generar
        System.out.println("Cuantas personas vas a crear?");
        int numIng = leer.nextInt();
        //cree un vector para guardar todas las personas.
        Personal1[] pernueva = new Personal1[numIng];

        //generar cantidad de personas determinadas.
        for (int i = 0; i < numIng; i++) {
            System.out.println("Persona Numero: " + (i + 1));
            pernueva[i] = ps.crearPersona();
            pernueva[i].toString();
        }
        //calcular Imc para todas las personas.
        for (int i = 0; i < numIng; i++) {
            switch (ps.calcularImc(pernueva[i])) {
                case - 1:
                    System.out.println(pernueva[i].getNombre() + " esta bajo en peso ");

                    break;
                case 1:
                    System.out.println(pernueva[i].getNombre() + " esta en sobre peso ");
                    break;
                default:
                    System.out.println(pernueva[i].getNombre() + " esta en su peso ideal ");
                    break;
            }

        }

        //Mayora de edad de las personas.
        for (int i = 0; i < numIng; i++) {

            if (ps.esMayorDeEdad(pernueva[i]) == true) {
                System.out.println(pernueva[i] + " Es mayor de edad!!");
            } else {
                System.out.println(pernueva[i] + " Es menor de edad!!");

            }
        }
        ps.calcularCantidadDeMayores(pernueva, numIng);

    }

}
