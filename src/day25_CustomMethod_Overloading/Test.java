package day25_CustomMethod_Overloading;

import day33_Static.utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------------------printEachChar-----------------------");

        String str= "Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("-----------------reverse---------------------------");

        String s1= "Wooden Spoon";
        String reverse= StringUtility.reverse(s1);
        System.out.println("reverse = " + reverse);

        System.out.println("-------------------palindrome-------------------------");

        String word="Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);

        System.out.println("-------------------How many palindrome in array-------------------------");

        String[] names ={"Anna","Java","Phyton","racecar","mom","Cydeo"};
        int count=0;
        for (String each: names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("-----------------------------remove duplicates----------------------");
        String nonDup="aaaaabbbbbcccdddddeee";
        nonDup= StringUtility.removeDuplicates(nonDup);
        System.out.println(nonDup);
    }
}
