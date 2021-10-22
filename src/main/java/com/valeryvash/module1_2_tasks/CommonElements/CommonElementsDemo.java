package main.java.com.valeryvash.module1_2_tasks.CommonElements;

import java.util.ArrayList;
import java.util.Arrays;

import static main.java.com.valeryvash.module1_2_tasks.CommonElements.CommonElementsCollection.*;
import static main.java.com.valeryvash.module1_2_tasks.CommonElements.CommonElementsAlgorithm.*;

public class CommonElementsDemo {

    public static void main(String[] args) {

//        Integer[] fArray = {6, 4, 6, 8, 1, 100, -100};
//        Integer[] sArray = {3,8,76544, -42, 100,1};
//
//        System.out.println(getCommonElements(
//               new ArrayList<>(Arrays.asList(fArray)),
//                new ArrayList<>(Arrays.asList(sArray))
//       ));

        int[] left =  {6, 4, 6,-15,9, -8, 1, 100, -100};
        int[] right = {9,-15,3,8,76544, -42, 100,1,-100};

        int[] array = getMassiveOfCommonsElements(left, right);

        System.out.println(Arrays.toString(array));

    }
}
