/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public abstract class  GameColculator {
    
    public abstract void hesapla();
    
    public final void Over(){
        System.out.println("Oyun bitti");
    }
}
