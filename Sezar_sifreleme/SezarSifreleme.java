/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sezar.sifreleme;

import java.util.Scanner;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class SezarSifreleme {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kay;
        
        Sifreleme orn = new Sifreleme();
        System.out.println("kelime giriniz:");
        
        orn.mesaj = scan.nextLine();
        
        System.out.println("Kaydırama Miktarının giriniz(k>4) :");
        kay = scan.nextInt();
      
        if (kay > 4) {
            orn.sifreleme(kay);
        } else {
            System.out.println("Istenilen kaydırma tanımsız!!");
        }
        Sifre_cozme orn1 = new Sifre_cozme();
        orn1.sifreli_Mesaj = orn.sifreli_Mesaj ;
        orn1.sifreleme(kay);
    }
}

