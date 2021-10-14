package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        System.out.println(
                "Array list content: " + a1
        );

        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);

        int sum = 0;

        for (int i:
             ia) {
            sum += i;
        }

        System.out.println("Sum: " + sum);

    }
}
