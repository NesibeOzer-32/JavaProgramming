package day25_CustomMethod_Overloading;

public class SomeOfNumbers {
    public static void main(String[] args) {
         int sum= sumOf2Numbers(7,8);
        System.out.println(sumOf2Numbers(7,9));
        System.out.println("sum = " + sum);
        int sum2=sumOf3Numbers(19,27,76);
        System.out.println("sum2 = " + sum2);
        int sum3=sumOf4Numbers(45,67,23,45);
    }

    public static int sumOf2Numbers(int a, int b) {
        return a + b;

    }
    public static int sumOf3Numbers(int a, int b,int c) {
        return a + b + c;

    }
    public static int sumOf4Numbers(int a, int b,int c,int d) {
        return a + b + c +d;

    }
}

