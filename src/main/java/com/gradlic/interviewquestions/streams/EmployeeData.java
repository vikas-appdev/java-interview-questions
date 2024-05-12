package com.gradlic.interviewquestions.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> loadData(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Vikas", 30));
        employees.add(new Employee(2, "Sunil", 33));
        employees.add(new Employee(3, "Vikram", 29));
        employees.add(new Employee(4, "Sonu", 28));
        employees.add(new Employee(5, "Bikash", 26));

        return employees;
    }
}
