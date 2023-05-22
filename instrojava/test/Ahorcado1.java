/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class Ahorcado {
    private String [] vec;
    private int encontradas;
    private int jugadasMaxima;

    public Ahorcado(String[] palabra, int qletrasEnc, int qJugadasMax) {
        this.vec = palabra;
        this.encontradas= qletrasEnc;
        this.jugadasMaxima = qJugadasMax;
    }

    public Ahorcado() {
    }

  
    

    @Override
    public String toString() {
        return "Ahorcado{" + "La palabra es =" + vec + '}';
    }

    String getEncontradas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
