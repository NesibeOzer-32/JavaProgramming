package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        System.out.println("------------------------------a to z-------------------------------------");
        char[] letters = new char[26];
        /*for (char i = 'A', j=0 ; i <= 'Z' && j<letters.length; i++, j++) {
            letters[j]=i;
        }*/
        char ch= 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch;
            ch++;

        }
        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------z to a--------------------------------------------");
        char[] letters2 = new char[26];
        char ch2 = 'Z';
        for (int j = 0; j < letters2.length ; j++ ) {
            letters2[j]=ch2;
            ch2--;

        }
        System.out.println(Arrays.toString(letters2));
    }
}
