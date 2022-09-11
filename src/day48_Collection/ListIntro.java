package day48_Collection;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {
        //can NOT synchronize
        //faster:performance
        List<Integer>list1= new ArrayList<>();//Polymorphism
        list1.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list1.get(0));

        //faster:insertion - delete
        List<Integer>list2= new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list2.get(0));

        //can synchronize
        List<Integer>list3= new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list3.get(0));

        //can synchronize
        //has special order-last-in,first out order
        //POP is only for stack
        List<Integer>list4= new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60));

        System.out.println(list4.get(0));

        System.out.println(".......................stack........................................");

        System.out.println("list4 = " + list4);

        //last obj removed
        ((Stack) list4).pop();

        System.out.println("list4 = " + list4);

        //last obj removed
        ((Stack) list4).pop();

        System.out.println("list4 = " + list4);

    }
    public synchronized void method1(){

    }
}
