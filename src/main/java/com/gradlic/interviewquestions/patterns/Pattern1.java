package com.gradlic.interviewquestions.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTriangle(n);

    }

    public static void printSquare(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
