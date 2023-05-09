/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Rectangulo {

    private int base;
    private int altura;
    public int perimetro;
    public int superficie;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void Superficie() {
        superficie = base * altura;
    }

    public void Perimetro() {
        perimetro = (base + altura) * 2;
    }

    public void rectanguloDibujado() {

        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if ((i == 0) || (i == (base - 1)) || (j == 0) || (j == (altura - 1))) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println(" ");
        }

    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", superficie=" + superficie + '}';
    }

}
