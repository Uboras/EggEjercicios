package entidades;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;
    public int suma;
    public int resta;
    public int multiplicacion;
    public double division;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public void OperacionInsert() {
        Scanner lp = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros");
        num1 = lp.nextInt();
        num2 = lp.nextInt();
    }

    public int Suma() {
         suma = num1 + num2;
        return suma;
    }

    public int resta() {
         resta = num1 + num2;
        return resta;
    }

    public int multiplicacion() {
         multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public double divir() {
         division =(double) num1 / num2;
        return division;
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + ", suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division=" + division + '}';
    }

}
