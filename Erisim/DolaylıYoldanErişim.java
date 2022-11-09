/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolaylı.yoldan.erişim;

import java.util.Scanner;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class DolaylıYoldanErişim {

    /**
     * @param args the command line arguments
     */    private static Scanner color ;
    public static void main(String[] args) {
        String renk;
        Car car1= new Car();
        color = new Scanner (System.in);// kullanıcıdan mesajı alacagız
        
        System.out.println("renk griniz:");
        renk=color.next(); 
            
        car1.setrenk(renk);// rengi kullanıcıdan aldık
        car1.setmodel("Renault Megane");
        car1.setmotor(2);
        car1.setkapi(4);
          
        System.out.println("Arabanın rengi: "  +car1.getrenk());
        System.out.println("Arabanın modeli: " +car1.getmodel());
        System.out.println("Arabanın motoru: "  +car1.getmotor());
        System.out.println("Arabanın kapi sayisi: " +car1.getkapi());
    }
}
