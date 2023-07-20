
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Herna
 */
public class Nifservice {
    
    public Nif crearNif(){
        Nif valor = new Nif();
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Dni ");
      long dniIng;
        do{
       dniIng=leer.nextLong();
       if(String.valueOf(dniIng).length() != 8){
           System.out.println("Dni erroneo, 8 digitos necesita.");
       }
       }while(String.valueOf(dniIng).length() != 8);
        
        valor.setNumDni(dniIng);
       int numeroLetra =((int)valor.getNumDni()%23);
       valor.setLetra(vector[numeroLetra]);
        
       
    return valor;
    }
    public void mostrar(Nif usu1){
    
        System.out.println(usu1);
    }
    
}
