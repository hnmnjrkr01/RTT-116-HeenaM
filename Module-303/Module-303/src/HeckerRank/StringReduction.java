package HeckerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReduction {

    public static int getMinDeletions(String s) {
        // Write your code here
        StringBuffer sBuff = new StringBuffer(s);
        int delCount = 0;
        System.out.println(s);
        for(int i=0; i< sBuff.length(); i++){
            for(int j=i+1; j<sBuff.length(); j++){
                if(sBuff.charAt(i) == sBuff.charAt(j)){
                    sBuff.deleteCharAt(j);
                    j--;
                    delCount++;
                }
            }

        }

        System.out.println(sBuff);

        return delCount;

    }
     public static void main(String[] args) {

         String s = "abcab";
         char[] c = s.toCharArray();
         int count = 0;
         for(int i=0 ; i<c.length-1;i++){
             for(int j=i+1 ; j<i;j++){
             if (c[i]==c[j]){
                 count++;
             }}

         }
         System.out.println(count);

     }







}
