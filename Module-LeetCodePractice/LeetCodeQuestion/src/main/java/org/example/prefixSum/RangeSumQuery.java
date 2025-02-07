package org.example.prefixSum;

public class RangeSumQuery {
    private int prefixSumArray[];

    public RangeSumQuery(int[] nums) {
        int n = nums.length;
        prefixSumArray = new int[n+1];

        for(int i=0; i<n; i++){

            prefixSumArray[i+1] = prefixSumArray[i]+nums[i];

        }
    }

    public int sumRange(int left, int right) {

        return prefixSumArray[right+1]-prefixSumArray[left];
    }

    public static void main(String[] args) {

        int nums [] = {-2,0,3,-5,2,-1};

        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);

        System.out.println(rangeSumQuery.sumRange(0,2));
        System.out.println(rangeSumQuery.sumRange(2,5));
        System.out.println(rangeSumQuery.sumRange(0,5));

    }
}
