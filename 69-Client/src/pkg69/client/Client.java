
package pkg69.client;


import java.net.*;
import java.io.*;


public class Client {

    
    public static void main(String[] args) throws Exception{
        
        int port = 9200;
        DataInputStream dis;
        DataOutputStream dos;
        
        Socket s = new Socket("127.0.0.1", port);
        
        System.out.println("Socket yaratildi");
        
        dis = new DataInputStream(s.getInputStream());
        dos = new DataOutputStream(s.getOutputStream());
        
        dos.writeDouble(5.3);
        
        
        double cevap = dis.readDouble();
        
        System.out.println("Gelen Cevap : " + cevap);
        
    }
    
}
