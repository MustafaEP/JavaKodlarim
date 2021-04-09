/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.krediborçtutarı;


import javax.swing.JOptionPane;

public class KrediBorçTutarı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String Kredi_Miktarı = JOptionPane.showInputDialog("Kredi Miktarını Giriniz: ");
        int SonKrediMiktarı = Integer.parseInt(Kredi_Miktarı);
        
        String Faiz_Oranı = JOptionPane.showInputDialog("Faiz Oranını Giriniz: ");
        double SonFaizOranı = Double.parseDouble(Faiz_Oranı);
        
        String Yıl_Sayısı = JOptionPane.showInputDialog("Yıl Sayısını Giriniz: ");
        int SonYılSayısı = Integer.parseInt(Yıl_Sayısı);
        
        double KrediTutarı = (SonKrediMiktarı * SonFaizOranı)/(1-(1/Math.pow((1 + SonFaizOranı),(SonYılSayısı * 12))));
        
        System.out.println(SonKrediMiktarı + "," + SonFaizOranı + "," + SonYılSayısı);
        System.out.println(KrediTutarı);
        
        
        
    }
    
}
