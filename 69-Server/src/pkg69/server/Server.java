
package pkg69.server;

import java.net.*;
import java.io.*;

public class Server {

    
    public static void main(String[] args) throws Exception{
        
        int port = 9200;
        DataInputStream dis;
        DataOutputStream dos;
        
        System.out.println("Dinlenmeye Başlandı...");
        
       
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();
        
        System.out.println("Birisi Bağlandı!");
        
        
        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());
    
        
        double yaricap = dis.readDouble();
        
        System.out.println("Veri Geldi: " + yaricap);
        
        double alan = (yaricap * yaricap * Math.PI);
        
        dos.writeDouble(alan);
        
        System.out.println("Alan Hesaplandı: " + alan);
        
    }
    
}
