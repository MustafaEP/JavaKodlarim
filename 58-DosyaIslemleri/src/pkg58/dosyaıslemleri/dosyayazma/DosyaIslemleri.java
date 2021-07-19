
package pkg58.dosyaıslemleri.dosyayazma;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DosyaIslemleri {

    
    public static void main(String[] args) {
        
        
        System.out.println("İşlem Başladı");
        
        try {
            PrintWriter yazici = new PrintWriter("C:/Users/porta/OneDrive/Masaüstü/metin.txt/");
            
            yazici.println("Galatasaray");
            yazici.println("Mustafa");
            
            yazici.close();
        
        
        } catch (FileNotFoundException e) {
        }
        
        System.out.println("İşlem bitti");
        
        
        
    }
    
}
