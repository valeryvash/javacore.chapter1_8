package main.java.com.valeryvash.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
/*
*   https://coderoad.ru/51177527/Что-в-принципе-такое-RandomAccess-Почему-мы-используем-RandomAccess
* */
public class RandomAccessDemo {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            arrayList.add(
                    Math.random() * 10000000 - 0.5*10000000
            );
        }

        long start,end;

        Iterator itr = arrayList.iterator();

        start = System.currentTimeMillis();
        /*
        //Approximate time is < 12 (Regular values are 8-9ms)
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
*/

        // Approximate time is [10-20] msec
        while(itr.hasNext()) itr.next();

        end = System.currentTimeMillis();
        System.out.println(
                "For loop duration is " + (end-start)
        );
    }
}
