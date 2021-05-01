/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.döngüler;

/**
 *
 * @author porta
 */
public class Döngüler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10, j=0, k=0;
        while(i>j){
            System.out.println("i j'den büyüktür");
            
            i-=2;
            j+=2;
            k++;
        }
        System.out.println("i artık j'den büyük değil");
        System.out.println("Sistem " + k + " kere dönmüştür");
    }
    
}
