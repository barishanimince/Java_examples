/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patika_kdv_hesap;

import java.util.Scanner;

/**
 *
 * @author BarisHanimINCE
 */
public class Patika_kdv_hesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tutar ,kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret giriniz: ");
        tutar= input.nextDouble();
        if(tutar<=1000){
            kdvOran=0.18;
        }
        else{
            kdvOran=0.08;
        }
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar+ kdvTutar;
        System.out.println(kdvTutar);
        System.out.println(kdvliTutar);
    }
    
}
