package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");

        try {
            System.out.println(9/0);

            System.out.println( "Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Aritmetic Exeption was occured");
        }


        System.out.println("Test Completed");

        System.out.println("............................unchecked exception............................................");

        System.out.println("Test 2 started");

        int [] numbers ={1,2,3,4,5};
        try {
            System.out.println(numbers[200]);
        /*}catch (NullPointerException e){----YANLIŞ EXEPTİON
            System.out.println("Catch Block");
            System.out.println("NullPointerException was occured");
        }*/
        /*}catch (RuntimeException e){ doğru ama uzun bir yol
            System.out.println("Catch Block");
            System.out.println("RuntimeException was occured");
        }*/
        }catch (RuntimeException e){
            e.printStackTrace(); //Index 200 out of bounds for length 5 (bizim için hatayı raporlar)
           // System.out.println(e.getMessage());Index 200 out of bounds for length 5
        }
        System.out.println("..............................unchecked exception.............................................");
        System.out.println("test3 started");
//önceden bilmiyorum ne olduğunu---RuntimeExpection(unchecked)
        try {
            System.out.println("Cydeo".substring(2,0));//begin 2, end 0, length 5
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(".............................checked exception...............................................");
        System.out.println("Hello");


        try {
            Thread.sleep(3000);//checked by compiler
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Cydeo");
        System.out.println("...........................checked exception.................................................");
        try {
            FileInputStream file= new FileInputStream("File path");//checked by compiler
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
