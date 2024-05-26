package com.gradlic.interviewquestions.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();

        // Add elements
        lists.add("Vikas");
        lists.add("Kumar");
        lists.add("Vikas");
        lists.add("Kumar");

        // Print using forEach
        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        for (int i=0; i<lists.size(); i++){
            System.out.println(lists.get(i));
        }

        String collect = lists.stream().collect(Collectors.joining(", "));
        System.out.println(collect);


        String remove = lists.remove(1);
        System.out.println(remove);
        boolean kumar = lists.remove("Kumar");

        System.out.println(kumar);

        lists.forEach(System.out::println);

        System.out.println(lists.hashCode());

    }
}
