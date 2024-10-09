package M303_6.Homework.GLAB303_6;

public class ArrayDemoThree {
    public static void main(String[] args) {

        int[] numbers = {2,-9,0,5,12,25,22,9,8,12};
        int sum = 0;
        Double average ;

        for(int number: numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;//total number of elements

        average = (double) sum/arrayLength;

        System.out.println("The Sum is : "+sum);
        System.out.println("The average is " + average);



    }
}
