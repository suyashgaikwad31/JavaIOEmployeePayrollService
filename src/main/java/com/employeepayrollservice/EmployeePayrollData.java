package com.employeepayrollservice;

public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;

    public EmployeePayrollData(Integer id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    }

    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary;
    }
}

