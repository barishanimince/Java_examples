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
public class Dairenin_alani {
     public static void main(String[] args) {
        // TODO code application logic here
        int r,a;
        double pi=3.14;
        Scanner inp= new Scanner(System.in);
         System.out.println("Dairenin yari capini giriniz:");
         r=inp.nextInt();
         System.out.println("Dairenin merkez acisinin olcusunu giriniz:");
         a=inp.nextInt();
         double alan = (pi*(r*r)*a)/360;
       
         
          System.out.println("Dairenin alani:"+alan);
    }
}
