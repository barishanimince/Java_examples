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
public class manav_kasa_hesap {
      public static void main(String[] args) {
        // TODO code application logic here
       double tutar, Armut = 2.14 ,Elma = 3.67 , Domates = 1.11 ,Muz= 0.95 ,Patlıcan = 5.00 ;
       int ArmutKilo,ElmaKilo,DomatesKilo,MuzKilo,PatlıcanKilo;

        
        
        Scanner girdi = new Scanner(System.in);
         System.out.println("Armut Kac Kilo");
         ArmutKilo= girdi.nextInt();
         
        System.out.println("Elma Kac Kilo");
         ElmaKilo= girdi.nextInt();
        
         System.out.println("Domates Kac Kilo");
         DomatesKilo= girdi.nextInt();
         
         System.out.println("Muz Kac Kilo");
         MuzKilo= girdi.nextInt();
         
         System.out.println("Patlıcan Kac Kilo");
         PatlıcanKilo= girdi.nextInt();
         
         
         tutar = (Armut*ArmutKilo)+(Elma*ElmaKilo)+(Domates*DomatesKilo)+(Muz*MuzKilo)+(Patlıcan*PatlıcanKilo);
         System.out.println("Kasa Tutarı: "+tutar);
         
    }
}
