package com.mycompany.ejercicio1;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Herna
 */
public class ServicioAdopcion {

    HashMap<String, Persona> personas = new HashMap<>();
    HashMap<String, Perro> mascota = new HashMap<>();

    public void menu() {

        String respuesta = JOptionPane.showInputDialog(null, """
                                                             -------------Menu-------------
                                                             
                                                             A.Ingresar mascotas
                                                             B.Ingresar Personas que adoten
                                                             C.Adopcion
                                                             D.Mostrar Dueños con adopciones
                                                             e.Salir """).toLowerCase();

        switch (respuesta) {
            case "a" ->
                creaPerros();
            case "b" ->
                creaPersonas();
            case "c" ->
                adopcion();
            case "d" ->
                mostarPersonas();
            case "e" ->
                System.exit(0);

        }

    }

    public void creaPerros() {
        Object[] opciones = {"Grande", "Mediano", "Pequeño"};

        Perro p1 = new Perro(JOptionPane.showInputDialog(null, "Ingrese el nombre").toLowerCase(), JOptionPane.showInputDialog(null, "Ingrese la raza"), Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad")), String.valueOf(JOptionPane.showOptionDialog(null, "Selecciona una opción", "Cartel de opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0])).toString());
        mascota.put(p1.getNombre(), p1);

        JOptionPane.showMessageDialog(null, "Ingresado...");
        menu();
    }

    public void creaPersonas() {
        Persona p1 = new Persona();

        p1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre").toLowerCase());
        p1.setApellido(JOptionPane.showInputDialog(null, "Ingrese apellido"));
        p1.setEdad(Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese edad")));
        p1.setDocumento(Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese documento")));
        p1.AgregarMascota(new Perro(" ", " ", 0, " "));
        personas.put(p1.getNombre(), p1);
        JOptionPane.showMessageDialog(null, "Ingresado");
        JOptionPane.showMessageDialog(null, p1);
        
        menu();
    }

    public void adopcion() {

        String nombreAdoptante = JOptionPane.showInputDialog(null, " Escriba el nombre"
                + " de la persona que adoptará de la lista" + personas.toString());
        String nombreAdoptadamascota = JOptionPane.showInputDialog(null, " Escriba que mascota "
                + "quiere adoptar de la lista " + mascota.toString());

        Persona p1 = personas.get(nombreAdoptante);
        Perro mas = mascota.get(nombreAdoptadamascota);

        p1.AgregarMascota(mas);
        menu();
    }

    public void mostarPerros() {

        mascota.values().toString();
        menu();
    }

    public void mostarPersonas() {
        personas.values().toString();
        menu();
    }

}
