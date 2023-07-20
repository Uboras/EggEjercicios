
package Entidades;


public class Camping extends AlojamientosExtra {
    private Integer QCarpasMax;
    private Integer QdeBanos;
  private boolean restorante;

    public Camping(Integer QCarpasMax, Integer QdeBanos, boolean restorante, boolean privacidad, double metrosQdos, String nombre, String direccion, String gerenteEncargado, String localidad) {
        super(privacidad, metrosQdos, nombre, direccion, gerenteEncargado, localidad);
        this.QCarpasMax = QCarpasMax;
        this.QdeBanos = QdeBanos;
        this.restorante = restorante;
    }


    public Integer getQCarpasMax() {
        return QCarpasMax;
    }

    public void setQCarpasMax(Integer QCarpasMax) {
        this.QCarpasMax = QCarpasMax;
    }

    public Integer getQdeBanos() {
        return QdeBanos;
    }

    public void setQdeBanos(Integer QdeBanos) {
        this.QdeBanos = QdeBanos;
    }

    public boolean isRestorante() {
        return restorante;
    }

    public void setRestorante(boolean restorante) {
        this.restorante = restorante;
    }
    private String Restorante(){
    String val ="no";
    if (isRestorante()){
        val="si";
    }
return val; }

    @Override
    public String toString() {
        return "Camping " + "Carpas Max " + QCarpasMax + ", Banos " + QdeBanos + " y " + Restorante() + " tiene restorante=";
    }
  
    
    
    
}
