package main.java.com.valeryvash.module1_2_tasks.CommonElements;


import java.util.*;

public class CommonElementsAlgorithm {

    public static void insertionSort(int[] massive) {

        int length = massive.length;

        for (int i = 1; i < length ; i++) {
            int temp = massive[i];
            int j = i - 1;
            for (; j >= 0 && temp < massive[j]; j--)
            {
                massive[j + 1] = massive[j];
            }
            massive[j + 1] = temp;
        }
    }
    // method return commons elements with duplicates
    public static int[] getMassiveOfCommonsElements(int[] first, int[] second)
    {
        boolean[] checked = new boolean[second.length];

        Arrays.fill(checked, false);

        int count = 0;

        for (int i = 0; i < first.length; i++)
        {
                for (int j = 0; j < second.length; j++)
                {
                    if ((first[i] == second[j]) && (!checked[j]))
                    {
                        checked[j]    = true;
                        count++;
                        break;
                    }
                }
        }

        int[] ret_val = new int[count];
        for (int i = 0; i < checked.length; i++) {
            if (checked[i]) ret_val[--count] = second[i];
        }

        insertionSort(ret_val);

        return ret_val;
    }

    // method return commons elements without duplicates
    public static Integer[] getCommonsElements(Integer[] first, Integer[] second)
    {
        // discard all duplicates and make all collections initially sorted
        TreeSet<Integer> fSet = new TreeSet<Integer>(List.of(first));
        TreeSet<Integer> sSet = new TreeSet<Integer>(List.of(second));
        // collection to be returned
        TreeSet<Integer> ret_val = new TreeSet<Integer>();

        // if sets doesn't intersect we have no need to check it and just return zero massive
        if (!(fSet.first() > sSet.last() || fSet.last() < sSet.first())) {
            // check all elements from first set
            for (int f : fSet) {
                // check all elements from second set
                for (int s : sSet) {
                    if (f < s ) break; // we have no need to check further
                    if (f == s) {
                        ret_val.add(f);
                        sSet.remove(f); // no need to repeat check of this element further
                        break;
                    }
                }
                if (sSet.isEmpty()) break;
            }
        } else {
            return new Integer[0];}

        return ret_val.toArray(new Integer[0]);
    }


}
