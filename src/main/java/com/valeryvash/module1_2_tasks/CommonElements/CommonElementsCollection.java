package main.java.com.valeryvash.module1_2_tasks.CommonElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class CommonElementsCollection {

    /*
        Input:
            - 2 collections with integer elements
        Output:
            - sorted collection with commons elements. Duplicates are allowed.
     */
    public static ArrayList<Integer> getCommonElements(ArrayList<Integer> firstCollection,
                                                       ArrayList<Integer> secondCollection)
    {
        firstCollection.retainAll(secondCollection);

        Collections.sort(firstCollection);

        return firstCollection;
    }
}
