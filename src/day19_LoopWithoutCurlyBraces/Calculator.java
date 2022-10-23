package day19_LoopWithoutCurlyBraces;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// System.in---kullanıcı giriş

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");// System.out---girilen bilginin bize gösterilmesi
        char operator = scan.next().charAt(0);//  "-".charAt(0) , "+"char girilmezse string olarak kabul eder ve hata verir.

        if(  !(operator == '+' || operator == '-') ){ // if the operator is not valid
            System.err.println("Invalid Math Operator: "+operator);
            System.exit(0); // terminates the whole program
        }// System.exit kendisinden önceki herşeyi durdurur bitirir.

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();


        if (operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }




    }

}