package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;

public class MapMethodsReview {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String>map = new LinkedHashMap<>();
        
        //put(): insert the key& value as a pair to the map
        map.put(10,"Arthur");
        map.put(20,"Ali");
        map.put(3,"Veli");
        map.put(40,"Isabella");

        System.out.println("map = " + map);
        
        //size(): returns the size (total number of paris) of the map

        System.out.println(map.size());

        //get(): returns the value of the given key from map

        System.out.println("map.get(20) = " + map.get(20));

        //replace(key, newValue): replace the value of the given key

        System.out.println("map.replace() = " + map.replace(10, "Nesibe"));

        //remove(key); removes the given key and its value from the map
        System.out.println("map.remove(10) = " + map.remove(10));
        System.out.println("map.size() = " + map.size());

        //contains(key): checks if the given key is contained in the map, returns boolean
        System.out.println("map.containsKey(25) = " + map.containsKey(25));
        System.out.println("map.containsKey(25) = " + map.containsKey(40));

        //contains(value): checks if the given value is contained in the map, returns boolean
        System.out.println("map.containsValue(\"Nesibe\") = " + map.containsValue("Isabella"));
        System.out.println("map.containsValue(\"James\") = " + map.containsValue("James"));

        //isEmpty(): checks if the map is empty , returns boolean
        System.out.println("map.isEmpty() = " + map.isEmpty());

        //equals(MapObject): checks if the map is equal to the given map in the argument, returns boolean

        LinkedHashMap<Integer,String>map2= new LinkedHashMap<>();
        map2.put(20,"Ali");
        map2.put(3,"Veli");
        map2.put(40,"Isabella");
        System.out.println("map.equals(map2) = " + map.equals(map2));

        //clear(); removes all the keys & values from the map , size will be set to 0

        map.clear();
        System.out.println("map.size() = " + map.size());


    }
}
