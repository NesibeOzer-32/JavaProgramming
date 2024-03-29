package week09;

import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        System.out.println("--------------------------------1D ARRAY------------------------------------");
        int[] arr1D_1= {3,34,21,56,-10,100 };
        int[] arr1D_2= {3,33,55,61,67,-11,89 };
        int[] arr1D_3= {7,35,34,52,-19,10,44,90 };
        System.out.println(Arrays.toString(arr1D_1));
        System.out.println(Arrays.toString(arr1D_2));
        System.out.println(Arrays.toString(arr1D_3));
        System.out.println("--------------------------------2D ARRAY------------------------------------");

        int[][] arr2D_1={arr1D_1, arr1D_2, arr1D_3};
        System.out.println(Arrays.deepToString(arr2D_1));
        System.out.println("--------------------------------reverse------------------------------------");

        int [][] reversed2Darr = new int[arr2D_1.length][];  // we create an empty 2d array, I know the size of 2d array, however I don't know the sizez of 1d arrays
        int index2D = 0;
        for(int i = arr2D_1.length-1; i>= 0 ; i--){
            int [] reversed1Darr = new int[arr2D_1[i].length]; // empty 1D array that will hold reversed 1D arrays temporarily
            int index1D = 0; // dummy counter for storing inside the reversed 1D array
            for(int j = arr2D_1[i].length-1; j>=0 ; j--){
                reversed1Darr[index1D] = arr2D_1[i][j];
                index1D++;
            }
            reversed2Darr[index2D]=reversed1Darr;
            index2D++;
        }
        System.out.println(Arrays.deepToString(reversed2Darr));
    }
}