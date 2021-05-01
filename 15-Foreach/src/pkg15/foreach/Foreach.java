/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.foreach;

/**
 *
 * @author porta
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] dizi = new int[5];
        for(int i=0; i<5; i++){
            dizi [i]= 3*i+i+i;
        }
        
        int k=1;
        for(int i: dizi){
            System.out.println("Dizinin " + k + "'ncı elemanının değeri " + i + "'dir");
            k++;
        }
        
    }
    
}
