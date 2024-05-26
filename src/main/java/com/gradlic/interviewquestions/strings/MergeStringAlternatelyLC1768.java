package com.gradlic.interviewquestions.strings;

public class MergeStringAlternatelyLC1768 {
    public static String mergeAlternately(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for (int i=0; i<min; i++){
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        sb.append(word1.substring(min)).append(word2.substring(min));

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr")); // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs")); // apbqrs
        System.out.println(mergeAlternately("abcd", "pq")); // apbqcd
    }


}
