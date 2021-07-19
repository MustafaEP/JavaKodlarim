
package Uygulama;


public class Uygulama {
    
    public static void main(String[] args){
        
        
        Ogrenci ogrenci = new Ogrenci("Mustafa", "Portakal", 2002, "433113");
        Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Kara", 2002, "43315423");
        
        DosyaYazma dosyaYazma = new DosyaYazma();
        
        boolean dosyaOlusturmadurumu = dosyaYazma.dosyaOlustur("ogrenciler");
        
        if(dosyaOlusturmadurumu){
            System.out.println("Dosya Oluşturuldu");
            
        }
        else{
            System.out.println("Dosya oluşturulamadı");
        }
        
        dosyaYazma.ogrenciyiKaydet(ogrenci);
        dosyaYazma.ogrenciyiKaydet(ogrenci1);
        
        boolean dosyaYazmaKapamaDurumu = dosyaYazma.dosyaYazmayiKapat();
        
        if(dosyaYazmaKapamaDurumu){
            System.out.println("Dosya Kapatıldı");
            
        }
        else{
            System.out.println("Dosya Kapatılamadı");
        }
        
        
    }
    
}
