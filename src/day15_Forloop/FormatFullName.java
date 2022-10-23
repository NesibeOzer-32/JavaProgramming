package day15_Forloop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        
        System.out.println("Enter your firstname: ");
        String firstName = new Scanner(System.in).next();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter your lastname: ");
        String lastName = new Scanner(System.in).next();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

    }
}  
        /*              
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)
                    input:
                        firstName = "cyDEo";
                        lastName = "SCHOOL";
                    output:
                        Cydeo School
 */