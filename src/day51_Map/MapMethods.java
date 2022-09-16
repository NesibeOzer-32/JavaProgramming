package day51_Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //student name & score:
        Map<String,Integer>students = new HashMap<>();
        students.put("Nesibe",100);
        students.put("Ahmet",90);
        students.put("Cagri",90);
        students.put("Ali",80);
        students.put("Said",70);
        students.put("Zeynep",60);
        students.put("Ayşe",60);

        System.out.println("students = " + students);
        System.out.println(students.size());

        System.out.println("....................get()method...............................");
        //display the score of Alex:
        System.out.println(students.get("Ali"));

        System.out.println("....................replace()method...............................");
        //replace Ali score to 90
        students.replace("Ali",90);
        System.out.println("students = " + students);

        System.out.println("....................remove()method...............................");
        //remove the key
        students.remove("Ayşe");
        System.out.println("students = " + students);

        System.out.println("....................containsKey()method...............................");
        boolean r1= students.containsKey("Muhtar");
        boolean r2= students.containsKey("Nesibe");
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("....................containsValue()method...............................");
        boolean r3=students.containsValue(100);
        boolean r4=students.containsValue(40);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("....................isEmpty()method...............................");
        System.out.println(students.isEmpty());

        System.out.println("....................equals()method...............................");
        Map<String,Integer>map1=new HashMap<>();
        map1.putAll(students);
        Map<String,Integer>map2=new HashMap<>();
        map2.putAll(students);

        System.out.println("map2 = " + map2);
        System.out.println("map2 = " + map2);

        System.out.println(map1==map2);//false
        System.out.println(map1.equals(map2));//true

        System.out.println("....................clear()method...............................");
        //clear everything
        map1.clear();
        map2.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);





    }
}
