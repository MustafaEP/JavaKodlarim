/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.yıldızyazdırma;

/**
 *
 * @author porta
 */
public class YıldızYazdırma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "*";
        int k=5;
        
        for(int i=0; i<5; i++){
            for(int j=0; j<k; j++){
                System.out.print(a);
            }
            System.out.print("\n");
            k--;
        }
        
        
        
    }
    
}
