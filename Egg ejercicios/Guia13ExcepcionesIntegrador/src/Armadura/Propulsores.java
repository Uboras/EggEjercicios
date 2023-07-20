
package Armadura;


public  class  Propulsores implements Consumo  {
    
private int consumo = 1;

    public Propulsores() {
        
    }

    public int getConsumo() {
        return consumo;
    }

    @Override
    public double Consumo(int intensidad, int tiempo) {
   return (intensidad*getConsumo()*tiempo);}

}
