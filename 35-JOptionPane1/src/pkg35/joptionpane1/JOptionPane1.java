/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35.joptionpane1;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author porta
 */
public class JOptionPane1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Random rand = new Random();
        
        int sayi = rand.nextInt(10);
        while(true)
        {
            String tahmin = JOptionPane.showInputDialog("Tahmin Gir: ");
            int t = Integer.parseInt(tahmin);
            if(t==sayi)
            {
                JOptionPane.showMessageDialog(null,"Tahmin Doğru");
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Tekrar Deneyiniz");
            }
        }
        
    }
    
}
