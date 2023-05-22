package entidades;


import entidades.cuentaBancaria;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Herna
 */
public class cuentaBancariaServicio {

    public cuentaBancaria crearCuenta() {
        
        Scanner leer = new Scanner(System.in);
       cuentaBancaria usu1 = new cuentaBancaria();
        
        System.out.println("Introduzca Numero de cuenta");
        usu1.setNumeroCuenta(leer.nextLong());
        System.out.println("Introduzca Dni");
        usu1.setDniCliente(leer.nextInt());
        return usu1;
    }

    public void ingresar(cuentaBancaria usu1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a Ingresar");
        double saldoNuevo = (usu1.getSaldoActual() + leer.nextDouble());
        usu1.setSaldoActual(saldoNuevo);
        System.out.println("Su saldo actual es " + usu1.getSaldoActual());
    }

    public void retirar(cuentaBancaria usu1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a retirar");
        double saldoNuevo = (double) (usu1.getSaldoActual() - leer.nextDouble());
        if (saldoNuevo <= 0) {
            System.out.println("Saldo insuficiente, se retirará " + usu1.getSaldoActual());
            usu1.setSaldoActual(0);
        } else { usu1.setSaldoActual(saldoNuevo);}

        System.out.println("Su saldo actual es " + usu1.getSaldoActual());

    }
    
    
}
