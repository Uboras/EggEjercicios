package GUIA3;

/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
y el programa deberá mostrar el resultado por pantalla y luego volver al menú
. El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */


import java.util.Scanner;

/**
 *
 * @author OFICINA
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int num1,num2,suma, resta, multiplica, divide, salir, consulta;
    String pregunta="n";
        System.out.println("Ingrese el primer número"); 
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo num");
        num2=leer.nextInt();
        do{
        System.out.println("MENU");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR");
        System.out.println("3 MULTIPLICAR");
        System.out.println("4 DIVIDIR");
        System.out.println("5 SALIR");
        consulta=leer.nextInt();
        suma=num1+num2;
        resta=num1-num2;
        multiplica=num1*num2;
        divide=num1/num2;
        
        
        
        switch (consulta){
            case 1:
                System.out.println("LA SUMA ES "+suma);
                break;
            case 2:
                System.out.println("LA RESTA ES "+resta);
                break;    
            case 3:
                System.out.println("LA MULTIPLICACIÓN ES "+multiplica);
                break;
            case 4:
                System.out.println("LA DIVISIÓN ES "+divide);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                pregunta=leer.next();
                
                    
                
                
                break;   
                
                 
            default:
                System.out.println("");}
      
        }while(!pregunta.equalsIgnoreCase("s"));
                
        } }