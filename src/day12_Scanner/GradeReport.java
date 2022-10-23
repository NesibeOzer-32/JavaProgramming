package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score:");
        int num = scan.nextInt();
        String result = "";
        if(num<=100 && num>=0){
            result= (num >= 89)? "A" : (num >= 79) ? "B" : (num >= 69) ? "C" : (num >= 59) ? "D" : "E";
        }else{
            result="Invalid Score";
        }
        System.out.println(result);
        scan.close();
    }
}
