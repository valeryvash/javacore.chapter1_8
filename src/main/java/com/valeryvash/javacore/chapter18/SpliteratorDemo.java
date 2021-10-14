package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        Spliterator<Double> spl = vals.spliterator();

        System.out.println("" +
                "Array list contains:");

        while(spl.tryAdvance((n) -> System.out.println(n)));

        System.out.println();

        spl = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spl.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));


        System.out.println(
                "Array list with sqrs (from 1st arraylist)"
        );
        spl = sqrs.spliterator();
        spl.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
