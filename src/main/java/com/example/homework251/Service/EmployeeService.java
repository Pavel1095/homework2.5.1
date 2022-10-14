package com.example.homework251.Service;

import com.example.homework251.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAll();

    public Employee remove(String name, String surname);

    public boolean completeCollection();

    public Employee search(String name, String surname);

    public boolean add(String name, String surname);
}
