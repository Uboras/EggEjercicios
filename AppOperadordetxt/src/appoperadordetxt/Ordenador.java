/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoperadordetxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ordenador {

    public void ejecutarOrdenes(String rutaArchivo) throws IOException {
       
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
          //se lee las lineas
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                //se guarda en comando el comienzo de la frase hasta el primer espacio
                String hora = partes[0];
                String parDivisas = partes[1];
                String operacion = partes[2];
                String minOperativa = partes[3];

                //se transforma a hora operativa en localtime de String
                LocalTime horaOperativa = LocalTime.parse(hora, DateTimeFormatter.ISO_TIME);
               
                // se muestra para ver si se guardo bien las cosas
                System.out.println("la hora " + horaOperativa);
                System.out.println("el par " + parDivisas);
                System.out.println("la operacion " + operacion);
                System.out.println("duracion es de min. "+ minOperativa);
                // Llama a un objeto GestorOrdenes para procesar el comando
                GestorOrdenes gestorOrdenes = new GestorOrdenes();
                gestorOrdenes.compraOventa(operacion);
            }

        }
    }
}
