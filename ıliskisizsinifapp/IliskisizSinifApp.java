
package ıliskisizsinifapp;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

interface arayuz
{
    
}
class A1 implements arayuz
{
    private double alan1;
     private double alan2;

    public double getAlan1() {
        return alan1;
    }

    public double getAlan2() {
        return alan2;
    }
   

    public A1(double alan1, double alan2) {
        this.alan1 = alan1;
        this.alan2 = alan2;
    }
    
}
class A2 implements arayuz
{
    private double alan1;
    private double alan2;
    private double alan3;
    private double alan4;
    public double getAlan1() {
        return alan1;
    }

    public void setAlan1(double alan1) {
        this.alan1 = alan1;
    }

    public double getAlan2() {
        return alan2;
    }

    public void setAlan2(double alan2) {
        this.alan2 = alan2;
    }

    public double getAlan3() {
        return alan3;
    }

    public void setAlan3(double alan3) {
        this.alan3 = alan3;
    }

    public double getAlan4() {
        return alan4;
    }

    public void setAlan4(double alan4) {
        this.alan4 = alan4;
    }

    public A2(double alan1, double alan2, double alan3, double alan4) {
        this.alan1 = alan1;
        this.alan2 = alan2;
        this.alan3 = alan3;
        this.alan4 = alan4;
    }

}
class A3 implements arayuz
{
private double alan2;
    private double alan3;
    private double alan4;
    private double alan5;
    private double alan1;

    public double getAlan1() {
        return alan1;
    }

    public void setAlan1(double alan1) {
        this.alan1 = alan1;
    }

    public double getAlan2() {
        return alan2;
    }

    public void setAlan2(double alan2) {
        this.alan2 = alan2;
    }

    public double getAlan3() {
        return alan3;
    }

    public void setAlan3(double alan3) {
        this.alan3 = alan3;
    }

    public double getAlan4() {
        return alan4;
    }

    public void setAlan4(double alan4) {
        this.alan4 = alan4;
    }

    public double getAlan5() {
        return alan5;
    }

    public void setAlan5(double alan5) {
        this.alan5 = alan5;
    }

}
class A4 implements arayuz
{
    private double alan1;
    private double alan2;
    private double alan3;

    public double getAlan1() {
        return alan1;
    }

    public void setAlan1(double alan1) {
        this.alan1 = alan1;
    }

    public double getAlan2() {
        return alan2;
    }

    public void setAlan2(double alan2) {
        this.alan2 = alan2;
    }

    public double getAlan3() {
        return alan3;
    }

    public void setAlan3(double alan3) {
        this.alan3 = alan3;
    }
}
class A5 implements arayuz
{
     private double alan1;

    public double getAlan1() {
        return alan1;
    }

    public void setAlan1(double alan1) {
        this.alan1 = alan1;
    }
}

class iliskisiz
{
    public static void yazdir(List<arayuz> arrList)
    {
        for(arayuz aryz : arrList)
        {
        System.out.println("Sınıf adı: "+aryz.getClass().getName()+"----------------------");
        Method methods[]=aryz.getClass().getDeclaredMethods();
        System.out.println("Nesnenin Metodlari:");
        for (Method meth : methods)
        {
            System.out.println(" " + meth);
        }
         System.out.println("Nesnenin Alanları:");
          Field fields[]=aryz.getClass().getDeclaredFields();
        for (Field fld : fields)
        {
            System.out.println(" " + fld);
        }
      System.out.println("");
}

        
    }
}
public class IliskisizSinifApp {


    public static void main(String[] args) {
        // TODO code application logic here
        List<arayuz> arrList = new ArrayList<arayuz>();
        arayuz a=new A1(0, 0);
        arayuz b = new A2(0, 0, 0, 0);
        arayuz c = new A3();
        arayuz d = new A4();
        arayuz e = new A5();
        arrList.add(a);
        arrList.add(b);
        arrList.add(c);
        arrList.add(d);
        arrList.add(e);
        iliskisiz.yazdir(arrList);
        
    }
    
}
