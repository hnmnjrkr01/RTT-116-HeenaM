package M303_7;

import java.util.Arrays;

public class ForloopCopyExample {
    public static void main(String[] args)
    {

        int[] sourceArrays = {2,3,4,5,10};
        int[] targetArrays = new int[sourceArrays.length];
        for(int i =0; i < sourceArrays.length; i++)
        {
            targetArrays[i] = sourceArrays[i];
        }
        System.out.println(Arrays.toString(sourceArrays));
        System.out.println(Arrays.toString(targetArrays));
        if (targetArrays == sourceArrays) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }

        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",  Arrays.toString(arr));

        int[] sourceArray = {1,2,3};
        int[] targetArray = sourceArray.clone();
        sourceArray[2] = 500;

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));


    }

}
