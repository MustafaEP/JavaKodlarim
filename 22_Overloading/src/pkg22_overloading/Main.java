/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22_overloading;

/**
 *
 * @author porta
 */
public class Main {

    static int metod1(int a)
    {
        return a;
    }
    
    static int metod1(int b, int c)
    {
        return b*c;
    }
    
    public static void main(String[] args) {
        
        System.out.println(metod1(3));
        System.out.println(metod1(5,7));
        //Burda aynı isimde metod oluşturabileceğimizi gördük bunun için parametreler farklı olmalıdır mesela birinde 1 diğerinde 2 parametre olmalıdır
        //yada biri int biri double olmalır yani farklı olmalıdır
        
    }
    
}
