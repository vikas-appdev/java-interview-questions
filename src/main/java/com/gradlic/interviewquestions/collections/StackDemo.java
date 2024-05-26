package com.gradlic.interviewquestions.collections;

import org.yaml.snakeyaml.util.ArrayStack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();

        for(int i=0; i<4;i++){
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}
