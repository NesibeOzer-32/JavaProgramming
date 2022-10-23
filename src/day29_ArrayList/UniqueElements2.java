package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,4,4,5,6,7,7,8));
        
        ArrayList<Integer> unique= new ArrayList<>(list);
        
        unique.removeIf(p -> Collections.frequency(list,p)>1);
        System.out.println("unique = " + unique);
                
    }
}
