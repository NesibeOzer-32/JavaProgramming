package day52_Map_FunctionalInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMapReview {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        //put(): insert the key& value as a pair to the map
        map.put(10,"Arthur");
        map.put(20,"Ali");
        map.put(3,"Veli");
        map.put(40,"Isabella");
        
        //keySet(); returns all the keys of map (Set)

        for (Integer eachKey : map.keySet()) {
            System.out.println( eachKey);
        }

        //values(); returns all the values of map(Collection)

        for (String eachValue : map.values()) {
            System.out.println(eachValue);
        }

        //entrySet(); returns all entries of map(set)
        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);

        }
    }
}
