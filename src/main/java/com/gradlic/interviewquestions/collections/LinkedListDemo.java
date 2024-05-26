package com.gradlic.interviewquestions.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("VIkas");
        list.add("Kumar");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.push("Test");
        System.out.println(list);
        System.out.println(list.poll());


        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.pop());
    }
}
