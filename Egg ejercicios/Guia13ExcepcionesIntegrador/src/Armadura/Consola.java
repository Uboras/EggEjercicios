
package Armadura;

public class Consola    {
private int durabilidad=100;
    private int energia=100;
//constructor
    public Consola() {
    }
//get y set
    public int getDurabilidad() {
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
// consumo basico usado "para botas" POR SER IGUAL al uso de consola.
   
    public double ConsumoLeer_escribir(int intensidad, int tiempo) {
        setDurabilidad(getDurabilidad()-intensidad);
        setEnergia(getEnergia()-intensidad);
    return (int)(tiempo*1);}

    @Override
    public String toString() {
         return "Consola: la durabilidad " +(durabilidad) + "/100 y su bateria es de " + energia+" %." ;
    }

   
    
    
    
}
