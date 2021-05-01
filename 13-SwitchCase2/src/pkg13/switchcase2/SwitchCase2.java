/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.switchcase2;

import java.util.Scanner;

/**
 *
 * @author porta
 */
public class SwitchCase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        for(int i=0; i<3; i++)
        {
        System.out.println("İsminizi Giriniz: ");
        String ad = a.next();
        switch(ad)
        {
            case "mustafa": case "Mustafa":
                System.out.println("Adınız Mustafa'dır");
                break;
            case "erhan":   case "Erhan":
                System.out.println("Adınız Erhan'dır");
                break;
            default:
                System.out.println("Bilinmeyen Ad");
                break;
        }
        
        }
    }
    
}
