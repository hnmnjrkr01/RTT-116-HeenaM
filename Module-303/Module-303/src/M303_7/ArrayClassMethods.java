package M303_7;

import java.util.Arrays;

public class ArrayClassMethods {

    public static void main(String[] args) {

        double[] dValues = new double[10];
        Arrays.fill(dValues, 6);
        // set all values to 6
        for(double i : dValues)
        { // print using loop
            System.out.println(i);
        }

        long[] lValues = new long[10];
        Arrays.fill(lValues, 2057);    // set all values to 2057
        System.out.println(Arrays.toString(lValues));  // print using toString()

        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
        // Fill from index 1 to index 4.
        Arrays.fill(ar, 1, 5, 10);
        System.out.println(Arrays.toString(ar)); // print using toString()
    }
}
