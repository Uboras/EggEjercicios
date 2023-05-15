/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CadenaServicio cs =new CadenaServicio();
      Cadena cad = new Cadena("casa blanca");
      String frase="Alamaula";
      cs.mostrarVocales2(cad);
      cs.invertirFrase(cad);
      cs.Remplazar(cad);
    cs.compararLongitud(cad, frase);
    cs.buscadorLetras(cad);
    }
    
}
