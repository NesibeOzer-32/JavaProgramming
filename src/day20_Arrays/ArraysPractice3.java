package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers would you like to enter: ");
        int length = scan.nextInt();

        if(length<=0){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        int[] numbers= new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            numbers[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
