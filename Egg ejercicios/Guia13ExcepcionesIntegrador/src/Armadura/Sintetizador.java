
package Armadura;


public class Sintetizador   {
private int durabilidad = 100 ;
    private int energia= 100;
//constructor con datos 
    public Sintetizador() {
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

   //se setea las durabilidad y la energia usada  
    public double consumoUsoSintetisador(int intensidad, int tiempo){
          setDurabilidad(getDurabilidad()-1);
        setEnergia(getEnergia()-1);
    return (int)(tiempo*1);
    }

    @Override
    public String toString() {
      return "Sintetizador: la durabilidad " +(durabilidad) + "/100 y su bateria es de " + energia +" %." ;
    }
    
    
    
}
