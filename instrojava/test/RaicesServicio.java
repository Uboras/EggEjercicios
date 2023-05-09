
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Herna
 */
public class RaicesServicio {

    public Raices crearRaices() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos de la función");
       double a;System.out.println("primero");
        do{ 
            a=leer.nextDouble() ;
           }while(a==0);
        System.out.println("segundo");
        double b=leer.nextDouble();
        System.out.println("tercero");
        double c =leer.nextDouble();
        Raices lp = new Raices(a,b, c);

        return lp;
    }

    public double getDiscriminante(Raices local) {
    double a = local.getA();
    double b = local.getB();
    double c = local.getC();
        
        return Math.pow(b, 2) - 4 * a * c;
       
    
    }

    public boolean tieneRaices(Raices local) {
        RaicesServicio lp = new RaicesServicio();
        double valor = lp.getDiscriminante(local);
        boolean resultado = false;

        if (valor > (-1)) {
            resultado = true;
        }
        return resultado;
    }

    public boolean tieneRaiz(Raices local) {
        RaicesServicio lp = new RaicesServicio();
        double valor = lp.getDiscriminante(local);
        boolean resultado = false;

        if (valor == 0) {
            resultado = true;
        }
        return resultado;
    }

    public void obtenerRaices(Raices local) {
        RaicesServicio lp = new RaicesServicio();
               double x1,x2;
        double a = local.getA();
        double b = local.getB();
        double c = local.getC();
        double discriminante = getDiscriminante(local);
        if(discriminante >= 0){
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raices son x1= " + x1 + " y x2= " + x2);
        }
    
    }
     public void obtenerRaiz(Raices local) {
        RaicesServicio lp = new RaicesServicio();
        double solucion1 = 0 ;
        double solucion = 0 ;
      
        boolean valor = lp.tieneRaices(local);
        if (valor == true) {
            solucion = (-local.getB() + Math.sqrt(lp.getDiscriminante(local)) / 2 * local.getA());
            //solucion1 = (-local.getB() - Math.sqrt(lp.getDiscriminante(local)) / 2 * local.getA());
        }
        System.out.println("Las soluciones es 1- " + solucion );
         System.out.println("la sol2"+solucion1);
    }
    public void calcular(Raices local){
     
     RaicesServicio lp = new RaicesServicio();
    
    boolean verdad = lp.tieneRaices(local);
    boolean verdad1 =    lp.tieneRaiz(local);    
    if(verdad ==true){
     lp.obtenerRaices(local);
    }else if(verdad1==true){
    lp.obtenerRaiz(local);
    }else{System.out.println("No existe solución"); 
   
    }
}
}