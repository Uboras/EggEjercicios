/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appoperadordetxt;


import EjecutordeSeñal.GestorSeñales;
import Entidades.MouseyTeclado;
import Entidades.Senales;
import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ordenador {

    public void ejecutarOrdenes(String rutaArchivo) throws IOException, AWTException {
  MouseyTeclado mouse = new MouseyTeclado();
  
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            //se lee las lineas
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                //se guarda en comando el comienzo de la frase hasta el primer espacio
                String hora = partes[0];
                String parDivisas = partes[1];
                String operacion = partes[2];
                Integer minDur = Integer.parseInt(partes[3]);
                //se transforma a hora operativa en localtime de String y se le resta 1 seg
                LocalTime horaOperativa = LocalTime.parse(hora, DateTimeFormatter.ISO_TIME);
                horaOperativa = horaOperativa.minusSeconds(7);
                //se arma la señal
                Senales senal = new Senales(horaOperativa, parDivisas, operacion, minDur);

              
                // Llama a un objeto GestorOrdenes para procesar el comando*/
                GestorSeñales gestorOrdenes = new GestorSeñales();
              
           if (GestorSeñales.horario(senal) == true){
                   GestorSeñales.compraOventa(senal);
                   }else {
           }
               
                
               
            }

        }
    }
}
