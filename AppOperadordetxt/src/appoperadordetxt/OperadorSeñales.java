/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoperadordetxt;

import java.io.IOException;
/**
 *
 * @author Herna
 */

public class OperadorSeñales {
    public static void main(String[] args) {
        String rutaArchivo = "C:\\Users\\Herna\\Desktop\\Señales.txt";
        // Ruta del archivo de texto

        try {
            Ordenador por = new Ordenador();
            por.ejecutarOrdenes(rutaArchivo);
        } catch (IOException e) {
            e.getSuppressed();
        }
    }
}
