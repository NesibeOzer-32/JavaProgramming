package day17_While_DoWhile;

import java.util.Scanner;

public class AreYouPregnant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you pregnant");
        String answer = scan.nextLine();
        while(!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, Please re_enter");
            System.out.println("Are you pregnant");
            answer = scan.nextLine();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats");
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Goodbye");
        }
    }
}
