package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));

        ArrayList<Integer> unique= new ArrayList<>();

        for (Integer each: list) {
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                unique.add(each);
            }

        }
        System.out.println("unique = " + unique);

    }
}
