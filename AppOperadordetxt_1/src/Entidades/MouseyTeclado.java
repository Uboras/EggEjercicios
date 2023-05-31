/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Herna
 */
public class MouseyTeclado {

    private final int alto;
    private final int ancho;

    public MouseyTeclado() throws AWTException {
        this.alto = setAlto();
        this.ancho = setAncho();
    }

    public int getAlto() {
        return alto;
    }

    public final int setAlto() throws AWTException {
        Robot robot = new Robot();

        robot.mouseMove(4000, 4000);
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point punto = pointerInfo.getLocation();
        int altoi = (int) punto.getY();

        return altoi;
    }

    public int getAncho() {
        return ancho;
    }

    public final int setAncho() throws AWTException {
        Robot robot = new Robot();
//SELECCIONA EL PAR DE LA LISTA
        robot.mouseMove(4000, 4000);
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point punto = pointerInfo.getLocation();
        int anchoi = (int) punto.getX();

        return anchoi;
    }

    public void CalcularAltoAnchopatalla() throws AWTException {
        setAlto();
        setAncho();
    }

    public void Movermouse(int x, int y) throws AWTException {
        Robot robot = new Robot();
//mueve y click izquierdo
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Presionar el botón izquierdo del mouse
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Soltar el botón izquierdo del mouse

    }

    public void teclado(String texto) throws AWTException {
        Robot robot = new Robot();
        for (char c : texto.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            // Espera un breve momento antes de escribir el siguiente caracter
            robot.delay(50);
        }
    }

    public void delay(int sec) throws AWTException {
        Robot robot = new Robot();
        robot.delay(sec);
    }

    public void abrirChrome() throws AWTException {

        int x = (1895 * getAncho()) / 1919;
        int y = (350 * getAlto()) / 1079; // Coordenada Y del punto
        Movermouse(x, y);

    }

    public void ingresarElPar(String par) throws AWTException {
        int x = (187 * getAncho()) / 1919;
        int y = (205 * getAlto()) / 1079; // Coordenada Y del punto
        Movermouse(x, y);  // ingresar el par( hacer el click al par)
        delay(700);

        //ESCRIBE EL PAR EN EL AUTOCOMPLETADO
        String texto = par; // Texto a autocompletar       
        teclado(texto);
        delay(300);
        //SELECCIONA EL PAR DE LA LISTA
        x = (478 * getAncho()) / 1919;
        y = (353 * getAlto()) / 1079; // Coordenada Y del punto
        Movermouse(x, y);

    }

    public void BotonCompra() throws AWTException {

        int x = (1762 * getAncho()) / 1919;
        int y = (521 * getAlto()) / 1079;
        delay(2500);
        Movermouse(x, y);
        delay(500);
    }

    public void BotonVenta() throws AWTException {

        int x = (1769 * getAncho()) / 1919;
        int y = (616 * getAlto()) / 1079;
        delay(2500);
        Movermouse(x, y);
        delay(500);
    }

    public void Duracion5min() throws AWTException {
        int x = (1804 * getAncho()) / 1919; // Coordenada X del punto
        int y = (248 * getAlto()) / 1079; // Coordenada Y del punto

        int c = 0;
        do {
            Movermouse(x, y); //seleccion 5 min de la lista
            c++;
            delay(100);
        } while (c < 4);
    }

    public void Duracion15min() throws AWTException {
        int x = (1804 * getAncho()) / 1919; // Coordenada X del punto
        int y = (248 * getAlto()) / 1079; // Coordenada Y del punto
        int c = 0;
        do {
            Movermouse(x, y); //seleccion 5 min de la lista
            c++;
            delay(100);
        } while (c < 5);

    }

    public void Duracion1min() throws AWTException {

    }
}
