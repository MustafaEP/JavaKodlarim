/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.ıfkomudu;

import java.util.Scanner;

/**
 *
 * @author porta
 */
public class IFKomudu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("i'yi giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int i;
        i = scanner.nextInt();
        
        if(i>10)
            System.out.println("i 10'dan büyüktür.");
        if(i<10)
            System.out.println("i 10'dan küçüktür");
        if(i==10)
            System.out.print("i 10'a eşittir");
    }
    
}
