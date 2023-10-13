/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_linsyposso;
import java.util.Scanner;
/**
 *
 * @author 29164
 */
public class Lab1P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese el peso: ");
        double peso=0, altura=0;
        peso = leer.nextDouble();
        System.out.print("Ingrese la altura en metros:");
        altura = leer.nextDouble();
        
        double imc = peso/(altura*altura);
        System.out.println("Su IMC es de "+ imc);
    }
    
}
