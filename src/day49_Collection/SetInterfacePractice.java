package day49_Collection;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        //All of them in the list --output:list = [10, 200, 300, 40, 90, 10, 200,
        // 300, 40, 90, 10, 200, 300, 40, 90, 10, 200,
        // 300, 40, 90, 10, 200, 300, 40, 90]
        List<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        System.out.println("list = " + list);
        System.out.println(list.get(4));

        //It's not duplicated. Each number one time. output:hashSet = [200, 40, 10, 90, 300]
        Set<Integer> hashSet= new HashSet<>();//(random)
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);
        //System.out.println(hashSet.get); get methodu yok.

    }
}
