/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloService;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Herna
 */
public class ArregloService {

    public void InicializarA(double[] vect) {
    
    Arrays.fill(vect,(Math.random()*50));
    }
    public void mostrarArreglo(double[] vect){
        
        System.out.println(Arrays.toString(vect));
        
    }
    public void ordenar(double[] vect){
        
        Arrays.sort(vect);
      
    
    }
    public void inicializarB(double[] vecta, double[] vectb){
vectb =  Arrays.copyOfRange(vecta, 0, 10);
        Arrays.fill(vectb, 10,vectb.length,0.5);
       // Arrays.copyOf(vectb,10);
        //System.arraycopy(vecta, 0, vectb, 0, 10);
    }
     
    
    
}
