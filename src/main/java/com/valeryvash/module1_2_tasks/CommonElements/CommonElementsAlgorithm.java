package main.java.com.valeryvash.module1_2_tasks.CommonElements;


import java.util.Arrays;

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
}
