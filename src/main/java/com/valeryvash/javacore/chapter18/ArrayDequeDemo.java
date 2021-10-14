package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.println("Stack extraction: ");

        while(arrayDeque.peek() != null)
        {
            System.out.print(arrayDeque.pop() + "\t");
        }
        System.out.println();

        arrayDeque.add("A");
        arrayDeque.push("B");
        arrayDeque.add("D");
        arrayDeque.push("E");
        arrayDeque.add("F");

        System.out.println("Stack extraction after add and push operations: ");

        while(arrayDeque.peek() != null)
        {
            System.out.print(arrayDeque.pop() + "\t");
        }
        System.out.println();

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("Z");
        priorityQueue.offer("DZ");
        priorityQueue.offer("B");
        priorityQueue.offer("D");
        priorityQueue.offer("DZZ");
        priorityQueue.offer("C");
        priorityQueue.offer("DT");

        System.out.println(
                "Priority queue contains: " + priorityQueue
        );

        System.out.println("Priority queue poll " + priorityQueue.poll());

        System.out.println(
                "Priority queue contains (after pool): " + priorityQueue
        );

        System.out.println("Priority queue peek " + priorityQueue.peek());

        System.out.println(
                "Priority queue contains (after peek): " + priorityQueue
        );

        System.out.println("Priority queue poll " + priorityQueue.poll());

        System.out.println(
                "Priority queue contains (after pool): " + priorityQueue
        );

        System.out.println("Priority queue poll " + priorityQueue.poll());

        System.out.println(
                "Priority queue contains (after pool): " + priorityQueue
        );

        /*
        every pool returns elements in ascending order according to the current comparable
        It does not sort queue. Just set the next element according to the comparator at the head of a queue
         */


    }
}
