package day12_Scanner;

import java.util.Scanner;

public class myExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        int birthYear = scan.nextInt();
        int result = 2022- birthYear;
        System.out.println("age = " + result);


    }
}
