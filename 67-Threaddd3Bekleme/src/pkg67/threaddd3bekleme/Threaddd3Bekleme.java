
package pkg67.threaddd3bekleme;


public class Threaddd3Bekleme {

    
    public static void main(String[] args) {
        
        for (int i=1 ; i<=3; i++){
            
            Thread kanal1 = new ThreadOrnek();
            Thread.yield();
            Thread kanal2 = new ThreadOrnek();
            
        }
        
        
        
    }
    
}

class ThreadOrnek extends Thread{

    int sayi;
    String isim;

    public ThreadOrnek(int sayi, String isim) throws InterruptedException{
        super(isim);
        
        this.sayi = sayi;
        this.isim = isim;
        
        start();
        
        sleep(100);
    }
    
    
    public ThreadOrnek() {
    
    
    start();
    }

    
    public void run() {
        
        System.out.println(Thread.currentThread().getName() );
        
        
    }
    
    
    
}


