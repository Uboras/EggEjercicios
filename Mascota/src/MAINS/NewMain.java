package MAINS;

import entidades.Botella;
import entidades.Cancion;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        Botella botella1 = new Botella(500, "negra", "Agua");
        Cancion cancion1 = new Cancion("Esterio ","Ernesto");
        System.out.println(botella1+ " " + cancion1);

        botella1.setCantidad(1000);
        botella1.setColorTapa("blanco");

        System.out.println(botella1.getCantidad() + " " + botella1.getColorTapa());
    }

}
