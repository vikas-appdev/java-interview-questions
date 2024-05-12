package com.gradlic.interviewquestions.arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,8,3,4,5};
        secondLargestMethodOne(arr);
        secondLargestMethodTwo(arr);
    }

    public static void secondLargestMethodTwo(int arr[]){
        int largest = 0;
        int secondLargest = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest Number: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }

    public static void secondLargestMethodOne(int[] arr){
        int largest = 0;
        int secondLargest = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i]> largest){
                largest = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest Number: "+largest);
        System.out.println("Second Largest: "+secondLargest);

    }
}
