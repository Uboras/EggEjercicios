
package Entidades;

public class Gato extends Animal{

    public Gato(String nombre, String Alimento, Integer edad, String raza) {
        super(nombre, Alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento con "+ Alimento );
}
}