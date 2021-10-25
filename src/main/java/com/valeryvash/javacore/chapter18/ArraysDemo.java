package main.java.com.valeryvash.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (-3 * i);
        }

        System.out.println("Initial massive: ");
        display(array);

        Arrays.sort(array);

        System.out.println("Sorted array: ");
        display(array);

        Arrays.fill(array,2,6,-1);
        System.out.println("array[] after fill() method call: ");
        display(array);

        Arrays.sort(array);
        System.out.println("array[] after 2nd sort() method call: ");
        display(array);

        int temp = -9;
        System.out.println("\"" + temp + "\" element position in array[] is:");
        System.out.println(Arrays.binarySearch(array, temp));
    }

    private static void display(int array[]) {
        for (int i:
             array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
