/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author BARIŞ HANIM İNCE
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car car1= new Car("beyaz","Renault",1, 4);
        Car car2= new Car();
        Car car3=new Car("siyah","mercedes");
        
        car3.yazdir();   
        car2.yazdir();  
        car1.yazdir();  
//       
    }
    
}

    
    

