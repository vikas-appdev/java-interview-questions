package com.gradlic.interviewquestions.functional;

public class RunnableInterface {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run ...");
            }
        };

        Runnable r = () -> System.out.println("Lambda runnable");



    }
}
