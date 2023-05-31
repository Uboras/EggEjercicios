package Main;

import Entidades.MouseyTeclado;
import appoperadordetxt.Ordenador;
import java.awt.AWTException;
import java.io.IOException;

public class lectordeArchivos {

    public static void main(String[] args) throws AWTException, IOException {
        MouseyTeclado mouse = new MouseyTeclado();

        String rutaArchivo = "C:\\Users\\Herna\\Desktop\\señales.txt";
        
        
        mouse.CalcularAltoAnchopatalla();
        System.out.println(mouse.getAlto()+" "+ mouse.getAncho());
        mouse.abrirChrome();
        try {
            Ordenador por = new Ordenador();
            por.ejecutarOrdenes(rutaArchivo);
        } catch (AWTException e) {

        }

    }
}

