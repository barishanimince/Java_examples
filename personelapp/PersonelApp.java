
package personelapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonelApp {
    public static void maasHesapla( List<Personel> arrList)
    {
          for(Personel per : arrList)
        {
            per.maasHesapla();
            
        }
        
    }
    
        public static void personelGoruntule( List<Personel> arrList)
    {
          for(Personel per : arrList)
        {
            per.bilgiGoruntule();
            
        }
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        
          List<Personel> arrList = new ArrayList<Personel>();
         Personel per1;
         //Personel per2=new Yonetici("Ali", "Veli", "Temsilci",20);
         //Personel per3=new Temsilci("Ali", "Veli", "Temsilci",20);
         
         int secim,calisilanGun,sicil_no,gun;
         String ad,soyad,unvan;
         Scanner s = new Scanner(System.in);
         do
         {
             System.out.println("1) Yönetici Ekle\n" + "2) Temsilci Ekle\n" +"3) Personel Ekle\n" +"4) Maaşları Hesapla\n" +"5) İzin Düş\n" +"6) Bütün Personel Bilgilerini Görüntüle");
             secim=s.nextInt();
             switch(secim)
             {
                 case 1:System.out.println("Yönetici adini giriniz");ad=s.nextLine(); System.out.println("Yönetici Soyadini giriniz");soyad=s.nextLine(); System.out.println("Yönetici unvanin giriniz");unvan=s.nextLine(); System.out.println("Yönetici calisilan gun sayısı giriniz");calisilanGun=s.nextInt();per1 = new Yonetici(ad, soyad, unvan, calisilanGun);arrList.add(per1);break;
                 case 2:System.out.println("Temsilci adini giriniz");ad=s.nextLine(); System.out.println("Temsilci Soyadini giriniz");soyad=s.nextLine(); System.out.println("Temsilci unvanin giriniz");unvan=s.nextLine(); System.out.println("Temsilci calisilan gun sayisi giriniz");calisilanGun=s.nextInt();per1 = new Temsilci(ad, soyad, unvan, calisilanGun);arrList.add(per1) ;break; 
                 case 3: System.out.println("Personel adini giriniz");ad=s.nextLine(); System.out.println("Personel Soyadini giriniz");soyad=s.nextLine(); System.out.println("Personel unvanin giriniz");unvan=s.nextLine(); System.out.println("Personel calisilan gun sayısı giriniz");calisilanGun=s.nextInt();per1 = new Personel(ad, soyad, unvan, calisilanGun);arrList.add(per1);break;
                 case 4: PersonelApp.maasHesapla(arrList); break;
                 case 5: System.out.println("izin düşülecek personelin sicil numarsini giriniz");sicil_no=s.nextInt();System.out.println("kaç gün düşülecek");gun=s.nextInt();Personel.izindenDus(arrList, sicil_no, gun);break;
                 case 6: PersonelApp.personelGoruntule(arrList);break;
              
             }
         }while(secim !=0);
        
         //per1.bilgiGoruntule();
    }
    
}
