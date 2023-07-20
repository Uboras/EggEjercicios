package Armadura;

public class Guante extends Propulsores {

    private int durabilidad= 100;
    private int energia=100;
    //constructores

    public void Guante() {
    }
//get y set

    private int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double consumo(int intensidad, int duracion) {
        return super.Consumo(intensidad, duracion);

    }
//calcula metodo disparos y setea durabilidad y consumo

    public double consumoDisparos(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 2);
        setEnergia(getEnergia() - ((int) (3 * consumo(intensidad, duracion))));
        return (int) 3 * consumo(intensidad, duracion);
    }

    //calcula el consumo por volar y setea durabilidad y energia
    public double consumoVolar(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 2);
        setEnergia(getEnergia() - ((int) (2 * consumo(intensidad, duracion))));
        return (int) (2 * consumo(intensidad, duracion));

    }
//describe la durabilidad en porcentaje y numero , ademas bateria

    @Override
    public String toString() {
        return " la durabilidad " + (durabilidad) + "/100 y su bateria es de " + energia + " %.";
    }

}
