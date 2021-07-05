/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25.staticmetodlar2;

/**
 *
 * @author porta
 */
public class StaticMetodlar2 {

    public static int x;
    public static void metod(int a)
    {
        x=a;
    }
    
    
    public static void main(String[] args) {
        
        StaticMetodlar2 s1=new StaticMetodlar2();
        StaticMetodlar2 s2=new StaticMetodlar2();
        
        s1.metod(5);
        s2.metod(7);
        System.out.println(s1.x);
        System.out.println(s2.x);
        
    }
    
}
