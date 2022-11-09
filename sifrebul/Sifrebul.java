/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifrebul;

import java.util.Scanner;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Sifrebul {

    /**
     * @param args the command line arguments
     */
      private static Scanner tara ;
    public static void main(String[] args) {
       String sifre ;
        int sayac=0;
        tara = new Scanner (System.in);
        
        do {
            System.out.println("sifre griniz:");
            sifre=tara.next();
            if (sifre.compareTo("elma")==0){
                  System.out.println("sifre dogru");
                  break;
            }
            sayac++;
        }
        while(sayac<3);
        
        if (sayac>=3)
              System.out.println("Hakkınız doldu");
     
    }
    
}
    
    

