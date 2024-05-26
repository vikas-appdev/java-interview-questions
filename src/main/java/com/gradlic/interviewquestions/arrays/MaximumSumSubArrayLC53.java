package com.gradlic.interviewquestions.arrays;

public class MaximumSumSubArrayLC53 {
    public static int maxSubArray(int[] nums){
        int maxNum = 0;
        for (int i=0; i<nums.length; i++){
            int sum = 0;
            for (int j=i; j<nums.length; j++){
                sum += nums[j];
                if (sum > maxNum){
                    maxNum = sum;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    }
}
