package Entidades;

public enum Gimnasios {
    A(50, "A"), B(30, "B");

    private int value;
    private String tipo;

    private Gimnasios(int value, String tipo) {
        this.value = value;
        this.tipo = tipo;
    }

    public int getValue() {
        return value;
    }

    public String getString() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Gimnasios tipo " + tipo + " Valor : " + value;
    }

}
