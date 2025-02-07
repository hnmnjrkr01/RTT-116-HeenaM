package org.example.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> sumToIndexMap = new HashMap<>();

        sumToIndexMap.put(0,-1);
        int sum=0, maxLenghtSubArr=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                sum++;
            }else{
                sum--;
            }

            if(sumToIndexMap.containsKey(sum)){
                maxLenghtSubArr = Math.max(maxLenghtSubArr,i-sumToIndexMap.get(sum));
            }else{
                sumToIndexMap.put(sum, i);
            }
        }

        return maxLenghtSubArr;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,0};

        System.out.println("Maximum length of subarray of given contiguous array is = "
        + new ContiguousArray().findMaxLength(nums)
        );
    }

}
