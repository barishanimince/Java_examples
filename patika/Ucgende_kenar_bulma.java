/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika;

import java.util.Scanner;

/**
 *
 * @author BarisHanimINCE
 */
public class Ucgende_kenar_bulma {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,x;
        double Alan;
        
        Scanner girdi = new Scanner(System.in);
         System.out.println("1. Kenarı giriniz");
         a= girdi.nextInt();
         
         System.out.println("2. Kenarı giriniz");
         b= girdi.nextInt();
         System.out.println("3. Kenarı giriniz");
         c= girdi.nextInt();
         x=(a+b+c)/2;
         Alan= Math.sqrt(x*(x-a)*(x-b)*(x-c));
         System.out.println("Alan: "+Alan);
         
    }
}
