package com.example.homework251.Service;

import com.example.homework251.model.Employee;

import java.util.List;

public interface EmployeeService {
        public List<Employee> printAllEmployee();
        public boolean completeCollectionEmployees();
        public int getCalculateSumSalary();
        public int getEmployeeMinSalary();
        public double getAverageSalaryEmployee();

}
