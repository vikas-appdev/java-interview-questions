package com.gradlic.interviewquestions.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class ContainsDuplicateLC217 {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums1));
        int nums2[] = {1,2,3,4};
        System.out.println(containsDuplicate(nums2));
        int nums3[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> uniques = new HashSet<>();
        for (int i=0; i< nums.length; i++){
            if (uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}
