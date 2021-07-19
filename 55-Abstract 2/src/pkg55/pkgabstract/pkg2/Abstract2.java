
package pkg55.pkgabstract.pkg2;


public class Abstract2 {

    
    public static void main(String[] args) {
        
        Bmw bmw = new Bmw("520d", "Kırmızı", 2500, 500);
        
        Mercedes mercedes = new Mercedes("CLA100", "Beyaz", 3500, "25");

        bilgileriGoruntule(bmw);
        System.out.println("************************************************************************************");
        bilgileriGoruntule(mercedes);
        System.out.println("************************************************************************************");

        
        
    }
    
    public static void bilgileriGoruntule(Araba araba){
        
        System.out.println(araba);
        
        System.out.println("Km Bası Kaç Litre Benzin harcar : " + araba.kmBasiKacLtBenzin());
        
    }
    
}
