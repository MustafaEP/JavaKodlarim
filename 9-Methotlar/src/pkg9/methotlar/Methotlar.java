
package pkg9.methotlar;


public class Methotlar {

   public static int sum(int i1, int i2)
   {
       //i1 ile i2 arasındaki sayıların toplamını sağlayan bir methot tanımladık.
       int sum = 0;
       for(int i=i1 ; i<=i2 ; i++)
           sum += i;
       return sum;
   
   }
   
    
    public static void main(String[] args) {
         
        System.out.println("1 ile 10 arasındaki sayıların toplamı: " + sum(1, 10));
        System.out.println("25 ile 35 arasındaki sayıların toplamaı: " + sum(25, 35));
        System.out.println("37 ile 55 arasındaki sayıların toplamaı: " + sum(37, 55));
        
    }
    
}
