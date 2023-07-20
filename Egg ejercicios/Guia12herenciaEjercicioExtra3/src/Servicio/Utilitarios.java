package Service;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Herna
 */
public class Utilitarios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    JOptionPane OP = new JOptionPane();

    public Utilitarios() {
    }
    public void Mensaje(String frase){
        System.out.println(frase);}
    public String MensajeString(String frase){
        System.out.println(frase);
               return LeerTexto();}
    public int Mensajeint(String frase){
        System.out.println(frase);
        return LeerInt();}
    public char LeerChar(){
 return leer.next().charAt(0);}
    public String LeerTexto() {
    return leer.next();}
    public int LeerInt() {
        return leer.nextInt();}
    public Integer LeerInteger() {
        return leer.nextInt();}
    public double LeerDouble() {
        return leer.nextDouble();}
    public float LeerFlat() {
        return leer.nextFloat();}

//OptionPane Menu!!
    
    public void MensajeCuadro(String frase){
    JOptionPane.showMessageDialog(null, frase);}  
    public Integer InputInteger(String frase){
    return Integer.valueOf(JOptionPane.showInputDialog(frase));}
    public String InputString(String frase){
    return JOptionPane.showInputDialog(frase);}
    public Double InputDouble(String frase){
    return Double.valueOf(JOptionPane.showInputDialog(frase));}
    public Float InputFloat(String frase){
    return Float.valueOf(JOptionPane.showInputDialog(frase));}
    public Character InputChar(String frase){
    return JOptionPane.showInputDialog(frase).charAt(0);}
    
//Menu    
}
