package M303_5.Homework.PA303_5_1;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int temp;
        boolean swapped = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }


}

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 90, 22, 11};

        System.out.println("Before Sorting: ");
        for(int a:arr) {
                System.out.print(a+" ");
        }

        bubbleSort(arr);
        System.out.println();
        System.out.println("After Sorting: ");
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }


}
