package com.gradlic.interviewquestions.strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        // Input
        String string = "aabbccdefatafaz";

        char[] charArray = string.toCharArray();

        Map<Character, Integer> exits = new HashMap<>();
        String st = "";

        for (int i=0; i< charArray.length; i++){
            if (!exits.containsKey(charArray[i])){
                st = st + charArray[i];
                exits.put(charArray[i], 1);
            }
        }
        System.out.println(st);
    }
}
