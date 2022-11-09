
package personelapp;


public class Yonetici extends Personel {
    
    public Yonetici(String ad, String soyad, String unvan, int calisilanGunSayisi) {
        super(ad, soyad, unvan, calisilanGunSayisi);
    }
    
    @Override
        public double maasHesapla()
    {
        return getGunlukUcret()*getCalisilanGunSayisi()*1.2;
    }
    
}
