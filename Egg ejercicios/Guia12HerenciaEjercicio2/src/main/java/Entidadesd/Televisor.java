
package Entidadesd;


public final class Televisor extends Electrodomesticos{
    private double pulgadas;
    private boolean sintonizadorTdT;

    public Televisor() {
    
      }

    public Televisor(double pulgadas, boolean sintonizadorTdT,String color, char consumoEnergético, int peso) {
        super(color, consumoEnergético, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTdT = sintonizadorTdT;
   
    }

  
    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTdT() {
        return sintonizadorTdT;
    }

    public void setSintonizadorTdT(boolean sintonizadorTdT) {
        this.sintonizadorTdT = sintonizadorTdT;
    }
    
    public Televisor crearTele(){
      Televisor tele = new Televisor();
  crearElectrodomestico();
        this.pulgadas=(op.MensajeDouble("Ingrese la cantida de pulgadas"));
        boolean tdt =  (op.MensajeBoolean("Tiene sintonizador TDT? TRUE or FALSE"));
  
        setSintonizadorTdT(tdt);
                
   return tele;}
    
  

    @Override
    public void precioFinal() {
    super.precioFinal();
        
    if(pulgadas>40){
        setPrecio(getPrecio()*1.3);
    }
    if(isSintonizadorTdT()){
        setPrecio(getPrecio()+500);
    }
    }

    @Override
    public String toString() {
        System.out.println("Televisor");
        System.out.println(super.toString());
        return "pulgadas=" + pulgadas + " sintonizadorTdT= " + sintonizadorTdT + " precio="+ this.precio +'}';
    }
    
}
