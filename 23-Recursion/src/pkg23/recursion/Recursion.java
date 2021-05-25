/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.recursion;

/**
 *
 * @author porta
 */
public class Recursion {

    
    static int faktoriyel(int sayı)
    {
        if (sayı == 1)
            return 1;
        
        if (sayı < 1)
            return 000;
        
        else
            return( sayı * (faktoriyel(sayı-1)));
    }
    
    public static void main(String[] args) {
        
        System.out.println(faktoriyel(5));
        
    }
    
}
