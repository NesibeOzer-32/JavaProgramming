package day30_CustomClassIntro.day34_GarbageCollection_AccessModifiers;

import static day33_Static.utilities.MathUtility.*;
public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println(".............................................................");
        //find the sum of 10,20
        int r1=sum(10,20);
        System.out.println("r1 = " + r1);
        //find the sum of 100,200
        int r2=sum(100,200);
        System.out.println("r2 = " + r2);

        int r3=subtract(100,50);
        System.out.println("r3 = " + r3);

        int r4= max(1000,2000);
        System.out.println("r4 = " + r4);
    }
}
