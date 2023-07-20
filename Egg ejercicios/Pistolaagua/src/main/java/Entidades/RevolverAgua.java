package Entidades;

import java.util.Objects;

public class RevolverAgua {

    private Integer posicionTambor;
    private Integer posicionAgua;

    public void llenarRevolverAgua() {
        this.posicionTambor = (int) (Math.random() * 5+1);
        this.posicionAgua = (int) (Math.random() * 5+1);
    }

    public boolean Mojar(RevolverAgua rev) {
        return Objects.equals(rev.getPosicionAgua(), rev.getPosicionTambor());
    }

    public void siguienteChorro() {
        setPosicionTambor(getPosicionTambor() + 1);
        if (getPosicionTambor() > 8) {
            setPosicionTambor(0);
        }

    }

    public Integer getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(Integer posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicion del Tambor: " + posicionTambor + "\nPosicion del Agua: " + posicionAgua + '}';
    }

}
