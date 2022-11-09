/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personelapp;

/**
 *
 * @author Gökhan
 */
public class Temsilci extends Personel {
    
    public Temsilci(String ad, String soyad, String unvan, int calisilanGunSayisi) {
        super(ad, soyad, unvan, calisilanGunSayisi);
    }
        @Override
        public double maasHesapla()
    {
        return getGunlukUcret()*getCalisilanGunSayisi()*1.1;
    }
}
