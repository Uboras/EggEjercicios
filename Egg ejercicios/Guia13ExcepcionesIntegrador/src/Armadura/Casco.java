package Armadura;



public class Casco {

    private Sintetizador sinteti;
    private Consola consola;
    private int durabilidad=100;
    private int energia= 100;
    
//constructores
    public Casco() {
        sinteti = new Sintetizador();
        consola = new Consola();
      }
    //get and set

    public Sintetizador getSinteti() {
        return sinteti;
    }

    public void setSinteti(Sintetizador sinteti) {
        this.sinteti = sinteti;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        sinteti.setDurabilidad(durabilidad);
        consola.setDurabilidad(durabilidad);
    this.durabilidad = durabilidad; 
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        sinteti.setEnergia(energia);
        consola.setEnergia(energia);
        this.energia= energia;
    }
    //metodo par adarle durabilidad y energia al casco. debilitador por el uso de consola y sintetizador
private void calcularDurEner(){
    setDurabilidad((getSinteti().getDurabilidad()+getConsola().getDurabilidad())/2);
    setEnergia((getSinteti().getEnergia()+getConsola().getEnergia())/2);
}
    
    
    
    @Override
    public String toString() {
        calcularDurEner();
        System.out.println("El Casco: la durabilidad " + (durabilidad) + "/100 y su bateria es de " + energia +" %.\n"+ sinteti+"\n"+consola);
        return " ";
    }

}
