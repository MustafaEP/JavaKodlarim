package pkg40.nesnedeğişkenş;

public class NesneDeğişkenş {

    int deger; // static olarak tanımlansaydı tüm nesneler için değeri son atanan değer olurdu
    
    public static void main(String[] args) {
        
        NesneDeğişkenş d1 = new NesneDeğişkenş();
        NesneDeğişkenş d2 = new NesneDeğişkenş();
        
        d1.deger=7;
        d2.deger=9;
        
        System.out.println(d1.deger);
        System.out.println(d2.deger);

    }
    
}
