package Armadura;

public class Botas extends Propulsores {

    private int durabilidad = 100;
    private int energia = 100;
//constructor

    public void Botas() {
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
//calcula el consumo basico

    public double consumo(int intensidad, int duracion) {
        return super.Consumo(intensidad, duracion);

    }
//calcula el consumo por caminar y setea la durabilidad y la energia

    public double consumoCaminar(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 1);
        setEnergia(getEnergia() - (int) consumo(intensidad, duracion));
        return (int) consumo(intensidad, duracion);
    }
//calcula el consumo por correr y setea la durabilidad y la energia

    public double consumoCorrer(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 2);
        setEnergia(getEnergia() - (int) (2 * consumo(intensidad, duracion)));
        return (int) (2 * consumo(intensidad, duracion));
    }
//calcula el consumo por propulsar y setea durabilidad y energia

    public double consumoPropulsarse(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 4);
        setEnergia(getEnergia() - (int) (2 * consumo(intensidad, duracion)));
        return (int) (2 * consumo(intensidad, duracion));
    }
    //calcula el consumo por volar y setea durabilidad y energia

    public double consumoVolar(int intensidad, int duracion) {
        setDurabilidad(getDurabilidad() - 4);
        setEnergia(getEnergia() - (int) (3 * consumo(intensidad, duracion)));
        return (int) (3 * consumo(intensidad, duracion));

    }
//describe la durabilidad en porcentaje y numero , ademas 

    @Override
    public String toString() {
        return " La durabilidad " + (durabilidad) + "/100 y su bateria es de " + energia + " %.";
    }

}
