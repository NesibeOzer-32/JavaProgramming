package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your fullname:");
        String fullname = input.nextLine();
        System.out.println("Enter your Programming Language: ");
        String ProgrammingLanguage = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name: ");
        String SchoolName = input.nextLine();
        System.out.println("fullname = " + fullname);
        System.out.println("ProgrammingLanguage = " + ProgrammingLanguage);
        System.out.println("age = " + age);
        System.out.println("SchoolName = " + SchoolName);


    }
}
