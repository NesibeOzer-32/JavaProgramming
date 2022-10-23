package day33_Static;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student studen1=new Student("Nesibe");
        Student studen2=new Student("Ahmet",'M');
        Student studen3=new Student("Ali",2189);
        Student studen4=new Student("Ayşe",42546,'A');
        Student studen5=new Student("Said",'M',24);
        Student studen6=new Student("Berat",'M',35,23454);
        Student studen7=new Student("Sena",'F',20,6789,'B');

        System.out.println(studen1==studen2);
        Student[] students={studen1,studen2,studen3,studen4,studen5,studen6,studen7};
        System.out.println(Arrays.toString(students));

        System.out.println("studen1 = " + studen1);
        System.out.println("studen2 = " + studen2);
        System.out.println("studen3 = " + studen3);
        System.out.println("studen4 = " + studen4);
        System.out.println("studen5 = " + studen5);
        System.out.println("studen6 = " + studen6);
        System.out.println("studen7 = " + studen7);

    }
}
