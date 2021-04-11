
package pkg7.confirmationdialog;

import javax.swing.JOptionPane;


public class ConfirmationDialog {

   
    public static void main(String[] args) {
        
        int option = JOptionPane.showConfirmDialog(null, "Hayat Güzel mi?");
        if(option == 0)
            JOptionPane.showMessageDialog(null,"Evet Güzel");
        if(option == 1)
            JOptionPane.showMessageDialog(null,"Hayır Kötü");
        if(option == 2)
            JOptionPane.showMessageDialog(null,"Çıkılıyor...");
        
    }
    
}
