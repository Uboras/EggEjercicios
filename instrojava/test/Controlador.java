/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herna
 */
// Clase de controlador
public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void setMensaje(String mensaje) {
        this.modelo.setMensaje(mensaje);
    }
    
    public void actualizarVista() {
        this.vista.mostrarMensaje(this.modelo.getMensaje());
    }
}