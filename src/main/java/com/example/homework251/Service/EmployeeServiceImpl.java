package com.example.homework251.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();
    @Override
    public void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public int getCalculateSumSalary(){
        return 0;
    }

    @Override
    public int getEmployeeMinSalary(){
        return 0;
    }

    @Override
    public double getAverageSaalaryEmployee(){
        return 0;
    }
}
