package com.example.homework251.Service;

import com.example.homework251.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAll();

    public Employee print(String name,String surname);

    public boolean completeCollection();

    public double getCalculateSumSalary();

    public int getEmployeeMinSalary();

    public double getAverageSalaryEmployee();

    public Employee search(String name,String surname);

    public double add();
}
