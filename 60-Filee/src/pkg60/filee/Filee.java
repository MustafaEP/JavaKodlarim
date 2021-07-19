
package pkg60.filee;
import java.io.File;
import java.util.Date;
import javafx.scene.chart.PieChart;

public class Filee {

    
    public static void main(String[] args) {
        
        File file = new File("C:/Users/porta/OneDrive/Masaüstü/Deneme");
        
        boolean calismaDurum = file.canExecute();
        
        System.out.println(calismaDurum);
        
        boolean okumaDurum = file.canRead();
        
        System.out.println(okumaDurum);
        
        boolean yazilmeDurum = file.canWrite();
  
        System.out.println(yazilmeDurum);
        
        boolean durum = file.exists();
    
        System.out.println("Dosyamı : " +durum);
        
        String path = file.getAbsolutePath();
        
        System.out.println(path);
        
        String name = file.getName();
        
        System.out.println(name);
        
        String parent = file.getParent();
        
        System.out.println(parent);
        
        long last = file.lastModified();
        
        System.out.println(last);
        
        Date date = new Date(last);
        
        System.out.println(date);
        
        boolean dosyamı = file.isDirectory();
        
        System.out.println("dosyamı : " + dosyamı);
                
    }
    
}
