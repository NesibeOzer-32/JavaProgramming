package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer>numbers;//birden çok bilgi gireceğim zaman static block kullanmalı

    //public static Sheet sheet ;
    public Circle(double radius){
        this.radius=radius;
        //pi=3.14; you should never do--- dont initiaize
    }
    static {//tüm static verilerini girmek için;
        //radius=5;---hata veriyor
        //test dosyasını kontrol et
        pi=3.14;
        name="Circle";

        numbers= new ArrayList<>();//bir çok bilgi giriyoruz o yüzden block
        numbers.add(10);
        numbers.add(20);
    }

    public static void main(String[] args) {
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
}
