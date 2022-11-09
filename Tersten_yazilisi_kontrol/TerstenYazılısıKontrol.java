/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersten.yazılısı.kontrol;

import java.util.Scanner;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class TerstenYazılısıKontrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int uzunluk,i=0;
       int a;
        char[] kontrol=new char [20];
        Scanner s = new Scanner(System.in);
        String kelime;
        System.out.println("bir kelime giriniz:");
        kelime=s.nextLine();
        
        uzunluk=kelime.length();
         a=uzunluk-1;
           
        for(i=0;i<uzunluk;i++){
         if(kelime.charAt(i)!=kelime.charAt(a)){
             System.out.println("tersi ile ayni degil");
             break;
         }
         
         else{
            a--;
             if (a==i || a<i){
             System.out.println("tersi ile ayni");
             break;
         }
         }
         
    }
        
   
   
   
    
        
    
    
}
    
}
