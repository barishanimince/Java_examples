package personelapp;

import java.util.ArrayList;
import java.util.List;

public class Personel {
    private String ad;
     private String soyad;
     private int sicil_numarasi;
     private String unvan;
     private int gunlukUcret;

     private int calisilanGunSayisi;
     private int kalanIzinGunu;
     private static int sayac=1;

    public Personel(String ad, String soyad, String unvan, int calisilanGunSayisi) {
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.calisilanGunSayisi = calisilanGunSayisi;
        gunlukUcret=100;
        kalanIzinGunu=20;
        sicil_numarasi=sayac;
        sayac++;
    }
    
    
    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public int getCalisilanGunSayisi() {
        return calisilanGunSayisi;
    }
    
    
    public double maasHesapla()
    {
        return gunlukUcret*calisilanGunSayisi;
    }
    
    public static void izindenDus(List<Personel> arrList ,int sicil_no, int gun)
    {
      for(Personel per : arrList)
      {
          if(per.sicil_numarasi==sicil_no)
          {
              per.kalanIzinGunu -= gun;
              return;
          }
      }
        
    }
    public void bilgiGoruntule()
    {
        System.out.println("Personel Adı-Soyadı:"+ad+" "+soyad);
        System.out.println("Personel Unvani:"+" "+unvan);
         System.out.println("Personel Maaşı:"+" "+maasHesapla());
          System.out.println("Personel Kalan inzi:"+" "+kalanIzinGunu);

    }

}
