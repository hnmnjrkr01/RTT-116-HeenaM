//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        System.out.println("=============Welcome To Sorting & Searching Module=============");


        int[] array = {17,2,56,96,28,35,46,12,10,8,5,};
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("==========Bubble Sorted===========");
        new SortingFunctions().bubbleSort(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        new SortingFunctions().bubbleSortTwoVaariables(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("==========Insertion Sorted===========");
        new SortingFunctions().insertionSort(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("==========Selection Sorted===========");
        new SortingFunctions().selectionSort(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
}