package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.nextLine();
        while(!(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("no") )){
            System.out.println("Invalid answer, Please re_enter");
            answer = scan.nextLine();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats.");
        }
        if(answer.equalsIgnoreCase("no")){
            System.out.println("Goodbye");
        }
    }
}
