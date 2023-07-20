
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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fechaService lp = new fechaService();
        Date fechanacimiento = new Date(2000,11,20);
        System.out.println(fechanacimiento);
        System.out.println(lp.calcularEdad(fechanacimiento,lp.fecha()));
        
        System.out.println((lp.calcularEdad(fechanacimiento,lp.fecha())));
    }
    
}
