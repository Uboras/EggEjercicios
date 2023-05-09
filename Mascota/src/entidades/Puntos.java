/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Herna
 */
public class Puntos {

    public int x1, y1, x2, y2;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
 public void crearPuntos() {
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese valor de x1");
        x1 = nuevo.nextInt();
        System.out.println("Ingrese valor de y1");
        y1 = nuevo.nextInt();
        System.out.println("Ingrese valor de x2");
        x2 = nuevo.nextInt();
        System.out.println("Ingrese valor de y2");
        y2 = nuevo.nextInt();

    }
    public double Distancia() {

        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) - Math.pow((y1 - y2), 2));
        return distancia;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + '}';
    }

}
