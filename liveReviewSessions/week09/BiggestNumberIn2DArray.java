package week09;

import java.util.Arrays;

public class BiggestNumberIn2DArray {
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

        int[][] arr2D_2={arr1D_1, arr1D_2, arr1D_3};
        System.out.println(Arrays.deepToString(arr2D_2));

        System.out.println("--------------------------------3D ARRAY------------------------------------");
        int[][][] arr3D_1={arr2D_1,arr2D_2};
        System.out.println(Arrays.deepToString(arr3D_1));
        System.out.println("-----------------------------biggest number---------------------------------");
    int[] biggestNumber= new int[arr2D_1.length];
        for (int i = 0; i < arr2D_1.length; i++) {
            int max= arr2D_1[i][0];
            for (int each:arr2D_1[i]) {
                if (each>max){
                    max=each;
                }

            }
            biggestNumber[i]=max;
        }
        System.out.println(Arrays.toString(biggestNumber));
    }
}
