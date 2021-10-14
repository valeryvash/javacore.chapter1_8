package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayDeque;

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

    }
}
