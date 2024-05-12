package com.gradlic.interviewquestions;

import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {

                int[] num1 = {23, 42, 54};
                int[] num2 = {11, 32, 54, 67};

                int size = num1.length + num2.length;
                int[] merge = new int[size];
                int count = 0;

                if(num1[0] > num2[0]){
                    for(int i=0; i< num2.length; i++){
                        merge[i] = num2[i];
                        count ++;
                    }

                    for(int i=0; i< num1.length; i++){
                        merge[count] = num1[i];
                        count++;
                    }
                }else{

                    for(int i=0; i< num1.length; i++){
                        merge[i] = num1[i];
                        count ++;
                    }

                    for(int i=0; i< num2.length; i++){
                        merge[count] = num2[i];
                        count++;
                    }
                }
                Arrays.sort(merge);
        Arrays.stream(merge).forEach(num -> System.out.println(num));


    }
}
