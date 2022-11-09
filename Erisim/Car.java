/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolaylı.yoldan.erişim;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Car {
    
    private String renk;
    private String model;
    private int motor;
    private int kapi;
    
    public void  setrenk(String renk){
        this.renk=renk;
       
    }
     public String getrenk(){
        return renk;
    }

        public void  setmodel(String model){
        this.model= model;
       
    }
         public String getmodel(){
        return model;
    }
         
       public void  setmotor(int motor){
        this.motor= motor;
       
    }
         public int getmotor(){
        return motor;
    }
        public void setkapi(int kapi){
            if ( kapi==2 || kapi==4 ){
        this.kapi= kapi;
            }
            else {
                System.out.println("Kapı sayısı 2 veya 4 olabilir");
            }
    }
         public int getkapi(){
        return kapi;
    }

   
    
    
    
}
