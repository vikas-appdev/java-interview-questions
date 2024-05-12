package com.gradlic.interviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        // int n=5;
        int[] arr = {1,3,4,5,3,4,5};

        HashMap<Integer, Integer> nums = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (!nums.containsKey(arr[i])){
                nums.put(arr[i], 1);
            }else {
                nums.put(arr[i], nums.get(arr[i])+1);
            }
        }


        System.out.println(nums);
    }
}
