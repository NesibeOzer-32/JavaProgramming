package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(nums); //hashcode
        System.out.println( Arrays.toString(nums) ); // ARRAY"{1,2,3,4,5}"

        System.out.println(  nums[0] );//ELEMENT ***int

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
         */

        System.out.println("--------------------Arrays.sort(name of arrays);sıralama yapıyor-------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        System.out.println( Arrays.toString(scores) );

        Arrays.sort(scores); //{55,65 .... 100}

        System.out.println( Arrays.toString(scores) );

        System.out.println("Min Score: " + scores[0] );
        System.out.println("Max Score: "+ scores[scores.length-1] );

        String[] names = {"Gunay", "Anna", "Zuhal" ,"Ahmet", "Maria", "Sinem"};//Ascii tablosunda harflerin sayısına gore diziyor.

        Arrays.sort(names);

        System.out.println( Arrays.toString(names));//Ascii tablosunda-A daha kucuk sayıya sahip iki A ile baslayan varsa 2. harfe bakar

        String[] words = {"Anna", "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));


        System.out.println("--------------------Arrays.equals(arr1,arr2);---------------------------");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        //her ikisini de sıralamalı cunku index index karşılaştırıyor aynı olup olmadığını test etmek için.
        boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2);//{1,2,3}

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2);

        System.out.println("-----------------------------------------------------");
        //"acb" , "bac"
        // Anagram: inc same letters, numbers.... heart-earth  top-pot listen-silent
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a, b, c}
        Arrays.sort(ch2); //{a, b, c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);




    }

}
