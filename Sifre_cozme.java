/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sezar.sifreleme;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Sifre_cozme {
       String mesaj="";
    String sifreli_Mesaj ;

    public void sifreleme(int kay) {
        int a = 0, b;

        char[] alfabe = new char[52];

        for (int i = 97; i < 123; i++) {//A - Z arası
            alfabe[a] = (char) i;
            a++;
        }

        for (int i = 65; i < 91; i++) {//a - z arası
            alfabe[a] = (char) i;
            a++;
        }
        for (int i = 0; i < sifreli_Mesaj.length(); i++) {
            for (int j = 0; j < 52; j++) {
                if (sifreli_Mesaj.charAt(i) == alfabe[j]) {//Harfi Alfabede bulunca gir
                    if (j < 26) {
                        b = j - kay;
                        b %= 26;
                        mesaj += String.valueOf(alfabe[b]);
                    } else {
                        b = j - kay;
                        if (b > 51) {
                            b = (b % 52) + 26;
                            mesaj += String.valueOf(alfabe[b]);
                            break;
                        } else {
                            b = (b % 52);
                            mesaj += String.valueOf(alfabe[b]);
                        }

                    }
                }
            }

        }
        System.out.println("Sifresi Cozulmus Hali :"+ mesaj);
    }

}

    

