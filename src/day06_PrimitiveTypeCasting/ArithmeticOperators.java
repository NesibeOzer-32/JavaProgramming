package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10 + 30);
        System.out.println(100 - 30);
        System.out.println(10 * 6);
        int a =100;
        double b = a/6 ; // 16
        double c = (double)a/6 ;  // 16.66666
        System.out.println(c);
        System.out.println(b);
    }
}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */