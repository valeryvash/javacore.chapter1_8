package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        System.out.println(
                "Initial array list content: "
        );

        for (int v:
             integerArrayList) {
            System.out.print( v + "\t");
        }
        System.out.println();

        int sum = 0;
        for (int v:
             integerArrayList) {
            sum += v;
        }

        System.out.println("Summ of array list elements equals: " + sum);

    }
}
