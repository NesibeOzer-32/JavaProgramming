package day26_CustomMethodsPractice;

import java.util.Arrays;

public class removeelements1 {
    public static void main(String[] args) {
        int  [] numbers ={100,200,300,400,500,600};
        numbers= removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
        numbers=removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));

    }
        //removes the index from the array, returns new array
        public static int[] removeElement(int[] array, int index){

            if(index < 0 || index > array.length-1){
                System.err.println("Invalid Index: "+index);
                System.exit(0);
            }

            int[] result = new int[array.length -1]; //1,2

            int j = 0;
            for (int i= 0; i < array.length; i++) {
                if(i == index){  // if the index of array is matching with the given index
                    continue; // skip
                }
                result[j++] = array[i];
            }

            return result;
        }
}