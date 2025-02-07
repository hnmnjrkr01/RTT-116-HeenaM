public class SortingFunctions {

    public void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSortTwoVaariables(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    arr[j] = arr[j]+arr[j + 1];
                    arr[j + 1] = arr[j]-arr[j + 1];
                    arr[j] = arr[j]-arr[j + 1];

                }
            }
        }
    }

    public void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j=i-1;
            int x = arr[i];
            while(j> -1 && arr[j]>x){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
    }

    public void selectionSort(int[] arr) {
        for(int i=1; i<arr.length-1; i++) {
            int min= i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[min]>arr[j]) {
                    min=j;
                }
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }


}
