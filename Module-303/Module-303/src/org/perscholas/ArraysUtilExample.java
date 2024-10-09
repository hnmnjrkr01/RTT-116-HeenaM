package org.perscholas;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {

        double[]  dValues = new double[10];

        Arrays.fill(dValues, 50);

        System.out.println(Arrays.toString(dValues));

        int[] intArray = {1,2,3,4,5,6,7,8,9,0};

        int[] copyArray = intArray.clone();
        System.out.println(Arrays.toString(copyArray));



    }
}
