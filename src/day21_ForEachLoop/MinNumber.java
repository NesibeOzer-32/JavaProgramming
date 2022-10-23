package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 6, 9};
        int min = numbers[0];// 20

        for (int number : numbers) {
            if(number < min){
                min =number;
            }
        }


        System.out.println(min);


    }

}

