package day20_Arrays;

public class MinimalNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0];// 20

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min ){ // if there is element in the array that's greater than the current max number
                min = numbers[i]; // assigning greater number to variable max
            }

        }

        System.out.println(min);


    }

}