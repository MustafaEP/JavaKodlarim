
package pkg58.dosyaıslemleri.dosyaokuma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DosyaOkuma {
    
    public static void main(String[] args){
        
        File dosya = new File("C:/Users/porta/OneDrive/Masaüstü/metin.txt/");
        
        try {
                       
            Scanner sc = new Scanner(dosya);
            
            
            /*
            String ilkSatır = sc.nextLine();
            String ikinciSatır = sc.nextLine();
            
            System.out.println(ilkSatır);
            System.out.println(ikinciSatır);
            

            */
            
            String metinBelgesi;
            
            while(sc.hasNextLine()){
                
                metinBelgesi = sc.nextLine();
                System.out.println(metinBelgesi);
                
            }
            
            sc.close();

        } catch (FileNotFoundException ex) {
            System.err.println("Hata : " + ex);
        }
        
        
        
    }
            
    
}
