package main.java.com.valeryvash.module1_2_tasks;



public class CommonElementsAlgorithm {
    /*
    I need to realize algorithm which returns intersection collection.
    Input data is two collections of integers.
    Example:
    [6,4,6,8,1,100,-100], [3,8,76544, -42, 100,1]
    Result:
    [1,8,100]
     */
    public static void main(String[] args) {

        int[] firstCollection = {6,4,6,8,1,100,-100};
        int[] secondCollection = {3,8,76544, -42, 100,1};

        // Intersected collection will not be greater that minimal collection
        int[] intersectionCollection = new int[
                Math.min(firstCollection.length, secondCollection.length)
                ];
        // If one collection have zero length we shall interrupt program work
        if (intersectionCollection.length == 0) {
            System.out.println(
                    "One collection has no elements."
            );
            throw new RuntimeException();
        }

        // Does collections have intersection?
        // I need min and max elements of both collections
        // First I need to init int values with collections first elements

        int
                min_1st = firstCollection[0],
                max_1st = min_1st,
                min_2nd = secondCollection[0],
                max_2nd = min_2nd;

        for (int j : firstCollection) {
            if (j < min_1st) min_1st = j;
            if (j > max_1st) max_1st = j;
        }

        for (int j : secondCollection) {
            if (j < min_2nd) min_2nd = j;
            if (j > max_2nd) max_2nd = j;
        }

        /*
            Check intersection condition
         */
        if (max_1st < min_2nd)
        {
            System.out.println("1st collection located to the left of 2nd. " +
                    "Collection have no intersection");
            new RuntimeException();
        }
        if (max_2nd < min_1st)
        {
            System.out.println("1st collection located to the right of 2nd. " +
                    "Collection have no intersection");
            new RuntimeException();
        }

        System.out.println("Collections might have common elements");

        // Here I use bool massive as
        // Duplicated values also will be included in final intersection

        boolean check[] = new boolean[Math.max(
                        firstCollection.length, secondCollection.length)];

        //Init counter. It is needed for precise array init
        int counter = 0;

        if (firstCollection.length >= secondCollection.length)
        {
            for (int first_element:
                 firstCollection) {
                for (int i = 0; i < secondCollection.length; i++) {
                    if (first_element == secondCollection[i] &&
                            !check[i]) {
                        check[i] = true;
                        counter++;
                    }
                }
            }
        } else {
            for (int first_element:
                    secondCollection) {
                for (int i = 0; i < firstCollection.length; i++) {
                    if (first_element == firstCollection[i] &&
                            !check[i]) {
                        check[i] = true;
                        counter++;
                    }
                }
            }
        }

        intersectionCollection = new int[counter];

        //TODO: complete bad algorithm version
        if (firstCollection.length >= secondCollection.length){
            for (int i = 0; i < secondCollection.length; i++) {
                if (check[i])
                {
                    intersectionCollection[counter---1]=secondCollection[i];
                }
            }
        } else {
            for (int i = 0; i < firstCollection.length; i++) {
                if (check[i])
                {
                    intersectionCollection[counter---1]=firstCollection[i];
                }
            }
        }

        // Print intersection massive in console

        for (int v:
             intersectionCollection) {
            System.out.print(v + "  ");
        }
        System.out.println();












    }

}
