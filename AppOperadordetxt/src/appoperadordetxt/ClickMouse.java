package appoperadordetxt;
    import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ClickMouse {   
        
    
    public void movimientodeVenta(){
        
    }
        
    public void movimientodeCompra(){
        try {
            Robot robot = new Robot();
            
            // Obtener las coordenadas (x, y) de la posición deseada en la pantalla
            int x = 500;
            int y = 300;
            
            // Mover el cursor del mouse a la posición deseada y hacer clic
            robot.mouseMove(x, y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

