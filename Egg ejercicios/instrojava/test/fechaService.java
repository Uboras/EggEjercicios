
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class fechaService {
   
    public Date fecha(){
          
    Date atual = new Date();
    return atual;
    }
    
    public int calcularEdad(Date fecha, Date fechaActual) {
        //Obtiene los milisegundos de cada fecha
        long milisegundosNacimiento = fecha.getTime();
        System.out.println(milisegundosNacimiento);
        long milisegundosActual = fechaActual.getTime();
        System.out.println(milisegundosActual);
        // Resta los milisegundos y divide por el número de milisegundos en un año
        int edad = (int) ((milisegundosActual - milisegundosNacimiento) / (1000 * 60 * 60 * 24 * 365));
        edad= edad-1970;
        // Retorna la edad
        return edad;

    }
}
