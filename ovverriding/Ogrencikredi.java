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
public class Ogrencikredi extends Basekredi{
    
    /**
     *
     * @param deger
     * @return
     */
    @Override
     public double hesapla(int deger){
        return deger*1.30;
    }
}
