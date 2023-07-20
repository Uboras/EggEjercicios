/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
public class PardeNumerosMaint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       PardeNumeroService prs = new PardeNumeroService();
        PardeNumeros pr = new PardeNumeros();
        
        
        prs.calculaRaiz(pr);
        prs.calcularPotencia(pr);
        prs.devolverMayor(pr);
        prs.mostrarValores(pr);
      
        
        
    }
    
}
