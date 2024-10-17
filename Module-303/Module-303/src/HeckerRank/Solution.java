package HeckerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static void getMinDeletions(String s) {
        // Write your code here
        String[] subStringArray = new String[s.length()];
        int n = s.length();
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(subStringArray[k]);
                }

                System.out.println();
            }
        }
        for(String str:subStringArray) {
            System.out.println(str);
        }


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
      // in.nextLine();

      Result.getMinDeletions(s);

    }
}
