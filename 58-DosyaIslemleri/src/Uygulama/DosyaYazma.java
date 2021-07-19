
package Uygulama;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DosyaYazma {
    
    
    private PrintWriter printWriter;
    
    public boolean dosyaOlustur(String dosyaadi){
        
 
        String dosyaYolu = "/C:/Users/porta/OneDrive/Masaüstü/";
        

        try {
            PrintWriter printWriter = new PrintWriter(dosyaYolu + dosyaadi + ".txt/");
            
            printWriter.println("");
            
            
            return true;
            
        } catch (FileNotFoundException ex) {
            System.err.println("Hata : " + ex);
            
            return false;
            
        }
        
        
        
    }
    
    
    public void ogrenciyiKaydet(Ogrenci ogrenci){
        
        String adi = ogrenci.getAdi();
        String soyadi = ogrenci.getSoyadi();
        int dogumYili = ogrenci.getDogumYili();
        String okulNumarasi = ogrenci.getOkulNumarasi();
        
        printWriter.print(adi + " " + soyadi + " " + dogumYili + " " + okulNumarasi);
        
        printWriter.println();
               
        
    }
    
    public boolean dosyaYazmayiKapat(){
        
        try {
            printWriter.close();
            return true;
        } catch (Exception e) {
            System.err.println("Hata: " + e);
            return false;
        }
    }
    
    
}
