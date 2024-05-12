package com.gradlic.interviewquestions.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsExample {
    public static void main(String[] args) {

        // Load Employee from DataSource like db or hardcoded list
        List<Employee> employees = EmployeeData.loadData();

        List<Integer> ages = employees.stream().map(employee -> employee.getAge()).collect(Collectors.toList());
        System.out.println("All ages mapping: "+ages);

        // Sort
        System.out.println(ages.stream().sorted().collect(Collectors.toList()));
        System.out.println(ages.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        // find max age
        System.out.println(ages.stream().mapToInt(value -> value).summaryStatistics().getMax());

        // find min age
        System.out.println(ages.stream().mapToInt(value -> value).summaryStatistics().getMin());

        // find avg age
        System.out.println(ages.stream().mapToInt(value -> value).summaryStatistics().getAverage());

        // find sum
        System.out.println(ages.stream().mapToInt(value -> value).summaryStatistics().getSum());

        // slice :- skip and limit
        System.out.println(ages.stream().sorted().skip(1).limit(2).collect(Collectors.toList()));

        // Print all name in uppercase using comma
        System.out.println(employees.stream().map(employee -> employee.getName().toUpperCase()).collect(Collectors.joining(", ")));



    }
}
