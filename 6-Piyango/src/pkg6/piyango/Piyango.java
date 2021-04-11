
package pkg6.piyango;

import java.awt.Component;
import javax.swing.JOptionPane;


public class Piyango {

    
    public static void main(String[] args) {
        
        
        int rastgelesayı1 = (10 + (int) (Math.random()*89));
        
        String Kullanıcı = JOptionPane.showInputDialog("2 basamaklı bir sayı giriniz: ");
        int SonKullanıcı = Integer.parseInt(Kullanıcı);
        Component frame = null;
        
        if(SonKullanıcı == rastgelesayı1)
            JOptionPane.showMessageDialog(frame, "Tebrikler Kazandınız İki Rakamıda Tutturdunuz");
        
        if(SonKullanıcı % 10 == rastgelesayı1 % 10)
            JOptionPane.showMessageDialog(frame, "2.Rakamı Tutturdunuz");
        if(SonKullanıcı / 10 == rastgelesayı1 / 10)
            JOptionPane.showMessageDialog(frame, "İlk Rakamı Tutturdunuz Tebrikler");
        if(SonKullanıcı / 10 == rastgelesayı1 % 10 ^ SonKullanıcı % 10 == rastgelesayı1 /10)
            JOptionPane.showMessageDialog(frame, "Sayıdaki rakamları tersten tutturdunuz tebrikler");
        
        
            System.out.println(rastgelesayı1);
            System.out.print(SonKullanıcı);
            
        
        
    }
    
}
