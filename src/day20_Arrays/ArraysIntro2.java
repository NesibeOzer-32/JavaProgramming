package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro2 {
    public static void main(String[] args) {
        System.out.println("------------------------Kaç element var biliyorum (5 tane) ama içindekiler belli değil-------------------------------------");
        String[] myGroup = new String[5];
        myGroup[0] = "Günay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------Kaç element var belli ve iç,ndekiler de belli-----------------------------------");
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index number:  0          1         2           3         4         5          6
        System.out.println(Arrays.toString(days));

        int number = 5;
        if(number<1||number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
