package Entidads;

public final class Veleros extends Barco {

    private Integer numMastil;   

    public Veleros(Integer numMastil, Integer matricula, Integer escola, Integer anioFabricacion) {
        super(matricula, escola, anioFabricacion);
        this.numMastil = numMastil;
    }

    public Veleros() {
    }

    public Integer getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(Integer numMastil) {
        this.numMastil = numMastil;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Veleros{" + "numMastil=" + numMastil + '}';
    }

  



}
