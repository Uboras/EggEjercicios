
package Entidades;


public class Perro extends Animal{

  
    public Perro(String nombre, String Alimento, Integer edad, String raza) {
        super(nombre, Alimento, edad, raza);
    }
    

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento con " + Alimento);
    }
    
}
