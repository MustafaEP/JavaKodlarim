/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.metodlardadizi;

/**
 *
 * @author porta
 */
public class MetodlardaDizi {

    
    
    
    public static void main(String[] args) {
       
        int dizi[] = new int []{1,1,1};
        islemYap(dizi);
        for(int i:dizi)
            System.out.println(i);
    }

    private static void islemYap(int[] dizi) {
        for(int i=0; i<3; i++)
        {
            dizi[i]=i*i;
        }
    }
    
}
