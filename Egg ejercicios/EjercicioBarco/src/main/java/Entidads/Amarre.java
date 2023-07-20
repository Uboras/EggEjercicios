package Entidads;

import java.util.Date;

public class Amarre {

private String nombre;
private Long documentoDelCliente;
private Date fechaDeAlquiler;
private Date fechaDeDevolución;
private Integer laPosiciónDelamarre;
private Barco barco;

    public Amarre(String nombre, Long documentoDelCliente, Date fechaDeAlquiler, Date fechaDeDevolución, Integer laPosiciónDelamarre, Barco barco) {
        this.nombre = nombre;
        this.documentoDelCliente = documentoDelCliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolución = fechaDeDevolución;
        this.laPosiciónDelamarre = laPosiciónDelamarre;
        this.barco = barco;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumentoDelCliente() {
        return documentoDelCliente;
    }

    public void setDocumentoDelCliente(Long documentoDelCliente) {
        this.documentoDelCliente = documentoDelCliente;
    }

    public Date getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(Date fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public Date getFechaDeDevolución() {
        return fechaDeDevolución;
    }

    public void setFechaDeDevolución(Date fechaDeDevolución) {
        this.fechaDeDevolución = fechaDeDevolución;
    }

    public Integer getLaPosiciónDelamarre() {
        return laPosiciónDelamarre;
    }

    public void setLaPosiciónDelamarre(Integer laPosiciónDelamarre) {
        this.laPosiciónDelamarre = laPosiciónDelamarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Amarre{" + "nombre=" + nombre + ", documentoDelCliente=" + documentoDelCliente + ", fechaDeAlquiler=" + fechaDeAlquiler + ", fechaDeDevoluci\u00f3n=" + fechaDeDevolución + ", laPosici\u00f3nDelamarre=" + laPosiciónDelamarre + ", barco=" + barco + '}';
    }
 public Double CalcularAlquiler(){
      int diasDeAlquiler =  fechasDiferencia();
     
      
      
      int modulo =(10*getBarco().getEscola());
      
     if(getBarco() instanceof Yate){
         Yate ne = (Yate)(getBarco());
     modulo += ne.getCamarotes()+ne.getPotencia();
     }else if(getBarco() instanceof Veleros){
         Veleros nes = (Veleros)(getBarco());
     modulo += nes.getNumMastil();
     }if(getBarco() instanceof BarcosMotor){
         BarcosMotor net = (BarcosMotor)(getBarco());
     modulo += net.getPotencia();
     }
     
    return (double)(diasDeAlquiler*modulo);}
    
 private int fechasDiferencia(){
    
 return ((int)(getFechaDeDevolución().getTime()-getFechaDeAlquiler().getTime())/86400000);}
 
 
}
