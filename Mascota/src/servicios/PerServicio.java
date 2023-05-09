/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import entidades.Persona2;
import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class PerServicio {

    Scanner leer = new Scanner(System.in);
    

    public PerServicio() {
    }

    
    public boolean esMayorDeEdad(Persona2 usuario) {
        boolean resultado = false;
        if (usuario.getEdad() > 17) {
            resultado = true;
        }
        return resultado;
    }

    public Persona2 crearPersona() {
        Persona2 usu1 = new Persona2();
        char x = 'c';
        System.out.println("Cual es el nombre?\n Cual es tu edad\n cual es tu sexo\n cual es tu peso \n cual es tu altura");
        usu1.setNombre(leer.next());
        usu1.setEdad(leer.nextInt());

        do {
            x = leer.next().charAt(0);
            if (x != 'h' && x != 'm' && x != 'o') {
                System.out.println("El dato es incorrecto vuel va a intentar");
            }
        } while ((x != 'h' && x != 'm' && x != 'o'));
        usu1.setSexo(x);
        usu1.setPeso(leer.nextDouble());
        usu1.setAltura(leer.nextDouble());

        return usu1;
    }

    public int CalcularImc(Persona2 persona) {
        int valor = 0;
        if (persona.getPeso() / (Math.pow(persona.getAltura(), 2)) < 20) {
            valor = (-1);
        } else if ((persona.getPeso() / (Math.pow(persona.getAltura(), 2))) > 25) {
            valor = 1;
        }

        return valor;
    }

    public void CalculaMayoriaEdadporcentaje(Persona2[] per, int numIng) {
        int mayor = 0, menor = 0;
        double porcentaje;
        for (int i = 0; i < numIng; i++) {
            if (per[i].getEdad() > 17) {
                mayor++;
            } else {
                menor++;
            }
        }
        porcentaje = ((double) mayor / numIng);
        System.out.println(porcentaje);
        System.out.println("El " + (porcentaje * 100) + " Es mayor de edad.\n Y el " + ((-porcentaje * 100) + 100) + " es menor de edad");

    }

    public void CalcularMayoriaImc(Persona2[] per, int numIng) {
      PerServicio ps = new PerServicio();
        int bajoPeso = 0;
        int sobrePeso = 0;
        int pesoIdeal = 0;
        for (int i = 0; i < numIng; i++) {
            if ((ps.CalcularImc(per[i])) == (-1)) {
                bajoPeso++;
            } else if (ps.CalcularImc(per[i]) == 1) {
                sobrePeso++;
            } else {
                pesoIdeal++;
            }
        }
        System.out.println(((double) bajoPeso/numIng)+"Es el porcentaje de gente en bajo peso");

        System.out.println(((double) sobrePeso/numIng)+"Es el porcentaje de gente en sobre peso");
    
        System.out.println(((double) pesoIdeal/numIng)+"Es el porcentaje de gente en peso ideal");
    }
public void MostrarResultadoIMC (Persona2[] personas, int numIng){
PerServicio ps = new PerServicio();
    for (int i = 0; i < numIng; i++) {
            System.out.println("Resultados: 0= peso ideal\n1= sobre peso\n(-1)= Bajo peso ");
            System.out.println(personas[i].getNombre() + " esta en la posicion de: " + ps.CalcularImc(personas[i]));
            
        }

}
}

