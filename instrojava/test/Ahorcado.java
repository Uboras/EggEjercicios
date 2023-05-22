
public class Ahorcado {

    private String [] vec;
    private int encontradas;
    private int jugadasMaxima;

    public Ahorcado(String[] vec, int encontradas, int jugadasMaxima) {
        this.vec = vec;
        this.encontradas = encontradas;
        this.jugadasMaxima = jugadasMaxima;
    }

    public Ahorcado() {
    }

    public String[] getVec() {
        return vec;
    }

    public void setVec(String[] vec) {
        this.vec = vec;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMaxima() {
        return jugadasMaxima;
    }

 
    

    public void setJugadasMaxima(int jugadasMaxima) {
        this.jugadasMaxima = jugadasMaxima;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "La palabra es =" + vec + '}';
    }

}
