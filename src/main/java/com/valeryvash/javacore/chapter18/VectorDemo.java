package main.java.com.valeryvash.javacore.chapter18;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>(3, 2);

        System.out.println("Initial vector size: " + vector.size());
        System.out.println("Initial vector capasity: " + vector.capacity());

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Vector capacity after elements insertion: " + vector.capacity());

        vector.add(5);

        System.out.println("Current vector capasity: " + vector.capacity());

        vector.add(6);
        vector.add(7);

        System.out.println("Current vector capasity: " + vector.capacity());

        vector.add(9);
        vector.add(10);

        System.out.println("Current vector capasity: " + vector.capacity());

        vector.add(11);
        vector.add(12);

        System.out.println("First vector element: " +
                vector.firstElement());
        System.out.println("Last vector element: " +
                vector.lastElement());


        int temp = 3;
        if (vector.contains(temp)) {
            System.out.println("Vector contains " + temp);
        }

        Enumeration<Integer> vEnum = vector.elements();

        System.out.println("\nVector elements: ");

//        while (vEnum.hasMoreElements())
//        {
//            System.out.print(vEnum.nextElement() + " ");
//        }

//        Iterator<Integer> itr = vector.iterator();
//
//        while (itr.hasNext()) {
//            System.out.print(itr.next() + " " );
//        }

        for (int i :
             vector) {
            System.out.print(i + " ");
        }

        System.out.println();


    }
}
