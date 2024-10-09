package M303_5.Homework.GLAB303_5_1;

public class DifferentForLoops {

    public static void main(String[] args) {

        int n = 5;
        // for loop
        for (int i = 1; i <= n; ++i) {
            System.out.println("Java is fun");
        }


        int sum = 0;
        int m = 1000;
        // for loop
        for (int i = 1; i <= m; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);

    }
}

