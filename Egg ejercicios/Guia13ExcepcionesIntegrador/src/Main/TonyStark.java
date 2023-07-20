package Main;



public class TonyStark {

    public static void main(String[] args) throws InterruptedException {
        
        
        Jarvis jarvis = new Jarvis();
        jarvis.ActivarJarvis(1);
        jarvis.getArmadura().MostrarEstadoArmaduraTotal();

        do{
        
        do{        
//ejecutar correr//
        jarvis.movimientos(1);
        jarvis.getArmadura().MostrarEstadoArmaduraTotal();
        
 }while(jarvis.getArmadura().getRestantebateria()>0);


        System.out.println("Recargar bateria");
        System.out.println("Recargando tardara 5 segungos");
                
            for (int i = 5; i > 0; i--) {
                System.out.println(i+" segundos");
                Thread.sleep(1000);
                }
            System.out.println("Recargada Armadura!!");  
                
jarvis.recargarBateria();
        
        
        }while(jarvis.getArmadura().getRestantebateria()<=100);
        
        
    }
    
}
