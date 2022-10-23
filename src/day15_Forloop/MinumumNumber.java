package day15_Forloop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any number that user enter will be less than 2147483647
        // min = -10

        for(int i = 0; i < 5; i++ ){

            System.out.println("Enter a number:");
            int num = scan.nextInt(); //67, 23, 42, 5, -10
                /*Her girilen sayıyı min sayı ile karşılastırıp min olanı alır yeni mmin num o olur
                ve yeni girilen sayı ile tekrar karşılaştırılır ve yeni min belirlenir.
                Bu döngü belirlenen sayı girimine kadar devam eder.*/
            if(num < min ){
                min = num;
            }

        }


        System.out.println("min = " + min);
    }

}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */