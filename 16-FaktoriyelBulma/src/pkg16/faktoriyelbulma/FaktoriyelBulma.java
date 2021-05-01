/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16.faktoriyelbulma;

import java.util.Scanner;

/**
 *
 * @author porta
 */
public class FaktoriyelBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelini Bulmak İStediğiniz Sayıyı Giriniz: ");
    
        
        int sayı = scanner.nextInt();
      
        int k = 1;
        for(int i=1; i<=sayı ; i++){
                k=i*k;
        }
        System.out.println(k);
       
        
        
    }
    
}
