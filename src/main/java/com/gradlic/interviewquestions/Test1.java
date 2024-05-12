package com.gradlic.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    // 3,5,2,9,1
    // 4,6,3,7,0

    public static void main(String[] args) {
        int[] num1 = {3,5,2,9,1};
        int[] num2 = {4,6,3,7,0};
        int max = 0;
        int num = 0;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i=0; i<num1.length; i++){
            if (!counts.containsKey(num1[i])){
                counts.put(num1[i], 1);
            }else {
                counts.put(num1[i], counts.get(num1[i])+1);
            }
            if (!counts.containsKey(num2[i])){
                counts.put(num2[i], 1);
            }else {
                counts.put(num2[i], counts.get(num2[i])+1);
            }
        }
         for(Map.Entry<Integer, Integer> e: counts.entrySet()){
             if (e.getValue() > max){
                 max = e.getValue();
                 num = e.getKey();
             }
         }

        System.out.println(counts);

        System.out.println(num);

    }


}
