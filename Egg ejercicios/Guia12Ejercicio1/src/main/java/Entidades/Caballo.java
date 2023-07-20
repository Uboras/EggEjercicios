
package Entidades;

public class Caballo extends Animal {

    public Caballo(String nombre, String Alimento, Integer edad, String raza) {
        super(nombre, Alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
    
     System.out.println("Me alimento con "+ Alimento);
}
}