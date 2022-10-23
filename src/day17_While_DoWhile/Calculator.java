package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter a math oparator: ");
        char ch = scan.next().charAt(0);

        /*
        if(!(ch=='+' || ch=='-')){
            System.err.println("Invalid oparator, Please re-enter");
            ch = scan.next().charAt(0);
        } Sonucu 1 kere verir
        */
        while(!(ch=='+' || ch=='-')){/* parantez içindeki doğru olduğu sürece tekrar etneye devam eder. */
            System.err.println("Invalid oparator, Please re-enter");
            ch = scan.next().charAt(0);
        }
        System.out.println((ch=='+')? num1+num2 : num1-num2);
    }
}
