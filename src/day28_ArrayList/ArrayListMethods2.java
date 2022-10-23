package day28_ArrayList;

import javax.lang.model.SourceVersion;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        System.out.println(".............remove().............................................");

        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        System.out.println("list = " + list);
        //int num=1;
        //list.remove(num);
        //System.out.println("list = " + list);
        Integer num=200;
        boolean r = list.remove(num);
        System.out.println(list);
        System.out.println("r = " + r);
        System.out.println(".............clear();herşeyi siler.......................................");
        System.out.println(list.size());// cevap:6
        list.clear();
        System.out.println(list.size());// cevap:0 hersey silindi listede eleman kalmadı

        System.out.println(".......indexOf() soldan sağa.........................................................");
        ArrayList<Character> character = new ArrayList<>();
        character.add('A');
        character.add('B');
        character.add('C');
        character.add('A');
        character.add('E');

       int b= character.indexOf('A');
        System.out.println("b = " + b);
        System.out.println(".......lastIndexOf()sağdan sola kontrol.....................................................");

        int a= character.lastIndexOf('A');
        System.out.println("a = " + a);

        System.out.println(".............contains().............................................");
        boolean r2 = character.contains('C');
        boolean r3 = character.contains('Y');
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println(".........equals();same elements same order...................................................");
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println("== eşitlik");
        System.out.println("list1 = " + list1);
        System.out.println(list1==list2);
        System.out.println("equals durumu:");
        System.out.println("list2 = " + list2);
        System.out.println(list1.equals(list2));
        System.out.println("..............isEmpty();size:0........................................");
        boolean r4 = list1.isEmpty();
        System.out.println("r4 = " + r4);
        list1.clear();
        boolean r5= list1.isEmpty();
        System.out.println("r5 = " + r5);

        System.out.println("..............addAll();.............................");
        ArrayList<Integer> numbers= new ArrayList<>();
        //bulk operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("numbers = " + numbers);
    }
}
