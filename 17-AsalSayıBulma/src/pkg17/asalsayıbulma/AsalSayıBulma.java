/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.asalsayıbulma;

/**
 *
 * @author porta
 */
public class AsalSayıBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int i;
        int j=90;
        int sayac=0;
        
        for(i=20; i<j; i++){
            
            for(int k=2; k<20; k++){
                if(i%k==0)
                    sayac++;
            
            }
            
            if(sayac==0)
                System.out.println(i + " Asal Sayıdır");
            sayac = 0;
        }
            
            
        
        
        
    }
    
}
