package M303_7.HomeworK.PA303_7_1;

public class TaskEight {

    //Task 9
    public static void sort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        for(int j=0;j<arr.length;j++){
            int mid = (arr.length-1)/2;
            arr[0] = arr[mid];
            System.out.println(arr[j]);
        }

        //Task 10
        int[] sortArray = {4, 2, 9, 13, 1, 0};

        System.out.println("Sorted array in ascending order: ");

        sort(sortArray);

        for(int sort : sortArray){
            System.out.print(sort+" ");
        }

        //Task 11

        Object[] mixedObjects = {10,"girl","boy","animal",108.0759};
        for(Object mixedObject : mixedObjects){
            System.out.print(mixedObject.toString()+" ");
        }
















    }
}
