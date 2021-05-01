/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.overloadingmethods;

import java.util.Scanner;



public class OverloadingMethods{
    
    public static int max(int num1, int num2) { 
  if (num1 > num2)
    return num1;
  else
    return num2;
    }
    
    public static void main(String[] args) {
       
       System.out.println("İlk Sayıyı Giriniz: ");
       Scanner scanner = new Scanner(System.in);
       int num1;
       num1 = scanner.nextInt();
       
       System.out.println("İkinci Sayıyı Giriniz: ");
       Scanner scanner1 = new Scanner(System.in);
       int num2;
       num2 = scanner.nextInt();
       
       
       System.out.println("Büyük Olan Sayı: " + max(num1, num2));
    }
    
}
