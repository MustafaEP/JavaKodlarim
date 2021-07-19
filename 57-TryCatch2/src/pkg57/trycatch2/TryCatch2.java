
package pkg57.trycatch2;


public class TryCatch2 {

    
    public static void main(String[] args) {
       
        Adres adres = new Adres("17", "Necip Fazıl", "Kahramanmaraş");
        
        Ogrenci ogrenci = new Ogrenci("Mustafa", "portakal", "41413", null);
        
        ogrenciBilgileriYazdir(ogrenci);
        
        System.out.println("DEVAM");
        
    }
    
   public static void ogrenciBilgileriYazdir(Ogrenci ogrenci){
       
       try{
       
        
       System.out.println("Adı :" + ogrenci.getIsim());
        
        Adres adres = ogrenci.getAdres();
        
        System.out.println(adres.getSokak());
        System.out.println(adres.getMahalle());
        System.out.println(adres.getSehir());
       }catch (Exception e){
           
           System.out.println("Hata : " + e);
       }
               
    }
    
}
