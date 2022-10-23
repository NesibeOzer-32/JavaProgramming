package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        System.out.println(".................kac tane belli ama içindekileri bilmiyoruz....................");
        //create a variable that's capable enough to contain 5 names- isimlendirilmemiş
        String[] myGroep = new String[5];//names are non-primitev String
        //System.out.println(myGroep); false way
        System.out.println(Arrays.toString(myGroep));//non_primitives:nul [null, null, null, null, null]

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));//primitives:0 [0, 0, 0, 0, 0]

        boolean[]isTrueorFalse = new boolean[5];
        System.out.println(Arrays.toString(isTrueorFalse));//boolean: false [false, false, false, false, false]
    }
}
