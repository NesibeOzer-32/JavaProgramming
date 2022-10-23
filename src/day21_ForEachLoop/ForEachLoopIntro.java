package day21_ForEachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        System.out.println("------------------------for loop-------------------------");
        int[] numbers = {10,20,30,40,50,60,70};
        for (int i = 0; i < numbers.length; i++) {
            int eachElement =  numbers[i];
            System.out.println(eachElement);

        }
        System.out.println("");

        System.out.println("------------------for each loop-------------------------");

        for(int each: numbers){
            System.out.println(each);
        }
    }
}
