package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class AnimalMain {

public static void main(String[] args){
    
  Animal perro1 = new Perro("stich","Carnivoro", 15,"Doberman");
  perro1.Alimentarse();
  
  Animal perro2 = new Perro("Teddy","Croquetas", 10,"Chihuahua");
  perro2.Alimentarse();
  
  Animal gato1 = new Gato("Pelusa","Galletas", 15,"Siamés");
  gato1.Alimentarse();
  
  Animal gato2 = new Gato("Spark","Pasto", 25,"Fino");
  gato2.Alimentarse();
  
Animal cabaio = new Caballo("Ernest", "Pelicanos",12,"Porigon");
cabaio.Alimentarse();
}
}

