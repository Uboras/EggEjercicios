/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona2;
import java.util.Scanner;

public class PersonasMaint {

    public static void main(String[] args) {
        PerServicio PerSer = new PerServicio();
        Scanner leer = new Scanner(System.in);

        //Pedir la cantidad de gente a crear
        System.out.println("Cuantas personasqueres crear");
        int numIng = leer.nextInt();
        //vectores necesarios
        Persona2[] personas = new Persona2[numIng];
        int[] vectorImc = new int[numIng];
        //crear Objetos

        for (int i = 0; i < numIng; i++) {
            personas[i] = PerSer.crearPersona();
        }
        //calculos de mayoria, por edad, por IMC.
        PerSer.CalculaMayoriaEdadporcentaje(personas, numIng);
        PerSer.CalcularMayoriaImc(personas, numIng);
    }

}
