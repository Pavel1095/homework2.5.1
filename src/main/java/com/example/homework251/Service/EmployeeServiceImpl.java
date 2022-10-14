package com.example.homework251.Service;

import com.example.homework251.ecxeption.EmployeeNotFoundException;
import com.example.homework251.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAll() {
        return employees;
    }

    @Override
    public Employee print(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName(name) && employees.get(i).getLastName().equals(surname)) {
                return employees.get(i);
            }
        }
        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }

    @Override
    public boolean completeCollection() {
        employees.add(new Employee("Иванов","Иван"));
        employees.add(new Employee("Сидоров","Петр"));
        employees.add(new Employee("Карелин","Алексей"));
        employees.add(new Employee("Табуреткин","Роман"));
        employees.add(new Employee("Карпов","Никита"));
        employees.add(new Employee("Воронов","Артем"));
        employees.add(new Employee("Петров","Павел"));
        employees.add(new Employee("Александров","Станислав"));
        return true;
    }


    @Override
    public double getCalculateSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    @Override
    public int getEmployeeMinSalary() {
        return 0;
    }

    @Override
    public double getAverageSalaryEmployee() {
        return 0;
    }

    @Override
    public double add() {
        return 0;
    }
}
