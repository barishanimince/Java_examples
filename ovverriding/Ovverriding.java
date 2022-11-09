/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ovverriding;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Ovverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Basekredi [] krediler =new Basekredi[]
        {new Ogrencikredi(),new Ogretmenkredi(),new Tarımkredi()};
        
        for(Basekredi kredi:krediler){
            System.out.println(kredi.hesapla(1000));
        }
    }
    
}
