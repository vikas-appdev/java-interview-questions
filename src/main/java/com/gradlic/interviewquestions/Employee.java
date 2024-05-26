package com.gradlic.interviewquestions;

public class Employee {

    private String employeeName;
    private int salary;
    private int age;

    public Employee(String employeeName, int salary, int age) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
