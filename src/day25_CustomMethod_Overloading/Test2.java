package day25_CustomMethod_Overloading;

import day33_Static.utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println(".....................................................");

        double[] arr2 ={1.9,2.7,3.5,4.2,5.0};
        ArraysUtility.printEachElement(arr2);

        System.out.println(".....................................................");

        char[] arr3 ={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);

        System.out.println(".....................................................");

        String[] arr4 ={"Ali","Veli","Sakine"};
        ArraysUtility.printEachElement(arr4);

        System.out.println(".....................................................");

        int[] n1={3,9,1,3,8};
        int max1= ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        System.out.println(".....................................................");

        double[] n2={3.1,9.3,1.1,3.7,8.7};
        double max2= ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println(".....................................................");

        int[] m1={3,9,1,3,8};
        int min1= ArraysUtility.min(n1);
        System.out.println("min1 = " + min1);

        System.out.println(".....................................................");

        double[] m2={3.1,9.3,1.1,3.7,8.7};
        double min2= ArraysUtility.min(m2);
        System.out.println("min2 = " + min2);

        System.out.println(".....................................................");

        int [] numbers2={3,9,1,3,8};
        boolean isTrue=ArraysUtility.contains(numbers2,3);
        System.out.println("isTrue = " + isTrue);

        System.out.println(".....................................................");

        double [] numbers3={3.2,9.4,1.1,3.5,8.6};
        boolean isTrue2=ArraysUtility.contains(numbers3,9.1);
        System.out.println("isTrue2 = " + isTrue2);

        System.out.println(".....................................................");

        char [] chr={'a','b','c','d','e'};
        boolean isTrue3=ArraysUtility.contains(chr,'a');
        System.out.println("isTrue3 = " + isTrue3);

        System.out.println(".....................................................");

        String [] str={"ali","bali","cali","dali" ,"eli"};
        boolean isTrue4=ArraysUtility.contains(str,"ali");
        System.out.println("isTrue3 = " + isTrue4);





    }
}
