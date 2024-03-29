package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        /*collection clas:
        sort();sıralama
         */
        System.out.println(".................. Collections.sort()...............................");
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println("list = " + list);

        System.out.println("..........................Collections.reverse(name).............................");

        ArrayList<Character> list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println("list2 = " + list2);

        Collections.reverse(list2);
        System.out.println("list2 = " + list2);

        System.out.println("..........................Collections.swap(name).............................");

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3,4,1);//index sayıları verilenler yer degiştiriyor
        System.out.println("list3 = " + list3);

        System.out.println(".............................Collections.max().................................");

        int max= Collections.max(list3);
        System.out.println("max = " + max);

        System.out.println(".............................Collections.min().................................");

        int min= Collections.min(list3);
        System.out.println("min = " + min);

        System.out.println("................................Collections.replaceAll()..............................");
        ArrayList<Integer> list4= new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,10,60,10));

        Collections.replaceAll(list4,10,1000);
        System.out.println("list4 = " + list4);
        System.out.println("................................Collections.frequencyOf()..............................");

        int frequency = Collections.frequency(list4,1000);
        System.out.println("frequency = " + frequency);

        System.out.println("........................................................................................");

        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","Java","Python","Python","Python","Cydeo","Cydeo"));

        int countJava= Collections.frequency(words,"Java");
        int countPython= Collections.frequency(words,"Python");
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);
    }
}
