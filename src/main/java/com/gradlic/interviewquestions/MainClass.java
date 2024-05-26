package com.gradlic.interviewquestions;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        // int n=5;
        int[] arr = {1,3,4,5,3,4,5};


        HashMap<Integer, Integer> nums = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : nums.entrySet());

        Set<Integer> integers = nums.keySet();



        for (int i=0; i<arr.length; i++){
            if (!nums.containsKey(arr[i])){
                nums.put(arr[i], 1);
            }else {
                nums.put(arr[i], nums.get(arr[i])+1);
            }
        }

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Emp1", 100, 24));
        employees.add(new Employee("Emp2", 200, 22));
        employees.add(new Employee("Emp3", 300, 23));
        employees.add(new Employee("Emp4", 400, 44));
        employees.add(new Employee("Emp5", 500, 25));
        employees.add(new Employee("Emp6", 600, 26));
        employees.add(new Employee("Emp7", 700, 27));

        OptionalInt min = employees.stream().mapToInt(Employee::getAge).min();


        System.out.println(nums);
    }
}
