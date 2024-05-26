package com.gradlic.interviewquestions;

public class Test3 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int sum = nums[0];
        int maxSum = nums[0];

        String s = nums[0] + " + ";
        for (int i =1; i<nums.length; i++){
            if (sum>= 0){
                sum += nums[i];
                s += nums[i] +" + ";
            }else {
                sum = nums[i];
                s = nums[i]+ " + ";
            }

            if (sum> maxSum){
                maxSum = sum;
            }
        }
        System.out.println(s+ " "+maxSum);
    }
}
