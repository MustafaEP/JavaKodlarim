/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20.metodlar;

/**
 *
 * @author porta
 */
public class Metodlar {

    static void metod1()
    {
        System.out.println("Bu metod parametre almıyor ve değer döndürmüyor");
        //void değer döndüremez.
    }
    
    static int metod2()
    {
        System.out.println("Bu metod parametre almıyor ama değer döndürüyor");
        return 2;
        //int değer döndürür.
    }
    
    static void metod3(int a)
    {
        System.out.println("Bu metod parametre alıyor ama değer döndürmüyor");
    }
    
    static int metod4(int b)
    {
        System.out.println("Bu metod parametre alıyor ve değer döndürüyor");
        return b;
    }
    public static void main(String[] args) {
        
        metod1();
        metod2();
        metod3(5);
        metod4(7);
        
    }
    
}
