/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.fahrenheitdencelciusa;

import java.util.Scanner;

/**
 *
 * @author porta
 */
public class FahrenheitdenCelciusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double celsius,fahrenheit ;
        
        System.out.println("Lütfen Hava Sıcaklığını Celsius Cinsinden Yszınız: ");
        
        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextDouble();
        
        fahrenheit = (9 * celsius)/5 + 32;
        
        System.out.println("Hava " + fahrenheit + " Fahrenheittır.");
        
        
    }
    
}
