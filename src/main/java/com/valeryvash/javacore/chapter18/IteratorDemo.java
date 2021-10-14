package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");

        System.out.println(
                "Initial content of array list: "
        );

        Iterator<String> stringIterator = a1.iterator();

        while (stringIterator.hasNext()) {
            String element = stringIterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = a1.listIterator();
        while (listIterator.hasNext()) {
            String str = listIterator.next();
            listIterator.set(str + "+");
        }

        System.out.println(
                "Chaged content of array list: "
        );

        stringIterator = a1.iterator();
        while(stringIterator.hasNext())
        {
            String element = stringIterator.next();
            System.out.print(element + " " );
        }
        System.out.println();

        System.out.println(
                "Changed content of array list in descending order: "
        );
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
