package Armadura;



public class Armadura {

    private String nombre;
    private String ColorPrimario;
    private String ColorSecundario;
    private float durezaArmadura;
    private int Restantebateria=100;
    private Casco casco;
    private Botas botadere;
    private Botas botasIzq;
    private Guante guantedere;
    private Guante guanteIzq;
//constructor que genera todo en base a la eleccion de "dureza

    public Armadura(float durezaArmadura) {
        casco = new Casco();
        botadere = new Botas();
        botasIzq = new Botas();
        guantedere = new Guante();
        guanteIzq = new Guante();
        nombre(durezaArmadura);
        TipoDureza(durezaArmadura);
        colores(durezaArmadura);
    }

    public Armadura() {

    }
//get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPrimario() {
        return ColorPrimario;
    }

    public void setColorPrimario(String ColorPrimario) {
        this.ColorPrimario = ColorPrimario;
    }

    public String getColorSecundario() {
        return ColorSecundario;
    }

    public void setColorSecundario(String ColorSecundario) {
        this.ColorSecundario = ColorSecundario;
    }

    public float getDurezaArmadura() {
        return durezaArmadura;
    }

    public void setDurezaArmadura(float durezaArmadura) {
        this.durezaArmadura = durezaArmadura;
    }

    public int getRestantebateria() {
        return Restantebateria;
    }

    public void setRestantebateria(int Restantebateria) {
        this.Restantebateria = Restantebateria;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Botas getBotadere() {
        return botadere;
    }

    public void setBotadere(Botas botadere) {
        this.botadere = botadere;
    }

    public Botas getBotasIzq() {
        return botasIzq;
    }

    public void setBotasIzq(Botas botasIzq) {
        this.botasIzq = botasIzq;
    }

    public Guante getGuantedere() {
        return guantedere;
    }

    public void setGuantedere(Guante guantedere) {
        this.guantedere = guantedere;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }
//setea el color depende del traje que elija

    private void colores(float dur) {
        switch (((int) dur)) {
            case 1:
                ColorPrimario = " Rojo ";
                ColorSecundario = " Dorado ";
                break;
            case 2:
                ColorPrimario = " Rojo ";
                ColorSecundario = " Dorado ";
                break;
            case 3:
                ColorPrimario = " Rojo y Dorado ";
                ColorSecundario = " Negro ";
                break;

        }
    }
//setea el nombre del traje

    private void nombre(float dur) {
        switch (((int) dur)) {
            case 1 ->
                nombre = "Mark III ";
            case 2 ->
                nombre = "Mark 42";
            case 3 ->
                nombre = "Mark 50";

        }
    }
//le da la durabilidad

    private void TipoDureza(float duro) {

        switch (((int) duro)) {
            case 1 ->
                setDurezaArmadura(60);
            case 2 ->
                setDurezaArmadura(80);
            case 3 ->
                setDurezaArmadura(100);
        }
    }
//seteo de la bateriaRestante y recargar
    private void Recuadrobateria() {
        setRestantebateria((int) ((botadere.getEnergia() + botasIzq.getEnergia() + guantedere.getEnergia() + guanteIzq.getEnergia() + casco.getEnergia()) / 5));

    }
 public void RecargarTraje(){
 botadere.setEnergia(100);
 botadere.setDurabilidad(100);
 botasIzq.setEnergia(100);
 botasIzq.setDurabilidad(100);
 guanteIzq.setEnergia(100);
 guanteIzq.setDurabilidad(100);
 guantedere.setEnergia(100);
 guantedere.setDurabilidad(100);
 casco.setEnergia(100);
 
 }
    
// consumo por propulsar y atacar
  
// consumo por propulsar
    public double ConsumoPropulsar(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += botadere.consumoPropulsarse(intensidad, tiempo);
        gasto += botasIzq.consumoPropulsarse(intensidad, tiempo);
        Recuadrobateria();
        return gasto;
    }
// consumo por correr

    public double ConsumoCorrer(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += botadere.consumoCorrer(intensidad, tiempo);
        gasto += botasIzq.consumoCorrer(intensidad, tiempo);
        Recuadrobateria();
        return gasto;
    }
//consumo por volar

    public double ConsumoVolar(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += botadere.consumoVolar(intensidad, tiempo);
        gasto += botasIzq.consumoVolar(intensidad, tiempo);
        gasto += guantedere.consumoVolar(intensidad, tiempo);
        gasto += guanteIzq.consumoVolar(intensidad, tiempo);
        Recuadrobateria();
        return gasto;
    }
//consumo por escribir

    public double ConsumoEscribir(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += casco.getConsola().ConsumoLeer_escribir(intensidad, tiempo);
        gasto += casco.getSinteti().consumoUsoSintetisador(intensidad, tiempo);
        Recuadrobateria();
        return gasto;
    }
//consumo por leer
    public double ConsumoLeer(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += casco.getConsola().ConsumoLeer_escribir(intensidad, tiempo);
        gasto += casco.getSinteti().consumoUsoSintetisador(intensidad, tiempo);
        Recuadrobateria();
        return gasto;
    }
    //movimientos de ataque...
   //Rayos repulsores. (vuelva y dispara)
    public double AtacarRayosRepulsores(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += ConsumoVolar(intensidad, tiempo);
        gasto += guanteIzq.consumoDisparos(intensidad, tiempo);
        gasto += guantedere.consumoDisparos(intensidad, tiempo);
                
        Recuadrobateria();
        return gasto;
    }
    //Misiles y proyectiles
     public double AtacarMisilesProyectiles(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += ConsumoCorrer(intensidad, tiempo);
        gasto += 2; //gasto por despliegue de misiles
        Recuadrobateria();
        return gasto;
     }
     // Laser y Cañones de energia
     public double AtacarLaser_Canon(int intensidad, int tiempo) {
        double gasto = 0;
        gasto += guanteIzq.consumoDisparos(intensidad, tiempo)*2;
        gasto += guantedere.consumoDisparos(intensidad, tiempo)*2;
             
        Recuadrobateria();
        return gasto;
    }
     
    
public void MostrarEstadoArmaduraTotal(){
    toString();
}

public void MostrarEstadorBateria(){
    System.out.println( "Bateria " + Restantebateria + " StarkWats(" + (Restantebateria / 100) + "%).");
}

    @Override
    public String toString() {
        
        System.out.println("Este es el " + nombre);
        System.out.println("Colores " + ColorPrimario + " y " + ColorSecundario);
        System.out.println("Defensa de " + durezaArmadura);
        System.out.println("Bateria " + Restantebateria + " StarkWats(" + (Restantebateria) + "%).");
        System.out.println("Conformada por:");
        System.out.println("Bota Derecha: " + botadere);
        System.out.println("Bota Izquierda: " + botasIzq);
        System.out.println("Guante Derecho: " + guantedere);
        System.out.println("Guante Izquierdo: " + guanteIzq);
        System.out.println(casco);
      
        return " ";}

}
