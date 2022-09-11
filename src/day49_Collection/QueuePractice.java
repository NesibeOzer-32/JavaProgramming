package day49_Collection;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        //random
        //output:priorityQueue = [10, 40, 300, 200, 90]

        Queue<Integer> priorityQueue= new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priorityQueue = " + priorityQueue);

        //eklendiği sıra ile
        Queue<Integer> arrayDeque= new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDeque = " + arrayDeque);


        //eklendiği sıra ile
        Queue<Integer> linkedList= new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList = " + linkedList);

        System.out.println(".......pol()-->remove last element.....................................");

        System.out.println("before pol : priorityQueue = " + priorityQueue);
        priorityQueue.poll();
        System.out.println("after pol : priorityQueue = " + priorityQueue);

        System.out.println("before pol : arrayDeque = " + arrayDeque);
        arrayDeque.poll();
        System.out.println("after pol : arrayDeque = " + arrayDeque);

        System.out.println("before pol : linkedList = " + linkedList);
        linkedList.poll();
        System.out.println("after pol : linkedList = " + linkedList);

        System.out.println(".................get()method...........................");

        //Cannot use get method
        //System.out.println(linkedList.get(1));
        //System.out.println(priorityQueue.get(1));
        //System.out.println(arrayDeque.get(1));

        System.out.println(((List)linkedList).get(1));
    }
}
