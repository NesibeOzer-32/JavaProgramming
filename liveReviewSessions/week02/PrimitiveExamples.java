package week02;

public class PrimitiveExamples {
    public static void main(String[] args) {
        // Variables : Primitive Types: Numbers || Characters  || Boolean
        /*
        Numbers: Integers ----> byte -> short -> int -> long
                decimals(floating points) ---> float and double
        Characters: char data type
                    not primitive however String : collection of chars
        Boolean: true / false   (1000100111)
         */
        // DataType
        /*
        DataType variableName = Value ; 1. Declare and 2.initialize at the same line
        DataType variableName; 1. Declare
        variableName = Value; 2.initialize
        DataType variableName1, variableName2;
         */

        byte num1;//Declare  a Variable
        num1 = 123;//initialize,  a assign a volue
        num1 = 121; //re-assigne a different volue
        short num2 = 12345;//Declare and initialize
        int distance = 1-000-000-000;
        System.out.println("distance = " + distance);
        long distanceMore = 3_000_000_000l;  // passing the limit so I have to put L
        long distanceShorter = 1_000_000_000; // inside the limit

        float rate = 1000.5F;
        double dNumber = 123.4;
        System.out.println(" -------Casting--------- ");
        // I wil assign num1 (byte) to num2 (short).... from bigger dataType to bigger dataType
        num2 = num1; // there is implicit costing : doe by complier
        System.out.println("num2 = " + num2);
        // I wil assign distance var,able value to num2 variable ..... from bigger dataType to smaller dataType
        num2 = (short) distance; //explict casting ..... done by developer/tester
        System.out.println("num2 = " + num2);

        char ch = 'a';
        System.out.println("ch = " + ch);
        int x = 5 + ch ;
        System.out.println("x = " + x);
        String str = "" + 'J'+ 'A'+ 'V'+ 'A';
        System.out.println("str = " + str);
        /* Note: Important rule of Java Java runs from left to right : string + char = String
        * "c":string
        * 'c': char
        * */
        int y = 'J'+ 'A'+ 'V'+ 'A';
        System.out.println("y = " + y);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b2 = " + b2);
/*
* naming RULES: examples for Valid(V) and Invalid(I) Ex:
*    _average : V We can use "_" and "$"
*    EU9: V
*    ABC: V
*    println : I NOT A RESERVED WORD
*    for: I
*    "Hello" : I
*    sum_of_data : v
*    firs -name : I
*    32HOİ : I */

    }
}
