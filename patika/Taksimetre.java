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
public class Taksimetre {
     public static void main(String[] args) {
        // TODO code application logic here
      int km;
      double perKm = 2.20 , total ,startPrice =10;
      Scanner input = new Scanner(System.in);
      System.out.println("Mesafeyi KM cinsinden giriniz: ");
      km= input.nextInt();
      total=(km*perKm);
      total+=startPrice;
      
      total=(total<20)?20:total;
      System.out.println("Toplam tutar: "+total);
         
    }
}
