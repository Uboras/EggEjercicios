
package Entidades;

import java.util.HashSet;
import java.util.Set;


public class Sala {
   private  Set<Asientos>[][] sala = new HashSet[8][6];

    public Set<Asientos>[][] getSala() {
        return sala;
    }

    public void setSala(Set<Asientos>[][] sala) {
        this.sala = sala;
    }

   @Override
    public String toString() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println(" ");
        }       
     return "Sala Atlas";}
    
    
    
}
