/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class Nif {
    private long numDni;
    private String letra;

    public Nif() {
    }

    
    
    public Nif(long numDni, String letra) {
        this.numDni = numDni;
        this.letra = letra;
    }

    public long getNumDni() {
        return numDni;
    }

    public void setNumDni(long numDni) {
        this.numDni = numDni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return numDni+"-"+letra;
    }
    
    
    
}
