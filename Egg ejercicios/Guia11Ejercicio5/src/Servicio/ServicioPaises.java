/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Paises;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class ServicioPaises {
    
    
    
    public Set<Paises> CrearPaises(){
    String respuesta = " ";  
        LinkedHashSet<Paises> pa = new LinkedHashSet<>();
  do{
      Paises p = new Paises(JOptionPane.showInputDialog(null,"Escribe el nombre del pais "));
      pa.add(p);
      
      respuesta = JOptionPane.showInputDialog(null,"Queres crear otro? si/no ");
  }while(respuesta.equalsIgnoreCase("NO"));
  
        return pa;}
    
    public void OrdenAlfabetico(LinkedHashSet<Paises> pa){
      
        Collection.sort(pa,order);
        
    }
    
    
  }


