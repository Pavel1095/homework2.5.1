package com.example.homework251.Service;

import com.example.homework251.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    @Service
    public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return null;
    }

    @Override
    public boolean completeCollectionEmployees() {
        employees.add(new Employee("Иванов Иван", 2, 10000));
        employees.add(new Employee("Сидоров Петр", 2, 15000));
        employees.add(new Employee("Карелин Алексей", 2, 20000));
        employees.add(new Employee("Табуреткин Роман", 2, 25000));
        employees.add(new Employee("Карпов Никита", 2, 30000));
        employees.add(new Employee("Воронов Артем", 2, 35000));
        employees.add(new Employee("Петров Павел", 2, 40000));
        employees.add(new Employee("Александров Станислав", 2, 45000));
        return true;
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
    public double getAverageSalaryEmployee(){
        return 0;
    }
}
