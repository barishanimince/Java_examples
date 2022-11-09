/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template i000000n the editor.
 */
package constructor;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Car {
    
    private String renk;
    private String model;
    private int motor;
    private int kapi;
    
    public Car(String renk ,String model){
        this(renk,model,0,0);
    }
    public Car(){
        /*this.renk="Blgi yok";
        this.model="bilgi yok";
        this.motor=0;
        this.kapi=0;*/
        this("Bilgi yok","Bilgi yok",0,0);
    }
    public Car( String renk ,String model, int motor, int kapi ){
        
        this.renk=renk;
        this.model=model;
        this.motor=motor;
        this.kapi=kapi;
    }
  
         
         public void yazdir(){
         System.out.println("Arabanın rengi: "  + this.renk);
        System.out.println("Arabanın modeli: " + this.model);
        System.out.println("Arabanın motoru: "  + this.motor);
        System.out.println("Arabanın kapi sayisi: " + this.kapi);
         }

   
    
    
    
}


