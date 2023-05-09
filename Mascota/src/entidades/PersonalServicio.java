package entidades;

import java.util.Scanner;

public class PersonalServicio {

 
   Scanner leer = new Scanner(System.in);
    public boolean esMayorDeEdad(Personal1 lp) {
        boolean edad = false;
        if (lp.getEdad() > 17) {
            edad = true;
        }
        return edad;
    }

    public Personal1 crearPersona() {
        Personal1 per1 = new Personal1();
        System.out.println("Cual es tu nombre?");
        per1.setNombre(leer.next());
        System.out.println("Tu edad?");
        per1.setEdad(leer.nextInt());
        System.out.println("Tu sexo? H.M.O");
        char x = ' ';
        do {
            x = (char) leer.next().charAt(0);
            if (((x != 'h') && (x != 'm') && (x != 'o'))) {
                System.out.println("Escribiste mal el sexo. vuelve a intentarlos.\n Cual es tu sexo?");
            }
        } while ((x != 'h' && x != 'm' && x != 'o'));
        per1.setSexo(x);
        System.out.println("Peso?");
        per1.setPeso(leer.nextDouble());
        System.out.println("Altura?");
        per1.setAltura(leer.nextDouble());
        return per1;

    }

    public int calcularImc(Personal1 persona) {
        int valor;
        if ((persona.getPeso() / (Math.pow(persona.getAltura(), 2))) < 20) {
            valor = -1;
        } else if (((persona.getPeso() / (Math.pow(persona.getAltura(), 2))) > 20) || ((persona.getPeso() / (Math.pow(persona.getAltura(), 2))) < 25)) {
            valor = 0;
        } else {
            valor = 1;
        }
        return valor;
    }

    public void calcularCantidadDeMayores(Personal1[] pernueva, int numIng) {
        int porcentaje ;
        int mayor = 0, menor = 0;
        for (int i = 0; i < numIng; i++) {

            if (pernueva[i].getEdad()>17) {
                mayor++;
            } else {
                menor++;
            }
        }
            porcentaje= (mayor/numIng)*100;
                System.out.println("El "+(porcentaje)+" Es mayor de edad.\n Y el "+(-porcentaje+100)+" es menor de edad");    
           
        

    }

}