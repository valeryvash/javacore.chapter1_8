package main.java.com.valeryvash.proselyte.collections.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(654);
        list.add(523);
        list.add(-668);
        list.add(-963);
        list.add(-753);
        list.add(-967);
        list.add(294);
        list.add(349);
        list.add(-349);

        System.out.println("Initial arraylist");
        System.out.println(list);

        System.out.println("\n=======\n");

        System.out.println("Sorting arrayList");
        Collections.sort(list);
        System.out.println("Sorted list\n" + list + "\n");

        System.out.println("\n=======\n");

        System.out.println("Reversing order");
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(list,comparator);
        System.out.println("Reversed list\n" + list + "\n");

        System.out.println("\n=======\n");

        System.out.println("Shuffling");
        Collections.shuffle(list);
        System.out.println("Shuffled collection: \n" + list + "\n");
    }
}
