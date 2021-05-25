/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19.kökbul;

/**
 *
 * @author porta
 */
public class KökBul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    KokBul(1,5,2);    
        
    }
  

    public static void KokBul(int a, int b, int c)
    {
        double delta = b*b - 4*a*c;
        double x1, x2;
        
        if(delta >0)
        {
            x1=(-b+Math.sqrt(delta))/2*a;
            x2=(-b-Math.sqrt(delta))/2*a;
            
            System.out.println("Birinci Kök: " + x1 +" 'dir. İkinci Kök: " + x2 + " 'dir");
        }
        
        if(delta == 0)
        {
            x1 = x2 = -b/2*a;
            System.out.println("Kökler eşit ve " + x1 + " 'dir");
            
        }
        if(delta < 0)
        {
            System.out.println("Kök Yoktur");
        }
    }
    
}
