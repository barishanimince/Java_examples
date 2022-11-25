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
public class Vucut_kitle_indeksi {
     public static void main(String[] args) {
        // TODO code application logic here
        int kilo;
        float boy,index;
        
        Scanner girdi = new Scanner(System.in);
         System.out.println("Kilonuzu giriniz");
         kilo= girdi.nextInt();
         
         System.out.println("Boyunuzu giriniz");
         boy= girdi.nextFloat();
       
         
         index = kilo/(boy*boy);
         System.out.println("İndexiniz: "+index);
         
    }
    
}
