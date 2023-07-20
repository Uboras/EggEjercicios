import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        // Configura el título de la ventana
        setTitle("Mi ventana");

        // Configura el tamaño de la ventana
        setSize(500, 100);

        // Hace que la ventana se cierre al presionar el botón "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hace visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crea una instancia de la clase Ventana
        Ventana ventana = new Ventana();
    }
}