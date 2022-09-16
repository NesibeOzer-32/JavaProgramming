package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        System.out.println("..............hashMap().................................");
        //Implements the Map interface
        //Random order
        //Accepts null value as a key
        //     Key ,value           (key can not duplicate but value can)
        Map<Integer,String>hashMap= new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");//key:5
        hashMap.put(5,"Isabella");//key:5 we see Last added one
        hashMap.put(6,"Ahmet");
        hashMap.put(7,"Ahmet");
        hashMap.put(8,null);
        hashMap.put(9,null);
        hashMap.put(null,null);
        hashMap.put(null,"Emre");
        hashMap.put(null,"Hulya");



        System.out.println("hashMap = " + hashMap);



        System.out.println("..............LinkedHashMap().................................");
        //same order(insertion order)
        //Accepts null value as a key
        Map<Integer,String>linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabelle");
        linkedHashMap.put(null,"Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("..............TreeMap().................................");
        //Doesn't except nul as a key
        //Sorted order
        Map<Integer,String>treeMap= new TreeMap<>();
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabelle");
        //treeMap.put(null,"Hulya"); NullPointerException
        System.out.println("treeMap = " + treeMap);


        System.out.println("..............Hashtable().................................");
        //doesn't except null as a key
        //random order
        //Synchronized(Thread_Safe)
        //disadvantages: slow
        Map<Integer,String>hashtable= new Hashtable<>();
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabelle");
        //treeMap.put(null,"Hulya"); NullPointerException
    }
}
