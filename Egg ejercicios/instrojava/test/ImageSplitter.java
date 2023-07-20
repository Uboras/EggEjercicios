
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageSplitter extends JFrame {

    private int rows = 100; // Número de filas
    private int cols = 100; // Número de columnas
    private BufferedImage originalImage;
    private BufferedImage secondImage;

    public ImageSplitter() throws InterruptedException {
        setTitle("Image Splitter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            // Cargar la imagen desde un archivo
            originalImage = ImageIO.read(new File("C:\\Users\\Herna\\Desktop\\2.jpg"));
            secondImage = ImageIO.read(new File("C:\\Users\\Herna\\Desktop\\2.jpg"));
            splitAndShowImage();
        } catch (IOException e) {
            e.printStackTrace();
        }

      //  pack();
       // setLocationRelativeTo(null);
        //setVisible(true);
    }

    private void splitAndShowImage() throws InterruptedException {
        int partWidth = originalImage.getWidth() / cols;
        int partHeight = originalImage.getHeight() / rows;
        int partWidth1 = secondImage.getWidth() / cols;
        int partHeight1 = secondImage.getHeight() / rows;

    
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if ((y == x )||(y+x == cols-1 ) ) {
                    BufferedImage part = originalImage.getSubimage((int)(Math.random()*cols) * partWidth1, (int)(Math.random()*rows) * partHeight1, partWidth1, partHeight1);
                    ImageIcon icon = new ImageIcon(part);
                    JLabel label = new JLabel(icon);
                    add(label);
                } else {
                    BufferedImage part = originalImage.getSubimage((int)(Math.random()*cols) * partWidth1, (int)(Math.random()*rows) * partHeight, partWidth, partHeight);
                    ImageIcon icon = new ImageIcon(part);
                    JLabel label = new JLabel(icon);
                    add(label);
                }

            }
            setLayout(new GridLayout(rows, cols));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        }

        
     
      
       
      
        
       
    }
    public static void main(String[] args) throws InterruptedException {
       for (int i = 0; i < 30; i++) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            
          
                try {
                  
                        
                    
                    new ImageSplitter();
                
                } catch (InterruptedException ex) {
                    ex.getLocalizedMessage();
                }
                
           }
        });
    
       }
    }
}
