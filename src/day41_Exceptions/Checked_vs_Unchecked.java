package day41_Exceptions;

import day39_Recap.CydeoTask.Student;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        System.out.println(".....................Unchecked exeption.................................");

        int a= 10;
        int b= 0;
        //System.out.println(a/b);.ArithmeticException compiler not able to check
        //Run yaptığım zaman .ArithmeticException hatası veriyor üncesinde vermiyor.Yazıldığında hata
        // göstermiyor hata olduğunu bilmiyor

        char[] characters ={'A','B','C'};

        //System.out.println(characters[99]); after run problem: "ArrayIndexOutOfBoundsException"
        //describe mistake: Index 99 out of bounds for length 3

        Student student=null;
        //System.out.println(student.getName()); problem:.NullPointerException
        //student.study();

        String str = "Wooden Spoon";//Garbage collector

        //str= null;//null is nothing
        // System.out.println(str.toUpperCase());.NullPointerException

        String str2="";// object!=null
        System.out.println(str2.isEmpty());

        System.out.println("...............................checked Exception......................");

        System.out.println("Hello");

        //Thread.sleep(3000);Unhandled exception: java.lang.InterruptedException

        System.out.println("Cydeo");

        //FileInputStream file= new FileInputStream("path of the file");Unhandled exception: java.io.FileNotFoundException
        //compliler able to check-before run it says wat is problem
    }
}
/*
Unchecked (unexpected event): occurs during the runtime

					all the RuntimeExceptions are unchecked exceptions
 Compiler tarafından handle etme zorunluluğu olmayan hata tipleridir . Fakat Runtime sırasında
 hata aldıgımız durumda handle etmemişsek programı recover etme şansımız yoktur

		checked (unwanted event): occurs during the compile time

					all the exceptions that are not RuntimeExceptions are checked exception

Bazı kod bloklarının hata fırlatabilme durumu ele alınarak handle etmemiz gerekmektedir.
Örnek olarak java.io.FileReader objesini oluşturdugumuz zaman compiler bizde exception ı handle
etmemizi isteyecektir . Aksi durumda projeyi compile edemeyiz.
 */