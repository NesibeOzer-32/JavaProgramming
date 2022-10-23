package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = new int[10];

        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number:");
            number[i] = scan.nextInt();
        }
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if(number[i]>max){
                max = number[i];
            }
            if(number[i]<min){
                min = number[i];
            }

        }
        System.out.println("numbers: " + Arrays.toString(number));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
/*
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */