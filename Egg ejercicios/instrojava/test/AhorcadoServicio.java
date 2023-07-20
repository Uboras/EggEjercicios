
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado vector = new Ahorcado();
        System.out.println("INGRESE UNA PALABRA PARA JUGAR");
        String palabra = leer.next();
        int tamaño = palabra.length();
        System.out.println("INGRESE CANTIDAD DE INTENTOS A PROBAR");
        vector.setJugadasMaxima(leer.nextInt());
        String[] vec1 = new String[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vec1[i] = palabra.substring(i, i + 1);
        }
        vector.setVec(vec1);
return vector;
    }

    public int longitud(Ahorcado vector) {

        return vector.getVec().length;
    }

    /*Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra
estaba o no.*/
    public void buscar(Ahorcado vector, String letra) {
        String[] vec2 = vector.getVec();
        
        int cont = 0;

        for (int i = 0; i < vec2.length; i++) {
            if (letra.equals(vec2[i])) {
                
                cont++;
            }

        }
        if (cont > 0) {
            System.out.println("LA LETRA " + letra + " SE ENCONTRO " + cont);
        } else {
            System.out.println("ESTA PALABRA NO TIENE LETRA " + letra);
        }
        vector.setEncontradas(vector.getEncontradas() + cont);

    }

    /* Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
que se busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(Ahorcado vector, String letra) {
        System.out.println("LETRAS ENCONTRADAS : " + vector.getEncontradas());
        System.out.println("LE FALTAN : "
                + (vector.getVec().length - vector.getEncontradas()) + " LETRAS");

        String[] vec2 = vector.getVec();
        int cont = 0;

        for (int i = 0; i < vec2.length; i++) {
            if (letra.equals(vec2[i])) {
                cont++;
            }

        }
        if (cont == 0) {
            vector.setJugadasMaxima(vector.getJugadasMaxima() - 1);
        }
        return cont > 0;
    }

    public void intentos(Ahorcado vector) {
        System.out.println("LE QUEDAN " + vector.getJugadasMaxima() + " INTENTOS");

        if (vector.getJugadasMaxima() == 0) {
            System.out.println("NO LE QUEDAN INTENTOS");
            System.out.println("FIN DEL JUEGO");
            System.out.println("USTED PERDIO!!");
        }
    }

    public boolean ganador(Ahorcado vector) {
        if (vector.getEncontradas() == vector.getVec().length) {
            System.out.println("FELICITACIONES USTED GANO!!");

        }
        return vector.getEncontradas() == vector.getVec().length;
    }

    public void Juego() {
        Scanner leer = new Scanner(System.in);
       
        AhorcadoServicio sv = new AhorcadoServicio();
        Ahorcado et = sv.crearJuego();
     String letra;

        System.out.println("BIENVENIDO AL JUEGO AHORCADO");
        
        do {
            System.out.println("LA PALABRA CONTIENE "
                    + sv.longitud(et) + " CARACTERES");
            System.out.println("INGRESE UNA LETRA A BUSCAR");
            letra = leer.next();
            sv.buscar(et, letra);
            sv.encontradas(et, letra);
            sv.intentos(et);
            sv.ganador(et);

        } while (et.getJugadasMaxima() > 0 && sv.ganador(et) == false);

    }
}

