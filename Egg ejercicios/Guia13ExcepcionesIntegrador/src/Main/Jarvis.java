
package Main;

import javax.swing.*;
import Armadura.Armadura;
import Servicios.Utilitarios;


public class Jarvis extends Thread {

    private Armadura armadura;
    private JFrame Pantalla;
    Utilitarios op = new Utilitarios();

    public Jarvis() {
    }




    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura Armadura) {
        this.armadura = Armadura;
    }

    public JFrame getPantalla() {
        return Pantalla;
    }

    public void setPantalla(JFrame Pantalla) {
        this.Pantalla = Pantalla;
    }

    public void ActivarJarvis(int numeroTraje)   {

        setPantalla(new JFrame());
        setArmadura(new Armadura(numeroTraje));

    }
    public void recargarBateria(){
       armadura.RecargarTraje();        
    }

    
    public void movimientos(int mov) {
        int intensidad = ((int) Math.random() * 1) + 1;

        switch (mov) {
            case 1 -> movimientosNormales(intensidad, op.Mensajeint("""
                                                              1.Correr
                                                              2.Volar
                                                              3.Propulsarse"""));
            case 2 -> movimientosAtaque(intensidad, op.Mensajeint("""
                                                              1.Rayos Repulsores
                                                            2.Misiles y Proyectiles
                                                            3. Laser y cañon"""));

        }
    }

    private void movimientosNormales(int intensidad, int mov) {
        int tiempo = (int) Math.random() * 5;

        switch (mov) {
            case 1:
                armadura.ConsumoCorrer(intensidad, tiempo);
                armadura.ConsumoEscribir(1, 1);
                break;
            case 2:
                armadura.ConsumoVolar(intensidad, tiempo);
                armadura.ConsumoEscribir(1, 1);
                break;
            case 3:
                armadura.ConsumoPropulsar(intensidad, tiempo);
                armadura.ConsumoEscribir(1, 1);
                break;
        }
      
    }

    private void movimientosAtaque(int intensidad, int mov) {
        //ataques duran entre 1-5 min intensidad siempre 1

        switch (mov) {
            case 1:
                armadura.AtacarRayosRepulsores(intensidad, (int) Math.random() * 5);
                  armadura.ConsumoEscribir(1, 1);
                break;
            case 2:
                armadura.AtacarMisilesProyectiles(intensidad, (int) Math.random() * 5);
                  armadura.ConsumoEscribir(1, 1);
                break;
            case 3:
                armadura.AtacarLaser_Canon(intensidad, (int) Math.random() * 5);
                  armadura.ConsumoEscribir(1, 1);
                  break;
        }
        
    }

}
