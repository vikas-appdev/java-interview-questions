package com.gradlic.interviewquestions.strings;

import java.util.Arrays;

public class SortStringChars {
    static final int MAX_CHAR = 26;

    public static void main(String[] args) {
        sortString("geeksforgeeks");
    }

    private static void sortString(String str) {
        // Hash array to keep count of character
        int letters[] = new int[MAX_CHAR];

        for (char c: str.toCharArray()){
            letters[c - 'a']++;
        }

        for (int i=0; i<MAX_CHAR; i++){
            for (int j=0; j<letters[i]; j++){
                System.out.print((char) (i + 'a'));
            }
        }


    }
}
