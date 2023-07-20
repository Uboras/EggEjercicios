
import ArregloService.ArregloService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArregloService lp = new ArregloService();
        
        double [] vector1= new double [50];
        double [] vector2= new double[20];
      lp.InicializarA(vector1);
        
        vector1[5]=3;
       vector1[6]=2;
       vector1[2]=1;
       vector1[1]=4;
        System.out.println("Mostar vector a iniciado");
        lp.mostrarArreglo(vector1);
        System.out.println("ordenar vector");
        lp.ordenar(vector1);
        System.out.println("vector1 ordenado");
        lp.mostrarArreglo(vector1);
        System.out.println("inicializacion b");
        lp.inicializarB(vector1, vector2);
        System.out.println("Mostrar vector b");
         lp.mostrarArreglo(vector2);
         
    }
    
}
